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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>Java class for TAssociation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documentation" type="{http://schemas.microsoft.com/ado/2009/11/edm}TDocumentation" minOccurs="0"/>
 *         &lt;element name="End" type="{http://schemas.microsoft.com/ado/2009/11/edm}TAssociationEnd" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="ReferentialConstraint" type="{http://schemas.microsoft.com/ado/2009/11/edm}TConstraint" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://schemas.microsoft.com/ado/2009/11/edm}TSimpleIdentifier" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAssociation", propOrder = {
    "documentation",
    "end",
    "referentialConstraint",
    "any"
})
public class Association {

    @XmlElement(name = "Documentation")
    protected Documentation documentation;

    @XmlElement(name = "End", required = true)
    protected List<AssociationEnd> end;

    @XmlElement(name = "ReferentialConstraint")
    protected Constraint referentialConstraint;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAttribute(name = "Name", required = true)
    protected String name;

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
     * Gets the value of the end property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a
     * <CODE>set</CODE> method for the end property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnd().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAssociationEnd }
     *
     *
     */
    public List<AssociationEnd> getEnd() {
        if (end == null) {
            end = new ArrayList<AssociationEnd>();
        }
        return this.end;
    }

    /**
     * Gets the value of the referentialConstraint property.
     *
     * @return
     * possible object is
     * {@link TConstraint }
     *
     */
    public Constraint getReferentialConstraint() {
        return referentialConstraint;
    }

    /**
     * Sets the value of the referentialConstraint property.
     *
     * @param value
     * allowed object is
     * {@link TConstraint }
     *
     */
    public void setReferentialConstraint(Constraint value) {
        this.referentialConstraint = value;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a
     * <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     *
     *
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     * possible object is
     * {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     * allowed object is
     * {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
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
