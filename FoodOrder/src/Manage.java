
public class Manage {
	Admin admin = new Admin();
	public void management(){

		do {
			System.out.println("===============================");
			System.out.println("[1]-> For Admin Login ");
			System.out.println("[2]-> For User Login ");
			System.out.println("[3]-> For Hotel Login ");
			System.out.println("[4]-> Exit");
			System.out.println("===============================");
			System.out.print("Enter your choice:");
			int opt  = Main.sc.nextInt();
			if(opt==1) {
				this.optAdmin();
			}
			if(opt == 2) {
				System.out.println("==================");
				admin.userLogin();
				
			}
			if(opt==3) {
				admin.hotelDetails();
			}
			if(opt==4) {
				System.out.println("ThankYou!!!!");
				break;
			}
			
		}while(true);
	}
	
	
	
	
	
	
	
	
	
	public void optAdmin() {
		int i =0;
		do {
			System.out.println("       Login       ");
			System.out.print("UserName : ");
			String username = Main.sc.next();
			System.out.print("Password : ");
			String password = Main.sc.next();

		if(admin.login(username,password)) {
			System.out.println("===============================");
			System.out.println("[1]-> For Check Pending orders ");
			System.out.println("[2]-> Admin Total Earnings And Order Details ");
			System.out.println("[3]-> Users ");
			System.out.println("[4]-> Hotel ");
			System.out.println("[5]-> SignOut ");
			System.out.println("===============================");
			System.out.print("Enter your choice:");
			int AdminOpt = Main.sc.nextInt();
			if(AdminOpt==1) {
				
			}
			if(AdminOpt==2) {
				
			}
			if(AdminOpt==3) {
				
			}
			if(AdminOpt==4) {
				
			}
			if(AdminOpt ==5) {
				System.out.println("Admin logOut Successfully!!");
				break;
			}
		}
		else {
			i++;
			System.out.println("Sorry invalid Inputs or Incorrect\n");
		}
		}while(i!=3);
	}
}
