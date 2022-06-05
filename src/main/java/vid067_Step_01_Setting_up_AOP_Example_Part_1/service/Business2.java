package vid067_Step_01_Setting_up_AOP_Example_Part_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vid067_Step_01_Setting_up_AOP_Example_Part_1.repository.Dao2;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        return dao2.retrieveString();
    }

}
