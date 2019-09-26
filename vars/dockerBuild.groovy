def call(String project, String hubUser) {
    sh "sudo docker image build -t ${hubUser}/${project}:beta-${env.BRANCH_NAME}-${env.BUILD_NUMBER} ."
}
