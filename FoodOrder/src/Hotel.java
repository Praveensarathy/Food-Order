import java.util.HashMap;

public class Hotel {
	private String HotelName,location,hotelUserName,hotelPassword,category;
	HashMap <String,Integer> hotelMenu = new HashMap();
	HashMap <Integer,String> getOrder = new HashMap();
	
	
	
	
	
	public void menu() {
		int item =1;
		for(String food : hotelMenu.keySet()) {
			System.out.println("["+item+"]" + food + " Rs-" + hotelMenu.get(food));
			getOrder.put(item, food);
			item++;
		}
	}
	public boolean orders() {
		int totalPrice=0;
		System.out.println("Select your Order please ");
		System.out.println("[0]-> Cancel to go previous Menu");
		System.out.println("[-1]-> Order Confirmed");
		do {
		int opt = Main.sc.nextInt();
		if(opt==0) {
			return false;
		}
		else if (opt ==-1) {
			return true;
		}
		else {
			if(getOrder.containsKey(opt)) {
				totalPrice += hotelMenu.get(getOrder.get(opt));
				System.out.println("Total Amount --> *****"+ totalPrice + "*****");
			}
		}
		
		}while(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHotelUserName() {
		return hotelUserName;
	}

	public void setHotelUserName(String hotelUserName) {
		this.hotelUserName = hotelUserName;
	}

	public String getHotelPassword() {
		return hotelPassword;
	}

	public void setHotelPassword(String hotelPassword) {
		this.hotelPassword = hotelPassword;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	} 

}
