# mlops-telemetry-test-server

This is a test server to print tha HAIC Telemetry APIs requests for development purpose.

```
./gradlew clean build 
docker build -t h2o/mlops-telemetry .
docker run -p 9001:9001 h2o/mlops-telemetry
```

docker run --rm -d --network host --name mlops-telemetry h2o/mlops-telemetry