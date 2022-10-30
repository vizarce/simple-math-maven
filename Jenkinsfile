pipeline {
    agent any

    environment {
        NEW_VERSION = '1.0.0'
    }

    tools {
        maven "Maven3"
    }

    stages {
        stage('Git-Checkout') {
            steps{
                echo "Checking out from the Git Repo"
                git 'https://github.com/vizarce/simple-math-maven.git'
            }
        }
        stage('Compile') {
            steps {
                echo "Compiling application..."
                echo "The Build ID of this job is ${BUILD_ID}"
                echo "The Build URL is ${BUILD_URL}"
                bat "mvn --version"
                bat "mvn clean compile"
            }
        }
        stage('Build') {
            steps {
                echo "Building application..."
                bat "mvn package"
            }
        }   
        stage('Test') {
            steps {
                echo "Testing VERSION ${NEW_VERSION}"
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying application..."
                bat "mvn deploy"
            }
        }        
    }
    post {
        always {
            junit(
                allowEmptyResults: true,
                testResults: '*test-reports/.xml'
            )
        }
    }
}
