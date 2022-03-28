pipeline{
    agent any
        stages{
            stage('Git clone'){
                steps{
                    git branch: 'main', url: 'https://github.com/Fazil-ali/spring_mongodb.git'
                }
            }
            stage('Create docker image'){
                steps{
                    sh 'docker build -t fazilrepo/spring_mongodb:latest .'
                }
            }             
        }
}
