package SpringBootBasics.SpringUdemy.Cdi;


import jakarta.inject.Named;

@Named
public class CdiDAO {

    public int[] getData(){
        return new int[]{5,20,6};
    }
}
