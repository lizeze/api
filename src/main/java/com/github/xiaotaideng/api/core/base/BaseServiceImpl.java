package com.github.xiaotaideng.api.core.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.core.base
 * @date 2020/11/18 15:09
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> implements BaseService<T> {

    @Autowired
    private M baseMapper;

    @Override
    public T save(T entity) throws Exception {
        baseMapper.insert(entity);
        return entity;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean saveBatch(Collection<T> entityList) {
        Integer size = entityList.size();
        for (T entity : entityList) {
            baseMapper.insert(entity);
            size++;
        }
        return size == entityList.size();
    }

    @Override
    public boolean saveOrUpdate(T entity) {
        int rs = baseMapper.updateById(entity);
        if (rs > 0) return true;
        return baseMapper.insert(entity) > 0;
    }

    @Override
    public boolean saveOrUpdate(T entity, Wrapper<T> updateWrapper) {


        return false;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList) {

        for (T entity : entityList) {
            saveOrUpdate(entity);
        }
        return true;
    }

    @Override
    public boolean remove(Wrapper<T> queryWrapper) {
        return baseMapper.delete(queryWrapper) > 0;
    }

    @Override
    public boolean removeById(Serializable id) {
        return baseMapper.deleteById(id) > 0;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return baseMapper.deleteByMap(columnMap) > 0;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return baseMapper.deleteBatchIds(idList) > 0;
    }

    @Override
    public List<T> list() {
        return baseMapper.selectList(new QueryWrapper<T>());
    }


    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> idList) {
        return baseMapper.selectBatchIds(idList);
    }

    @Override
    public Collection<T> listByMap(Map<String, Object> columnMap) {
        return baseMapper.selectByMap(columnMap);
    }

    @Override
    public IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }


    @Override
    public T selectById(Serializable id) {
        return baseMapper.selectById(id);
    }

    @Override
    public T selectOne(Wrapper<T> queryWrapper) {
        return baseMapper.selectOne(queryWrapper);
    }
}
