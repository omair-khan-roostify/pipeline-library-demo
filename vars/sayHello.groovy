#!/usr/bin/env groovy

def call(String name = '.') {
 pipeline 
  {
    agent any

    environment {
            AWS_ECR_LOGIN='true'
    }
stage ('test') {
            steps {
                sh "./sonarqube-scanner-gradle/gradlew -b ./sonarqube-scanner-gradle/build.gradle test"
            }                
        }
}
}

