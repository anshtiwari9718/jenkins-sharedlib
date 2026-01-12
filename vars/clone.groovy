def call(string url , string branch){
  echo "This for cloning the code"
  git url:"${url}" , branch:"${branch}"
  echo "code clone successfully"
}
  
