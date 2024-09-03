import java.util.ArrayList;
import java.util.Scanner;
class Bill{
	int itemId;
	String itemName;
	int itemPrice;
	int quantity;
	int subTotal;
	
	public Bill(int itemId, String itemName, int itemPrice, int quantity, int subTotal) {
	
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return itemId+" "+itemName+" "+itemPrice+" "+quantity+" "+subTotal;
	}
	
}

public class LaunchHotelBilling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=null;
		int itemId=0;
		int quantity=0;
		String itemName=null;
		int itemPrice=0;
		int subTotal=0;
		String choice="y";
		int grandTotal=0;
		System.out.println("Welcome to Bcc");
		System.out.println("Dear customer Kindely enter your name ");
		name=scan.nextLine();
		
		ArrayList<Bill> al=new ArrayList<Bill>();
		do {
		System.out.println("Dear"+" "+name+" below is the menu");
		System.out.println("______________________________________");
		System.out.println("ItemId      ItemName       ItemPrice");
		System.out.println("______________________________________");
		System.out.println("1            Water             10");
		System.out.println("2            pepsi             40");
		System.out.println("3            Fries             60");
		System.out.println("4            Pizza            100");
		System.out.println("5            Burger            150");
		System.out.println("______________________________________");
		System.out.println("Dear user kindly enter ItemId");
		itemId=scan.nextInt();
		System.out.println("Enter the quantity");
		quantity=scan.nextInt();
		switch(itemId) {
		case 1:itemName="Water";
		itemPrice=10;
		subTotal=itemPrice*quantity;
		break;
		case 2:itemName="Pepsi";
		itemPrice=40;
		subTotal=itemPrice*quantity;
		break;
		case 3:itemName="Fries";
		itemPrice=60;
		subTotal=itemPrice*quantity;
		break;
		case 4:itemName="Pizza";
		itemPrice=100;
		subTotal=itemPrice*quantity;
		break;
		case 5:itemName="Burger";
		itemPrice=150;
		subTotal=itemPrice*quantity;
		break;
		default:System.out.println("Invalid choice.Please select between(1-5");
		break;
		}
		System.out.println("ItemName:"+itemName+ "ItemPrice:"+itemPrice+ "quantity:"+quantity+"Subtotal:"+subTotal);
		grandTotal = grandTotal+subTotal;
		Bill b=new Bill(itemId,itemName,itemPrice,quantity,subTotal);
		al.add(b);
		System.out.println("Do you order anything more(y/n)");
		choice = scan.next();
		
		}while(choice.equals("y"));
		for(Bill x:al) {
			System.out.println(x);
		}
		System.out.println("Grand total is:"+grandTotal);
	}

}
