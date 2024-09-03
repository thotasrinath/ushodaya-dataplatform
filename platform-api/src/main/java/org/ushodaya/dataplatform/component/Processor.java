package org.ushodaya.dataplatform.component;


import org.ushodaya.dataplatform.data.api.data.format.StructuredRecord;

public interface Processor {
    String getName();
    StructuredRecord process(StructuredRecord inputRecord);
}
