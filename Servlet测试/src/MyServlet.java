import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.txw2.TypedXmlWriter;
import com.sun.xml.internal.ws.wsdl.writer.document.Documented;
import com.sun.xml.internal.ws.wsdl.writer.document.Port;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

import javax.xml.namespace.QName;

public class MyServlet implements Service {
    @Override
    public Service name(String s) {
        return null;
    }

    @Override
    public Port port() {
        return null;
    }

    @Override
    public Documented documentation(String s) {
        return null;
    }

    @Override
    public void commit() {

    }

    @Override
    public void commit(boolean b) {

    }

    @Override
    public void block() {

    }

    @Override
    public Document getDocument() {
        return null;
    }

    @Override
    public void _attribute(String s, Object o) {

    }

    @Override
    public void _attribute(String s, String s1, Object o) {

    }

    @Override
    public void _attribute(QName qName, Object o) {

    }

    @Override
    public void _namespace(String s) {

    }

    @Override
    public void _namespace(String s, String s1) {

    }

    @Override
    public void _namespace(String s, boolean b) {

    }

    @Override
    public void _pcdata(Object o) {

    }

    @Override
    public void _cdata(Object o) {

    }

    @Override
    public void _comment(Object o) throws UnsupportedOperationException {

    }

    @Override
    public <T extends TypedXmlWriter> T _element(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(String s, String s1, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(QName qName, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _element(Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends TypedXmlWriter> T _cast(Class<T> aClass) {
        return null;
    }
}
