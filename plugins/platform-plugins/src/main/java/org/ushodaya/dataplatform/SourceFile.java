package org.ushodaya.dataplatform;

import org.ushodaya.dataplatform.component.Source;
import org.ushodaya.dataplatform.data.api.data.format.StructuredRecord;
import org.ushodaya.dataplatform.data.api.data.schema.Schema;

public class SourceFile implements Source{
    @Override
    public String getName() {
        return "get-file-content";
    }

    @Override
    public Schema getOutputSchema() {
        return null;
    }

    @Override
    public StructuredRecord readRecord() {
        return null;
    }
}
