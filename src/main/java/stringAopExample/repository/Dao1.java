package stringAopExample.repository;


import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveString(){
        return "Dao1";
    }
}
