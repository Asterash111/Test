package com.example.hsport.assingment;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by macadmin on 2016-08-23.
 */
public class Questions {

    private final String[] arrQn =
            {"Frog young one is",
            "Pig young one is ",
            "Owl young one is",
            "Goat young one is",
            "Deer young one is",
            "Donkey young one is",
            "Horse young one is",
            "Lion young one is",
            "Giraffe young one is",
            "Fish young one is "};

    public final String [] arrOptA ={"Spawn"  ,"Pidgoet","Crane"  ,"Kid"    ,"Colt"   ,"Foal", "Infant","Cub"        ,"Giraffelet","Fishlet"};
    public final String [] arrOptB ={"Tadpole","Piglet" ,"Infant" ,"Goatlet","Fawn"   ,"Dunk", "Lamb"  ,"Lionie"     ,"Giraffete" ,"Fishling"};
    public final String [] arrOptC = {"Crane" ,"Infant" ,"Owlet"  ,"Calf"   ,"Kid"    ,"Crub", "Pony"  ,"Kittie"     ,"Guffy"     ,"Fry"};
    public final String [] arrOptD = {"fawn"  ,"Lamb"   ,"Spane"  ,"Lamb"   ,"Deerlet","Calf", "Colt"  ,"None Above" ,"Calf"      ,"Foul"};
    public final String [] arrAnswer = {"oB"  ,"oB"     ,"oC"     ,"oA"     ,"oB"     ,"oA"  , "oD"    ,"oA"         ,"oD"        ,"oC"};
    public static ArrayList<Integer> arrayRandom = new ArrayList<Integer>();
    public int num =0;
    public Questions(){
        Random randomnumber = new Random();
        num = randomnumber.nextInt(10);

        boolean b = false;
        b = this.check(num);
        while(b == true){
            num = randomnumber.nextInt(10);
            b = this.check(num);

        }
        arrayRandom.add(num);
    }
    public String getQuestion(){

         return arrQn[num];

    }
    public boolean check(int n){
        int b = 0;
        while ((b < arrayRandom.size())){
            if(n == arrayRandom.get(b)){
                return true;
            }
            b++;
        }
        return false;
    }

    public String getOptionA(){

        return arrOptA[num];
    }
    public String getOptionB(){

        return arrOptB[num];
    }
    public String getOptionC(){

        return arrOptC[num];
    }
    public String getOptionD(){

        return arrOptD[num];
    }
    public String getAnswer(){

        return arrAnswer[num];
    }

    public void clearRandomnum (){

        arrayRandom.clear();
    }

}
