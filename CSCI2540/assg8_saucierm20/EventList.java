/*
 * A class for an Event List
 * @author - Madeleine Saucier
 */
package assg8_saucierm20;

import java.util.*;

public class EventList {

	private ArrayList<Event> eventList;
	private int eventCount;
	
	/*
	 * default constructor
	 */
	public EventList() {
		eventList = new ArrayList<Event>();
		eventCount = 0;
	}
	
	/*
	 * check to see if the list is empty
	 * @return true or false
	 */
	public boolean isEmpty() {
		return eventCount == 0;
	}
	
	/*
	 * add an arrival event
	 * @param time of arrival and transaction time
	 */
	public void addArrive(int arrive, int transact) {
		eventList.add(new Event('A', arrive, transact));
		Collections.sort(eventList);
		eventCount++;
	}
	
	/*
	 * add departure event
	 * @param departure time
	 */
	public void addDepart(int depart) {
		eventList.add(new Event ('D', depart));
		Collections.sort(eventList);
		eventCount++;
	}
	
	/*
	 * remove first event from list
	 */
	public void delete() {
		eventList.remove(0);
		eventCount--;
	}
	
	/*
	 * look at the first event in the list
	 */
	public Event retrieve() {
		return eventList.get(0);
	}

}
