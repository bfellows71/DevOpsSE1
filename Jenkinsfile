pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git 'https://github.com/bfellows71/DevOpsSE1.git'
            }
        }

        stage('Build') {
            steps {
                // Build your project
                sh 'mvn clean install'
            }
        }

        stage('PMD Analysis') {
            steps {
                // Run PMD analysis
                recordIssues(
                    tools: [pmd(pattern: 'target/pmd.xml')] // Adjust the pattern based on your PMD output location
                )
            }
        }

        stage('Test') {
            steps {
                // Run your tests
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application (if applicable)
            }
        }
    }

    post {
        always {
            // Perform cleanup or other actions
        }

        success {
            // Actions to be performed on success
        }

        failure {
            // Actions to be performed on failure
        }
    }
}

