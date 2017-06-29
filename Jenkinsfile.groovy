#!/usr/bin/env groovy 
node {
    git url: 'https://github.com/jglick/simple-maven-project-with-tests.git'

  //git url: 'https://github.com/pgupta46/project1.git'
  def mvnHome1 = tool 'M2'
 // env.PATH = "${mvnHome1}//bin:${env.PATH}:C://Windows//System32"
    
   bat "mvn -B verify"

 /*bat "${mvnHome1}//bin//mvn -B verify"*/
 /*sh "${mvnHome1}/bin/mvn -B verify"*/

}