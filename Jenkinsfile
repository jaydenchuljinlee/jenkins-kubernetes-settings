node {
    stage("Checkout") {
        checkout scm
    }
    stage("Gradle Build"){
        sh "./gradlew build"
    }
}