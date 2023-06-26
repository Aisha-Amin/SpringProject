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


}
