def call(String appName) {
    echo "Building application: ${appName}"
    sh "echo 'Building ${appName}...'"
    // Add build logic, such as Maven or Gradle commands
    sh "echo 'Build successful for ${appName}'"

    sh "mvn clean package"

}


