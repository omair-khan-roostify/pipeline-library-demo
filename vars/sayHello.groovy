#!/usr/bin/env groovy

def call(String name = '.') {
 pipeline 
  {
   echo "Hello ${name}."
}
}

