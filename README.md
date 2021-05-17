# bill-shopping-mall-microservice


### setup
- vagrant
- vagrant init ubuntu/xenial64
- vagrant up
- docker pull mysql:5.7
- docker run 
  --name mysql 
  -d mysql:5.7 
  -p 3307:3306 
  -v /mydata/mysql/log:/var/log/mysql
  -v /mydata/mysql/data:/var/lib/mysql
  -v /mydata/mysql/conf:/etc/mysql
  -e MYSQL_ROOT_PASSWORD=root
- mkdir -p /mydata/redis/conf
- touch /mydata/redis/conf/redis.conf
- docker run -p 6379:6379 --name redis -v /mydata/redis/data:/data -v /mydata/redis/conf/redis.conf:/etc/redis/redis.conf -d redis redis-server /etc/redis/redis.conf
- docker exec -it redis redis-cli
- cd /mydata/redis/conf/
- vi redis.conf 
- appendonly yes (persistence)

### mysql 
- order
- product
- sale
- ware
- user