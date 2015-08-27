
package proj;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proj package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateTableResponse_QNAME = new QName("http://proj/", "updateTableResponse");
    private final static QName _UpdateTable_QNAME = new QName("http://proj/", "updateTable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proj
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateTable }
     * 
     */
    public UpdateTable createUpdateTable() {
        return new UpdateTable();
    }

    /**
     * Create an instance of {@link UpdateTableResponse }
     * 
     */
    public UpdateTableResponse createUpdateTableResponse() {
        return new UpdateTableResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proj/", name = "updateTableResponse")
    public JAXBElement<UpdateTableResponse> createUpdateTableResponse(UpdateTableResponse value) {
        return new JAXBElement<UpdateTableResponse>(_UpdateTableResponse_QNAME, UpdateTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://proj/", name = "updateTable")
    public JAXBElement<UpdateTable> createUpdateTable(UpdateTable value) {
        return new JAXBElement<UpdateTable>(_UpdateTable_QNAME, UpdateTable.class, null, value);
    }

}
