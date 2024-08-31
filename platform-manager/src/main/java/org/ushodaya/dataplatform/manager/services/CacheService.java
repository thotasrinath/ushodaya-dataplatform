package org.ushodaya.dataplatform.manager.services;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.stereotype.Service;
import org.ushodaya.dataplatform.component.Processor;

import java.util.*;

@BrowserCallable
@AnonymousAllowed
@Service
public class CacheService {

    private final Map<String, String> map = new HashMap<>();

    public String saveToCache(String key, String value) {
        System.out.println("SaveToCache Called");
        return Objects.requireNonNull(map.put(key, value));
    }

    public String listAllProcessors() {

        List<String> list = new LinkedList<>();
        ServiceLoader<Processor> loader = ServiceLoader.load(Processor.class);
        loader.forEach(processor -> {
            list.add(processor.getName());
            System.out.println(processor.getName());
        });

        return list.toString();
    }
}
