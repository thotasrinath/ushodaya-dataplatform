package org.ushodaya.dataplatform;

import org.ushodaya.dataplatform.component.Processor;
import org.ushodaya.dataplatform.data.api.data.format.StructuredRecord;

public class MapProcessor implements Processor {
    @Override
    public String getName() {
        return "map-processor";
    }

    @Override
    public StructuredRecord process(StructuredRecord inputRecord) {
        return null;
    }
}
