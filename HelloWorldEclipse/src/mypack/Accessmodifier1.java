package mypack;

class myEmployee {
	   protected int newid;
	    private int id;
	    private String name;

	    public void setid(int i) {
	        id = i;
	    }

	    public void setname(String n) {
	        name = n;
	    }

	    public int getid() {
	        return id;
	    }

	    public String getname() {
	        return name;
	    }
	    
	    public void greet() {
	    	System.out.println("Greetings of the day ! ");
	    }

	}


public class Accessmodifier1 {
	public void hi() {
		System.out.println("Say hi !!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myEmployee e1 = new myEmployee();

	        e1.setid(3491);
	        e1.setname("KM John");
	        e1.newid = 9;
	        System.out.println(e1.newid);

	        System.out.println(e1.getid());
	        System.out.println(e1.getname());
	        
	        
	}

}




