
package soap.cibertec.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para inserta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inserta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boleta" type="{http://interfaces.cibertec.soap/}boletaBean" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://interfaces.cibertec.soap/}detalleBoletaBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserta", propOrder = {
    "boleta",
    "arg1"
})
public class Inserta {

    protected BoletaBean boleta;
    protected List<DetalleBoletaBean> arg1;

    /**
     * Obtiene el valor de la propiedad boleta.
     * 
     * @return
     *     possible object is
     *     {@link BoletaBean }
     *     
     */
    public BoletaBean getBoleta() {
        return boleta;
    }

    /**
     * Define el valor de la propiedad boleta.
     * 
     * @param value
     *     allowed object is
     *     {@link BoletaBean }
     *     
     */
    public void setBoleta(BoletaBean value) {
        this.boleta = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleBoletaBean }
     * 
     * 
     */
    public List<DetalleBoletaBean> getArg1() {
        if (arg1 == null) {
            arg1 = new ArrayList<DetalleBoletaBean>();
        }
        return this.arg1;
    }

}
