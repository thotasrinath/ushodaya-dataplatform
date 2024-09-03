package org.ushodaya.dataplatform;

import org.ushodaya.dataplatform.component.Processor;
import org.ushodaya.dataplatform.data.api.data.format.StructuredRecord;


public class WrangleProcessor implements Processor {
    @Override
    public String getName() {
        return "wrangle-processor";
    }

    @Override
    public StructuredRecord process(StructuredRecord inputRecord) {
        return null;
    }
}
