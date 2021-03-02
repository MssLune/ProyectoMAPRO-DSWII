
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaUsuarioPorCargo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaUsuarioPorCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCargo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaUsuarioPorCargo", propOrder = {
    "idCargo"
})
public class ListaUsuarioPorCargo {

    protected int idCargo;

    /**
     * Obtiene el valor de la propiedad idCargo.
     * 
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * Define el valor de la propiedad idCargo.
     * 
     */
    public void setIdCargo(int value) {
        this.idCargo = value;
    }

}
