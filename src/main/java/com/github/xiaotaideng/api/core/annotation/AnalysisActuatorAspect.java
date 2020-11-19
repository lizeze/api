package com.github.xiaotaideng.api.core.annotation;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author zeze.li
 * @BelongsProject: com.github.xiaotaideng.api.core.annotation
 * @date 2020/11/19 15:16
 */
@Aspect
@Component
public class AnalysisActuatorAspect {
    ThreadLocal<Long> beginTime = new ThreadLocal<>();
    final static Logger log = LoggerFactory.getLogger(AnalysisActuatorAspect.class);

    @Pointcut("@annotation(analysisActuator)")
    public void serviceStatistics(AnalysisActuator analysisActuator) {
    }

    @Before("serviceStatistics(analysisActuator)")
    public void doBefore(JoinPoint joinPoint, AnalysisActuator analysisActuator) {
        // 记录请求到达时间
        beginTime.set(System.currentTimeMillis());
        log.info("  note:{}", analysisActuator.note());
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为:" + JSON.toJSONString(args[i]));
        }

    }

    @After("serviceStatistics(analysisActuator)")
    public void doAfter(AnalysisActuator analysisActuator) {
        log.info("  note:{} statistic time:{}", analysisActuator.note(), System.currentTimeMillis() - beginTime.get());
    }
}
