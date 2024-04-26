import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
    LinkedList<Employee> employees = new LinkedList<>();

    System.out.println("¿Cuantos empleados desea ingresar?: ");
    int quantity = reader.nextInt();

    for (int i = 0; i < quantity ; i++) {
      Employee employee = new Employee();
      System.out.println("Ingrese el nombre: ");
      employee.setName(reader.next());
      System.out.println("Ingrese el apellido: ");
      employee.setLastName(reader.next());
      System.out.println("Ingrese la direccion: ");
      employee.setAddress(reader.next());
      System.out.println("Ingrese la edad: ");
      employee.setAge(reader.nextInt());
      System.out.println("Ingrese el cargo: ");
      employee.setCarge(reader.next());

      employees.add(employee);
    }

    String message = "---- Lista de empleados ----";
    for (Employee employee : employees){
      message += "------------";
      message += "\nNombre: " + employee.getName() + "\n"
              + "Apellido: " + employee.getLastName() + "\n"
              + "Direccion: " +employee.getAddress() + "\n"
              + "Edad: " +employee.getAge() + "\n"
              + "Cargo: " + employee.getCarge();
    }

    System.out.println(message);
  }
}
