package org.ushodaya.dataplatform.component;

import org.ushodaya.dataplatform.data.StructuredRecord;

public interface Processor {
    String getName();
    StructuredRecord process(StructuredRecord inputRecord);
}
