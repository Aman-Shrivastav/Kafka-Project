package com.example.kafka2;


import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.File;
import java.util.Scanner;

public class Producer_two {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        final Logger logger = LoggerFactory.getLogger(Producer.class);
        // Create properties object for producer
        Properties prop = new Properties();
        prop.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        prop.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        prop.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //Creat the producer
        final KafkaProducer<String, String> producer = new KafkaProducer<>(prop);
        File file = new File("C:\\Users\\Aman Shrivastav\\IdeaProjects\\kafka-example2\\demo");
        Scanner sc = new Scanner(file);
        int i=0;
        while (sc.hasNextLine()){
            //Create the producer record
            ProducerRecord<String, String> record = new ProducerRecord<>("Broadcast1","key_"+ i++,sc.next());
            //Send data -asynchronous
            producer.send(record);
            TimeUnit.SECONDS.sleep(2);
        }
        //flush and close producer
        producer.flush();
        producer.close();
    }
}

