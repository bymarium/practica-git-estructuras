public class Employee {
  private String name;
  private String lastName;
  private String address;
  private int age;
  private String carge;

  public Employee() {
  }

  public Employee(String name, String lastName, String address, int age, String carge) {
    this.name = name;
    this.lastName = lastName;
    this.address = address;
    this.age = age;
    this.carge = carge;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCarge() {
    return carge;
  }

  public void setCarge(String carge) {
    this.carge = carge;
  }
}
