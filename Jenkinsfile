pipeline {
    agent any 
    stages {
        stage('Clone Repo') { 
            steps {
                sh "mvn clean"
                // sh "mvn clean"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test" 
            }
        }
        stage('Deploy') { 
            steps {
                sh "mvn package"
            }
        }
    }
}
