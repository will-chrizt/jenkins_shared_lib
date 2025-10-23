 def call(String project, String ImageTag, String hubUser){
    
     sh """
      chmod 777 /var/run/docker.sock
      docker image build -t ${hubUser}/${project} . 
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
     """
 }

