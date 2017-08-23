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
@Table(name = "history", schema = "assisdesk", catalog = "")
public class HistoryDb {
	private int changeId;
	private Integer ticketId;
	private String field;
	private String previousValue;
	private String currentValue;
	private Timestamp date;
	private Integer userId;

	@Basic
	@Column(name = "change_id")
	public int getChangeId() {
		return changeId;
	}

	public void setChangeId(int changeId) {
		this.changeId = changeId;
	}

	@Basic
	@Column(name = "ticket_id")
	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	@Basic
	@Column(name = "field")
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Basic
	@Column(name = "previous_value")
	public String getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(String previousValue) {
		this.previousValue = previousValue;
	}

	@Basic
	@Column(name = "current_value")
	public String getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	@Basic
	@Column(name = "date")
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Basic
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		HistoryDb historyDb = (HistoryDb) o;

		if (changeId != historyDb.changeId) {
			return false;
		}
		if (ticketId != null ? !ticketId.equals(historyDb.ticketId) : historyDb.ticketId != null) {
			return false;
		}
		if (field != null ? !field.equals(historyDb.field) : historyDb.field != null) {
			return false;
		}
		if (previousValue != null ? !previousValue.equals(historyDb.previousValue) : historyDb.previousValue != null) {
			return false;
		}
		if (currentValue != null ? !currentValue.equals(historyDb.currentValue) : historyDb.currentValue != null) {
			return false;
		}
		if (date != null ? !date.equals(historyDb.date) : historyDb.date != null) {
			return false;
		}
		if (userId != null ? !userId.equals(historyDb.userId) : historyDb.userId != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = changeId;
		result = 31 * result + (ticketId != null ? ticketId.hashCode() : 0);
		result = 31 * result + (field != null ? field.hashCode() : 0);
		result = 31 * result + (previousValue != null ? previousValue.hashCode() : 0);
		result = 31 * result + (currentValue != null ? currentValue.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		return result;
	}
}
