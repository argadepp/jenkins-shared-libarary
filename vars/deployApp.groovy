def call(String appName, String environment) {
    echo "Deploying ${appName} to ${environment}"
    sh "echo 'Deploying ${appName} to ${environment}'"
    // Add deployment commands (e.g., kubectl apply or helm install)
    sh "echo '${appName} deployed to ${environment}'"
}
