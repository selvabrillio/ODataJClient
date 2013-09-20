/**
 * Copyright © Microsoft Open Technologies, Inc.
 *
 * All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 * ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
 * PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
 *
 * See the Apache License, Version 2.0 for the specific language
 * governing permissions and limitations under the License.
 */
package com.msopentech.odatajclient.engine.data.metadata.edm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for TValueTermReferenceExpression complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TValueTermReferenceExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documentation" type="{http://schemas.microsoft.com/ado/2009/11/edm}TDocumentation" minOccurs="0"/>
 *         &lt;group ref="{http://schemas.microsoft.com/ado/2009/11/edm}GExpression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Term" use="required" type="{http://schemas.microsoft.com/ado/2009/11/edm}TQualifiedName" />
 *       &lt;attribute name="Qualifier" type="{http://schemas.microsoft.com/ado/2009/11/edm}TSimpleIdentifier" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TValueTermReferenceExpression", propOrder = {
    "documentation",
    "stringOrBinaryOrInt"
})
public class ValueTermReferenceExpression {

    @XmlElement(name = "Documentation")
    protected Documentation documentation;

    @XmlElementRefs({
        @XmlElementRef(name = "DateTime", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Int", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Collection", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "PropertyReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Record", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "EnumMemberReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Binary", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Guid", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "If", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type = JAXBElement.class),
        @XmlElementRef(name = "ParameterReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "FunctionReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "LabeledElement", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Time", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "ValueTermReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "String", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "IsType", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Path", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "EntitySetReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "LabeledElementReference", namespace = "http://schemas.microsoft.com/ado/2009/11/edm",
                type = JAXBElement.class),
        @XmlElementRef(name = "Apply", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Bool", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Decimal", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "DateTimeOffset", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Null", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "AssertType", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class),
        @XmlElementRef(name = "Float", namespace = "http://schemas.microsoft.com/ado/2009/11/edm", type =
                JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> stringOrBinaryOrInt;

    @XmlAttribute(name = "Term", required = true)
    protected String term;

    @XmlAttribute(name = "Qualifier")
    protected String qualifier;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentation property.
     *
     * @return
     * possible object is
     * {@link Documentation }
     *
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     *
     * @param value
     * allowed object is
     * {@link Documentation }
     *
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the stringOrBinaryOrInt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a
     * <CODE>set</CODE> method for the stringOrBinaryOrInt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringOrBinaryOrInt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TDateTimeConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TCollectionExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TPropertyReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TRecordExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TEnumMemberReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TBinaryConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TGuidConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TIfExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TParameterReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TFunctionReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TLabeledElement }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimeConstantExpression }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TValueTermReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TStringConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TIsTypeExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TPathExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TEntitySetReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TLabeledElementReferenceExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TApplyExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TBoolConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TDecimalConstantExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TDateTimeOffsetConstantExpression }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link TAssertTypeExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TNullExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TFloatConstantExpression }{@code >}
     *
     *
     */
    public List<Object> getStringOrBinaryOrInt() {
        if (stringOrBinaryOrInt == null) {
            stringOrBinaryOrInt = new ArrayList<Object>();
        }
        return this.stringOrBinaryOrInt;
    }

    /**
     * Gets the value of the term property.
     *
     * @return
     * possible object is
     * {@link String }
     *
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     *
     * @param value
     * allowed object is
     * {@link String }
     *
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the qualifier property.
     *
     * @return
     * possible object is
     * {@link String }
     *
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     *
     * @param value
     * allowed object is
     * {@link String }
     *
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     * always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }
}
