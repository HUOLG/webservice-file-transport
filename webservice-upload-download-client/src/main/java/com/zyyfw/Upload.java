
package com.zyyfw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>upload complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="upload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file" type="{http://zyyfw.com/}cxfFileWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upload", propOrder = {
    "file"
})
public class Upload {

    protected CxfFileWrapper file;

    /**
     * ��ȡfile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CxfFileWrapper }
     *     
     */
    public CxfFileWrapper getFile() {
        return file;
    }

    /**
     * ����file���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CxfFileWrapper }
     *     
     */
    public void setFile(CxfFileWrapper value) {
        this.file = value;
    }

}
