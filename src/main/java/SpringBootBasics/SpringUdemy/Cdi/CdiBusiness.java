package SpringBootBasics.SpringUdemy.Cdi;


import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class CdiBusiness {

    @Inject
    CdiDAO cdiDAO;

    public CdiDAO getCdiDAO() {
        return cdiDAO;
    }

    public void setCdiDAO(CdiDAO cdiDAO) {
        this.cdiDAO = cdiDAO;
    }

    public int findGreatest(){
        int greatestValue = Integer.MIN_VALUE;
       int[] data =  cdiDAO.getData();
       for(int value : data){
           if(value > greatestValue){
               greatestValue = value;
           }
       }
       return greatestValue;
    }


}
