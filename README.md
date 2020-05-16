# springboot-elasticsearch-demo

# CRUD Example of Spring-Boot-JPA-Elasticsearch

## Elasticsearch Setup on Windows 10:

### 1. Download elasticsearch from below URL:
https://www.elastic.co/downloads/elasticsearch

### 2. Once downloaded, extract or unzip file.

### 3. Goto bin folder under extracted directory and double click on elasticsearch windows batch file. 

### 4. Open browser and hit below url
http://localhost:9200

### 5. If elasticsearch setup has been done successfully then you will get response like this
```
{
  "name": "NITESH-PC",
  "cluster_name": "elasticsearch",
  "cluster_uuid": "3MIxi_TJRPaunm8MwQldyQ",
  "version": {
    "number": "7.6.2",
    "build_flavor": "default",
    "build_type": "zip",
    "build_hash": "ef48eb35cf30adf4db14086e8aabd07ef6fb113f",
    "build_date": "2020-03-26T06:34:37.794943Z",
    "build_snapshot": false,
    "lucene_version": "8.4.0",
    "minimum_wire_compatibility_version": "6.8.0",
    "minimum_index_compatibility_version": "6.0.0-beta1"
  },
  "tagline": "You Know, for Search"
}
```

## Development Setup: 
### 1. You can clone it from github by running following command
```
  $ git clone https://github.com/niteshsinghrajput/springboot-elasticsearch-demo.git
```
### 2. Import project into eclipse
```
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
```
### 3. Right click on project in eclipse and then Maven -> Update Projects

### 4. Update following elsaticsearch configuration in application.properties
```
spring.data.elasticsearch.cluster-name=<clustername>
spring.data.elasticsearch.cluster-nodes=<cluster node url>
```
### 5 Right click on SpringbootElasticsearchDemoApplication .java file and run as Java Application

##### Once Sprint Boot Application will be started successfully then we can call following Endpoints by using POSTMAN

### 6. To get list of books call following endpoint with GET Request
```
  http://localhost:8080/api/v1/books
```
### 7. To create a new book call following endpoint with POST Request in Postman
```
http://localhost:8080/api/v1/books
```
### Sample Request Payload
```
{
    "title": "RESTFul webservices",
    "author": "Nitesh"
}
