#!/usr/bin/env groovy

def call(String name = '.') {
stage ('test') {
            steps {
                sh "./sonarqube-scanner-gradle/gradlew -b ./sonarqube-scanner-gradle/build.gradle test"
            }                
        }
}

