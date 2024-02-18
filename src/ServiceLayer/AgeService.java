package ServiceLayer;

import RepositoryLayer.YearRepository;

public class AgeService {
    public AgeService(){
        System.out.println("Inside Age-Service Layer !");
    }
    public int calculateAge(int birthYear){
        YearRepository yearRepository = new YearRepository();
        int currYear = yearRepository.getCurrentYear();
        return currYear - birthYear;
    }
}
