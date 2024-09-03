package com.lexmatos.schedule.leaderQuartz.quartz;

import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

@Configuration
public class QuartzConfig {

  @Bean
  public JobDetailFactoryBean jobDetail() {
    JobDetailFactoryBean factory = new JobDetailFactoryBean();
    factory.setJobClass(LogJob.class);
    factory.setDescription("Just a log Job");
    factory.setDurability(true);
    return factory;
  }

  @Bean
  public SimpleTriggerFactoryBean trigger(JobDetail jobDetail) {
    SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
    trigger.setJobDetail(jobDetail);
    trigger.setRepeatInterval(5000);  // Set the interval in milliseconds
    return trigger;
  }
}
