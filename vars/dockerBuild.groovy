def call() {
    sh "sudo docker image build -t sharelib ."
    withCredentials([usernamePassword(
            credentialsId: "dockerhub",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    
}
