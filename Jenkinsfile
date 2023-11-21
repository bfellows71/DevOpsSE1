pipeline {
agent any 
stages {
stage('scan') {
steps {
recordIssues 
    enabledForFailure: true, aggregatingResults : true, 
    tools: [
        [tool: [$class: 'Java']], 
        [pattern: 'checkstyle-result.xml', tool: [$class: 'CheckStyle']]
    ]
}
}
}
}
