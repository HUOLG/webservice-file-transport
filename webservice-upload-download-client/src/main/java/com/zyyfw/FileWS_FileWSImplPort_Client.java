
package com.zyyfw;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2018-04-09T16:52:46.650+08:00
 * Generated source version: 2.5.9
 * 
 */
public final class FileWS_FileWSImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://zyyfw.com/", "FileWSImplService");

    private FileWS_FileWSImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FileWSImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        FileWSImplService ss = new FileWSImplService(wsdlURL, SERVICE_NAME);
        FileWS port = ss.getFileWSImplPort();  

        //文件下载
        {
        System.out.println("Invoking download...");
        com.zyyfw.CxfFileWrapper _download__return = port.download();

        _download__return.setFileName("123.xml");
        _download__return.setFileExtension("xml");


        System.out.println("download.result=" + _download__return);


        }

//        文件上传
       /* {
        System.out.println("Invoking upload...");
        com.zyyfw.CxfFileWrapper _upload_file = new CxfFileWrapper();
        _upload_file.setFileName("test.csv");
        _upload_file.setFileExtension("csv");
        DataSource source = new FileDataSource(new File("d:\\test.csv"));
        _upload_file.setFile(new DataHandler(source));
        boolean _upload__return = port.upload(_upload_file);
        System.out.println("upload.result=" + _upload__return);
        }*/

        System.exit(0);
    }




}
