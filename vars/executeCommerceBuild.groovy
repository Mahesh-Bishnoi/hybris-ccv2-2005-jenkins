def call(commerceDir) {
	echo "##### Execute install script ##### -- ${commerceDir}"
	//addProperty(commerceDir, "solrserver.instances.default.autostart=false")
	bat "cd ${commerceDir}/core-customize/hybris/bin/platform && . setantenv.bat && ant clean all"
} 
   
