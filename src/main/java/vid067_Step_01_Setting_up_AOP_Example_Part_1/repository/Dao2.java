package vid067_Step_01_Setting_up_AOP_Example_Part_1.repository;


import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveString(){
        return "Dao2";
    }
}
