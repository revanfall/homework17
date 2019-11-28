import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlValidation {
    public boolean isValid(String path) {
        try {
            DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document=parser.parse(path);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            return false;
        }
        return true;
    }

}
