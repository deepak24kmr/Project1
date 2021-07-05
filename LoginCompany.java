package Control;
import java.util.*;
public class LoginCompany {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("select your designation :");
		System.out.println("1.MANAGER           2.EMPLOYEE");
		int x=sc.nextInt();
		
		Admin a=new Admin();
		User1 u=new User1();
		
		switch(x)
		{
		case 1:
			System.out.println("Enter name");
			String mname=sc.next();
			
			System.out.println("Enter manager id number");
			int id_num=sc.nextInt();
			System.out.println("Enter your login id");
			String login_id=sc.next();
			System.out.println("Enter your password ");
			String password=sc.next();
			if(a.validate_manager(login_id, password))
			{
				u.display_manager(mname,id_num);
			}
			else {
				System.out.println("wrong id or password");
			}
			sc.close();
			break;
			
		case 2:
			System.out.println("Enter name");
			String ename=sc.next();
		
			System.out.println("Enter manager id number");
			int id_no=sc.nextInt();
			System.out.println("Enter your login id");
			String loginid=sc.next();
			System.out.println("Enter your password ");
			String pass=sc.next();
			if(a.validate_employee(loginid, pass))
			{
				u.display_employee(ename,id_no);
			}
			else {
				System.out.println("wrong id or password");
			}
			sc.close();
			break;
		}
		
		sc.close();
	}
}


class Admin{
	public boolean validate_manager(String id,String password)
	{
		if(id.equals("manager")&& password.equals("mypass1"))
		{
			return true;
		}
		return false;
	}
	
	public boolean validate_employee(String id,String password)
	{
		if(id.equals("employee")&& password.equals("mypass2"))
		{
			return true;
		}
		return false;
	}
}

class User1 extends Admin {
	public void display_manager(String mname,int id)
	{
	 System.out.println("Welcome "+mname+" your id number is "+id+" and your salary as manager is 15lpa");
	}
	
	public void display_employee(String ename,int id)
	{
	 System.out.println("Welcome "+ename+" your id number is "+id+" and your salary as employee is 4lpa");
	}
	
}

