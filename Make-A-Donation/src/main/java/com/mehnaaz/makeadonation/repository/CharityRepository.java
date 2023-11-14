package com.mehnaaz.makeadonation.repository;

import com.mehnaaz.makeadonation.model.Charity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.Optional;

import static java.time.LocalTime.now;

@Repository
public class CharityRepository {
    private  final ArrayList<Charity> charityArrayList = new ArrayList<>();

    CharityRepository (){
    }

   public Charity get(int id) throws Exception {
       return charityArrayList.stream().filter(x -> x.id() == id).findFirst().orElseThrow(() -> new Exception());
    }

    public  ArrayList<Charity> getAll(){
        return charityArrayList;
    }

    public  void addChairty(Charity charity){
        charityArrayList.add(charity);
    }
    public void modify(Charity charity) throws  Exception{
        Optional<Charity> charity1 =   charityArrayList.stream().filter(x -> x.id() == charity.id()).findFirst();
        if(charity1.isPresent()){
           Charity charity2 =  charity1.get() ;
            charity2 = charity;
        }else{
            throw  new Exception("Data not found");
        }
    }

    public  void delete (int id){
        charityArrayList.removeIf(  x-> x.id() == id);

    }




    @PostConstruct
     private  void init (){
        Charity charity = new Charity(1,"Mehnaaz",
            "Faiz -e - Aam",500, "INR",
                 new Date(System.currentTimeMillis()), "Hyderabad"
        );
        charityArrayList.add(charity);

    }

}
