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
@Table(name = "comment", schema = "assisdesk", catalog = "")
public class CommentDb {
	private int id;
	private int ticketId;
	private String text;
	private Integer isInternal;
	private Timestamp date;
	private Integer userId;

	@Basic
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "ticket_id")
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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
	@Column(name = "is_internal")
	public Integer getIsInternal() {
		return isInternal;
	}

	public void setIsInternal(Integer isInternal) {
		this.isInternal = isInternal;
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

		CommentDb commentDb = (CommentDb) o;

		if (id != commentDb.id) {
			return false;
		}
		if (ticketId != commentDb.ticketId) {
			return false;
		}
		if (text != null ? !text.equals(commentDb.text) : commentDb.text != null) {
			return false;
		}
		if (isInternal != null ? !isInternal.equals(commentDb.isInternal) : commentDb.isInternal != null) {
			return false;
		}
		if (date != null ? !date.equals(commentDb.date) : commentDb.date != null) {
			return false;
		}
		if (userId != null ? !userId.equals(commentDb.userId) : commentDb.userId != null) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + ticketId;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (isInternal != null ? isInternal.hashCode() : 0);
		result = 31 * result + (date != null ? date.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		return result;
	}
}
