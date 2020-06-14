#!/usr/bin/env bash

echo "build Started ...."
pwd
ls -l

cd ..

# mvn clean package

docker build -f config/Dockerfile -t gandhicloudlab/idepo-storelocator:latest .  --no-cache
# docker login -u gandhicloudlab
docker push gandhicloudlab/idepo-storelocator:latest

echo "build completed ...."