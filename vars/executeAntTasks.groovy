def call(commerceDir, antTasks, env, antOptions = "-Xmx512m -Dfile.encoding=UTF-8") {
        echo "##### Execute ant tasks : ${antTasks} #####"
        bat "cd ${commerceDir}\\core-customize\\hybris\\bin\\platform && setantenv.bat && ant ${antTasks} -Denv=${env}"
} 
