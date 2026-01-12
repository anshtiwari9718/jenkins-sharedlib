def call(string project name , string imagetag, string username ){
  sh" docker build -t ${username}/${projectname}:${imagetag}"
}
