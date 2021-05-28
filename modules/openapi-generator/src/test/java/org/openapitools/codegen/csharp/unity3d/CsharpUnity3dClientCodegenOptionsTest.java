package org.openapitools.codegen.csharp.unity3d;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.CsharpUnity3dClientCodegen;
import org.openapitools.codegen.options.CsharpUnity3dClientCodegenOptionsProvider;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CsharpUnity3dClientCodegenOptionsTest extends AbstractOptionsTest {
    private CsharpUnity3dClientCodegen codegen = mock(CsharpUnity3dClientCodegen.class, mockSettings);

    public CsharpUnity3dClientCodegenOptionsTest() {
        super(new CsharpUnity3dClientCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void verifyOptions() {
        // TODO: Complete options using Mockito
        // verify(codegen).someMethod(arguments)
    }
}

