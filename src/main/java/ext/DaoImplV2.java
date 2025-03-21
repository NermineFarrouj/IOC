package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {


    @Override
    public double getData() {
        System.out.println("Version: WS");
        double t= 19;
        return t;
    }
}
