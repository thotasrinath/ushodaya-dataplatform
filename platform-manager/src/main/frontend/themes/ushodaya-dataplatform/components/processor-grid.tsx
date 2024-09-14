import {useEffect, useState} from "react";
import {CacheService} from "Frontend/generated/endpoints";
import ProcessorRecord
    from "Frontend/generated/org/ushodaya/dataplatform/manager/services/CacheService/ProcessorRecord";
import {Grid, GridColumn} from "@vaadin/react-components";

export default function ProcessorList() {

    const [processors, setProcessors] = useState<ProcessorRecord[]>([]);
    const [selected, setSelected] = useState<ProcessorRecord | null | undefined>();

    useEffect(() => {
        CacheService.listAllProcessors().then(setProcessors);
    }, []);

    return (
        <div className="p-m flex gap-m">
            <Grid items={processors} onActiveItemChanged={e => setSelected(e.detail.value)}
                selectedItems={[selected]}>

                <GridColumn path="name"/>
            </Grid>
        </div>
    )
}


