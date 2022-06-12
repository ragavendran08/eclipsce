package org.value;


public class C  {
	
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			if (username.equals("facebook")) {
				this.username = "Ragavendhiran";
				
			}else if (username.equals("insta")) {
			this.username="Ragav08";	
			}
			else {
				System.out.println("this username is not matched");
			}
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			if (password.equals("facebook")) {
				this.password = "12345";
			}else if (password.equals("insta")) {
				this.password="94450";
				
			}else {
				System.out.println("Password is  not matched");
			}
			
		}
		
		
}
