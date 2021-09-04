// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$36 {

    static final FunctionDescriptor crypto_kdf_contextbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_kdf_contextbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_contextbytes",
        "()J",
        constants$36.crypto_kdf_contextbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_kdf_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_keybytes",
        "()J",
        constants$36.crypto_kdf_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_primitive$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle crypto_kdf_primitive$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_primitive",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$36.crypto_kdf_primitive$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_derive_from_key$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_kdf_derive_from_key$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_derive_from_key",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$36.crypto_kdf_derive_from_key$FUNC, false
    );
    static final FunctionDescriptor crypto_kdf_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_kdf_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kdf_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$36.crypto_kdf_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_kx_publickeybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_kx_publickeybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_kx_publickeybytes",
        "()J",
        constants$36.crypto_kx_publickeybytes$FUNC, false
    );
}


