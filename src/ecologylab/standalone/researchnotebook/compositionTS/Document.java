package ecologylab.standalone.researchnotebook.compositionTS;

import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_scalar;

public class Document extends ElementState{
	@simpl_scalar ParsedURL location; 
	@simpl_scalar String title; 
	@simpl_scalar String page_structure; 
	
	@simpl_scalar @simpl_hints(Hint.XML_LEAF) String query; 
	
}
