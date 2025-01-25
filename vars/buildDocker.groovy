def dockerLogin(String user,String repo , String pass){
    sh "echo '${pass} | docker login ghcr.io -u ${user} --password-stdin'"
}


def call(String image,String tag,String path){
    sh "echo 'Building docker image'"
    sh "docker build -t ${image}:${tag} ${path}"
    sh "echo 'Image build successfully'"
    sh "docker push ${image}:${tag}"
}