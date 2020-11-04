pipeline{
    agent any

    stages{
        stage('Build'){
            steps{
              echo 'Build'
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
}