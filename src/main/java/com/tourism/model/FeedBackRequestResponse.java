package com.tourism.model;

import com.tourism.model.BaseRequestResponse.BaseResponse;

public interface FeedBackRequestResponse {

	public class FeedBackRequest {

		private String fullName;

		private String email;

		private String subject;

		private String message;

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	public class FeedBackResponse extends BaseResponse {
	}
	
}