pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check the git repo
                git 'https://github.com/bfellows71/DevOpsSE1.git'
            }
        }

        stage('Build') {
            steps {
                // build it
                sh 'mvn clean install'
            }
        }

        stage('PMD Analysis') {
            steps {
                // run the PMD tool 
                recordIssues(
                    tools: [pmd(pattern: 'target/pmd.xml')] // Adjust the pattern based on your PMD output location
                )
            }
        }

        stage('Test') {
            steps {
                // tests
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // if it passes, lets deploy it wherever
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

