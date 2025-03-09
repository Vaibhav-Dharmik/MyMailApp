pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'gmail-clone-backend'
        DOCKER_TAG = 'latest'
        RENDER_SERVICE_ID = 'srv-cv6purin91rc73bhi5r0'
        RENDER_API_KEY = 'rnd_Ys6VamqWNMQIkLnM7PwUlOsC6Lfl'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build & Push') {
            steps {
                sh "docker build -t $DOCKER_IMAGE:$DOCKER_TAG ."
                sh "docker tag $DOCKER_IMAGE:$DOCKER_TAG docker.io/vaibhav05dharmik/$DOCKER_IMAGE:$DOCKER_TAG"
                sh "docker push docker.io/vaibhav05dharmik/$DOCKER_IMAGE:$DOCKER_TAG"
            }
        }
        stage('Deploy to Render') {
            steps {
                sh "curl -X POST \"https://api.render.com/v1/services/$RENDER_SERVICE_ID/deploys\" \\
                -H \"Authorization: Bearer $RENDER_API_KEY\" \\
                -H 'Content-Type: application/json' \\
                -d '{"clearCache": true}'"
            }
        }
    }
}
