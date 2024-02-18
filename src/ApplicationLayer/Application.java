package ApplicationLayer;

import ServiceLayer.AgeService;

public class Application {
    public  Application(){
        System.out.println("Inside application layer");

    }
    public void getAge(int birthYear){
        AgeService ageService = new AgeService();
        int age = ageService.calculateAge(birthYear);
        System.out.println("Your age is : " + age);
    }
}
