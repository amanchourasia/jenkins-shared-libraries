def call() {
    sh "sudo docker image build -t sharelibtest ."
    withCredentials([usernamePassword(
            credentialsId: "dockerhub",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "sudo docker login -u '$USER' -p '$PASS'"
    }
    
}
