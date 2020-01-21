pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}
