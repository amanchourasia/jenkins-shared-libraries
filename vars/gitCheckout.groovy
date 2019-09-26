def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
