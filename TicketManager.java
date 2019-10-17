import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class TicketManager implements Hardware{
	
	private boolean gateOpen = false;

	private ParkingLot[] lots;
	private HashMap<Transaction, Card> outstandingTransactions;
	private ArrayList<Transaction> completedTransactions;
	
	public boolean addLot(ParkingLot parkingLot) {
		return true;
	}
	
	public boolean removeLot(ParkingLot parkingLot) {
		return true;
	}
	
	public boolean startTransaction(Transaction transaction) {
		return true;
	}
	
	public boolean completeTransaction(int transactionId) {
		return true;
	}

	public LotSection getOpenLotSection(){
		return null;
	}

	public Card scanCard(){
		String name;
		int cardNum;
		int ssn;
		String experiationDate;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter your name: ");

			System.out.print("Enter Card Number: ");
			String cardNumber = br.readLine();
			card = Integer.parseInt(cardNumber);
			br.close();
			isr.close();
		}catch(IOException e){
			e.printStackTrace();
		}

		return null;
	}

    public void PrintTicket(Transaction transaction){
		System.out.println("----------------------------------------");
		System.out.println("Transaction ID: " + transaction.transactionId);
		System.out.println("Lot Assigned: " + transaction.lotUsed.getName());
		System.out.println("Time Assigned: " + transaction.timeCreated);
		System.out.println("----------------------------------------");
	}

    public void PrintReceipt(Transcation transaction){
		System.out.println("----------------------------------------");
		System.out.println("Transaction ID: " + transaction.transactionId);
		System.out.println("Lot Used: " + transaction.lotUsed.getName());
		System.out.println("Time Assigned: " + transaction.timeCreated);
		System.out.println("----------------------------------------");
	}

    public void setGateOpen(){
		this.gateOpen = true;
	}

    public void setGateClosed(){
		this.gateOpen = false;
	}

    public int scanTicket(){
		int ticketId;
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter Ticket: ");
			String card = br.readLine();
			tickedId = Integer.parseInt(card);
			br.close();
			isr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return ticketId;
	}
	
}
