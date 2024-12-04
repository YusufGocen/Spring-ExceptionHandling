package com.yusufgocen.scheduled;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

@Component
public class ScheduledExample {

	@Scheduled(cron = "0 23 11 * * *")
	public void check() {
		System.out.println("Data Güncellendi");
	}
	
	
}
//SCHEDULED:
//Zamanlamaya ayarlamak için kullanılır . örnegin her sabah su saatte calıssın tarzında
//EnableScheduled ile aktif hale getiriyoruz.Starter sayfasına import edicez
//Scheduled() seklinde degerleri vericez


