def call(String image,String tag){
    sh "echo 'Building docker image'"
    sh "docker build ${image}:${tag}"
    sh "echo 'Image build successfully'"
}