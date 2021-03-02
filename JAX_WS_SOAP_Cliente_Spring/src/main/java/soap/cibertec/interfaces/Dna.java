
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambienteDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ambienteprivDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departamento" type="{http://interfaces.cibertec.soap/}departamento" minOccurs="0"/>
 *         &lt;element name="diasDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccionDna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://interfaces.cibertec.soap/}distrito" minOccurs="0"/>
 *         &lt;element name="documentoDna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreDna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotor" type="{http://interfaces.cibertec.soap/}promotor" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://interfaces.cibertec.soap/}provincia" minOccurs="0"/>
 *         &lt;element name="telefonoDna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dna", propOrder = {
    "ambienteDna",
    "ambienteprivDna",
    "codigoDna",
    "departamento",
    "diasDna",
    "direccionDna",
    "distrito",
    "documentoDna",
    "nombreDna",
    "promotor",
    "provincia",
    "telefonoDna"
})
public class Dna {

    protected int ambienteDna;
    protected int ambienteprivDna;
    protected int codigoDna;
    protected Departamento departamento;
    protected int diasDna;
    protected String direccionDna;
    protected Distrito distrito;
    protected String documentoDna;
    protected String nombreDna;
    protected Promotor promotor;
    protected Provincia provincia;
    protected int telefonoDna;

    /**
     * Obtiene el valor de la propiedad ambienteDna.
     * 
     */
    public void setPrecio(String precio) {
		precio="70";
		
	}
	
    public int getAmbienteDna() {
        return ambienteDna;
    }

    /**
     * Define el valor de la propiedad ambienteDna.
     * 
     */
    public void setAmbienteDna(int value) {
        this.ambienteDna = value;
    }

    /**
     * Obtiene el valor de la propiedad ambienteprivDna.
     * 
     */
    public int getAmbienteprivDna() {
        return ambienteprivDna;
    }

    /**
     * Define el valor de la propiedad ambienteprivDna.
     * 
     */
    public void setAmbienteprivDna(int value) {
        this.ambienteprivDna = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDna.
     * 
     */
    public int getCodigoDna() {
        return codigoDna;
    }

    /**
     * Define el valor de la propiedad codigoDna.
     * 
     */
    public void setCodigoDna(int value) {
        this.codigoDna = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad diasDna.
     * 
     */
    public int getDiasDna() {
        return diasDna;
    }

    /**
     * Define el valor de la propiedad diasDna.
     * 
     */
    public void setDiasDna(int value) {
        this.diasDna = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDna() {
        return direccionDna;
    }

    /**
     * Define el valor de la propiedad direccionDna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDna(String value) {
        this.direccionDna = value;
    }

    /**
     * Obtiene el valor de la propiedad distrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistrito(Distrito value) {
        this.distrito = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoDna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoDna() {
        return documentoDna;
    }

    /**
     * Define el valor de la propiedad documentoDna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoDna(String value) {
        this.documentoDna = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDna() {
        return nombreDna;
    }

    /**
     * Define el valor de la propiedad nombreDna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDna(String value) {
        this.nombreDna = value;
    }

    /**
     * Obtiene el valor de la propiedad promotor.
     * 
     * @return
     *     possible object is
     *     {@link Promotor }
     *     
     */
    public Promotor getPromotor() {
        return promotor;
    }

    /**
     * Define el valor de la propiedad promotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotor }
     *     
     */
    public void setPromotor(Promotor value) {
        this.promotor = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvincia(Provincia value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoDna.
     * 
     */
    public int getTelefonoDna() {
        return telefonoDna;
    }

    /**
     * Define el valor de la propiedad telefonoDna.
     * 
     */
    public void setTelefonoDna(int value) {
        this.telefonoDna = value;
    }

}
