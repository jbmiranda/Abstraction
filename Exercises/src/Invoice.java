import java.util.Scanner;

public class Invoice {	
	float fltAmount = 0;
	float fltDiscountAmount = 0;
	float fltInvoiceTotal = 0; 
	float fltDiscountPercent = 0.0f;
	
	int intNoInvoices = 0;
	float fltTotalInvoice = 0f;	
	float fltTotalDiscount =0f;
	
	public static void main(String[] args) {
		Invoice NewInvoice = new Invoice();
		Scanner inScanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println("");
		
		Boolean Res = true;		
		do {
			NewInvoice.Compute();		
			NewInvoice.Display(NewInvoice.fltAmount, NewInvoice.fltDiscountPercent, NewInvoice.fltDiscountAmount, NewInvoice.fltInvoiceTotal);
				
			System.out.println("Continue? (y/n):");
			String strContinue = inScanner.nextLine();
			
			switch(strContinue) {
			case "n":
			case "N":			
				Res = false;								
				break;
			case "y":
			case "Y":			
				Res = true;								
				break;
			default:
				Res = false;								
				break;
			}											
		}while(Res==true);	
		
		float AverageInvoice = NewInvoice.fltTotalInvoice/NewInvoice.intNoInvoices;
		float AverageDiscount = NewInvoice.fltTotalDiscount/NewInvoice.intNoInvoices;
		
		NewInvoice.DisplayDone(NewInvoice.intNoInvoices, AverageInvoice, AverageDiscount);
		inScanner.close();
	}
	
	public void Compute() {
		Scanner inScanner = new Scanner(System.in);		
		System.out.println("Enter Subtotal:");
		String strAmount = inScanner.nextLine();
		System.out.println("Discount Percent:");
		String strDiscountPercent = inScanner.nextLine();
		
		this.fltAmount = Float.parseFloat(strAmount);
		this.fltDiscountPercent = Float.parseFloat(strDiscountPercent);		
		this.fltDiscountAmount = fltAmount * fltDiscountPercent;
		this.fltInvoiceTotal = fltAmount - fltDiscountAmount;
		
		this.intNoInvoices++;
		this.fltTotalInvoice+=fltInvoiceTotal;
		this.fltTotalDiscount+=fltDiscountAmount;		
	}
	
	public void Display(float Amount, float DiscountPercent, float DiscountAmount, float InvoiceTotal) {
		System.out.println(String.format("Subtotal        : %s", Amount));
		System.out.println(String.format("Discount percent: %s", DiscountPercent));
		System.out.println(String.format("Discount amount : %s", DiscountAmount));
		System.out.println(String.format("Invoice total   : %s", InvoiceTotal));
	}
	
	public void DisplayDone(int TotalNoInvoices, float AverageInvoice, float AverageDiscount) {
		System.out.println(String.format("Number of invoices: %s", TotalNoInvoices));
		System.out.println(String.format("Average invoice   : %s", AverageInvoice));
		System.out.println(String.format("Average discount  : %s", AverageDiscount));
	}
}
