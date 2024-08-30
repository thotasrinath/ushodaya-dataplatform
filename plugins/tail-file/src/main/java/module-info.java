import org.ushodaya.dataplatform.TailProcessor;

module tail.file {
    requires platform.api;

    provides org.ushodaya.dataplatform.component.Processor with
            TailProcessor;
}