package operation;


import java.util.InputMismatchException;
import java.util.List;

import model.StockDetails;
import utility.Utility;

public class Operations {
	StockDetails stockDetails=new StockDetails();
	//Add Stock Details
	public List<StockDetails> addStock(List<StockDetails> list){
		try {
			System.out.println("Enter name of Stock");
			stockDetails.setName(Utility.inputString());
			System.out.println("Enter number of Shares");
			stockDetails.setShare(Utility.inputNumber());
			System.out.println("Enter price of share");
			stockDetails.setPrice(Utility.inputNumber());

		}catch(InputMismatchException e) {
			System.out.println("Enter Valid data");
		}
		list.add(stockDetails);
		System.out.println("Stock Details Addede Successfully");
		return list;
	}
	//remove stock
	public List<StockDetails> removeStock(List<StockDetails> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		boolean find=false;
		System.out.println("Enter name of Stock to remove");
		try {
			String name=Utility.stringValidation(Utility.inputString());
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getName().equalsIgnoreCase(name)) {
					list.remove(i);
					find=true;
					System.out.println("Stock Deleted");
					break;
				}

			}
		}catch (InputMismatchException e) {
			System.out.println("Enter valid Input");
		}
		if(!find) {
			System.out.println("Stock is Not found");
		}
		return list;
	}
	//Calculate Total Share
	public void totalShare(List<StockDetails> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		System.out.println("Enter name of stock to calculate");
		try {
			String stockName=Utility.stringValidation(Utility.inputString());
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getName().equalsIgnoreCase(stockName)) {
					double totalSharePrice=list.get(i).getShare()* list.get(i).getPrice();
					System.out.println("Total Price of Shares is "+totalSharePrice);
				}
			}
		}catch(InputMismatchException e) {
			System.out.println("Enter valid Input");
		}
	}
	// Total Share in Market
	public void totalShareMarket(List<StockDetails> list) { //method to calculate total share price in markent
		double temp = 0.0,temp1 = 0.0;
		for(int i = 0; i<list.size(); i++) {
			double totalShare = list.get(i).getShare()*list.get(i).getShare(); 
			double totalprice = list.get(i).getShare()*list.get(i).getPrice();//calculating price each
			temp = temp+totalShare; //adding price of each share to make grand total
			temp1 = temp1 +totalprice ;
		}
		System.out.println("Total shares in market : "+temp+", Price : "+temp1); //Total Price for Stock
	}


}
