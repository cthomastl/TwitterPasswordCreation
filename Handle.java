package twitter;

public class handle {
	
	private String twitterHandle;
    private String password;
    public String passwordLength = "123456";
	
    public handle() {
    	
    }
		

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public String getPassword() {
		return password;
	}

	public void setTwitterHandle(String twitterHandle) {
		if(twitterHandle.startsWith("@")) {
			this.twitterHandle = twitterHandle;
			System.out.println("Twitter handle created successfully!");
		}
		else {
			System.out.println("Twitter handle must begin with @");
			
		}
	}

	public void setPassword(String password) {
		if(password.length() > 5) {
			System.out.println("Password too Long!");
		}
		else {
			this.password = password;
			System.out.println("Password set successfully!");
		}
	}
    
    
	
	
	
}
