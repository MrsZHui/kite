package com.disruptor.bhz.threadpoolv2.handler;

import com.disruptor.bhz.threadpoolv2.event.RunEvent;

/**
 * 直接执行器
 */
public class DirectEventHandler implements RunWorkHandler {

    @Override
    public void shutdown() {

    }

    @Override
    public void onEvent(RunEvent runEvent, long l, boolean b) throws Exception {
        execute(runEvent.getRunnable());
    }

    @Override
    public void onEvent(RunEvent runEvent) throws Exception {
        execute(runEvent.getRunnable());
    }

    @Override
    public void execute(Runnable command) {
        try {
            command.run();
        } catch (Exception e) {
            throw e;
        }
    }
}
