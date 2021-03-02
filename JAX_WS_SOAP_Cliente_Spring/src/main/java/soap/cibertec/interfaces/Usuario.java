
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://interfaces.cibertec.soap/}cargo" minOccurs="0"/>
 *         &lt;element name="codigoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="correoUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "apellidoUsuario",
    "cargo",
    "codigoUsuario",
    "correoUsuario",
    "fechaUsuario",
    "idUsuario",
    "nombreUsuario",
    "passwordUsuario"
})
public class Usuario {

    protected String apellidoUsuario;
    protected Cargo cargo;
    protected int codigoUsuario;
    protected String correoUsuario;
    protected String fechaUsuario;
    protected String idUsuario;
    protected String nombreUsuario;
    protected String passwordUsuario;

	/**
     * Obtiene el valor de la propiedad apellidoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    
    public String getNombreCompleto() {
        return nombreUsuario+" "+apellidoUsuario;
    }
    
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * Define el valor de la propiedad apellidoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoUsuario(String value) {
        this.apellidoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargo(Cargo value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuario.
     * 
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Define el valor de la propiedad codigoUsuario.
     * 
     */
    public void setCodigoUsuario(int value) {
        this.codigoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad correoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    /**
     * Define el valor de la propiedad correoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoUsuario(String value) {
        this.correoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUsuario() {
        return fechaUsuario;
    }

    /**
     * Define el valor de la propiedad fechaUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUsuario(String value) {
        this.fechaUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    /**
     * Define el valor de la propiedad passwordUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordUsuario(String value) {
        this.passwordUsuario = value;
    }

}
