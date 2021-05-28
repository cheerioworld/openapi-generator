#mvn -B --no-snapshot-updates clean package -DskipTests=true -Dmaven.javadoc.skip=true -Djacoco.skip=true
./bin/generate-samples.sh bin/configs/csharp-netcore-OpenAPIClient-unitywebrequest.yaml #-- \
#--packageName=Cheerio.Api \
#--packageGuid=f768aca1-f81a-4c20-99ec-ab1657c78626 \
#--packageVersion=0.0.1 \
#--targetFramework=netstandard2.0 \
#--hideGenerationTimestamp=false \
#--library=unitywebrequest
rm -r ../csharp-unitywebrequest-sample/Assets/Sample
cp -R ./samples/client/petstore/csharp-netcore/OpenAPIClient-unitywebrequest ../csharp-unitywebrequest-sample/Assets/Sample