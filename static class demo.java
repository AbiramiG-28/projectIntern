class MotherBoard {

   // static nested class
   static class USB{
       String name="hello";
       void getTotalPorts(String type){
           this.name=type;
		   System.out.println(name);
       }
   }

}
public class Nest {
   public static void main(String[] args) {

       // create an object of the static nested class
       // using the name of the outer class
       MotherBoard.USB usb = new MotherBoard.USB();
	   usb.getTotalPorts("hejh");
   }
}
