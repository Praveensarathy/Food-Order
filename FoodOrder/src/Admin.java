import java.util.*;

public class Admin {
	HashMap <String,String> userData = new HashMap();
	HashMap <String,String> hotelData = new HashMap();
	ArrayList<Customer> userList = new ArrayList();
	ArrayList<Hotel> hotelList = new ArrayList();
	ArrayList<Orders> orders = new ArrayList();
	
	
	public void confirmedOrder() {
		
		Orders order = new Orders();
		
	}
	
	protected boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("1234")) {
			System.out.println("Admin Login Successfully!!");
			return true;
		}
		return false;
	}
	public void userDetails() {
		// TODO Auto-generated method stub
		
	}
	public void hotelDetails() {
		// TODO Auto-generated method stub
		
	}
	HashMap <Integer,Hotel> setHotel = new HashMap();
	public void listHotels() {
		int i = 1;

		for(Hotel s : hotelList) {
			System.out.println("["+i+"]" + s.getHotelName() + " in " + s.getLocation() + " pure "+ s.getCategory());
			setHotel.put(i, s);
			i++;
		}
		int selectHotel = Main.sc.nextInt();
		for(int c : setHotel.keySet()) {
			if(c==selectHotel) {
				System.out.println("********* Hotel Menu **********");
				setHotel.get(c).menu();
				if(setHotel.get(c).orders()) {
					System.out.println("Order Booked Successfully");
					confirmedOrder();
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//hotel login
	
	public void hotelLogin() {
		Hotel hotel = new Hotel();
		System.out.println("[1]->Hotel Login ");
		System.out.println("[2]->Hotel signUp ");
		int opt = Main.sc.nextInt();
		if(userData.size() == 0 || opt==2) {
			System.out.println("\n======== SignIn =========");
			System.out.println("Enter your Hotel name: ");
			hotel.setHotelName(Main.sc.next());;
			System.out.println("Enter your CurrectLocation: ");
			hotel.setLocation(Main.sc.next());
			System.out.println("Enter your category (Veg or Non-Veg): ");
			hotel.setCategory(Main.sc.next());
			int items = Main.sc.nextInt();
			while(items != 0) {
				String foodName = Main.sc.next();
				int foodPrice = Main.sc.nextInt();
				hotel.hotelMenu.put(foodName, foodPrice);
			}
			System.out.println("Enter Hotel Username: ");
			hotel.setHotelUserName(Main.sc.next());
			System.out.println("Enter Hotel Password: ");
			hotel.setHotelPassword(Main.sc.next());
			hotelData.put(hotel.getHotelUserName(),hotel.getHotelPassword());
			hotelList.add(hotel);
		}
		else if(opt ==1 && userData.size()!=0) {
			System.out.println("\n==========Login============");
			System.out.println("Enter Hotel Username: ");
			String username = Main.sc.next();
			System.out.println("Enter Hotel Password: "); 
			String password = Main.sc.next();
			for(String name : userData.keySet()) {
				if(name.equals(username)) {
					if(userData.get(name).equals(password)) {
						System.out.println("Hi :) " + username + " Login Successfully!!!");
						break;
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Customer login
	public void userLogin() {
		Customer user = new Customer();
		System.out.println("[1]->User Login ");
		System.out.println("[2]->User signUp ");
		int opt = Main.sc.nextInt();
		if(userData.size() == 0 || opt==2) {
			System.out.println("\n======== SignIn =========");
			System.out.println("Enter your name: ");
			user.setName(Main.sc.next());
			System.out.println("Enter your age: ");
			user.setAge(Main.sc.nextInt());
			System.out.println("Enter your CurrectLocation: ");
			user.setLocation(Main.sc.next());
			System.out.println("Enter Username: ");
			user.setUserName(Main.sc.next());
			System.out.println("Enter Password: ");
			user.setPassword(Main.sc.next());
			userData.put(user.getUserName(),user.getPassword());
			userList.add(user);
		}
		else if(opt ==1 && userData.size()!=0) {
			System.out.println("\n==========Login============");
			System.out.println("Enter Username: ");
			String username = Main.sc.next();
			System.out.println("Enter Password: ");
			String password = Main.sc.next();
			for(String name : userData.keySet()) {
				if(name.equals(username)) {
					if(userData.get(name).equals(password)) {
						System.out.println("Hi :) " + username + " Login Successfully!!!");
						break;
					}
				}
			}
		}
	}
	
}