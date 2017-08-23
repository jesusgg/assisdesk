package com.assistdesk.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by jgarcia on 19.08.17.
 */
@Entity
@Table(name = "user", schema = "assisdesk", catalog = "")
public class UserDb {
	private int userId;
	private String userName;
	private String userEmail;
	private Timestamp creationDate;

	@Basic
	@Column(name = "user_id")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Basic
	@Column(name = "user_email")
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Basic
	@Column(name = "creation_date")
	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		UserDb userDb = (UserDb) o;

		if (userId != userDb.userId) {
			return false;
		}
		if (userName != null ? !userName.equals(userDb.userName) : userDb.userName != null) {
			return false;
		}
		if (userEmail != null ? !userEmail.equals(userDb.userEmail) : userDb.userEmail != null) {
			return false;
		}
		if (creationDate != null ? !creationDate.equals(userDb.creationDate) : userDb.creationDate != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = userId;
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
		result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
		result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
		return result;
	}
}
