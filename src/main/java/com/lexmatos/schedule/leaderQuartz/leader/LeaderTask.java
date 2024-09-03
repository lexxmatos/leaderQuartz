package com.lexmatos.schedule.leaderQuartz.leader;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
public class LeaderTask {

  // This method will run every 5 seconds
  @Scheduled(fixedRate = 5000)
  public void scheduleFixedRateTask() {
    log.info("[LEADER] Fixed RATE task - {}", System.currentTimeMillis() / 1000);
  }

  // This method will run 3 seconds after the previous execution completes
  @Scheduled(fixedDelay = 3000)
  public void scheduleFixedDelayTask() {
    log.info("[LEADER] Fixed DELAY task - {}", System.currentTimeMillis() / 1000);
  }
}
