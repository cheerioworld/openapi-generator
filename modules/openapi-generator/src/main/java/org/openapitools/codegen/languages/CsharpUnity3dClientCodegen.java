package org.openapitools.codegen.languages;

import org.openapitools.codegen.*;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.parameters.Parameter;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsharpUnity3dClientCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    static final Logger LOGGER = LoggerFactory.getLogger(CsharpUnity3dClientCodegen.class);

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "csharp-unity3d";
    }

    public String getHelp() {
        return "Generates a csharp-unity3d client.";
    }

    public CsharpUnity3dClientCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "csharp-unity3d";
        modelTemplateFiles.put("model.mustache", ".zz");
        apiTemplateFiles.put("api.mustache", ".zz");
        embeddedTemplateDir = templateDir = "csharp-unity3d";
        apiPackage = "Apis";
        modelPackage = "Models";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }
}
