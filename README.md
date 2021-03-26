# Kubernetes Demo

* Kubernetes Version: v1.19.6
* SpringBoot app image link: https://hub.docker.com/repository/docker/zzeju/k8s-springboot-demo

## Practice

1. Setup k8s cluster (1 master 2 nodes) 

2. Setup mongodb cluster by StatefulSet
    * Statefulset
    * Pod env
3. Setup an app with step 2 DB by Service And Deployment   
    * Deployment
    * Service
4. Simulate a case for auto recovering     
    * LivenessProbe
    * ReadinessProbe
    * Pod tolerations
5. Simulate a case for auto scaling             
    * Metrics-Server
    * HPA
    * JMeter

6. Setup a dashboard for monitor
