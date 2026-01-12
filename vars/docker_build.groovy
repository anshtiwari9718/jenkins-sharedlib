def call(String project name , String imagetag, String username ){
  sh" docker build -t ${username}/${projectname}:${imagetag}"
}
