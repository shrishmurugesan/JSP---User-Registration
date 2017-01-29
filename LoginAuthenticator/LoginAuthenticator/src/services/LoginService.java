package services;

import java.util.HashMap;

import dto.User;

public class LoginService {
	// A database would be used in a real world scenario...a local Hashmap is used for learning purposes
	HashMap<String,String> auth = new HashMap<>();
	HashMap<String,String> users = new HashMap<>();

	{
		auth.put("Shrish", "Shrisharmi123");
		auth.put("Sharmila", "Shrisharmi9193");
		auth.put("Srikrish", "iamababy");
		users.put("Shrish", "Shrish Murugesan");
		users.put("Harrish", "Harrish Murugesan");
		users.put("Nagarathinam", "Nagarathinam Murugesan");
		users.put("Sharmila", "Sharmila Shrish");
	}
	
	public boolean authenticate(String userID, String password)
	{
		/*For a full scale application, JDBC connection goes here
		 * check against a database table for validity
		*/
		boolean challenge = false;
		if(password == null || password.trim()==""){
			return challenge;
		}
		else if(userID==null||userID.trim()=="")
		{
			return challenge;
		}
		else
		{
			if(auth.containsKey(userID))
			{
				if(password.equals(auth.get(userID)))
				{
					challenge = true;
					return challenge;
				}
				else
					return challenge;
			}
		}
		return challenge;
	}
	
	public User getUserDetails(String userID)
	{
		User user = new User();
		user.setUserName(users.get(userID));
		user.setUserID(userID);
		return user;
	}

}
