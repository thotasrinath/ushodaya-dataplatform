package org.ushodaya.dataplatform;

import org.ushodaya.dataplatform.component.Processor;
import org.ushodaya.dataplatform.data.StructuredRecord;

public class TailProcessor implements Processor {
    @Override
    public String getName() {
        return "tail-processor";
    }

    @Override
    public StructuredRecord process(StructuredRecord inputRecord) {
        return null;
    }
}
