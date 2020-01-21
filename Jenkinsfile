pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'gradle run'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}
