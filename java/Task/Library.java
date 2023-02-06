package Task;

//Users class
class Users {
	private String name;
	private int id;
	private String email;

	public Users(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class ReminderMessage {
	private String message;
	private String date;

	public ReminderMessage(String message, String date) {
		this.message = message;
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public String getDate() {
		return date;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDate(String date) {
		this.date = date;
	}
}

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user = new Users("John Doe", 1, "johndoe@example.com");
		System.out.println("Name: " + user.getName());
		System.out.println("ID: " + user.getId());
		System.out.println("Email: " + user.getEmail());

		ReminderMessage reminder = new ReminderMessage("Return Book by 30th Jan", "28th Jan");
		System.out.println("Reminder Message: " + reminder.getMessage());
		System.out.println("Date: " + reminder.getDate());

	}

}
