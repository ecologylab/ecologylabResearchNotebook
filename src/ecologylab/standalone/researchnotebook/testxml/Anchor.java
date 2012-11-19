package ecologylab.standalone.researchnotebook.testxml;

import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState;
import ecologylab.serialization.annotations.simpl_scalar;

public class Anchor extends ElementState{
	@simpl_scalar String anchor_text;
	@simpl_scalar ParsedURL link; 
	@simpl_scalar String target_title; 
}
