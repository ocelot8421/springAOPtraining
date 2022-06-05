package vid067_Step_01_Setting_up_AOP_Example_Part_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vid067_Step_01_Setting_up_AOP_Example_Part_1.repository.Dao1;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        return dao1.retrieveString();
    }

}
