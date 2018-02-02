//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.17 a las 11:34:04 AM CST 
//


package org.tempuri.dscargaremisionprov;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para responseDSCargaRemisionProv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseDSCargaRemisionProv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Remision">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="FechaRemision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="TipoBulto" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="EntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="CumpleReqFiscales" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="IEPS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="OtrosImpuestos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="CantidadPedidos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="FechaEntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Cita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="FolioNotaEntrada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pedimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Pedimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Aduana" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="AgenteAduanal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="TipoPedimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FechaPedimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="FechaReciboLaredo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="FechaBillOfLading" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pedidos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="CantidadArticulos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PedidoEmitidoProveedor" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="2"/>
 *                         &lt;enumeration value="SI"/>
 *                         &lt;enumeration value="NO"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Articulos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="CantidadUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="CostoNetoUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="PorcentajeIEPS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="PorcentajeIVA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseDSCargaRemisionProv", propOrder = {
    "remisionOrPedimentoOrPedidos"
})
public class ResponseDSCargaRemisionProv {

    @XmlElements({
        @XmlElement(name = "Remision", type = ResponseDSCargaRemisionProv.Remision.class),
        @XmlElement(name = "Pedimento", type = ResponseDSCargaRemisionProv.Pedimento.class),
        @XmlElement(name = "Pedidos", type = ResponseDSCargaRemisionProv.Pedidos.class),
        @XmlElement(name = "Articulos", type = ResponseDSCargaRemisionProv.Articulos.class)
    })
    protected List<Object> remisionOrPedimentoOrPedidos;

