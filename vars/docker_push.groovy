def call(String projectname , String imagetag , String credId){
  withCredentials([usernamePassword(credentialsId:credId , passwordVariable:'dockerpass' , usernameVariable:'dockeruser')]){
    sh "docker login -u ${dockeruser} -p ${dockerpass} "
  }
  sh "docker push ${dockeruser}/${projectname}:${imagetag} "
}

  
