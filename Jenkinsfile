pipeline{
    agent any

    stages{
        stage('Build'){
            steps{
              echo "Build of branch: ${env.BRANCH_NAME} "
              bat 'mvn -DSkipTests package'
            }
        }
        stage('Test'){
            steps{
              echo 'Test'
              bat 'mvn test'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploy'
                bat 'docker cp app-0.0.1-SNAPSHOT.war mytomcat:/usr/local/tomcat/webapps'
            }
        }
    }
     post {
            always {
                archiveArtifacts artifacts: 'target\\*.war', onlyIfSuccessful: true
            }
        }
}