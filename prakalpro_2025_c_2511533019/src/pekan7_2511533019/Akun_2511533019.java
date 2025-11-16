package pekan7_2511533019;

public class Akun_2511533019 {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		
		private String username,password,email;
		private int pinAngka;
		//membuat mutator (setter)
		public void setUsername (String username) {
			this.username=username;
		}
		public void setPassword (String password) {
			this.password=password;
		}
		public void setEmail (String email) {
			this.email=email;
		}
		public void setPinAngka (int pinAngka) {
			this.pinAngka=pinAngka;
		}
		//membuat accesor (getter)
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
		public String getEmail() {
			return email;
		}
		public int getPinAngka() {
			return pinAngka;
		}
		//membuat helper method
		public boolean isPasswordValid() {
			return password.length()>=8;
		}
		public boolean isEmailValid() {
			return email.contains("@") && email.contains(".");
		}
		
			
	}


