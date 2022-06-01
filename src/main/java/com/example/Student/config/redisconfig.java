package com.example.Student.config;

/*import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class redisconfig {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> initRedisTemplate() {

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        // 支持事物
        redisTemplate.setEnableTransactionSupport(true);
        // key的序列化方式采用StringRedisSerializer。相信很少用对象作为key的吧。
        // 如果要走非主流路线,将对象作为key,且对象含有非String属性,需要将key的序列化方式
        // 更改为下面的value序列化方式
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);

        // 设置value的序列化方式GenericFastJsonRedisSerializer(需要依赖fastjson)
        GenericFastJsonRedisSerializer fastJsonRedisSerializer = new GenericFastJsonRedisSerializer();
        redisTemplate.setValueSerializer(fastJsonRedisSerializer);
        redisTemplate.setHashValueSerializer(fastJsonRedisSerializer);

// 如果不想使用fastJson。常用的还有jackson的序列化方式。springboot项目中,默认带了jackson。
//		Jackson2JsonRedisSerializer<Object> jacksonSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//		jacksonSerializer.setObjectMapper(objectMapper);
//		redisTemplate.setValueSerializer(jacksonSerializer);
//		redisTemplate.setHashValueSerializer(jacksonSerializer);

        // 顾名思义,在属性设置之后运行.初始化配置的作用
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }
}*/
