package main;

public class Session {
	private static Session session;
	
	
	private Session() {}
	
	public static Session getSession() {
		if (session == null) session = new Session();
		return session;
	}
}
