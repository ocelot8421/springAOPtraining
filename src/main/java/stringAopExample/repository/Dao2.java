package stringAopExample.repository;


import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveString(){
        return "Dao2";
    }
}
