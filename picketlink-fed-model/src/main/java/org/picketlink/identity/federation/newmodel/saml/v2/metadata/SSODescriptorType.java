package org.picketlink.identity.federation.newmodel.saml.v2.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * <p>Java class for SSODescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSODescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptorType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ArtifactResolutionService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}SingleLogoutService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}ManageNameIDService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}NameIDFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public abstract class SSODescriptorType extends RoleDescriptorType
{
    protected List<IndexedEndpointType> artifactResolutionService = new ArrayList<IndexedEndpointType>(); 
    protected List<EndpointType> singleLogoutService = new ArrayList<EndpointType>(); 
    protected List<EndpointType> manageNameIDService = new ArrayList<EndpointType>(); 
    protected List<String> nameIDFormat = new ArrayList<String>();

    public void addSingleLogoutService( EndpointType endpt )
    {
       this.singleLogoutService.add(endpt);
    }
    
    public void addArtifactResolutionService( IndexedEndpointType i )
    {
       this.artifactResolutionService.add(i);
    }
    
    public void addManageNameIDService( EndpointType end )
    {
       this.manageNameIDService.add(end);
    }
    
    public void addNameIDFormat( String s )
    {
       this.nameIDFormat.add(s);
    }
    
    /**
     * Gets the value of the artifactResolutionService property. 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedEndpointType }
     */
    public List<IndexedEndpointType> getArtifactResolutionService() 
    { 
        return Collections.unmodifiableList( this.artifactResolutionService );
    }

    /**
     * Gets the value of the singleLogoutService property.
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     */
    public List<EndpointType> getSingleLogoutService() 
    {
        return Collections.unmodifiableList( this.singleLogoutService );
    }

    /**
     * Gets the value of the manageNameIDService property.
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     */
    public List<EndpointType> getManageNameIDService() 
    {
        return Collections.unmodifiableList( this.manageNameIDService );
    }

    /**
     * Gets the value of the nameIDFormat property. 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameIDFormat() 
    {
        return Collections.unmodifiableList( this.nameIDFormat );
    } 
}