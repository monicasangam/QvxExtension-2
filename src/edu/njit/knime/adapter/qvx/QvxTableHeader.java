//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.20 at 07:51:10 PM EST 
//


package edu.njit.knime.adapter.qvx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CreateUtcTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BlockSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Fields"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QvxFieldHeader" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Type" type="{}QvxFieldType"/&gt;
 *                             &lt;element name="Extent" type="{}QvxFieldExtent"/&gt;
 *                             &lt;element name="NullRepresentation" type="{}QvxNullRepresentation"/&gt;
 *                             &lt;element name="BigEndian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="CodePage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="ByteWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FixPointDecimals" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                             &lt;element name="FieldFormat" type="{}FieldAttributes"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "QvxTableHeader")
public class QvxTableHeader {

    @XmlElement(name = "MajorVersion", required = true)
    protected BigInteger majorVersion;
    @XmlElement(name = "MinorVersion", required = true)
    protected BigInteger minorVersion;
    @XmlElement(name = "CreateUtcTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createUtcTime;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "BlockSize")
    protected BigInteger blockSize;
    @XmlElement(name = "Fields", required = true)
    protected QvxTableHeader.Fields fields;

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the createUtcTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateUtcTime() {
        return createUtcTime;
    }

    /**
     * Sets the value of the createUtcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateUtcTime(XMLGregorianCalendar value) {
        this.createUtcTime = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlockSize(BigInteger value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link QvxTableHeader.Fields }
     *     
     */
    public QvxTableHeader.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link QvxTableHeader.Fields }
     *     
     */
    public void setFields(QvxTableHeader.Fields value) {
        this.fields = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="QvxFieldHeader" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Type" type="{}QvxFieldType"/&gt;
     *                   &lt;element name="Extent" type="{}QvxFieldExtent"/&gt;
     *                   &lt;element name="NullRepresentation" type="{}QvxNullRepresentation"/&gt;
     *                   &lt;element name="BigEndian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="CodePage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="ByteWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FixPointDecimals" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                   &lt;element name="FieldFormat" type="{}FieldAttributes"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "qvxFieldHeader"
    })
    public static class Fields {

        @XmlElement(name = "QvxFieldHeader", required = true)
        protected List<QvxTableHeader.Fields.QvxFieldHeader> qvxFieldHeader;

        /**
         * Gets the value of the qvxFieldHeader property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the qvxFieldHeader property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQvxFieldHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QvxTableHeader.Fields.QvxFieldHeader }
         * 
         * 
         */
        public List<QvxTableHeader.Fields.QvxFieldHeader> getQvxFieldHeader() {
            if (qvxFieldHeader == null) {
                qvxFieldHeader = new ArrayList<QvxTableHeader.Fields.QvxFieldHeader>();
            }
            return this.qvxFieldHeader;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Type" type="{}QvxFieldType"/&gt;
         *         &lt;element name="Extent" type="{}QvxFieldExtent"/&gt;
         *         &lt;element name="NullRepresentation" type="{}QvxNullRepresentation"/&gt;
         *         &lt;element name="BigEndian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="CodePage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="ByteWidth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FixPointDecimals" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *         &lt;element name="FieldFormat" type="{}FieldAttributes"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class QvxFieldHeader {

            @XmlElement(name = "FieldName", required = true)
            protected String fieldName;
            @XmlElement(name = "Type", required = true)
            @XmlSchemaType(name = "string")
            protected QvxFieldType type;
            @XmlElement(name = "Extent", required = true)
            @XmlSchemaType(name = "string")
            protected QvxFieldExtent extent;
            @XmlElement(name = "NullRepresentation", required = true)
            @XmlSchemaType(name = "string")
            protected QvxNullRepresentation nullRepresentation;
            @XmlElement(name = "BigEndian")
            protected Boolean bigEndian;
            @XmlElement(name = "CodePage")
            protected BigInteger codePage;
            @XmlElement(name = "ByteWidth")
            protected BigInteger byteWidth;
            @XmlElement(name = "FixPointDecimals")
            protected BigInteger fixPointDecimals;
            @XmlElement(name = "FieldFormat", required = true)
            protected FieldAttributes fieldFormat;

            /**
             * Gets the value of the fieldName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFieldName() {
                return fieldName;
            }

            /**
             * Sets the value of the fieldName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFieldName(String value) {
                this.fieldName = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link QvxFieldType }
             *     
             */
            public QvxFieldType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link QvxFieldType }
             *     
             */
            public void setType(QvxFieldType value) {
                this.type = value;
            }

            /**
             * Gets the value of the extent property.
             * 
             * @return
             *     possible object is
             *     {@link QvxFieldExtent }
             *     
             */
            public QvxFieldExtent getExtent() {
                return extent;
            }

            /**
             * Sets the value of the extent property.
             * 
             * @param value
             *     allowed object is
             *     {@link QvxFieldExtent }
             *     
             */
            public void setExtent(QvxFieldExtent value) {
                this.extent = value;
            }

            /**
             * Gets the value of the nullRepresentation property.
             * 
             * @return
             *     possible object is
             *     {@link QvxNullRepresentation }
             *     
             */
            public QvxNullRepresentation getNullRepresentation() {
                return nullRepresentation;
            }

            /**
             * Sets the value of the nullRepresentation property.
             * 
             * @param value
             *     allowed object is
             *     {@link QvxNullRepresentation }
             *     
             */
            public void setNullRepresentation(QvxNullRepresentation value) {
                this.nullRepresentation = value;
            }

            /**
             * Gets the value of the bigEndian property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBigEndian() {
                return bigEndian;
            }

            /**
             * Sets the value of the bigEndian property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBigEndian(Boolean value) {
                this.bigEndian = value;
            }

            /**
             * Gets the value of the codePage property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodePage() {
                return codePage;
            }

            /**
             * Sets the value of the codePage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodePage(BigInteger value) {
                this.codePage = value;
            }

            /**
             * Gets the value of the byteWidth property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getByteWidth() {
                return byteWidth;
            }

            /**
             * Sets the value of the byteWidth property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setByteWidth(BigInteger value) {
                this.byteWidth = value;
            }

            /**
             * Gets the value of the fixPointDecimals property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getFixPointDecimals() {
                return fixPointDecimals;
            }

            /**
             * Sets the value of the fixPointDecimals property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setFixPointDecimals(BigInteger value) {
                this.fixPointDecimals = value;
            }

            /**
             * Gets the value of the fieldFormat property.
             * 
             * @return
             *     possible object is
             *     {@link FieldAttributes }
             *     
             */
            public FieldAttributes getFieldFormat() {
                return fieldFormat;
            }

            /**
             * Sets the value of the fieldFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link FieldAttributes }
             *     
             */
            public void setFieldFormat(FieldAttributes value) {
                this.fieldFormat = value;
            }

        }

    }

}
