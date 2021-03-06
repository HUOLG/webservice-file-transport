package com.zyyfw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-04-09T16:52:46.711+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "FileWSImplService", 
                  wsdlLocation = "http://localhost:8762/soap/user?wsdl",
                  targetNamespace = "http://zyyfw.com/") 
public class FileWSImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://zyyfw.com/", "FileWSImplService");
    public final static QName FileWSImplPort = new QName("http://zyyfw.com/", "FileWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8762/soap/user?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FileWSImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8762/soap/user?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FileWSImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FileWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileWSImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileWSImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileWSImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public FileWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns FileWS
     */
    @WebEndpoint(name = "FileWSImplPort")
    public FileWS getFileWSImplPort() {
        return super.getPort(FileWSImplPort, FileWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileWS
     */
    @WebEndpoint(name = "FileWSImplPort")
    public FileWS getFileWSImplPort(WebServiceFeature... features) {
        return super.getPort(FileWSImplPort, FileWS.class, features);
    }

}
