package com.midai.framework.concurrent;

/**
 * 
 * ClassName: DistributedLockTemplate <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年12月5日 下午2:07:00 <br/>
 *
 * @author 陈勋
 * @version 
 * @since JDK 1.7
 */
public interface DistributedLockTemplate {

    /**
     *
     * @param lockId 锁id(对应业务唯一ID)
     * @param timeout 单位毫秒
     * @param callback 回调函数
     * @return
     */
    public Object execute(String lockId,int timeout,Callback callback);
}
