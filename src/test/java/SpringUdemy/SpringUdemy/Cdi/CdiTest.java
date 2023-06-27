package SpringUdemy.SpringUdemy.Cdi;

import SpringBootBasics.SpringUdemy.Cdi.CdiBusiness;
import SpringBootBasics.SpringUdemy.Cdi.CdiDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CdiTest {

   @Mock
   CdiDAO cdiDAO;

    @InjectMocks
    CdiBusiness cdiBusiness;

    @Test
    public void testBasicScenario() {
        when(cdiDAO.getData()).thenReturn(new int[] { 2, 4 });
        // Verify the result
        assertEquals(4, cdiBusiness.findGreatest());
    }

    @Test
    public void testBasicScenario_NoElement() {
        when(cdiDAO.getData()).thenReturn(new int[] {});
        // Verify the result
        assertEquals(Integer.MIN_VALUE, cdiBusiness.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElement() {
        when(cdiDAO.getData()).thenReturn(new int[] {2,2});
        // Verify the result
        assertEquals(2, cdiBusiness.findGreatest());
    }

}
