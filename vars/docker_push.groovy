def call(String projectname , String imagetag , String credId){
  withCredentials([usernamePassword(credentialsId:credId , passwordVariable:'dockerpass' , usernameVariable:'dockeruser')]){
    sh "docker login -u ${env.dockeruser} -p ${env.dockerpass} "
  }
  sh "docker push ${env.dockeruser}/${projectname}:${imagetag} "
}

  
