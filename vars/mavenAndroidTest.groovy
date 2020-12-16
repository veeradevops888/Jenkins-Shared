def call(String mavenVersion) {
  withMaven(maven: ${mavenVersion}) {
        sh "mvn --version"
        //echo ${key}    
  }
}
      
return this
