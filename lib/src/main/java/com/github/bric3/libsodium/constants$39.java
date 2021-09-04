// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$39 {

    static final FunctionDescriptor crypto_onetimeauth_poly1305_verify$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_poly1305_verify$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_poly1305_verify",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$39.crypto_onetimeauth_poly1305_verify$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_poly1305_init$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_poly1305_init$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_poly1305_init",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$39.crypto_onetimeauth_poly1305_init$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_poly1305_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_onetimeauth_poly1305_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_poly1305_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$39.crypto_onetimeauth_poly1305_update$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_poly1305_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_poly1305_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_poly1305_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$39.crypto_onetimeauth_poly1305_final$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_poly1305_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_poly1305_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_poly1305_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$39.crypto_onetimeauth_poly1305_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_statebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_onetimeauth_statebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_statebytes",
        "()J",
        constants$39.crypto_onetimeauth_statebytes$FUNC, false
    );
}


