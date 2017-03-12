//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.12 at 09:45:21 AM EDT 
//


package org.netbeans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notificationOrModuleGroupOrModuleOrLicenseOrError"
})
@XmlRootElement(name = "module_updates")
public class ModuleUpdates {

    @XmlAttribute(name = "timestamp", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timestamp;
    @XmlElements({
        @XmlElement(name = "notification", type = Notification.class),
        @XmlElement(name = "module_group", type = ModuleGroup.class),
        @XmlElement(name = "module", type = Module.class),
        @XmlElement(name = "license", type = License.class),
        @XmlElement(name = "error", type = Error.class)
    })
    protected List<Object> notificationOrModuleGroupOrModuleOrLicenseOrError;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the notificationOrModuleGroupOrModuleOrLicenseOrError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOrModuleGroupOrModuleOrLicenseOrError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationOrModuleGroupOrModuleOrLicenseOrError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * {@link ModuleGroup }
     * {@link Module }
     * {@link License }
     * {@link Error }
     * 
     * 
     */
    public List<Object> getNotificationOrModuleGroupOrModuleOrLicenseOrError() {
        if (notificationOrModuleGroupOrModuleOrLicenseOrError == null) {
            notificationOrModuleGroupOrModuleOrLicenseOrError = new ArrayList<Object>();
        }
        return this.notificationOrModuleGroupOrModuleOrLicenseOrError;
    }

}