    /**
     * Gets the value of the remisionOrPedimentoOrPedidos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remisionOrPedimentoOrPedidos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemisionOrPedimentoOrPedidos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDSCargaRemisionProv.Remision }
     * {@link ResponseDSCargaRemisionProv.Pedimento }
     * {@link ResponseDSCargaRemisionProv.Pedidos }
     * {@link ResponseDSCargaRemisionProv.Articulos }
     * 
     * 
     */
    public List<Object> getRemisionOrPedimentoOrPedidos() {
        if (remisionOrPedimentoOrPedidos == null) {
            remisionOrPedimentoOrPedidos = new ArrayList<Object>();
        }
        return this.remisionOrPedimentoOrPedidos;
    }


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
     *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="CantidadUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="CostoNetoUnidadCompra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="PorcentajeIEPS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="PorcentajeIVA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "proveedor",
        "remision",
        "folioPedido",
        "tienda",
        "codigo",
        "cantidadUnidadCompra",
        "costoNetoUnidadCompra",
        "porcentajeIEPS",
        "porcentajeIVA"
    })
    public static class Articulos {

        @XmlElement(name = "Proveedor")
        protected int proveedor;
        @XmlElement(name = "Remision", required = true)
        protected String remision;
        @XmlElement(name = "FolioPedido")
        protected int folioPedido;
        @XmlElement(name = "Tienda")
        protected short tienda;
        @XmlElement(name = "Codigo", required = true)
        protected BigDecimal codigo;
        @XmlElement(name = "CantidadUnidadCompra", required = true)
        protected BigDecimal cantidadUnidadCompra;
        @XmlElement(name = "CostoNetoUnidadCompra", required = true)
        protected BigDecimal costoNetoUnidadCompra;
        @XmlElement(name = "PorcentajeIEPS", required = true)
        protected BigDecimal porcentajeIEPS;
        @XmlElement(name = "PorcentajeIVA", required = true)
        protected BigDecimal porcentajeIVA;

        /**
         * Obtiene el valor de la propiedad proveedor.
         * 
         */
        public int getProveedor() {
            return proveedor;
        }

        /**
         * Define el valor de la propiedad proveedor.
         * 
         */
        public void setProveedor(int value) {
            this.proveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad remision.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemision() {
            return remision;
        }

        /**
         * Define el valor de la propiedad remision.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemision(String value) {
            this.remision = value;
        }

        /**
         * Obtiene el valor de la propiedad folioPedido.
         * 
         */
        public int getFolioPedido() {
            return folioPedido;
        }

        /**
         * Define el valor de la propiedad folioPedido.
         * 
         */
        public void setFolioPedido(int value) {
            this.folioPedido = value;
        }

        /**
         * Obtiene el valor de la propiedad tienda.
         * 
         */
        public short getTienda() {
            return tienda;
        }

        /**
         * Define el valor de la propiedad tienda.
         * 
         */
        public void setTienda(short value) {
            this.tienda = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCodigo(BigDecimal value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadUnidadCompra.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCantidadUnidadCompra() {
            return cantidadUnidadCompra;
        }

        /**
         * Define el valor de la propiedad cantidadUnidadCompra.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCantidadUnidadCompra(BigDecimal value) {
            this.cantidadUnidadCompra = value;
        }

        /**
         * Obtiene el valor de la propiedad costoNetoUnidadCompra.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCostoNetoUnidadCompra() {
            return costoNetoUnidadCompra;
        }

        /**
         * Define el valor de la propiedad costoNetoUnidadCompra.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCostoNetoUnidadCompra(BigDecimal value) {
            this.costoNetoUnidadCompra = value;
        }

        /**
         * Obtiene el valor de la propiedad porcentajeIEPS.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPorcentajeIEPS() {
            return porcentajeIEPS;
        }

        /**
         * Define el valor de la propiedad porcentajeIEPS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPorcentajeIEPS(BigDecimal value) {
            this.porcentajeIEPS = value;
        }

        /**
         * Obtiene el valor de la propiedad porcentajeIVA.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPorcentajeIVA() {
            return porcentajeIVA;
        }

        /**
         * Define el valor de la propiedad porcentajeIVA.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPorcentajeIVA(BigDecimal value) {
            this.porcentajeIVA = value;
        }

    }


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
     *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FolioPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="CantidadArticulos" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PedidoEmitidoProveedor" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="2"/>
     *               &lt;enumeration value="SI"/>
     *               &lt;enumeration value="NO"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "proveedor",
        "remision",
        "folioPedido",
        "tienda",
        "cantidadArticulos",
        "pedidoEmitidoProveedor"
    })
    public static class Pedidos {

        @XmlElement(name = "Proveedor")
        protected int proveedor;
        @XmlElement(name = "Remision", required = true)
        protected String remision;
        @XmlElement(name = "FolioPedido")
        protected int folioPedido;
        @XmlElement(name = "Tienda")
        protected short tienda;
        @XmlElement(name = "CantidadArticulos")
        protected int cantidadArticulos;
        @XmlElement(name = "PedidoEmitidoProveedor")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String pedidoEmitidoProveedor;

        /**
         * Obtiene el valor de la propiedad proveedor.
         * 
         */
        public int getProveedor() {
            return proveedor;
        }

        /**
         * Define el valor de la propiedad proveedor.
         * 
         */
        public void setProveedor(int value) {
            this.proveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad remision.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemision() {
            return remision;
        }

        /**
         * Define el valor de la propiedad remision.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemision(String value) {
            this.remision = value;
        }

        /**
         * Obtiene el valor de la propiedad folioPedido.
         * 
         */
        public int getFolioPedido() {
            return folioPedido;
        }

        /**
         * Define el valor de la propiedad folioPedido.
         * 
         */
        public void setFolioPedido(int value) {
            this.folioPedido = value;
        }

        /**
         * Obtiene el valor de la propiedad tienda.
         * 
         */
        public short getTienda() {
            return tienda;
        }

        /**
         * Define el valor de la propiedad tienda.
         * 
         */
        public void setTienda(short value) {
            this.tienda = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadArticulos.
         * 
         */
        public int getCantidadArticulos() {
            return cantidadArticulos;
        }

        /**
         * Define el valor de la propiedad cantidadArticulos.
         * 
         */
        public void setCantidadArticulos(int value) {
            this.cantidadArticulos = value;
        }

        /**
         * Obtiene el valor de la propiedad pedidoEmitidoProveedor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPedidoEmitidoProveedor() {
            return pedidoEmitidoProveedor;
        }

        /**
         * Define el valor de la propiedad pedidoEmitidoProveedor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPedidoEmitidoProveedor(String value) {
            this.pedidoEmitidoProveedor = value;
        }

    }


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
     *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Pedimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Aduana" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="AgenteAduanal" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="TipoPedimento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FechaPedimento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="FechaReciboLaredo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="FechaBillOfLading" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "proveedor",
        "remision",
        "pedimento",
        "aduana",
        "agenteAduanal",
        "tipoPedimento",
        "fechaPedimento",
        "fechaReciboLaredo",
        "fechaBillOfLading"
    })
    public static class Pedimento {

        @XmlElement(name = "Proveedor")
        protected int proveedor;
        @XmlElement(name = "Remision", required = true)
        protected String remision;
        @XmlElement(name = "Pedimento")
        protected int pedimento;
        @XmlElement(name = "Aduana")
        protected short aduana;
        @XmlElement(name = "AgenteAduanal")
        protected short agenteAduanal;
        @XmlElement(name = "TipoPedimento", required = true)
        protected String tipoPedimento;
        @XmlElement(name = "FechaPedimento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaPedimento;
        @XmlElement(name = "FechaReciboLaredo", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaReciboLaredo;
        @XmlElement(name = "FechaBillOfLading", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaBillOfLading;

        /**
         * Obtiene el valor de la propiedad proveedor.
         * 
         */
        public int getProveedor() {
            return proveedor;
        }

        /**
         * Define el valor de la propiedad proveedor.
         * 
         */
        public void setProveedor(int value) {
            this.proveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad remision.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemision() {
            return remision;
        }

        /**
         * Define el valor de la propiedad remision.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemision(String value) {
            this.remision = value;
        }

        /**
         * Obtiene el valor de la propiedad pedimento.
         * 
         */
        public int getPedimento() {
            return pedimento;
        }

        /**
         * Define el valor de la propiedad pedimento.
         * 
         */
        public void setPedimento(int value) {
            this.pedimento = value;
        }

        /**
         * Obtiene el valor de la propiedad aduana.
         * 
         */
        public short getAduana() {
            return aduana;
        }

        /**
         * Define el valor de la propiedad aduana.
         * 
         */
        public void setAduana(short value) {
            this.aduana = value;
        }

        /**
         * Obtiene el valor de la propiedad agenteAduanal.
         * 
         */
        public short getAgenteAduanal() {
            return agenteAduanal;
        }

        /**
         * Define el valor de la propiedad agenteAduanal.
         * 
         */
        public void setAgenteAduanal(short value) {
            this.agenteAduanal = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoPedimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoPedimento() {
            return tipoPedimento;
        }

        /**
         * Define el valor de la propiedad tipoPedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoPedimento(String value) {
            this.tipoPedimento = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaPedimento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaPedimento() {
            return fechaPedimento;
        }

        /**
         * Define el valor de la propiedad fechaPedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaPedimento(XMLGregorianCalendar value) {
            this.fechaPedimento = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaReciboLaredo.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaReciboLaredo() {
            return fechaReciboLaredo;
        }

        /**
         * Define el valor de la propiedad fechaReciboLaredo.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaReciboLaredo(XMLGregorianCalendar value) {
            this.fechaReciboLaredo = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaBillOfLading.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaBillOfLading() {
            return fechaBillOfLading;
        }

        /**
         * Define el valor de la propiedad fechaBillOfLading.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaBillOfLading(XMLGregorianCalendar value) {
            this.fechaBillOfLading = value;
        }

    }


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
     *         &lt;element name="Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Remision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Consecutivo" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="FechaRemision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Tienda" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="TipoMoneda" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="TipoBulto" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="EntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="CumpleReqFiscales" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="Subtotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="IEPS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="OtrosImpuestos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="CantidadPedidos" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="FechaEntregaMercancia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Cita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="FolioNotaEntrada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "proveedor",
        "remision",
        "consecutivo",
        "fechaRemision",
        "tienda",
        "tipoMoneda",
        "tipoBulto",
        "entregaMercancia",
        "cumpleReqFiscales",
        "cantidadBultos",
        "subtotal",
        "ieps",
        "iva",
        "otrosImpuestos",
        "total",
        "cantidadPedidos",
        "fechaEntregaMercancia",
        "cita",
        "folioNotaEntrada"
    })
    public static class Remision {

        @XmlElement(name = "Proveedor")
        protected int proveedor;
        @XmlElement(name = "Remision", required = true)
        protected String remision;
        @XmlElement(name = "Consecutivo")
        protected short consecutivo;
        @XmlElement(name = "FechaRemision", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaRemision;
        @XmlElement(name = "Tienda")
        protected short tienda;
        @XmlElement(name = "TipoMoneda")
        protected short tipoMoneda;
        @XmlElement(name = "TipoBulto")
        protected short tipoBulto;
        @XmlElement(name = "EntregaMercancia")
        protected short entregaMercancia;
        @XmlElement(name = "CumpleReqFiscales")
        protected boolean cumpleReqFiscales;
        @XmlElement(name = "CantidadBultos", required = true)
        protected BigDecimal cantidadBultos;
        @XmlElement(name = "Subtotal", required = true)
        protected BigDecimal subtotal;
        @XmlElement(name = "IEPS", required = true)
        protected BigDecimal ieps;
        @XmlElement(name = "IVA", required = true)
        protected BigDecimal iva;
        @XmlElement(name = "OtrosImpuestos", required = true)
        protected BigDecimal otrosImpuestos;
        @XmlElement(name = "Total", required = true)
        protected BigDecimal total;
        @XmlElement(name = "CantidadPedidos")
        protected int cantidadPedidos;
        @XmlElement(name = "FechaEntregaMercancia", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaEntregaMercancia;
        @XmlElement(name = "Cita")
        protected Integer cita;
        @XmlElement(name = "FolioNotaEntrada")
        protected Integer folioNotaEntrada;

        /**
         * Obtiene el valor de la propiedad proveedor.
         * 
         */
        public int getProveedor() {
            return proveedor;
        }

        /**
         * Define el valor de la propiedad proveedor.
         * 
         */
        public void setProveedor(int value) {
            this.proveedor = value;
        }

        /**
         * Obtiene el valor de la propiedad remision.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemision() {
            return remision;
        }

        /**
         * Define el valor de la propiedad remision.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemision(String value) {
            this.remision = value;
        }

        /**
         * Obtiene el valor de la propiedad consecutivo.
         * 
         */
        public short getConsecutivo() {
            return consecutivo;
        }

        /**
         * Define el valor de la propiedad consecutivo.
         * 
         */
        public void setConsecutivo(short value) {
            this.consecutivo = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaRemision.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaRemision() {
            return fechaRemision;
        }

        /**
         * Define el valor de la propiedad fechaRemision.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaRemision(XMLGregorianCalendar value) {
            this.fechaRemision = value;
        }

        /**
         * Obtiene el valor de la propiedad tienda.
         * 
         */
        public short getTienda() {
            return tienda;
        }

        /**
         * Define el valor de la propiedad tienda.
         * 
         */
        public void setTienda(short value) {
            this.tienda = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoMoneda.
         * 
         */
        public short getTipoMoneda() {
            return tipoMoneda;
        }

        /**
         * Define el valor de la propiedad tipoMoneda.
         * 
         */
        public void setTipoMoneda(short value) {
            this.tipoMoneda = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoBulto.
         * 
         */
        public short getTipoBulto() {
            return tipoBulto;
        }

        /**
         * Define el valor de la propiedad tipoBulto.
         * 
         */
        public void setTipoBulto(short value) {
            this.tipoBulto = value;
        }

        /**
         * Obtiene el valor de la propiedad entregaMercancia.
         * 
         */
        public short getEntregaMercancia() {
            return entregaMercancia;
        }

        /**
         * Define el valor de la propiedad entregaMercancia.
         * 
         */
        public void setEntregaMercancia(short value) {
            this.entregaMercancia = value;
        }

        /**
         * Obtiene el valor de la propiedad cumpleReqFiscales.
         * 
         */
        public boolean isCumpleReqFiscales() {
            return cumpleReqFiscales;
        }

        /**
         * Define el valor de la propiedad cumpleReqFiscales.
         * 
         */
        public void setCumpleReqFiscales(boolean value) {
            this.cumpleReqFiscales = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadBultos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCantidadBultos() {
            return cantidadBultos;
        }

        /**
         * Define el valor de la propiedad cantidadBultos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCantidadBultos(BigDecimal value) {
            this.cantidadBultos = value;
        }

        /**
         * Obtiene el valor de la propiedad subtotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSubtotal() {
            return subtotal;
        }

        /**
         * Define el valor de la propiedad subtotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSubtotal(BigDecimal value) {
            this.subtotal = value;
        }

        /**
         * Obtiene el valor de la propiedad ieps.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIEPS() {
            return ieps;
        }

        /**
         * Define el valor de la propiedad ieps.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIEPS(BigDecimal value) {
            this.ieps = value;
        }

        /**
         * Obtiene el valor de la propiedad iva.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIVA() {
            return iva;
        }

        /**
         * Define el valor de la propiedad iva.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIVA(BigDecimal value) {
            this.iva = value;
        }

        /**
         * Obtiene el valor de la propiedad otrosImpuestos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOtrosImpuestos() {
            return otrosImpuestos;
        }

        /**
         * Define el valor de la propiedad otrosImpuestos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOtrosImpuestos(BigDecimal value) {
            this.otrosImpuestos = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotal(BigDecimal value) {
            this.total = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadPedidos.
         * 
         */
        public int getCantidadPedidos() {
            return cantidadPedidos;
        }

        /**
         * Define el valor de la propiedad cantidadPedidos.
         * 
         */
        public void setCantidadPedidos(int value) {
            this.cantidadPedidos = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaEntregaMercancia.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaEntregaMercancia() {
            return fechaEntregaMercancia;
        }

        /**
         * Define el valor de la propiedad fechaEntregaMercancia.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaEntregaMercancia(XMLGregorianCalendar value) {
            this.fechaEntregaMercancia = value;
        }

        /**
         * Obtiene el valor de la propiedad cita.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCita() {
            return cita;
        }

        /**
         * Define el valor de la propiedad cita.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCita(Integer value) {
            this.cita = value;
        }

        /**
         * Obtiene el valor de la propiedad folioNotaEntrada.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFolioNotaEntrada() {
            return folioNotaEntrada;
        }

        /**
         * Define el valor de la propiedad folioNotaEntrada.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFolioNotaEntrada(Integer value) {
            this.folioNotaEntrada = value;
        }

    }

}
