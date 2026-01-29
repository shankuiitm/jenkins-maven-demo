pipeline {
    agent { label 'linux-agent' }

    tools {
        maven 'M3'
    }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                  mkdir -p /opt/maven-app
                  cp target/*.jar /opt/maven-app/
                '''
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo '✅ Maven CI/CD pipeline successful'
        }
        failure {
            echo '❌ Maven CI/CD pipeline failed'
        }
    }
}
