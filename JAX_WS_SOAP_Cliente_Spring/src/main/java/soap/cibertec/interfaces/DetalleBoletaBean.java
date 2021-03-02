
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleBoletaBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleBoletaBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBoleta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idDNA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleBoletaBean", propOrder = {
    "idBoleta",
    "idDNA",
    "precio"
})
public class DetalleBoletaBean {

    protected int idBoleta;
    protected int idDNA;
    protected double precio;

    /**
     * Obtiene el valor de la propiedad idBoleta.
     * 
     */
    public int getIdBoleta() {
        return idBoleta;
    }

    /**
     * Define el valor de la propiedad idBoleta.
     * 
     */
    public void setIdBoleta(int value) {
        this.idBoleta = value;
    }

    /**
     * Obtiene el valor de la propiedad idDNA.
     * 
     */
    public int getIdDNA() {
        return idDNA;
    }

    /**
     * Define el valor de la propiedad idDNA.
     * 
     */
    public void setIdDNA(int value) {
        this.idDNA = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

}
