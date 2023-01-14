package com.utiles;
 
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder; 

public class TransferXMIFileToJavaObject {

	public static void main(String[] args) {
 		// generate EPackages from schemas
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		Collection<EObject> generatedPackages = xsdEcoreBuilder.generate(URIConverter("http://www.example.org/projetTemplate"));

		// register the packages loaded from XSD
		for (EObject generatedEObject : generatedPackages) {
		    if (generatedEObject instanceof EPackage) {
		        EPackage generatedPackage = (EPackage) generatedEObject;
		        EPackage.Registry.INSTANCE.put(generatedPackage.getNsURI(),
		            generatedPackage);
		    }
		}

		// add file extension to registry
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("projettemplate", new GenericXMLResourceFactoryImpl());
		
		ResourceSet resourceSet = ResourceSetFactory.createResourceSet();
		Resource resource = resourceSet.getResource(xmlURI, true);
		resource.load(Collections.EMPTY_MAP);
		EObject root = resource.getContents().get(0);
	}

}
