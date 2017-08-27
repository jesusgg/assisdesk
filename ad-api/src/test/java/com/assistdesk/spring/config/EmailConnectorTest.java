package com.assistdesk.spring.config;

import com.assistdesk.email.EmailConnector;
import org.junit.Test;

/**
 * Created by jgarcia on 23.08.17.
 */
public class EmailConnectorTest {

	@Test
	public void fetchEmail() {
		EmailConnector.getEmail();
	}

}
