import java.util.Scanner;

public class View{
  private Scanner scan;
  
  public View(){
    scan = new Scanner(System.in);
  }
  public void menu(String command){
    if(command == "origin"){
      System.out.println("Ingrese la ciudad de origen: ");
    }
    if(command == "destiny"){
      System.out.println("Ingrese la ciudad destino: ");
    }
    
  }
}
