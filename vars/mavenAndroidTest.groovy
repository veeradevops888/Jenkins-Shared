def call() {
  withMaven(maven: "MVN_360") {
        sh "mvn --version"
        //echo ${key}    
  }
}
      
return this
