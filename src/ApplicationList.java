/**
 * @author Aaron
 * This is a class that creates a queue, the different methods needed, as well as different bubblesorts
 */

public class ApplicationList {
	/**
	 * variables within the queue class
	 */
	private int maxSize;
	private Applicant[] ApplicationList;
	private int front;
	private int rear;
	private int nItems;

	/**
	 * This is the constructor
	 */
	public ApplicationList(int size) {
		maxSize = size;
		ApplicationList = new Applicant[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	/**
	 * Adds to the bottom of the queue, and determines if the queue is full
	 */
	public void enqueue(Applicant j) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == maxSize - 1)
				rear = front - 1;

			ApplicationList[rear + 1] = j;
			rear++;
			nItems++;
		}
	}

	/**
	 * dequeues items from the top of the queue
	 */
	public Applicant dequeue() {
		Applicant temp = ApplicationList[front];
		front++;
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	/**
	 * peeks at the front of the queue
	 */
	public Applicant peekFront() {
		return ApplicationList[front];
	}

	/**
	 * determines if the queue is empty
	 */
	public boolean isEmpty() {
		return (nItems == 0);
	}

	/**
	 * Determines if the queue is full
	 */
	public boolean isFull() {
		return (nItems == maxSize);
	}

	/**
	 * determines size of queue
	 */
	public int size() {
		return nItems;
	}

	/**
	 * displays the queue when called
	 */
	public void display() {
		for (int i = 0; i < nItems; i++)
			System.out.println(ApplicationList[(front + i) % maxSize].toString());
		System.out.println(" ");
	}

	/**
	 * Using a bubblesort, this sorts the list by last name
	 */
	public void sortByName() {
		int i, j;
		Applicant temp;
		for (i = 0; i < nItems - 1; i++) {
			for (j = 0; j < nItems - 1 - i; j++) {
				if (ApplicationList[j].getLastName().compareTo(ApplicationList[j + 1].getLastName()) > 1) {
					temp = ApplicationList[j];
					ApplicationList[j] = ApplicationList[j + 1];
					ApplicationList[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Using a bubblesort, this sorts the list by age
	 */
	public void sortByAge() {
		int i, j;
		Applicant temp;
		for (i = 0; i < nItems - 1; i++) {
			for (j = 0; j < nItems - 1 - i; j++) {
				if (ApplicationList[j].getAge() > ApplicationList[j + 1].getAge()) {
					temp = ApplicationList[j];
					ApplicationList[j] = ApplicationList[j + 1];
					ApplicationList[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Using the created "edValue" in the Applicant class, this is a bubblesort that sorts the list by their education
	 */
	public void sortByEducation() {
		int i, j;
		Applicant temp;
		for (i = 0; i < nItems - 1; i++) {
			for (j = 0; j < nItems - 1 - i; j++) {
				if (ApplicationList[j].getEduvalue() > ApplicationList[j + 1].getEduvalue()) {
					temp = ApplicationList[j];
					ApplicationList[j] = ApplicationList[j + 1];
					ApplicationList[j + 1] = temp;
				}
			}
		}
	}
}