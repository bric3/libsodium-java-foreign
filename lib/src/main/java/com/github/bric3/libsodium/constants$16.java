// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$16 {

    static final FunctionDescriptor crypto_auth_hmacsha256_statebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_auth_hmacsha256_statebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_statebytes",
        "()J",
        constants$16.crypto_auth_hmacsha256_statebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_init$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle crypto_auth_hmacsha256_init$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_init",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$16.crypto_auth_hmacsha256_init$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_auth_hmacsha256_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$16.crypto_auth_hmacsha256_update$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha256_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$16.crypto_auth_hmacsha256_final$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha256_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.crypto_auth_hmacsha256_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_xsalsa20_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_keybytes",
        "()J",
        constants$16.crypto_stream_xsalsa20_keybytes$FUNC, false
    );
}


