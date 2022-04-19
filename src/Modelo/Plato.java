//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.3 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.03.22 a las 10:57:31 AM CET 
//


package Modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="precioeuros" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="calorias" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "precioeuros",
    "descripcion",
    "calorias"
})
@XmlRootElement(name = "plato")
public class Plato {

    @XmlElement(required = true)
    protected String precioeuros;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String calorias;
    @XmlAttribute(name = "nombre", required = true)
    protected String nombre;
    @XmlAttribute(name = "tipo", required = true)
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad precioeuros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioeuros() {
        return precioeuros;
    }

    /**
     * Define el valor de la propiedad precioeuros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioeuros(String value) {
        this.precioeuros = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad calorias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalorias() {
        return calorias;
    }

    /**
     * Define el valor de la propiedad calorias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalorias(String value) {
        this.calorias = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    public Plato() {
    }

    public Plato(String precioeuros, String descripcion, String calorias, String nombre, String tipo) {
        this.precioeuros = precioeuros;
        this.descripcion = descripcion;
        this.calorias = calorias;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    

}
