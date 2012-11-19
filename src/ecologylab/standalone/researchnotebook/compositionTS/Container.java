package ecologylab.standalone.researchnotebook.compositionTS;

import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_scalar;

public class Container extends ElementState{
	@simpl_scalar ParsedURL purl; 
	@simpl_scalar String document_type; 
	@simpl_scalar int generation; 
	@simpl_scalar float bias; 
	
	@simpl_composite Document document; 
	@simpl_composite WikipediaPage wikipedia_page; 
}
