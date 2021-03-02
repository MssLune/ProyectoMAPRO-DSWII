
package soap.cibertec.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.cibertec.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListaPromotorPorDepartamento_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorPorDepartamento");
    private final static QName _ListaPromotors_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotors");
    private final static QName _BuscarDNA_QNAME = new QName("http://interfaces.cibertec.soap/", "buscarDNA");
    private final static QName _BuscarDNAResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "buscarDNAResponse");
    
    private final static QName _ListaProvinciaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaProvinciaResponse");
    private final static QName _ListaDnaPorCaracteres_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorCaracteres");
    private final static QName _ListaProvinciaPorDepartamento_QNAME = new QName("http://interfaces.cibertec.soap/", "listaProvinciaPorDepartamento");
    private final static QName _ListaDna_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDna");
    private final static QName _ListaGeneroResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaGeneroResponse");
    private final static QName _ListaUsuarioPorCargo_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuarioPorCargo");
    private final static QName _LoginResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "loginResponse");
    private final static QName _ActualizaPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaPromotorResponse");
    private final static QName _ListaExpeXPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXPromotorResponse");
    private final static QName _ActualizaCargo_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaCargo");
    private final static QName _InsertaDnaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaDnaResponse");
    private final static QName _ListaPromotorPorDepartamentoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorPorDepartamentoResponse");
    private final static QName _InsertaUsuarioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaUsuarioResponse");
    private final static QName _ListaUsuarioPorCaracteresResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuarioPorCaracteresResponse");
    private final static QName _ListaCargoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaCargoResponse");
    private final static QName _ListaGrado_QNAME = new QName("http://interfaces.cibertec.soap/", "listaGrado");
    private final static QName _InsertaDna_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaDna");
    private final static QName _ListaDnaPorPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorPromotor");
    private final static QName _EliminaPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaPromotor");
    private final static QName _ListaUsuarioPorCargoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuarioPorCargoResponse");
    private final static QName _ListaDistritoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDistritoResponse");
    private final static QName _BuscarPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "buscarPromotor");
    private final static QName _ListaPromotorOrigin_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorOrigin");
    private final static QName _ListaDnaPorPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorPromotorResponse");
    private final static QName _ListaProvincia_QNAME = new QName("http://interfaces.cibertec.soap/", "listaProvincia");
    private final static QName _EliminaPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaPromotorResponse");
    private final static QName _ListaDnaPorDepartamento_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorDepartamento");
    private final static QName _LoginId_QNAME = new QName("http://interfaces.cibertec.soap/", "loginId");
    private final static QName _ActualizaCargoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaCargoResponse");
    private final static QName _InsertaPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaPromotor");
    private final static QName _ListaPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotor");
    private final static QName _ListaPromotorPorCaracteresResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorPorCaracteresResponse");
    private final static QName _EliminaDnaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaDnaResponse");
    private final static QName _ListaXCaracter_QNAME = new QName("http://interfaces.cibertec.soap/", "listaXCaracter");
    private final static QName _ListaDistrito_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDistrito");
    private final static QName _ListaCargo_QNAME = new QName("http://interfaces.cibertec.soap/", "listaCargo");
    private final static QName _ListaPromotorPorCaracteres_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorPorCaracteres");
    private final static QName _LoginIdResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "loginIdResponse");
    private final static QName _EjecutaSQL_QNAME = new QName("http://interfaces.cibertec.soap/", "ejecutaSQL");
    private final static QName _EliminaCargoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaCargoResponse");
    private final static QName _ActualizaUsuario_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaUsuario");
    private final static QName _EjecutaSQLResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "ejecutaSQLResponse");
    private final static QName _ListaExpeXCadenaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXCadenaResponse");
    private final static QName _ListaPromotorOriginResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorOriginResponse");
    private final static QName _ListaExpeXEstado_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXEstado");
    private final static QName _ListaXCaracterResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaXCaracterResponse");
    private final static QName _EliminaUsuarioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaUsuarioResponse");
    private final static QName _Inserta_QNAME = new QName("http://interfaces.cibertec.soap/", "inserta");
    private final static QName _ListaExpeXPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXPromotor");
    private final static QName _Exception_QNAME = new QName("http://interfaces.cibertec.soap/", "Exception");
    private final static QName _ActualizaPromotor_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaPromotor");
    private final static QName _ListaUsuarioPorCaracteres_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuarioPorCaracteres");
    private final static QName _InsertaUsuario_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaUsuario");
    private final static QName _ListaCargos_QNAME = new QName("http://interfaces.cibertec.soap/", "listaCargos");
    private final static QName _ListaDnaPorCaracteresResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorCaracteresResponse");
    private final static QName _ActualizaDna_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaDna");
    private final static QName _ListaLogUsuarioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaLogUsuarioResponse");
    private final static QName _ListaGenero_QNAME = new QName("http://interfaces.cibertec.soap/", "listaGenero");
    private final static QName _InsertaCargoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaCargoResponse");
    private final static QName _ListaExpeXCadena_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXCadena");
    private final static QName _InsertaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaResponse");
    private final static QName _ListaExpediente_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpediente");
    private final static QName _ListaUsuario_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuario");
    private final static QName _InsertaCargo_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaCargo");
    private final static QName _EliminaCargo_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaCargo");
    private final static QName _Login_QNAME = new QName("http://interfaces.cibertec.soap/", "login");
    private final static QName _InsertaPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "insertaPromotorResponse");
    private final static QName _ListaProvinciaPorDepartamentoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaProvinciaPorDepartamentoResponse");
    private final static QName _ListaDistritoPorProvinciaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDistritoPorProvinciaResponse");
    private final static QName _ListaExpedienteResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpedienteResponse");
    private final static QName _ListaCargosResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaCargosResponse");
    private final static QName _EliminaDna_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaDna");
    private final static QName _ListaDistritoPorProvincia_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDistritoPorProvincia");
    private final static QName _ListaGradoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaGradoResponse");
    private final static QName _ListaPromotorsResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorsResponse");
    private final static QName _ActualizaUsuarioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaUsuarioResponse");
    private final static QName _ListaLogUsuario_QNAME = new QName("http://interfaces.cibertec.soap/", "listaLogUsuario");
    private final static QName _ActualizaDnaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "actualizaDnaResponse");
    private final static QName _BuscarPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "buscarPromotorResponse");
    private final static QName _ListaDepartamentoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDepartamentoResponse");
    private final static QName _ListaDnaPorDepartamentoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaPorDepartamentoResponse");
    private final static QName _ListaDepartamento_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDepartamento");
    private final static QName _ListaUsuarioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaUsuarioResponse");
    private final static QName _ListaPromotorResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaPromotorResponse");
    private final static QName _ListaDnaResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaDnaResponse");
    private final static QName _ListaExpeXEstadoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listaExpeXEstadoResponse");
    private final static QName _EliminaUsuario_QNAME = new QName("http://interfaces.cibertec.soap/", "eliminaUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.cibertec.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminaPromotorResponse }
     * 
     */
    public EliminaPromotorResponse createEliminaPromotorResponse() {
        return new EliminaPromotorResponse();
    }
    /**
     * Create an instance of {@link BuscarDNA }
     * 
     */
    public BuscarDNA createBuscarDNA() {
        return new BuscarDNA();
    }
    /**
     * Create an instance of {@link BuscarDNAResponse }
     * 
     */
    public BuscarDNAResponse createBuscarDNAResponse() {
        return new BuscarDNAResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "buscarDNA")
    public JAXBElement<BuscarDNA> createBuscarDNA(BuscarDNA value) {
        return new JAXBElement<BuscarDNA>(_BuscarDNA_QNAME, BuscarDNA.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDNAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "buscarDNAResponse")
    public JAXBElement<BuscarDNAResponse> createBuscarDNAResponse(BuscarDNAResponse value) {
        return new JAXBElement<BuscarDNAResponse>(_BuscarDNAResponse_QNAME, BuscarDNAResponse.class, null, value);
    }

    
    
    /**
     * Create an instance of {@link ListaDnaPorDepartamento }
     * 
     */
    public ListaDnaPorDepartamento createListaDnaPorDepartamento() {
        return new ListaDnaPorDepartamento();
    }

    /**
     * Create an instance of {@link LoginId }
     * 
     */
    public LoginId createLoginId() {
        return new LoginId();
    }

    /**
     * Create an instance of {@link ListaDistritoResponse }
     * 
     */
    public ListaDistritoResponse createListaDistritoResponse() {
        return new ListaDistritoResponse();
    }

    /**
     * Create an instance of {@link BuscarPromotor }
     * 
     */
    public BuscarPromotor createBuscarPromotor() {
        return new BuscarPromotor();
    }

    /**
     * Create an instance of {@link ListaPromotorOrigin }
     * 
     */
    public ListaPromotorOrigin createListaPromotorOrigin() {
        return new ListaPromotorOrigin();
    }

    /**
     * Create an instance of {@link ListaProvincia }
     * 
     */
    public ListaProvincia createListaProvincia() {
        return new ListaProvincia();
    }

    /**
     * Create an instance of {@link ListaDnaPorPromotorResponse }
     * 
     */
    public ListaDnaPorPromotorResponse createListaDnaPorPromotorResponse() {
        return new ListaDnaPorPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaXCaracter }
     * 
     */
    public ListaXCaracter createListaXCaracter() {
        return new ListaXCaracter();
    }

    /**
     * Create an instance of {@link ListaCargo }
     * 
     */
    public ListaCargo createListaCargo() {
        return new ListaCargo();
    }

    /**
     * Create an instance of {@link ListaDistrito }
     * 
     */
    public ListaDistrito createListaDistrito() {
        return new ListaDistrito();
    }

    /**
     * Create an instance of {@link ListaPromotorPorCaracteres }
     * 
     */
    public ListaPromotorPorCaracteres createListaPromotorPorCaracteres() {
        return new ListaPromotorPorCaracteres();
    }

    /**
     * Create an instance of {@link LoginIdResponse }
     * 
     */
    public LoginIdResponse createLoginIdResponse() {
        return new LoginIdResponse();
    }

    /**
     * Create an instance of {@link ActualizaCargoResponse }
     * 
     */
    public ActualizaCargoResponse createActualizaCargoResponse() {
        return new ActualizaCargoResponse();
    }

    /**
     * Create an instance of {@link InsertaPromotor }
     * 
     */
    public InsertaPromotor createInsertaPromotor() {
        return new InsertaPromotor();
    }

    /**
     * Create an instance of {@link ListaPromotor }
     * 
     */
    public ListaPromotor createListaPromotor() {
        return new ListaPromotor();
    }

    /**
     * Create an instance of {@link EliminaDnaResponse }
     * 
     */
    public EliminaDnaResponse createEliminaDnaResponse() {
        return new EliminaDnaResponse();
    }

    /**
     * Create an instance of {@link ListaPromotorPorCaracteresResponse }
     * 
     */
    public ListaPromotorPorCaracteresResponse createListaPromotorPorCaracteresResponse() {
        return new ListaPromotorPorCaracteresResponse();
    }

    /**
     * Create an instance of {@link ListaGeneroResponse }
     * 
     */
    public ListaGeneroResponse createListaGeneroResponse() {
        return new ListaGeneroResponse();
    }

    /**
     * Create an instance of {@link ActualizaPromotorResponse }
     * 
     */
    public ActualizaPromotorResponse createActualizaPromotorResponse() {
        return new ActualizaPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaExpeXPromotorResponse }
     * 
     */
    public ListaExpeXPromotorResponse createListaExpeXPromotorResponse() {
        return new ListaExpeXPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaUsuarioPorCargo }
     * 
     */
    public ListaUsuarioPorCargo createListaUsuarioPorCargo() {
        return new ListaUsuarioPorCargo();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ListaPromotorPorDepartamento }
     * 
     */
    public ListaPromotorPorDepartamento createListaPromotorPorDepartamento() {
        return new ListaPromotorPorDepartamento();
    }

    /**
     * Create an instance of {@link ListaPromotors }
     * 
     */
    public ListaPromotors createListaPromotors() {
        return new ListaPromotors();
    }

    /**
     * Create an instance of {@link ListaProvinciaResponse }
     * 
     */
    public ListaProvinciaResponse createListaProvinciaResponse() {
        return new ListaProvinciaResponse();
    }

    /**
     * Create an instance of {@link ListaProvinciaPorDepartamento }
     * 
     */
    public ListaProvinciaPorDepartamento createListaProvinciaPorDepartamento() {
        return new ListaProvinciaPorDepartamento();
    }

    /**
     * Create an instance of {@link ListaDnaPorCaracteres }
     * 
     */
    public ListaDnaPorCaracteres createListaDnaPorCaracteres() {
        return new ListaDnaPorCaracteres();
    }

    /**
     * Create an instance of {@link ListaDna }
     * 
     */
    public ListaDna createListaDna() {
        return new ListaDna();
    }

    /**
     * Create an instance of {@link ListaPromotorPorDepartamentoResponse }
     * 
     */
    public ListaPromotorPorDepartamentoResponse createListaPromotorPorDepartamentoResponse() {
        return new ListaPromotorPorDepartamentoResponse();
    }

    /**
     * Create an instance of {@link InsertaUsuarioResponse }
     * 
     */
    public InsertaUsuarioResponse createInsertaUsuarioResponse() {
        return new InsertaUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListaUsuarioPorCaracteresResponse }
     * 
     */
    public ListaUsuarioPorCaracteresResponse createListaUsuarioPorCaracteresResponse() {
        return new ListaUsuarioPorCaracteresResponse();
    }

    /**
     * Create an instance of {@link InsertaDna }
     * 
     */
    public InsertaDna createInsertaDna() {
        return new InsertaDna();
    }

    /**
     * Create an instance of {@link ListaDnaPorPromotor }
     * 
     */
    public ListaDnaPorPromotor createListaDnaPorPromotor() {
        return new ListaDnaPorPromotor();
    }

    /**
     * Create an instance of {@link ListaCargoResponse }
     * 
     */
    public ListaCargoResponse createListaCargoResponse() {
        return new ListaCargoResponse();
    }

    /**
     * Create an instance of {@link ListaGrado }
     * 
     */
    public ListaGrado createListaGrado() {
        return new ListaGrado();
    }

    /**
     * Create an instance of {@link EliminaPromotor }
     * 
     */
    public EliminaPromotor createEliminaPromotor() {
        return new EliminaPromotor();
    }

    /**
     * Create an instance of {@link ListaUsuarioPorCargoResponse }
     * 
     */
    public ListaUsuarioPorCargoResponse createListaUsuarioPorCargoResponse() {
        return new ListaUsuarioPorCargoResponse();
    }

    /**
     * Create an instance of {@link ActualizaCargo }
     * 
     */
    public ActualizaCargo createActualizaCargo() {
        return new ActualizaCargo();
    }

    /**
     * Create an instance of {@link InsertaDnaResponse }
     * 
     */
    public InsertaDnaResponse createInsertaDnaResponse() {
        return new InsertaDnaResponse();
    }

    /**
     * Create an instance of {@link ListaCargosResponse }
     * 
     */
    public ListaCargosResponse createListaCargosResponse() {
        return new ListaCargosResponse();
    }

    /**
     * Create an instance of {@link ListaDistritoPorProvinciaResponse }
     * 
     */
    public ListaDistritoPorProvinciaResponse createListaDistritoPorProvinciaResponse() {
        return new ListaDistritoPorProvinciaResponse();
    }

    /**
     * Create an instance of {@link ListaExpedienteResponse }
     * 
     */
    public ListaExpedienteResponse createListaExpedienteResponse() {
        return new ListaExpedienteResponse();
    }

    /**
     * Create an instance of {@link ListaDistritoPorProvincia }
     * 
     */
    public ListaDistritoPorProvincia createListaDistritoPorProvincia() {
        return new ListaDistritoPorProvincia();
    }

    /**
     * Create an instance of {@link ListaGradoResponse }
     * 
     */
    public ListaGradoResponse createListaGradoResponse() {
        return new ListaGradoResponse();
    }

    /**
     * Create an instance of {@link ListaPromotorsResponse }
     * 
     */
    public ListaPromotorsResponse createListaPromotorsResponse() {
        return new ListaPromotorsResponse();
    }

    /**
     * Create an instance of {@link EliminaDna }
     * 
     */
    public EliminaDna createEliminaDna() {
        return new EliminaDna();
    }

    /**
     * Create an instance of {@link ListaLogUsuario }
     * 
     */
    public ListaLogUsuario createListaLogUsuario() {
        return new ListaLogUsuario();
    }

    /**
     * Create an instance of {@link ActualizaUsuarioResponse }
     * 
     */
    public ActualizaUsuarioResponse createActualizaUsuarioResponse() {
        return new ActualizaUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertaCargo }
     * 
     */
    public InsertaCargo createInsertaCargo() {
        return new InsertaCargo();
    }

    /**
     * Create an instance of {@link EliminaCargo }
     * 
     */
    public EliminaCargo createEliminaCargo() {
        return new EliminaCargo();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link InsertaPromotorResponse }
     * 
     */
    public InsertaPromotorResponse createInsertaPromotorResponse() {
        return new InsertaPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaProvinciaPorDepartamentoResponse }
     * 
     */
    public ListaProvinciaPorDepartamentoResponse createListaProvinciaPorDepartamentoResponse() {
        return new ListaProvinciaPorDepartamentoResponse();
    }

    /**
     * Create an instance of {@link ListaDnaResponse }
     * 
     */
    public ListaDnaResponse createListaDnaResponse() {
        return new ListaDnaResponse();
    }

    /**
     * Create an instance of {@link ListaExpeXEstadoResponse }
     * 
     */
    public ListaExpeXEstadoResponse createListaExpeXEstadoResponse() {
        return new ListaExpeXEstadoResponse();
    }

    /**
     * Create an instance of {@link EliminaUsuario }
     * 
     */
    public EliminaUsuario createEliminaUsuario() {
        return new EliminaUsuario();
    }

    /**
     * Create an instance of {@link ActualizaDnaResponse }
     * 
     */
    public ActualizaDnaResponse createActualizaDnaResponse() {
        return new ActualizaDnaResponse();
    }

    /**
     * Create an instance of {@link BuscarPromotorResponse }
     * 
     */
    public BuscarPromotorResponse createBuscarPromotorResponse() {
        return new BuscarPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaDnaPorDepartamentoResponse }
     * 
     */
    public ListaDnaPorDepartamentoResponse createListaDnaPorDepartamentoResponse() {
        return new ListaDnaPorDepartamentoResponse();
    }

    /**
     * Create an instance of {@link ListaDepartamentoResponse }
     * 
     */
    public ListaDepartamentoResponse createListaDepartamentoResponse() {
        return new ListaDepartamentoResponse();
    }

    /**
     * Create an instance of {@link ListaDepartamento }
     * 
     */
    public ListaDepartamento createListaDepartamento() {
        return new ListaDepartamento();
    }

    /**
     * Create an instance of {@link ListaUsuarioResponse }
     * 
     */
    public ListaUsuarioResponse createListaUsuarioResponse() {
        return new ListaUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListaPromotorResponse }
     * 
     */
    public ListaPromotorResponse createListaPromotorResponse() {
        return new ListaPromotorResponse();
    }

    /**
     * Create an instance of {@link ListaUsuarioPorCaracteres }
     * 
     */
    public ListaUsuarioPorCaracteres createListaUsuarioPorCaracteres() {
        return new ListaUsuarioPorCaracteres();
    }

    /**
     * Create an instance of {@link InsertaUsuario }
     * 
     */
    public InsertaUsuario createInsertaUsuario() {
        return new InsertaUsuario();
    }

    /**
     * Create an instance of {@link ListaCargos }
     * 
     */
    public ListaCargos createListaCargos() {
        return new ListaCargos();
    }

    /**
     * Create an instance of {@link ListaDnaPorCaracteresResponse }
     * 
     */
    public ListaDnaPorCaracteresResponse createListaDnaPorCaracteresResponse() {
        return new ListaDnaPorCaracteresResponse();
    }

    /**
     * Create an instance of {@link ActualizaDna }
     * 
     */
    public ActualizaDna createActualizaDna() {
        return new ActualizaDna();
    }

    /**
     * Create an instance of {@link ListaLogUsuarioResponse }
     * 
     */
    public ListaLogUsuarioResponse createListaLogUsuarioResponse() {
        return new ListaLogUsuarioResponse();
    }

    /**
     * Create an instance of {@link EjecutaSQL }
     * 
     */
    public EjecutaSQL createEjecutaSQL() {
        return new EjecutaSQL();
    }

    /**
     * Create an instance of {@link EliminaCargoResponse }
     * 
     */
    public EliminaCargoResponse createEliminaCargoResponse() {
        return new EliminaCargoResponse();
    }

    /**
     * Create an instance of {@link ActualizaUsuario }
     * 
     */
    public ActualizaUsuario createActualizaUsuario() {
        return new ActualizaUsuario();
    }

    /**
     * Create an instance of {@link EjecutaSQLResponse }
     * 
     */
    public EjecutaSQLResponse createEjecutaSQLResponse() {
        return new EjecutaSQLResponse();
    }

    /**
     * Create an instance of {@link ListaExpeXCadenaResponse }
     * 
     */
    public ListaExpeXCadenaResponse createListaExpeXCadenaResponse() {
        return new ListaExpeXCadenaResponse();
    }

    /**
     * Create an instance of {@link ListaPromotorOriginResponse }
     * 
     */
    public ListaPromotorOriginResponse createListaPromotorOriginResponse() {
        return new ListaPromotorOriginResponse();
    }

    /**
     * Create an instance of {@link ListaExpeXEstado }
     * 
     */
    public ListaExpeXEstado createListaExpeXEstado() {
        return new ListaExpeXEstado();
    }

    /**
     * Create an instance of {@link ListaXCaracterResponse }
     * 
     */
    public ListaXCaracterResponse createListaXCaracterResponse() {
        return new ListaXCaracterResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ActualizaPromotor }
     * 
     */
    public ActualizaPromotor createActualizaPromotor() {
        return new ActualizaPromotor();
    }

    /**
     * Create an instance of {@link EliminaUsuarioResponse }
     * 
     */
    public EliminaUsuarioResponse createEliminaUsuarioResponse() {
        return new EliminaUsuarioResponse();
    }

    /**
     * Create an instance of {@link Inserta }
     * 
     */
    public Inserta createInserta() {
        return new Inserta();
    }

    /**
     * Create an instance of {@link ListaExpeXPromotor }
     * 
     */
    public ListaExpeXPromotor createListaExpeXPromotor() {
        return new ListaExpeXPromotor();
    }

    /**
     * Create an instance of {@link ListaExpeXCadena }
     * 
     */
    public ListaExpeXCadena createListaExpeXCadena() {
        return new ListaExpeXCadena();
    }

    /**
     * Create an instance of {@link InsertaResponse }
     * 
     */
    public InsertaResponse createInsertaResponse() {
        return new InsertaResponse();
    }

    /**
     * Create an instance of {@link ListaExpediente }
     * 
     */
    public ListaExpediente createListaExpediente() {
        return new ListaExpediente();
    }

    /**
     * Create an instance of {@link ListaUsuario }
     * 
     */
    public ListaUsuario createListaUsuario() {
        return new ListaUsuario();
    }

    /**
     * Create an instance of {@link ListaGenero }
     * 
     */
    public ListaGenero createListaGenero() {
        return new ListaGenero();
    }

    /**
     * Create an instance of {@link InsertaCargoResponse }
     * 
     */
    public InsertaCargoResponse createInsertaCargoResponse() {
        return new InsertaCargoResponse();
    }

    /**
     * Create an instance of {@link Grado }
     * 
     */
    public Grado createGrado() {
        return new Grado();
    }

    /**
     * Create an instance of {@link Dna }
     * 
     */
    public Dna createDna() {
        return new Dna();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

    /**
     * Create an instance of {@link DetalleBoletaBean }
     * 
     */
    public DetalleBoletaBean createDetalleBoletaBean() {
        return new DetalleBoletaBean();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link PromotorOrigin }
     * 
     */
    public PromotorOrigin createPromotorOrigin() {
        return new PromotorOrigin();
    }

    /**
     * Create an instance of {@link Promotor }
     * 
     */
    public Promotor createPromotor() {
        return new Promotor();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link Distrito }
     * 
     */
    public Distrito createDistrito() {
        return new Distrito();
    }

    /**
     * Create an instance of {@link Expediente }
     * 
     */
    public Expediente createExpediente() {
        return new Expediente();
    }

    /**
     * Create an instance of {@link BoletaBean }
     * 
     */
    public BoletaBean createBoletaBean() {
        return new BoletaBean();
    }

    /**
     * Create an instance of {@link ComboBean }
     * 
     */
    public ComboBean createComboBean() {
        return new ComboBean();
    }

    /**
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
    }

    /**
     * Create an instance of {@link Departamento }
     * 
     */
    public Departamento createDepartamento() {
        return new Departamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorPorDepartamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorPorDepartamento")
    public JAXBElement<ListaPromotorPorDepartamento> createListaPromotorPorDepartamento(ListaPromotorPorDepartamento value) {
        return new JAXBElement<ListaPromotorPorDepartamento>(_ListaPromotorPorDepartamento_QNAME, ListaPromotorPorDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotors")
    public JAXBElement<ListaPromotors> createListaPromotors(ListaPromotors value) {
        return new JAXBElement<ListaPromotors>(_ListaPromotors_QNAME, ListaPromotors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProvinciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaProvinciaResponse")
    public JAXBElement<ListaProvinciaResponse> createListaProvinciaResponse(ListaProvinciaResponse value) {
        return new JAXBElement<ListaProvinciaResponse>(_ListaProvinciaResponse_QNAME, ListaProvinciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorCaracteres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorCaracteres")
    public JAXBElement<ListaDnaPorCaracteres> createListaDnaPorCaracteres(ListaDnaPorCaracteres value) {
        return new JAXBElement<ListaDnaPorCaracteres>(_ListaDnaPorCaracteres_QNAME, ListaDnaPorCaracteres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProvinciaPorDepartamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaProvinciaPorDepartamento")
    public JAXBElement<ListaProvinciaPorDepartamento> createListaProvinciaPorDepartamento(ListaProvinciaPorDepartamento value) {
        return new JAXBElement<ListaProvinciaPorDepartamento>(_ListaProvinciaPorDepartamento_QNAME, ListaProvinciaPorDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDna")
    public JAXBElement<ListaDna> createListaDna(ListaDna value) {
        return new JAXBElement<ListaDna>(_ListaDna_QNAME, ListaDna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGeneroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaGeneroResponse")
    public JAXBElement<ListaGeneroResponse> createListaGeneroResponse(ListaGeneroResponse value) {
        return new JAXBElement<ListaGeneroResponse>(_ListaGeneroResponse_QNAME, ListaGeneroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuarioPorCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuarioPorCargo")
    public JAXBElement<ListaUsuarioPorCargo> createListaUsuarioPorCargo(ListaUsuarioPorCargo value) {
        return new JAXBElement<ListaUsuarioPorCargo>(_ListaUsuarioPorCargo_QNAME, ListaUsuarioPorCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaPromotorResponse")
    public JAXBElement<ActualizaPromotorResponse> createActualizaPromotorResponse(ActualizaPromotorResponse value) {
        return new JAXBElement<ActualizaPromotorResponse>(_ActualizaPromotorResponse_QNAME, ActualizaPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXPromotorResponse")
    public JAXBElement<ListaExpeXPromotorResponse> createListaExpeXPromotorResponse(ListaExpeXPromotorResponse value) {
        return new JAXBElement<ListaExpeXPromotorResponse>(_ListaExpeXPromotorResponse_QNAME, ListaExpeXPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaCargo")
    public JAXBElement<ActualizaCargo> createActualizaCargo(ActualizaCargo value) {
        return new JAXBElement<ActualizaCargo>(_ActualizaCargo_QNAME, ActualizaCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaDnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaDnaResponse")
    public JAXBElement<InsertaDnaResponse> createInsertaDnaResponse(InsertaDnaResponse value) {
        return new JAXBElement<InsertaDnaResponse>(_InsertaDnaResponse_QNAME, InsertaDnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorPorDepartamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorPorDepartamentoResponse")
    public JAXBElement<ListaPromotorPorDepartamentoResponse> createListaPromotorPorDepartamentoResponse(ListaPromotorPorDepartamentoResponse value) {
        return new JAXBElement<ListaPromotorPorDepartamentoResponse>(_ListaPromotorPorDepartamentoResponse_QNAME, ListaPromotorPorDepartamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaUsuarioResponse")
    public JAXBElement<InsertaUsuarioResponse> createInsertaUsuarioResponse(InsertaUsuarioResponse value) {
        return new JAXBElement<InsertaUsuarioResponse>(_InsertaUsuarioResponse_QNAME, InsertaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuarioPorCaracteresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuarioPorCaracteresResponse")
    public JAXBElement<ListaUsuarioPorCaracteresResponse> createListaUsuarioPorCaracteresResponse(ListaUsuarioPorCaracteresResponse value) {
        return new JAXBElement<ListaUsuarioPorCaracteresResponse>(_ListaUsuarioPorCaracteresResponse_QNAME, ListaUsuarioPorCaracteresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaCargoResponse")
    public JAXBElement<ListaCargoResponse> createListaCargoResponse(ListaCargoResponse value) {
        return new JAXBElement<ListaCargoResponse>(_ListaCargoResponse_QNAME, ListaCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaGrado")
    public JAXBElement<ListaGrado> createListaGrado(ListaGrado value) {
        return new JAXBElement<ListaGrado>(_ListaGrado_QNAME, ListaGrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaDna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaDna")
    public JAXBElement<InsertaDna> createInsertaDna(InsertaDna value) {
        return new JAXBElement<InsertaDna>(_InsertaDna_QNAME, InsertaDna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorPromotor")
    public JAXBElement<ListaDnaPorPromotor> createListaDnaPorPromotor(ListaDnaPorPromotor value) {
        return new JAXBElement<ListaDnaPorPromotor>(_ListaDnaPorPromotor_QNAME, ListaDnaPorPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaPromotor")
    public JAXBElement<EliminaPromotor> createEliminaPromotor(EliminaPromotor value) {
        return new JAXBElement<EliminaPromotor>(_EliminaPromotor_QNAME, EliminaPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuarioPorCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuarioPorCargoResponse")
    public JAXBElement<ListaUsuarioPorCargoResponse> createListaUsuarioPorCargoResponse(ListaUsuarioPorCargoResponse value) {
        return new JAXBElement<ListaUsuarioPorCargoResponse>(_ListaUsuarioPorCargoResponse_QNAME, ListaUsuarioPorCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDistritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDistritoResponse")
    public JAXBElement<ListaDistritoResponse> createListaDistritoResponse(ListaDistritoResponse value) {
        return new JAXBElement<ListaDistritoResponse>(_ListaDistritoResponse_QNAME, ListaDistritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "buscarPromotor")
    public JAXBElement<BuscarPromotor> createBuscarPromotor(BuscarPromotor value) {
        return new JAXBElement<BuscarPromotor>(_BuscarPromotor_QNAME, BuscarPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorOrigin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorOrigin")
    public JAXBElement<ListaPromotorOrigin> createListaPromotorOrigin(ListaPromotorOrigin value) {
        return new JAXBElement<ListaPromotorOrigin>(_ListaPromotorOrigin_QNAME, ListaPromotorOrigin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorPromotorResponse")
    public JAXBElement<ListaDnaPorPromotorResponse> createListaDnaPorPromotorResponse(ListaDnaPorPromotorResponse value) {
        return new JAXBElement<ListaDnaPorPromotorResponse>(_ListaDnaPorPromotorResponse_QNAME, ListaDnaPorPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProvincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaProvincia")
    public JAXBElement<ListaProvincia> createListaProvincia(ListaProvincia value) {
        return new JAXBElement<ListaProvincia>(_ListaProvincia_QNAME, ListaProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaPromotorResponse")
    public JAXBElement<EliminaPromotorResponse> createEliminaPromotorResponse(EliminaPromotorResponse value) {
        return new JAXBElement<EliminaPromotorResponse>(_EliminaPromotorResponse_QNAME, EliminaPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorDepartamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorDepartamento")
    public JAXBElement<ListaDnaPorDepartamento> createListaDnaPorDepartamento(ListaDnaPorDepartamento value) {
        return new JAXBElement<ListaDnaPorDepartamento>(_ListaDnaPorDepartamento_QNAME, ListaDnaPorDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "loginId")
    public JAXBElement<LoginId> createLoginId(LoginId value) {
        return new JAXBElement<LoginId>(_LoginId_QNAME, LoginId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaCargoResponse")
    public JAXBElement<ActualizaCargoResponse> createActualizaCargoResponse(ActualizaCargoResponse value) {
        return new JAXBElement<ActualizaCargoResponse>(_ActualizaCargoResponse_QNAME, ActualizaCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaPromotor")
    public JAXBElement<InsertaPromotor> createInsertaPromotor(InsertaPromotor value) {
        return new JAXBElement<InsertaPromotor>(_InsertaPromotor_QNAME, InsertaPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotor")
    public JAXBElement<ListaPromotor> createListaPromotor(ListaPromotor value) {
        return new JAXBElement<ListaPromotor>(_ListaPromotor_QNAME, ListaPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorPorCaracteresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorPorCaracteresResponse")
    public JAXBElement<ListaPromotorPorCaracteresResponse> createListaPromotorPorCaracteresResponse(ListaPromotorPorCaracteresResponse value) {
        return new JAXBElement<ListaPromotorPorCaracteresResponse>(_ListaPromotorPorCaracteresResponse_QNAME, ListaPromotorPorCaracteresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaDnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaDnaResponse")
    public JAXBElement<EliminaDnaResponse> createEliminaDnaResponse(EliminaDnaResponse value) {
        return new JAXBElement<EliminaDnaResponse>(_EliminaDnaResponse_QNAME, EliminaDnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaXCaracter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaXCaracter")
    public JAXBElement<ListaXCaracter> createListaXCaracter(ListaXCaracter value) {
        return new JAXBElement<ListaXCaracter>(_ListaXCaracter_QNAME, ListaXCaracter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDistrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDistrito")
    public JAXBElement<ListaDistrito> createListaDistrito(ListaDistrito value) {
        return new JAXBElement<ListaDistrito>(_ListaDistrito_QNAME, ListaDistrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaCargo")
    public JAXBElement<ListaCargo> createListaCargo(ListaCargo value) {
        return new JAXBElement<ListaCargo>(_ListaCargo_QNAME, ListaCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorPorCaracteres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorPorCaracteres")
    public JAXBElement<ListaPromotorPorCaracteres> createListaPromotorPorCaracteres(ListaPromotorPorCaracteres value) {
        return new JAXBElement<ListaPromotorPorCaracteres>(_ListaPromotorPorCaracteres_QNAME, ListaPromotorPorCaracteres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "loginIdResponse")
    public JAXBElement<LoginIdResponse> createLoginIdResponse(LoginIdResponse value) {
        return new JAXBElement<LoginIdResponse>(_LoginIdResponse_QNAME, LoginIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaSQL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "ejecutaSQL")
    public JAXBElement<EjecutaSQL> createEjecutaSQL(EjecutaSQL value) {
        return new JAXBElement<EjecutaSQL>(_EjecutaSQL_QNAME, EjecutaSQL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaCargoResponse")
    public JAXBElement<EliminaCargoResponse> createEliminaCargoResponse(EliminaCargoResponse value) {
        return new JAXBElement<EliminaCargoResponse>(_EliminaCargoResponse_QNAME, EliminaCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaUsuario")
    public JAXBElement<ActualizaUsuario> createActualizaUsuario(ActualizaUsuario value) {
        return new JAXBElement<ActualizaUsuario>(_ActualizaUsuario_QNAME, ActualizaUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutaSQLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "ejecutaSQLResponse")
    public JAXBElement<EjecutaSQLResponse> createEjecutaSQLResponse(EjecutaSQLResponse value) {
        return new JAXBElement<EjecutaSQLResponse>(_EjecutaSQLResponse_QNAME, EjecutaSQLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXCadenaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXCadenaResponse")
    public JAXBElement<ListaExpeXCadenaResponse> createListaExpeXCadenaResponse(ListaExpeXCadenaResponse value) {
        return new JAXBElement<ListaExpeXCadenaResponse>(_ListaExpeXCadenaResponse_QNAME, ListaExpeXCadenaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorOriginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorOriginResponse")
    public JAXBElement<ListaPromotorOriginResponse> createListaPromotorOriginResponse(ListaPromotorOriginResponse value) {
        return new JAXBElement<ListaPromotorOriginResponse>(_ListaPromotorOriginResponse_QNAME, ListaPromotorOriginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXEstado")
    public JAXBElement<ListaExpeXEstado> createListaExpeXEstado(ListaExpeXEstado value) {
        return new JAXBElement<ListaExpeXEstado>(_ListaExpeXEstado_QNAME, ListaExpeXEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaXCaracterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaXCaracterResponse")
    public JAXBElement<ListaXCaracterResponse> createListaXCaracterResponse(ListaXCaracterResponse value) {
        return new JAXBElement<ListaXCaracterResponse>(_ListaXCaracterResponse_QNAME, ListaXCaracterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaUsuarioResponse")
    public JAXBElement<EliminaUsuarioResponse> createEliminaUsuarioResponse(EliminaUsuarioResponse value) {
        return new JAXBElement<EliminaUsuarioResponse>(_EliminaUsuarioResponse_QNAME, EliminaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inserta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "inserta")
    public JAXBElement<Inserta> createInserta(Inserta value) {
        return new JAXBElement<Inserta>(_Inserta_QNAME, Inserta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXPromotor")
    public JAXBElement<ListaExpeXPromotor> createListaExpeXPromotor(ListaExpeXPromotor value) {
        return new JAXBElement<ListaExpeXPromotor>(_ListaExpeXPromotor_QNAME, ListaExpeXPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaPromotor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaPromotor")
    public JAXBElement<ActualizaPromotor> createActualizaPromotor(ActualizaPromotor value) {
        return new JAXBElement<ActualizaPromotor>(_ActualizaPromotor_QNAME, ActualizaPromotor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuarioPorCaracteres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuarioPorCaracteres")
    public JAXBElement<ListaUsuarioPorCaracteres> createListaUsuarioPorCaracteres(ListaUsuarioPorCaracteres value) {
        return new JAXBElement<ListaUsuarioPorCaracteres>(_ListaUsuarioPorCaracteres_QNAME, ListaUsuarioPorCaracteres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaUsuario")
    public JAXBElement<InsertaUsuario> createInsertaUsuario(InsertaUsuario value) {
        return new JAXBElement<InsertaUsuario>(_InsertaUsuario_QNAME, InsertaUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCargos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaCargos")
    public JAXBElement<ListaCargos> createListaCargos(ListaCargos value) {
        return new JAXBElement<ListaCargos>(_ListaCargos_QNAME, ListaCargos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorCaracteresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorCaracteresResponse")
    public JAXBElement<ListaDnaPorCaracteresResponse> createListaDnaPorCaracteresResponse(ListaDnaPorCaracteresResponse value) {
        return new JAXBElement<ListaDnaPorCaracteresResponse>(_ListaDnaPorCaracteresResponse_QNAME, ListaDnaPorCaracteresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaDna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaDna")
    public JAXBElement<ActualizaDna> createActualizaDna(ActualizaDna value) {
        return new JAXBElement<ActualizaDna>(_ActualizaDna_QNAME, ActualizaDna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaLogUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaLogUsuarioResponse")
    public JAXBElement<ListaLogUsuarioResponse> createListaLogUsuarioResponse(ListaLogUsuarioResponse value) {
        return new JAXBElement<ListaLogUsuarioResponse>(_ListaLogUsuarioResponse_QNAME, ListaLogUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGenero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaGenero")
    public JAXBElement<ListaGenero> createListaGenero(ListaGenero value) {
        return new JAXBElement<ListaGenero>(_ListaGenero_QNAME, ListaGenero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaCargoResponse")
    public JAXBElement<InsertaCargoResponse> createInsertaCargoResponse(InsertaCargoResponse value) {
        return new JAXBElement<InsertaCargoResponse>(_InsertaCargoResponse_QNAME, InsertaCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXCadena }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXCadena")
    public JAXBElement<ListaExpeXCadena> createListaExpeXCadena(ListaExpeXCadena value) {
        return new JAXBElement<ListaExpeXCadena>(_ListaExpeXCadena_QNAME, ListaExpeXCadena.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaResponse")
    public JAXBElement<InsertaResponse> createInsertaResponse(InsertaResponse value) {
        return new JAXBElement<InsertaResponse>(_InsertaResponse_QNAME, InsertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpediente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpediente")
    public JAXBElement<ListaExpediente> createListaExpediente(ListaExpediente value) {
        return new JAXBElement<ListaExpediente>(_ListaExpediente_QNAME, ListaExpediente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuario")
    public JAXBElement<ListaUsuario> createListaUsuario(ListaUsuario value) {
        return new JAXBElement<ListaUsuario>(_ListaUsuario_QNAME, ListaUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaCargo")
    public JAXBElement<InsertaCargo> createInsertaCargo(InsertaCargo value) {
        return new JAXBElement<InsertaCargo>(_InsertaCargo_QNAME, InsertaCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaCargo")
    public JAXBElement<EliminaCargo> createEliminaCargo(EliminaCargo value) {
        return new JAXBElement<EliminaCargo>(_EliminaCargo_QNAME, EliminaCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertaPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "insertaPromotorResponse")
    public JAXBElement<InsertaPromotorResponse> createInsertaPromotorResponse(InsertaPromotorResponse value) {
        return new JAXBElement<InsertaPromotorResponse>(_InsertaPromotorResponse_QNAME, InsertaPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProvinciaPorDepartamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaProvinciaPorDepartamentoResponse")
    public JAXBElement<ListaProvinciaPorDepartamentoResponse> createListaProvinciaPorDepartamentoResponse(ListaProvinciaPorDepartamentoResponse value) {
        return new JAXBElement<ListaProvinciaPorDepartamentoResponse>(_ListaProvinciaPorDepartamentoResponse_QNAME, ListaProvinciaPorDepartamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDistritoPorProvinciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDistritoPorProvinciaResponse")
    public JAXBElement<ListaDistritoPorProvinciaResponse> createListaDistritoPorProvinciaResponse(ListaDistritoPorProvinciaResponse value) {
        return new JAXBElement<ListaDistritoPorProvinciaResponse>(_ListaDistritoPorProvinciaResponse_QNAME, ListaDistritoPorProvinciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpedienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpedienteResponse")
    public JAXBElement<ListaExpedienteResponse> createListaExpedienteResponse(ListaExpedienteResponse value) {
        return new JAXBElement<ListaExpedienteResponse>(_ListaExpedienteResponse_QNAME, ListaExpedienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCargosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaCargosResponse")
    public JAXBElement<ListaCargosResponse> createListaCargosResponse(ListaCargosResponse value) {
        return new JAXBElement<ListaCargosResponse>(_ListaCargosResponse_QNAME, ListaCargosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaDna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaDna")
    public JAXBElement<EliminaDna> createEliminaDna(EliminaDna value) {
        return new JAXBElement<EliminaDna>(_EliminaDna_QNAME, EliminaDna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDistritoPorProvincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDistritoPorProvincia")
    public JAXBElement<ListaDistritoPorProvincia> createListaDistritoPorProvincia(ListaDistritoPorProvincia value) {
        return new JAXBElement<ListaDistritoPorProvincia>(_ListaDistritoPorProvincia_QNAME, ListaDistritoPorProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaGradoResponse")
    public JAXBElement<ListaGradoResponse> createListaGradoResponse(ListaGradoResponse value) {
        return new JAXBElement<ListaGradoResponse>(_ListaGradoResponse_QNAME, ListaGradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorsResponse")
    public JAXBElement<ListaPromotorsResponse> createListaPromotorsResponse(ListaPromotorsResponse value) {
        return new JAXBElement<ListaPromotorsResponse>(_ListaPromotorsResponse_QNAME, ListaPromotorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaUsuarioResponse")
    public JAXBElement<ActualizaUsuarioResponse> createActualizaUsuarioResponse(ActualizaUsuarioResponse value) {
        return new JAXBElement<ActualizaUsuarioResponse>(_ActualizaUsuarioResponse_QNAME, ActualizaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaLogUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaLogUsuario")
    public JAXBElement<ListaLogUsuario> createListaLogUsuario(ListaLogUsuario value) {
        return new JAXBElement<ListaLogUsuario>(_ListaLogUsuario_QNAME, ListaLogUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaDnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "actualizaDnaResponse")
    public JAXBElement<ActualizaDnaResponse> createActualizaDnaResponse(ActualizaDnaResponse value) {
        return new JAXBElement<ActualizaDnaResponse>(_ActualizaDnaResponse_QNAME, ActualizaDnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "buscarPromotorResponse")
    public JAXBElement<BuscarPromotorResponse> createBuscarPromotorResponse(BuscarPromotorResponse value) {
        return new JAXBElement<BuscarPromotorResponse>(_BuscarPromotorResponse_QNAME, BuscarPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDepartamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDepartamentoResponse")
    public JAXBElement<ListaDepartamentoResponse> createListaDepartamentoResponse(ListaDepartamentoResponse value) {
        return new JAXBElement<ListaDepartamentoResponse>(_ListaDepartamentoResponse_QNAME, ListaDepartamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaPorDepartamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaPorDepartamentoResponse")
    public JAXBElement<ListaDnaPorDepartamentoResponse> createListaDnaPorDepartamentoResponse(ListaDnaPorDepartamentoResponse value) {
        return new JAXBElement<ListaDnaPorDepartamentoResponse>(_ListaDnaPorDepartamentoResponse_QNAME, ListaDnaPorDepartamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDepartamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDepartamento")
    public JAXBElement<ListaDepartamento> createListaDepartamento(ListaDepartamento value) {
        return new JAXBElement<ListaDepartamento>(_ListaDepartamento_QNAME, ListaDepartamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaUsuarioResponse")
    public JAXBElement<ListaUsuarioResponse> createListaUsuarioResponse(ListaUsuarioResponse value) {
        return new JAXBElement<ListaUsuarioResponse>(_ListaUsuarioResponse_QNAME, ListaUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPromotorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaPromotorResponse")
    public JAXBElement<ListaPromotorResponse> createListaPromotorResponse(ListaPromotorResponse value) {
        return new JAXBElement<ListaPromotorResponse>(_ListaPromotorResponse_QNAME, ListaPromotorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaDnaResponse")
    public JAXBElement<ListaDnaResponse> createListaDnaResponse(ListaDnaResponse value) {
        return new JAXBElement<ListaDnaResponse>(_ListaDnaResponse_QNAME, ListaDnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExpeXEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listaExpeXEstadoResponse")
    public JAXBElement<ListaExpeXEstadoResponse> createListaExpeXEstadoResponse(ListaExpeXEstadoResponse value) {
        return new JAXBElement<ListaExpeXEstadoResponse>(_ListaExpeXEstadoResponse_QNAME, ListaExpeXEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "eliminaUsuario")
    public JAXBElement<EliminaUsuario> createEliminaUsuario(EliminaUsuario value) {
        return new JAXBElement<EliminaUsuario>(_EliminaUsuario_QNAME, EliminaUsuario.class, null, value);
    }

}
