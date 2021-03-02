
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotorOrigin complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotorOrigin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccionPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distrito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dniPromotor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emailPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odepartamento" type="{http://interfaces.cibertec.soap/}departamento" minOccurs="0"/>
 *         &lt;element name="odistrito" type="{http://interfaces.cibertec.soap/}distrito" minOccurs="0"/>
 *         &lt;element name="ogenero" type="{http://interfaces.cibertec.soap/}genero" minOccurs="0"/>
 *         &lt;element name="ogrado" type="{http://interfaces.cibertec.soap/}grado" minOccurs="0"/>
 *         &lt;element name="oprovincia" type="{http://interfaces.cibertec.soap/}provincia" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "promotorOrigin", propOrder = {
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
    "odepartamento",
    "odistrito",
    "ogenero",
    "ogrado",
    "oprovincia",
    "provincia",
    "telefonoPromotor"
})
public class PromotorOrigin {

    protected String apellidoPromotor;
    protected int codigoPromotor;
    protected int departamento;
    protected String direccionPromotor;
    protected int distrito;
    protected int dniPromotor;
    protected String emailPromotor;
    protected int genero;
    protected int grado;
    protected String nombrePromotor;
    protected Departamento odepartamento;
    protected Distrito odistrito;
    protected Genero ogenero;
    protected Grado ogrado;
    protected Provincia oprovincia;
    protected int provincia;
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
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     */
    public void setDepartamento(int value) {
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
     */
    public int getDistrito() {
        return distrito;
    }

    /**
     * Define el valor de la propiedad distrito.
     * 
     */
    public void setDistrito(int value) {
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
     */
    public int getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     */
    public void setGenero(int value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad grado.
     * 
     */
    public int getGrado() {
        return grado;
    }

    /**
     * Define el valor de la propiedad grado.
     * 
     */
    public void setGrado(int value) {
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
     * Obtiene el valor de la propiedad odepartamento.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getOdepartamento() {
        return odepartamento;
    }

    /**
     * Define el valor de la propiedad odepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setOdepartamento(Departamento value) {
        this.odepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad odistrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getOdistrito() {
        return odistrito;
    }

    /**
     * Define el valor de la propiedad odistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setOdistrito(Distrito value) {
        this.odistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad ogenero.
     * 
     * @return
     *     possible object is
     *     {@link Genero }
     *     
     */
    public Genero getOgenero() {
        return ogenero;
    }

    /**
     * Define el valor de la propiedad ogenero.
     * 
     * @param value
     *     allowed object is
     *     {@link Genero }
     *     
     */
    public void setOgenero(Genero value) {
        this.ogenero = value;
    }

    /**
     * Obtiene el valor de la propiedad ogrado.
     * 
     * @return
     *     possible object is
     *     {@link Grado }
     *     
     */
    public Grado getOgrado() {
        return ogrado;
    }

    /**
     * Define el valor de la propiedad ogrado.
     * 
     * @param value
     *     allowed object is
     *     {@link Grado }
     *     
     */
    public void setOgrado(Grado value) {
        this.ogrado = value;
    }

    /**
     * Obtiene el valor de la propiedad oprovincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getOprovincia() {
        return oprovincia;
    }

    /**
     * Define el valor de la propiedad oprovincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setOprovincia(Provincia value) {
        this.oprovincia = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     */
    public int getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     */
    public void setProvincia(int value) {
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
