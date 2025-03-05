import java.util.Scanner;
class Cpu{
  int price;
  class Processor{
    String no_of_cores,manufacturer;
    void display(){
      System.out.println("processor manufacturer:"+manufacturer+"\n");
      System.out.println("no of cores of processor:"+no_of_cores+"\n");
    }
  }
  static class Ram{
    int memory;
    String manufacturer;
    void display(){
      System.out.println("Ram memory:"+memory);
      System.out.println("Ram manufacturer:"+manufacturer);
    }
  }
  void display(){
    System.out.println("price:"+price);
  }
}

public class Cpuinfo{
  public static void main(String args[]){
    Cpu ncpu = new Cpu();
    Cpu.Processor processor = ncpu.new Processor();
    Cpu.Ram ram = new Cpu.Ram();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the processor manufacturer:");
    processor.manufacturer=sc.next();
    System.out.println("Enter the no of cores of processor:");
    processor.no_of_cores = sc.next();
    System.out.println("Enter the Ram memory size:");
    ram.memory =sc.nextInt();
    System.out.println("Enter the Ram manufacturer:");
    ram.manufacturer = sc.next();
    System.out.println("Enter the price:");
    ncpu.price = sc.nextInt();
    System.out.println("\nInformation of processor and Ram:");
    processor.display();
    ram.display();
    ncpu.display();
  }
}
