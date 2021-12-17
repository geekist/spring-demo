package com.ytech.springtask.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class DemoJob {
    private final AtomicInteger counts = new AtomicInteger();

    @Scheduled(fixedRate = 2000)
    public void execute() {
        String str = "[execute][定时第" + counts.incrementAndGet() + "次执行]\"";
        System.out.println(str);
    }
}
