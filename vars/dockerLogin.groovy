def call() {
    withCredentials([usernamePassword(
            credentialsId: "dockerhub",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "sudo docker login -u $USER -p $PASS"
    }
}
