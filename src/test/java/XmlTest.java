import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

import static org.junit.Assert.*;

public class XmlTest {
private XmlValidation xml=new XmlValidation();
    @Test
    public void isValid() {
        assertTrue(xml.isValid("C:\\Users\\Ilya\\homework17\\src\\main\\resources\\rightXML.xml"));
            System.out.println(true);
    }
    @Test
    public void isNotValid(){
            assertFalse(xml.isValid("C:\\Users\\Ilya\\homework17\\src\\main\\resources\\wrongXML.xml"));
            System.out.println(false);
    }
}