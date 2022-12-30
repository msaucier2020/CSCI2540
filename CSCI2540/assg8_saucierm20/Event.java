/*
 * a class for events
 * @author - Madeleine Saucier
 */
package assg8_saucierm20;

public class Event implements Comparable<Event>{

	private Character type;
	private int eventTime, transactTime;
	
	/*
	 * constructor for Arrival events
	 * @param type, arrival time, transaction time
	 */
	public Event(Character typeA, int arrive, int transact) {
		type = typeA;
		eventTime = arrive;
		transactTime = transact;
	}
	
	/*
	 * constructor for Departure events
	 * @param type, departure
	 */
	public Event(Character typeD, int depart) {
		type = typeD;
		eventTime = depart;
	}
	
	/*
	 * return the type of event (arrival or departure)
	 * @return type
	 */
	public Character getType(){
		return type;
	}
	
	/*
	 * check if an event is an arrival event
	 * @return true or false
	 */
	public boolean isArrive() {
		if(type == 'A') {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * check if an event is a departure event
	 * @return true or false
	 */
	public boolean isDepart() {
		if(type == 'D') {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * get event time (arrival or departure time)
	 * @return event time
	 */
	public int getETime() {
		return eventTime;
	}
	
	/*
	 * get transaction time
	 * @return transaction time
	 */
	public int getTransact() {
		return transactTime;
	}
	
	/*
	 * compare events in order of increasing event time; if event time is same, arrival comes before departure
	 * @param event to compare to
	 * @return -1 if this comes before compare , 1 if this comes after
	 */
	public int compareTo(Event compare) {
		if(this.eventTime < compare.eventTime) {
			return -1;
		}
		else if(compare.eventTime < this.eventTime) {
			return 1;
		}
		else{
			return this.type.compareTo(compare.type);
		}
	}
	
	/*
	 * get event in string form (type, event time, transaction time)
	 * @return string with event info
	 */
	public String toString() {
		
		if(type == 'D') {
			return "('" + type + "', " + eventTime + ")";
		}
		else {
			return "('" + type + "', " + eventTime + ", " + transactTime + ")";
		}
		
	}
}
