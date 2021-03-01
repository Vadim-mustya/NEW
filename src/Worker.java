public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;



    Worker(String fullName,String position,String email,String phoneNumber,int salary,int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    void fetInfoOffWorker() {
        System.out.println("Имя: "+fullName);
        System.out.println("Должность: "+position);
        System.out.println("email: "+email);
        System.out.println("Телефон: "+phoneNumber);
        System.out.println("Зарплата: "+salary);
        System.out.println("Возраст: "+age);


    }
    int getWorkerAge(){
        return age;
    }


}