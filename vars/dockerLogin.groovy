def call(String project, String hubUser) {
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "sudo docker login -u '$USER' -p '$PASS'"
    }
    sh "sudo docker image push ${hubUser}/${project}:beta-${env.BRANCH_NAME}-${env.BUILD_NUMBER}"
}
