
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departamento" type="{http://interfaces.cibertec.soap/}departamento" minOccurs="0"/>
 *         &lt;element name="direccionPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://interfaces.cibertec.soap/}distrito" minOccurs="0"/>
 *         &lt;element name="dniPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emailPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://interfaces.cibertec.soap/}genero" minOccurs="0"/>
 *         &lt;element name="grado" type="{http://interfaces.cibertec.soap/}grado" minOccurs="0"/>
 *         &lt;element name="nombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://interfaces.cibertec.soap/}provincia" minOccurs="0"/>
 *         &lt;element name="telefonoPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotor", propOrder = {
    "apellidoPromotor",
    "codigoPromotor",
    "departamento",
    "direccionPromotor",
    "distrito",
    "dniPromotor",
    "emailPromotor",
    "genero",
    "grado",
    "nombrePromotor",
    "provincia",
    "telefonoPromotor"
})
public class Promotor {

    protected String apellidoPromotor;
    protected int codigoPromotor;
    protected Departamento departamento;
    protected String direccionPromotor;
    protected Distrito distrito;
    protected int dniPromotor;
    protected String emailPromotor;
    protected Genero genero;
    protected Grado grado;
    protected String nombrePromotor;
    protected Provincia provincia;
    protected int telefonoPromotor;

    /**
     * Obtiene el valor de la propiedad apellidoPromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPromotor() {
        return apellidoPromotor;
    }

    /**
     * Define el valor de la propiedad apellidoPromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPromotor(String value) {
        this.apellidoPromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPromotor.
     * 
     */
    public int getCodigoPromotor() {
        return codigoPromotor;
    }

    /**
     * Define el valor de la propiedad codigoPromotor.
     * 
     */
    public void setCodigoPromotor(int value) {
        this.codigoPromotor = value;
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
     * Obtiene el valor de la propiedad direccionPromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionPromotor() {
        return direccionPromotor;
    }

    /**
     * Define el valor de la propiedad direccionPromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionPromotor(String value) {
        this.direccionPromotor = value;
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
     * Obtiene el valor de la propiedad dniPromotor.
     * 
     */
    public int getDniPromotor() {
        return dniPromotor;
    }

    /**
     * Define el valor de la propiedad dniPromotor.
     * 
     */
    public void setDniPromotor(int value) {
        this.dniPromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad emailPromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPromotor() {
        return emailPromotor;
    }

    /**
     * Define el valor de la propiedad emailPromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPromotor(String value) {
        this.emailPromotor = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link Genero }
     *     
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link Genero }
     *     
     */
    public void setGenero(Genero value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad grado.
     * 
     * @return
     *     possible object is
     *     {@link Grado }
     *     
     */
    public Grado getGrado() {
        return grado;
    }

    /**
     * Define el valor de la propiedad grado.
     * 
     * @param value
     *     allowed object is
     *     {@link Grado }
     *     
     */
    public void setGrado(Grado value) {
        this.grado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePromotor() {
        return nombrePromotor;
    }

    /**
     * Define el valor de la propiedad nombrePromotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePromotor(String value) {
        this.nombrePromotor = value;
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
     * Obtiene el valor de la propiedad telefonoPromotor.
     * 
     */
    public int getTelefonoPromotor() {
        return telefonoPromotor;
    }

    /**
     * Define el valor de la propiedad telefonoPromotor.
     * 
     */
    public void setTelefonoPromotor(int value) {
        this.telefonoPromotor = value;
    }

}
