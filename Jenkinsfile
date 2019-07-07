node {
  stage('Cleaning project'){
      sh "mvn clean -f unit-test-maven-jenkins"
  }
   stage('Test project'){
       sh "mvn test -f unit-test-maven-jenkins"
   }
   stage('Deploy project'){
       sh "mvn package -f unit-test-maven-jenkins"
   }
}
