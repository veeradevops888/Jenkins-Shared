def call(String mavenVersion, String key) {
  withMaven(maven: ${mavenVersion}) {
        sh "mvn --version"
        echo ${key}    
  }
}
      
return this
