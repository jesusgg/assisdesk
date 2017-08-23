package com.assistdesk.api.service;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by jgarcia on 20.08.17.
 */

@Configuration
@EnableScheduling
@Service("emailPullService")
public class EmailPullService {

	final static Logger LOG = Logger.getLogger(EmailPullService.class);

	public EmailPullService() {
		LOG.info("Getting all new tickets from email");
	}

	@Scheduled(fixedRate = 1000)
	public void readEmail() throws IOException {
		LOG.info("Getting all new tickets from email");
	}

}
