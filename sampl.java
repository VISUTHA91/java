import java.util.Scanner;
 class Student{
    private String name;
    private int age;
    private String address;
    private String email;

    public Student(){}

    public Student(String name, int age, String address, String email){
       this.name = name;
       this.age = age;
       this.address = address;
       this.email = email;
    }

    public void setName(String newName){
       name = newName;
    }
    public void setAge(int newAge){
       age = newAge;
    }
    public void setAddress(String newAddress){
       address = newAddress;
    }
    public void setEmail(String newEmail){
       email = newEmail;
    }

    public String getName(){
      return name;
    }
    public int getAge(){
      return age;
    }
    public String getAddress(){
      return address;
    }
    public String getEmail(){
      return email;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email;
    }
  }

    public class sampl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] s= new Student[];

        for(int i = 0; i < 5; i++){
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Address: ");
            sc.nextLine();
            String address = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            s[i] = new Student(name,age,address,email);
        }
        for(int i = 0; i < s.size(); i++){
            if(s)
        }

        System.out.println(Arrays.toString(s));

    }
}