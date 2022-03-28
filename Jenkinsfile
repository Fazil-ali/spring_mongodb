pipeline{
    agent any
        stages{
            stage('Git clone'){
                steps{
                    git branch: 'main', url: 'https://github.com/Fazil-ali/spring_mongodb.git'
                }
            }
            stage('Maven Test'){
                steps{
                    sh 'mvn test'
                }
            }  
            stage('Maven build'){
                steps{
                    sh 'mvn package'
                }
            }
            stage('Maven deploy'){
                steps{
                    echo 'deploy the war file to the server'
                }
            }            
        }
}
