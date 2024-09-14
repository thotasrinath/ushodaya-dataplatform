import {ViewConfig} from '@vaadin/hilla-file-router/types.js';
import {useSignal} from '@vaadin/hilla-react-signals';
import ProcessorList from "Frontend/themes/ushodaya-dataplatform/components/processor-grid";
import PipelineContainer from "Frontend/themes/ushodaya-dataplatform/components/pipeline-container";


export const config: ViewConfig = {menu: {order: 1, icon: 'line-awesome/svg/globe-solid.svg'}, title: 'Pipelines'};

export default function PipelinesView() {
    const name = useSignal('');

    return (
        <>
            <section>
                <ProcessorList />
            </section>
            <section className="p-m">
                <PipelineContainer />
            </section>
        </>
    );
}
