package com.entities;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notes")
public class Notesmaker {
		@Id
		private int id;
		private String title;
		@Column(length = 100000)
		private String content;
		private Date addedDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Date getAddedDate() {
			return addedDate;
		}
		public void setAddedDate(Date addedDate) {
			this.addedDate = addedDate;
		}
		public Notesmaker( String title, String content, Date addedDate) {
			super();
			this.id = new Random().nextInt(100000);
			this.title = title;
			this.content = content;
			this.addedDate = addedDate;
		}
		public Notesmaker() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
