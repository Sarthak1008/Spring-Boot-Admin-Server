package com.example.Admin_Client.configuration;
import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HazelCastConfig {

    
    @Bean
    public Config hazelCastConfiguration(){
        MapConfig mapConfig = new MapConfig();
        mapConfig.setName("products");
        
        EvictionConfig evictionConfig = new EvictionConfig();
        evictionConfig.setEvictionPolicy(EvictionPolicy.LRU);
        evictionConfig.setSize(200);
        evictionConfig.setMaxSizePolicy(EvictionConfig.DEFAULT_MAX_SIZE_POLICY);
        mapConfig.setEvictionConfig(evictionConfig);
        mapConfig.setTimeToLiveSeconds(200);
        Config config = new Config();
        config.setInstanceName("hazelcast instance");
        config.addMapConfig(mapConfig);
        return config;
    }
}
