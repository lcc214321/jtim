package cn.bytes.jtim.core.module.retry;

import cn.bytes.jtim.core.module.Module;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @version 1.0
 * @date 2020/2/16 22:20
 */
public interface RetryModule extends Module {

    /**
     * 最大重试次数
     *
     * @return
     */
    int retryMax();

    /**
     * 减少重试次数
     */
    void decRetryMax();

    /**
     * 间隔时长
     */
    TimeUnit suspendTimeUnit();

    int suspendStep();

    void retry(Consumer<SimpleRetryModule.RetryStatus> consumer);

}