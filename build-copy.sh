#mvn clean package -DskipTests=true -Dmaven.javadoc.skip=true -Djacoco.skip=true
# clean the local samples output directory and the unity directory that the sample was copied to
rm -r ../csharp-unitywebrequest-sample/Assets/Sample
rm -r ./samples/client/petstore/csharp-netcore/OpenAPIClient-unitywebrequest
./bin/generate-samples.sh bin/configs/csharp-netcore-OpenAPIClient-unitywebrequest.yaml #-- \
cp -R ./samples/client/petstore/csharp-netcore/OpenAPIClient-unitywebrequest ../csharp-unitywebrequest-sample/Assets/Sample