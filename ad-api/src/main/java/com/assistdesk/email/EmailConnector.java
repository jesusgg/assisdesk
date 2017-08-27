package com.assistdesk.email;

import org.apache.log4j.Logger;

import javax.mail.*;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by jgarcia on 23.08.17.
 */
public class EmailConnector {

	final static Logger LOG = Logger.getLogger(EmailConnector.class);

	public static Message[] getEmail() throws IOException, MessagingException {

		Properties props = new Properties();
		props.put("mail.store.protocol", "imaps");

		Session session = Session.getInstance(props);
		Store store = session.getStore("imaps");
		store.connect("imap.googlemail.com", "assisdesktest@gmail.com", "assisdesk.1");

		Folder emailFolder = store.getFolder("INBOX");
		emailFolder.open(Folder.READ_ONLY);

		Message[] messages = emailFolder.getMessages();

		LOG.info("We have found " + messages.length + " messages in the inbox.");

		return messages;

	}

}
