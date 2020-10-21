
package ws;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSPedidos", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSPedidos {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "numTotalDePersonas", targetNamespace = "http://webservice/", className = "ws.NumTotalDePersonas")
    @ResponseWrapper(localName = "numTotalDePersonasResponse", targetNamespace = "http://webservice/", className = "ws.NumTotalDePersonasResponse")
    @Action(input = "http://webservice/WSPedidos/numTotalDePersonasRequest", output = "http://webservice/WSPedidos/numTotalDePersonasResponse")
    public int numTotalDePersonas();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "numCantPedidosHoy", targetNamespace = "http://webservice/", className = "ws.NumCantPedidosHoy")
    @ResponseWrapper(localName = "numCantPedidosHoyResponse", targetNamespace = "http://webservice/", className = "ws.NumCantPedidosHoyResponse")
    @Action(input = "http://webservice/WSPedidos/numCantPedidosHoyRequest", output = "http://webservice/WSPedidos/numCantPedidosHoyResponse")
    public int numCantPedidosHoy();

    /**
     * 
     * @param id
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "cambiarEstadoPedido", targetNamespace = "http://webservice/", className = "ws.CambiarEstadoPedido")
    @Action(input = "http://webservice/WSPedidos/cambiarEstadoPedido")
    public void cambiarEstadoPedido(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Pedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "todosLosPedidos", targetNamespace = "http://webservice/", className = "ws.TodosLosPedidos")
    @ResponseWrapper(localName = "todosLosPedidosResponse", targetNamespace = "http://webservice/", className = "ws.TodosLosPedidosResponse")
    @Action(input = "http://webservice/WSPedidos/todosLosPedidosRequest", output = "http://webservice/WSPedidos/todosLosPedidosResponse")
    public List<Pedido> todosLosPedidos();

    /**
     * 
     * @param rutPersona
     * @param nombrePersona
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "agregarPedido", targetNamespace = "http://webservice/", className = "ws.AgregarPedido")
    @Action(input = "http://webservice/WSPedidos/agregarPedido")
    public void agregarPedido(
        @WebParam(name = "rut_Persona", targetNamespace = "")
        String rutPersona,
        @WebParam(name = "nombre_Persona", targetNamespace = "")
        String nombrePersona);

    /**
     * 
     * @param rut
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresar", targetNamespace = "http://webservice/", className = "ws.Ingresar")
    @ResponseWrapper(localName = "ingresarResponse", targetNamespace = "http://webservice/", className = "ws.IngresarResponse")
    @Action(input = "http://webservice/WSPedidos/ingresarRequest", output = "http://webservice/WSPedidos/ingresarResponse")
    public boolean ingresar(
        @WebParam(name = "rut", targetNamespace = "")
        String rut);

    /**
     * 
     * @param fechaFiltro
     * @return
     *     returns java.util.List<ws.Pedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pedidosPorFecha", targetNamespace = "http://webservice/", className = "ws.PedidosPorFecha")
    @ResponseWrapper(localName = "pedidosPorFechaResponse", targetNamespace = "http://webservice/", className = "ws.PedidosPorFechaResponse")
    @Action(input = "http://webservice/WSPedidos/pedidosPorFechaRequest", output = "http://webservice/WSPedidos/pedidosPorFechaResponse")
    public List<Pedido> pedidosPorFecha(
        @WebParam(name = "fecha_Filtro", targetNamespace = "")
        String fechaFiltro);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Pedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pedidosDeHoy", targetNamespace = "http://webservice/", className = "ws.PedidosDeHoy")
    @ResponseWrapper(localName = "pedidosDeHoyResponse", targetNamespace = "http://webservice/", className = "ws.PedidosDeHoyResponse")
    @Action(input = "http://webservice/WSPedidos/pedidosDeHoyRequest", output = "http://webservice/WSPedidos/pedidosDeHoyResponse")
    public List<Pedido> pedidosDeHoy();

}