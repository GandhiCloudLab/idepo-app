#!/usr/bin/env bash

echo "build Started ...."
pwd
ls -l

cd ..

# mvn clean package

docker build -f config/Dockerfile -t gandhicloudlab/idepo-catalog:latest .  --no-cache
# docker login -u gandhicloudlab
docker push gandhicloudlab/idepo-catalog:latest

echo "build completed ...."