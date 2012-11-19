package ecologylab.standalone.researchnotebook.testxml;

import java.util.ArrayList;

import ecologylab.serialization.ElementState;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;

@simpl_inherit

public class Query extends ElementState{
	@simpl_nowrap
	@simpl_collection("SearchTerms") ArrayList<String> terms = new ArrayList<String>();  

}
