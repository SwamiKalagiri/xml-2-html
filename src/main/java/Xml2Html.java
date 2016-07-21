import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import java.io.FileOutputStream;

public class Xml2Html {

    public static void main(String[] args) {
        try {

            TransformerFactory tFactory = TransformerFactory.newInstance();

            Transformer transformer =
                    tFactory.newTransformer
                            (new javax.xml.transform.stream.StreamSource
                                    ("src/main/resources/test.xsl"));

            transformer.transform
                    (new javax.xml.transform.stream.StreamSource
                                    ("src/main/resources/test.xml"),
                            new javax.xml.transform.stream.StreamResult
                                    (new FileOutputStream("src/main/resources/test.html")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


