def call(commerceDir) {
	echo "##### Execute install script ##### -- ${commerceDir}"
	//addProperty(commerceDir, "solrserver.instances.default.autostart=false")
	//bat "cd ${commerceDir}\\core-customize\\hybris\\bin\\platform && . setantenv.bat && ant clean all"  D:\a\workspace\B
	bat "cd ${commerceDir}\\core-customize\\hybris\\bin\\platform && setantenv.bat && ant clean all"
	//bat "cd ../ && 7z.exe x hybrisConfig*.ZIP -o${commerceDir}\\core-customize -y"
	//bat "cd ${commerceDir}\\core-customize\\hybris\\bin\\platform && setantenv.bat && ant clean all"
} 
   
