node {
  stage('Cleaning project'){
      sh "mvn clean"
  }
   stage('Test project'){
       sh "mvn test"
   }
   stage('Deploy project'){
       sh "mvn package"
   }
}
