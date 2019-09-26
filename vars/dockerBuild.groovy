def call(String project, String hubUser) {
    sh "sudo docker image build -t ${hubUser}/${project}:latest ."
}
