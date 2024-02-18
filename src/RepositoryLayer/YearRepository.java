package RepositoryLayer;

import java.time.Year;

public class YearRepository {

    public YearRepository(){
        System.out.println("Inside Year - Repository class");
    }
    public int getCurrentYear(){
        System.out.println("Fetching year from database !!");
        return 2024;
    }
}
