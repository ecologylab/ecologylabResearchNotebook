package ecologylab.standalone.researchnotebook.compositionTS;

import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState;
import ecologylab.serialization.annotations.simpl_scalar;

public class Image extends ElementState{
	@simpl_scalar String context; 
	@simpl_scalar String caption; 
	@simpl_scalar ParsedURL location; 
	@simpl_scalar String local_location; 
}
