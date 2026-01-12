def call(String url , String branch){
  echo "This for cloning the code"
  git url:"${url}" , branch:"${branch}"
  echo "code clone successfully"
}
  
