#!/usr/bin/env groovy

def call(String name = '.') {
  echo "Hello, ${name}."
  sh "./${name}/gradlew -b ./${name}/build.gradle test"
}

