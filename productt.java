import java.util.Scanner;
class product{
	int pcode,price;
	String pname;
	product(int code,String name,int pr){
		pcode=code;
		pname=name;
		price=pr;
	}
}

class productt{
	public static void main(String args[]){
		product product1=new product(101,"crayons",45);
		int pcode,price;
		String pname;
		pcode=1002;
		pname="sketch pen";
		price=30;
		product product2=new product(pcode,pname,price);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product code:");
		pcode=sc.nextInt();
		System.out.println("Enter product name:");
		pname=sc.next();
		System.out.println("Enter product price:");
		price=sc.nextInt();
		
		product product3=new product(pcode,pname,price);
		System.out.println("\npcode:"+product1.pcode);
		System.out.println("\npname:"+product1.pname);
		System.out.println("\nprice:"+product1.price);
		
		System.out.println("\npcode:"+product2.pcode);
		System.out.println("\npname:"+product2.pname);
		System.out.println("\nprice:"+product2.price);
		
		System.out.println("\npcode:"+product3.pcode);
		System.out.println("\npname:"+product3.pname);
		System.out.println("\nprice:"+product3.price);
		
		System.out.println("\nproduct having lowest price is:");
		if(product1.price<product2.price && product1.price<product3.price){
		  System.out.println("\npcode:"+product1.pcode);
		  System.out.println("\npname:"+product1.pname);
		  System.out.println("\nprice:"+product1.price);
		}
		else if(product2.price<product1.price && product2.price<product3.price){
		  System.out.println("\npcode:"+product2.pcode);
		  System.out.println("\npname:"+product2.pname);
		  System.out.println("\nprice:"+product2.price);
		}
		else{
		  System.out.println("\npcode:"+product3.pcode);
		  System.out.println("\npname:"+product3.pname);
		  System.out.println("\nprice:"+product3.price);
		}
	}
}
		  
		
