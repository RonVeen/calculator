pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
       sh 'mvn clean install -DskipTests'
      }
    }
    stage('Test') {
      steps {
        script {
          def executeTests = input(message: 'Uitvoeren van de tests?', ok: 'Ja', 
                            parameters: [booleanParam(defaultValue: true, 
                            description: 'Bepaal of u de test wilt uitvoeren klik dan op',name: 'Ja?')])
          println 'executeTests heeft de waarde ' + userInput.executeTests
        }     

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