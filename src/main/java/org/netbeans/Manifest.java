//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.12 at 09:45:21 AM EDT 
//


package org.netbeans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "manifest")
public class Manifest {

    @XmlAttribute(name = "OpenIDE-Module", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModule;
    @XmlAttribute(name = "OpenIDE-Module-Name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleName;
    @XmlAttribute(name = "OpenIDE-Module-Specification-Version", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleSpecificationVersion;
    @XmlAttribute(name = "OpenIDE-Module-Implementation-Version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleImplementationVersion;
    @XmlAttribute(name = "OpenIDE-Module-Module-Dependencies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleModuleDependencies;
    @XmlAttribute(name = "OpenIDE-Module-Package-Dependencies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModulePackageDependencies;
    @XmlAttribute(name = "OpenIDE-Module-Java-Dependencies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleJavaDependencies;
    @XmlAttribute(name = "OpenIDE-Module-IDE-Dependencies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleIDEDependencies;
    @XmlAttribute(name = "OpenIDE-Module-Short-Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleShortDescription;
    @XmlAttribute(name = "OpenIDE-Module-Long-Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleLongDescription;
    @XmlAttribute(name = "OpenIDE-Module-Display-Category")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleDisplayCategory;
    @XmlAttribute(name = "OpenIDE-Module-Provides")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleProvides;
    @XmlAttribute(name = "OpenIDE-Module-Requires")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleRequires;
    @XmlAttribute(name = "OpenIDE-Module-Recommends")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleRecommends;
    @XmlAttribute(name = "OpenIDE-Module-Needs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String openIDEModuleNeeds;
    @XmlAttribute(name = "AutoUpdate-Show-In-Client")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoUpdateShowInClient;
    @XmlAttribute(name = "AutoUpdate-Essential-Module")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoUpdateEssentialModule;

    /**
     * Gets the value of the openIDEModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModule() {
        return openIDEModule;
    }

    /**
     * Sets the value of the openIDEModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModule(String value) {
        this.openIDEModule = value;
    }

    /**
     * Gets the value of the openIDEModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleName() {
        return openIDEModuleName;
    }

    /**
     * Sets the value of the openIDEModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleName(String value) {
        this.openIDEModuleName = value;
    }

    /**
     * Gets the value of the openIDEModuleSpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleSpecificationVersion() {
        return openIDEModuleSpecificationVersion;
    }

    /**
     * Sets the value of the openIDEModuleSpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleSpecificationVersion(String value) {
        this.openIDEModuleSpecificationVersion = value;
    }

    /**
     * Gets the value of the openIDEModuleImplementationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleImplementationVersion() {
        return openIDEModuleImplementationVersion;
    }

    /**
     * Sets the value of the openIDEModuleImplementationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleImplementationVersion(String value) {
        this.openIDEModuleImplementationVersion = value;
    }

    /**
     * Gets the value of the openIDEModuleModuleDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleModuleDependencies() {
        return openIDEModuleModuleDependencies;
    }

    /**
     * Sets the value of the openIDEModuleModuleDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleModuleDependencies(String value) {
        this.openIDEModuleModuleDependencies = value;
    }

    /**
     * Gets the value of the openIDEModulePackageDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModulePackageDependencies() {
        return openIDEModulePackageDependencies;
    }

    /**
     * Sets the value of the openIDEModulePackageDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModulePackageDependencies(String value) {
        this.openIDEModulePackageDependencies = value;
    }

    /**
     * Gets the value of the openIDEModuleJavaDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleJavaDependencies() {
        return openIDEModuleJavaDependencies;
    }

    /**
     * Sets the value of the openIDEModuleJavaDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleJavaDependencies(String value) {
        this.openIDEModuleJavaDependencies = value;
    }

    /**
     * Gets the value of the openIDEModuleIDEDependencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleIDEDependencies() {
        return openIDEModuleIDEDependencies;
    }

    /**
     * Sets the value of the openIDEModuleIDEDependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleIDEDependencies(String value) {
        this.openIDEModuleIDEDependencies = value;
    }

    /**
     * Gets the value of the openIDEModuleShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleShortDescription() {
        return openIDEModuleShortDescription;
    }

    /**
     * Sets the value of the openIDEModuleShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleShortDescription(String value) {
        this.openIDEModuleShortDescription = value;
    }

    /**
     * Gets the value of the openIDEModuleLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleLongDescription() {
        return openIDEModuleLongDescription;
    }

    /**
     * Sets the value of the openIDEModuleLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleLongDescription(String value) {
        this.openIDEModuleLongDescription = value;
    }

    /**
     * Gets the value of the openIDEModuleDisplayCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleDisplayCategory() {
        return openIDEModuleDisplayCategory;
    }

    /**
     * Sets the value of the openIDEModuleDisplayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleDisplayCategory(String value) {
        this.openIDEModuleDisplayCategory = value;
    }

    /**
     * Gets the value of the openIDEModuleProvides property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleProvides() {
        return openIDEModuleProvides;
    }

    /**
     * Sets the value of the openIDEModuleProvides property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleProvides(String value) {
        this.openIDEModuleProvides = value;
    }

    /**
     * Gets the value of the openIDEModuleRequires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleRequires() {
        return openIDEModuleRequires;
    }

    /**
     * Sets the value of the openIDEModuleRequires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleRequires(String value) {
        this.openIDEModuleRequires = value;
    }

    /**
     * Gets the value of the openIDEModuleRecommends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleRecommends() {
        return openIDEModuleRecommends;
    }

    /**
     * Sets the value of the openIDEModuleRecommends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleRecommends(String value) {
        this.openIDEModuleRecommends = value;
    }

    /**
     * Gets the value of the openIDEModuleNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenIDEModuleNeeds() {
        return openIDEModuleNeeds;
    }

    /**
     * Sets the value of the openIDEModuleNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenIDEModuleNeeds(String value) {
        this.openIDEModuleNeeds = value;
    }

    /**
     * Gets the value of the autoUpdateShowInClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoUpdateShowInClient() {
        return autoUpdateShowInClient;
    }

    /**
     * Sets the value of the autoUpdateShowInClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoUpdateShowInClient(String value) {
        this.autoUpdateShowInClient = value;
    }

    /**
     * Gets the value of the autoUpdateEssentialModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoUpdateEssentialModule() {
        return autoUpdateEssentialModule;
    }

    /**
     * Sets the value of the autoUpdateEssentialModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoUpdateEssentialModule(String value) {
        this.autoUpdateEssentialModule = value;
    }

}