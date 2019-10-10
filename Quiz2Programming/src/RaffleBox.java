
public class RaffleBox {
	private int numberOfTickets = 0;
	private int maxTickets;
	private String nameOfEvent;
	private boolean raffleActive=true;
	private int [] ticketNumber = new int [500];

	/**
	 * This class tries to model a Raffle Box
	 * A Raffle box is a box that contains a large number of tickets
	 * 
	 * @param maxTickets The maximum number of tickets that can fit inside the box
	 * @param nameOfEvent The name of the event being used for this raffle
	 * 
	 * Not Shown:
	 * There are currently no tickets in the box
	 * The raffle is currently active, meaning tickets can be added to the box
	 * 
	 * GOTCHAS:
	 * Don't let there ever be less than 1 maxTicket, but set it to 1 if that is the case
	 * Don't let the nameOfEvent be null, but set it to "Holiday Trip" if that is the case
	 */
	public RaffleBox(int maxTickets, String nameOfEvent) {
		if(maxTickets<1)
			this.maxTickets=1;
		else
			this.maxTickets=maxTickets;
		if(nameOfEvent==null)
			this.nameOfEvent="Holiday Trip";
		else {
			this.nameOfEvent=nameOfEvent;
		}
		this.ticketNumber = new int [this.maxTickets];
	}
	
	/**
	 * The copy constructor
	 * @param box the RaffleBox to be copied
	 * 
	 * GOTCHAS:
	 * Don't allow null jar's, but set the values to what is described in the 2 argument
	 * constructor
	 * 
	 * Don't forget to do a deep copy
	 */
	public RaffleBox(RaffleBox box) {
		this.numberOfTickets=box.numberOfTickets;
		this.maxTickets=box.maxTickets;
		this.nameOfEvent=box.nameOfEvent;
		this.raffleActive=box.raffleActive;
		this.ticketNumber = new int [maxTickets];
		for(int i=0; i<this.ticketNumber.length; i++) {
			this.ticketNumber[i]=box.ticketNumber[i];
		}
	}
	
	/**
	 * 
	 * @return how many tickets can fit into the box
	 */
	public int getMaximumNumberOfTicketsBoxCanContain() {
		return this.maxTickets;
	}

	/**
	 * 
	 * @return how many tickets currently are in the box
	 */
	public int getCurrentNumberOfTicketsInBox() {
		return this.numberOfTickets;
	}
	
	/**
	 * 
	 * @return the name of the event
	 */
	public String getNameOfEvent() {
		return this.nameOfEvent;
	}
	
	/**
	 * 
	 * @return true if the raffle is currently active, false if it is not
	 */

	public boolean isRaffelStillActive() {
		return this.raffleActive;
	}
	
	/**
	 * Calling this method stops the raffle and no more tickets can be added to the box
	 */
	public void endRaffel() {
		this.raffleActive=false;
	}
	
	/**
	 * Calling this method allows tickets to be added to the box
	 */
	public void reopenRaffel() {
		this.raffleActive=true;
	}
	
	/**
	 * This method adds tickets into the box
	 * 
	 * @param ticketNumber The number of the ticket
	 * Assume all integer values are valid ticket numbers
	 * 
	 * GOTCHAS:
	 * Don't allow a ticket number to be added that already exists in the box
	 * Don't allow more tickets to be added then can fit in the box
	 */
	public void addTicketToBox(int ticketNumber) {
		boolean equalsPreviousTicket=false;
		for(int i=0; i<this.ticketNumber.length; i++) {
			if(this.ticketNumber[i]==ticketNumber)
				equalsPreviousTicket=true;
		}
		if(this.numberOfTickets<maxTickets&&this.raffleActive==true&&equalsPreviousTicket==false) {
			if(equalsPreviousTicket==false)
				this.ticketNumber[this.numberOfTickets]=ticketNumber;
			this.numberOfTickets++;
		}	
	}
	
	/**
	 * 
	 * @param ticketNumber
	 * @return true if this ticket number is in the box, false if it is not
	 */
	public boolean isThisTicketInTheBox(int ticketNumber) {
		for(int i=0; i<this.ticketNumber.length; i++) {
			if(this.ticketNumber[i]==ticketNumber)
				return true;
		}
		return false;
	}

}
