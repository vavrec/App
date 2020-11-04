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
            }
        }
    }
     post {
            always {
                archiveArtifacts artifacts: 'generatedFile.txt', onlyIfSuccessful: true
            }
        }
}