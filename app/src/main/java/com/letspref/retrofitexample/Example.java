package com.letspref.retrofitexample;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Example {

        @SerializedName("Status")
        @Expose
        private String status;
        @SerializedName("Message")
        @Expose
        private String message;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("Password")
        @Expose
        private String password;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

