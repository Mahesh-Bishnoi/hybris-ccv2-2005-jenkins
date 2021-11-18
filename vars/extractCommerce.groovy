def call(commerceDir) {
    echo "##### Extract commerce platform ##### -- ${commerceDir}"
    //sh "unzip -o ../CXCOM2005*.ZIP -d ${commerceDir}/core-customize"
    bat '''cd ../ && 7z.exe x CXCOM2005*.ZIP -o${commerceDir}\core-customize'''
    bat '''cd ../ && 7z.exe x CXCOMINTPK200500P*.ZIP -o${commerceDir}\core-customize'''
    bat '''cd ../ && 7z.exe x hybrisConfig*.ZIP -o${commerceDir}\core-customize'''
    /** Uncomment if you will be using the Integration Extension Pack
    echo "##### Extract commerce integration pack #####"
    sh "unzip -o ../CXCOMINTPK2005*.ZIP -d ${commerceDir}/core-customize"
    **/
}  
