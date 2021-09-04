// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$85 {

    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_seed_keypair$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_seed_keypair$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_seed_keypair",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_seed_keypair$FUNC, false
    );
    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_keypair$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_keypair$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_keypair",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_keypair$FUNC, false
    );
    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_easy$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_easy$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_easy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_easy$FUNC, false
    );
    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_open_easy$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_open_easy$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_open_easy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_open_easy$FUNC, false
    );
    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_detached$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_detached$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_detached",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_detached$FUNC, false
    );
    static final FunctionDescriptor crypto_box_curve25519xchacha20poly1305_open_detached$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_curve25519xchacha20poly1305_open_detached$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_curve25519xchacha20poly1305_open_detached",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$85.crypto_box_curve25519xchacha20poly1305_open_detached$FUNC, false
    );
}


