#!/usr/bin/env bash
if [ -z "$JENKINS_URL" ]; then
  # if not set in environment use default
  JENKINS_URL=https://ci.eclipse.org/xtext/
fi

mvn \
  clean deploy \
  -PuseJenkinsSnapshots \
  --batch-mode \
  --update-snapshots \
  -Dmaven.repo.local=.m2/repository \
  -DaltDeploymentRepository=local::default::file:./build/maven-repository \
  -DJENKINS_URL=$JENKINS_URL \
  -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn \
  $@

