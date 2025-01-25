def call(String image,String tag,String path){
    sh "echo 'Building docker image'"
    sh "docker build ${image}:${tag} ${path}"
    sh "echo 'Image build successfully'"
}