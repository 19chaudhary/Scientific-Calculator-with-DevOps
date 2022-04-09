pipeline {
    environment {
        github-credentialsId : 'git-cred'
    }
    agent any
    stages {
        stage('step 1 Git') {
            steps {
                 git url: 'https://github.com/19chaudhary/MIniProject.git', branch: 'master',
                 credentialsId: github-credentialsId
            }
        }
        stage('step 2 Build maven') {
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }
    }
}