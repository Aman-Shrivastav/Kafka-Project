# Kafka-Project
 Project 2 - Build a Fault Tolerant Distributed Application using Apache Kafka and Zookeeper  

Making a Fault Tolerant Broadcast System with Single Producer ,Multiple broker and Multiple Consumers
Installation Steps
    1. Verifying Java Installation

    2. Zookeeper Framework Installation
    3. After extracting the zookeeper tar file, a file is to be created with the name “conf/zoo.cfg” inside C:\Users\apache-zookeeper-3.5.7-bin\conf	
    4. Apache Kafka Installation  
	I have followed this link https://www.youtube.com/watch?v=3XjfYH5Z0f0
    5. Single Node-Single Broker 	Configuration: Here 	we have a single ZooKeeper and broker id instance. 	
    • Creating a Kafka Topic − Kafka provides a command line utility named 	kafka-topics.cmd (for Windows users) to create topics on the server. 	Once the topic has been created, we can get the notification in the 	Kafka broker terminal window and the log for the created topic 	specified in “/tmp/kafka-logs/“ in the config/server.properties 	file.
 	
    • Start 	Producer to Send Messages : Two main parameters are required for the 	producer command line client :broker-list and topic name.The 	producer will wait on input from stdin and publish to the Kafka 	cluster. By default, every new line is published as a new message 	then the default producer properties are specified in 	config/producer.properties file. 	
 	
    • Start 	Consumer to Receive Messages: Similar to producer, the default 	consumer properties are specified in config/consumer.properties 	file.
 	
    • Finally, we are able to enter messages from the producer’s terminal and see them appearing in the consumer’s terminal.

Starting Zookeeper


















Starting Kafka Server


Starting producer and pushing message






Starting consumer and pulling messages 


Date - 24-05-21
A screenshot of pom.xml




A screenshot of producer.java




A screenshot of consumer.java 

`
Date-31/05/2021

Setting Up a a muticluster setup 

Step1
Starting Zookeeper

Step2
Creating multiple server files and Starting Kafka Servers (or brokers)





Step-3
Creating a topic with replication factor 3


Step-4
Starting Producer




Step-5
Starting Consumer


Date-06-06-2021

The above steps are followed again to start zookeeper, brokers and consumer 
The output of multiple consumers after running the setup on multiple consumers are


This Completes the setup
