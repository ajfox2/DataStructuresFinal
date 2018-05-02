import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aaron
 * This is the driver that tests all of the methods implemented by the queue and array classes.
 */
public class ApplicationDriver {
	public static void main(String[] args) throws IOException {
		
		
		/**
		 * creates the new Queue
		 */
		ApplicationList Applicants = new ApplicationList(5);

		/**
		 * Creates the objects that get implemented into the queue
		 */
		Applicant sSmith = new Applicant("Smith", "Steve", 34, "SSmith@work.email", "GED",
				"Did a review on other games, hoping to review yours as well.");
		Applicant jRosen = new Applicant("Rosen", "Jane", 23, "RosenWall@zmail.com", "4+ years",
				"Game reviewing was somthing I've always wanted to try.");
		Applicant hAbhul = new Applicant("Abhul", "Habib", 19, "SwimminIndian@LookIn.org", "NA",
				"I like playing games, and feel like I have good insight.");
		Applicant aJones = new Applicant("Jones", "Abigail", 27, "Jonsin4Love@zmail.com", "2 years",
				"I went to school for journalism, and think that I can write a fair and honest review of your games.");
		Applicant gInsider = new Applicant("Insider", "Gaming", 0, "Michael@G.Insider.com", "Diploma",
				"Hi there, I am Michael from Gaming Insider. I see you are an upcoming developer, and want to see what you can do.");

		/**
		 * adds objects to the queue
		 */
		Applicants.enqueue(sSmith);
		Applicants.enqueue(jRosen);
		Applicants.enqueue(hAbhul);
		Applicants.enqueue(aJones);
		Applicants.enqueue(gInsider);
		
		/**
		 * This is an interface that allows the user to do different things to the queue
		 */
		while (true) {
			System.out.print("Enter the first letter of ");
			System.out.print("display, sort, remove, total, peek: ");
			int choice = getChar();
			System.out.println(" ");
			switch (choice) {
			
			/**
			 * Displays the queue
			 */
			case 'd':
				Applicants.display();
				break;
				
				/**
				 * With this selection, there is another interface that allows the user to sort the items in different ways
				 */
			case 's':
				System.out.print("Enter the first letter to sort by ");
				System.out.print("name, age, education, or enter another letter to return to the main menu: ");
				int choice2 = getChar();
				System.out.println(" ");
				switch (choice2) {
				case 'n':
					Applicants.sortByName();
					break;
				case 'a':
					Applicants.sortByAge();
					break;
				case 'e':
					Applicants.sortByEducation();
					break;
				default:
					System.out.println("Invalid Sorting Option\n");
				}
				Applicants.display();
				break;
				
				/**
				 * removes the top item of the current queue
				 */
			case 'r':
				Applicants.dequeue();
				Applicants.display();
				break;
				
				/**
				 * Displays the amount of people in the queue
				 */
			case 't':
				System.out.println("There are " + Applicants.size() + " people in the queue.");
				System.out.println(" ");
				Applicants.display();
				System.out.println(" ");
				break;
				
				/**
				 * displays the top person in the queue
				 */
			case 'p':
				System.out.println("The person at the top of the current queue is: " + Applicants.peekFront());
				System.out.println(" ");
				Applicants.display();
				System.out.println(" ");
				break;
			default:
				System.out.println("Invalid Entry, retry\n");
			}
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}