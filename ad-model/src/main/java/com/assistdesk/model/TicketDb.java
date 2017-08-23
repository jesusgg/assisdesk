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
@Table(name = "ticket", schema = "assisdesk", catalog = "")
public class TicketDb {
	private int id;
	private String text;
	private int userId;
	private String title;
	private Integer assignee;
	private Integer priorityLevel;
	private Timestamp date;
	private Timestamp closureDate;

	@Basic
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Basic
	@Column(name = "userId")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "assignee")
	public Integer getAssignee() {
		return assignee;
	}

	public void setAssignee(Integer assignee) {
		this.assignee = assignee;
	}

	@Basic
	@Column(name = "priority_level")
	public Integer getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(Integer priorityLevel) {
		this.priorityLevel = priorityLevel;
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
	@Column(name = "closure_date")
	public Timestamp getClosureDate() {
		return closureDate;
	}

	public void setClosureDate(Timestamp closureDate) {
		this.closureDate = closureDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		TicketDb ticketDb = (TicketDb) o;

		if (id != ticketDb.id) {
			return false;
		}
		if (userId != ticketDb.userId) {
			return false;
		}
		if (text != null ? !text.equals(ticketDb.text) : ticketDb.text != null) {
			return false;
		}
		if (title != null ? !title.equals(ticketDb.title) : ticketDb.title != null) {
			return false;
		}
		if (assignee != null ? !assignee.equals(ticketDb.assignee) : ticketDb.assignee != null) {
			return false;
		}
		if (priorityLevel != null ? !priorityLevel.equals(ticketDb.priorityLevel) : ticketDb.priorityLevel != null) {
			return false;
		}
		if (date != null ? !date.equals(ticketDb.date) : ticketDb.date != null) {
			return false;
		}
		if (closureDate != null ? !closureDate.equals(ticketDb.closureDate) : ticketDb.closureDate != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + userId;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (assignee != null ? assignee.hashCode() : 0);
		result = 31 * result + (priorityLevel != null ? priorityLevel.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (closureDate != null ? closureDate.hashCode() : 0);
		return result;
	}
}
