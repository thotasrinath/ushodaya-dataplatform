package org.ushodaya.dataplatform.manager;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.instance.impl.HazelcastBootstrap;
import com.hazelcast.jet.pipeline.Pipeline;
import com.hazelcast.jet.pipeline.SourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;


@Configuration
public class HazelcastMain {

    @Bean
    public HazelcastInstance getHazelcastInstance() {
        return HazelcastBootstrap.getInstance();
    }

    public void pipeline() {
        Pipeline pipeline = Pipeline.create();


        SourceBuilder
                .batch("line-source", x ->

                        new BufferedReader(new FileReader("lines.txt")))
                .<String>fillBufferFn((in, buf) -> {
                    String line = in.readLine();
                    if (line != null) {
                        buf.add(line);
                    } else {
                        buf.close();
                    }
                })
                .destroyFn(buf -> buf.close())
                .build();
    }
}
