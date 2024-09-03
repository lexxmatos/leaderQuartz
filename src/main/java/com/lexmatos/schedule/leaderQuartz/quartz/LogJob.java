package com.lexmatos.schedule.leaderQuartz.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogJob implements Job {

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    log.info("[QUARTZ] Execute the Job {} at {}", jobExecutionContext.getFireInstanceId(), System.currentTimeMillis() / 1000);
  }
}
