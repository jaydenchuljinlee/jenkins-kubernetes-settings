node {
    stage("Checkout") {
        checkout scm
    }
    stage("Gradle Build"){
        tool name: "gradle7.0", type: "gradle"
        sh "./gradlew build"
    }
}