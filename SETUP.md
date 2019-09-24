Running and experimenting with Kafka locally 

#Goal:
- Set up a local kafka env with minimal effort  
- Create a Java (spring-boot) example with basic Kafka `producer` and `consumer` configurations 

#Prereqs:
- docker
- spring-boot
- java 8+

# Setting up the Kafka
All of the services needed to get kakfa working is defined in the `docker/local-kafka-setup.yml` file. There are four services defined in that file 
-  *zookeeper*  - Required to run Kafka
-  *kafka*   - Kafka
-  *kafka-rest-proxy* - API interface to Kafka
-  *kafka-topics-ui* - Nice UI component to view topics 

## Install and Run Kakfa
Just run the `/bin/setup_kafka.sh`. You will need `docker and `docker-compose`

# Run the Java app
Run `mvn spring-boot:run`

