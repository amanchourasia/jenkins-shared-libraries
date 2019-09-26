def call(String project, String hubUser) {
    withCredentials([usernamePassword(
            credentialsId: "dockerhub",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "sudo docker login -u '$USER' -p '$PASS'"
    }
    sh "sudo docker image push ${hubUser}/${project}:latest"
}
