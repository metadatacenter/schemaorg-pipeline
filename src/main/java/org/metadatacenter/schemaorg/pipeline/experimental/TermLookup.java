package org.metadatacenter.schemaorg.pipeline.experimental;

import java.util.Collection;
import java.util.Map;

public interface TermLookup {

  public static final String CONCEPT_IRI = "concept_iri";
  public static final String CONCEPT_CODE = "concept_code";
  public static final String CONCEPT_LABEL = "concept_label";
  public static final String SOURCE_ONTOLOGY = "source_ontology";

  Collection<Map<String, String>> find(String name);
}
