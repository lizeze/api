package com.github.xiaotaideng.api.core.base;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.core.base
 * @date 2020/11/18 15:06
 */
public interface BaseService<T> {
    T save(T entity) throws Exception;

    boolean saveBatch(Collection<T> entityList);


    // TableId 注解存在更新记录，否插入一条记录
    boolean saveOrUpdate(T entity);

    // 根据updateWrapper尝试更新，否继续执行saveOrUpdate(T)方法
    boolean saveOrUpdate(T entity, Wrapper<T> updateWrapper);

    // 批量修改插入
    boolean saveOrUpdateBatch(Collection<T> entityList);

    // 根据 entity 条件，删除记录
    boolean remove(Wrapper<T> queryWrapper);

    // 根据 ID 删除
    boolean removeById(Serializable id);

    // 根据 columnMap 条件，删除记录
    boolean removeByMap(Map<String, Object> columnMap);

    // 删除（根据ID 批量删除）
    boolean removeByIds(Collection<? extends Serializable> idList);

    List<T> list();


    // 查询（根据ID 批量查询）
    Collection<T> listByIds(Collection<? extends Serializable> idList);

    // 查询（根据 columnMap 条件）
    Collection<T> listByMap(Map<String, Object> columnMap);

    // 翻页查询
    IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper);

    T selectById(Serializable id);

    T selectOne(Wrapper<T> queryWrapper);
}
