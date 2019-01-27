pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          def doesJavaRock = input(message: 'Do you like Java?', ok: 'Yes', 
                            parameters: [booleanParam(defaultValue: true, 
                            description: 'If you like Java, just push the button',name: 'Yes?')])
        }
        sh 'mvn clean install -DskipTests'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Archive test results') {
      steps {
        junit '**/target/surefire-reports/TEST*.xml'
      }
    }
  }
}