package org.ushodaya.dataplatform.component;


import org.ushodaya.dataplatform.data.api.data.format.StructuredRecord;
import org.ushodaya.dataplatform.data.api.data.schema.Schema;

public interface Source {
    String getName();
    Schema getOutputSchema();
    StructuredRecord readRecord();

}
