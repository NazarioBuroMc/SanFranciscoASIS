//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.01 a las 03:40:31 PM CST 
//


package mx.com.buro.mc.generated.addenda.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}personOrDepartmentName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personOrDepartmentName"
})
@XmlRootElement(name = "contactInformation")
public class ContactInformation {

    @XmlElement(required = true)
    protected Text personOrDepartmentName;

    /**
     * Obtiene el valor de la propiedad personOrDepartmentName.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getPersonOrDepartmentName() {
        return personOrDepartmentName;
    }

    /**
     * Define el valor de la propiedad personOrDepartmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setPersonOrDepartmentName(Text value) {
        this.personOrDepartmentName = value;
    }

}
