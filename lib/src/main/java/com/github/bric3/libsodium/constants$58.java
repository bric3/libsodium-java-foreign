// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$58 {

    static final FunctionDescriptor crypto_secretbox_boxzerobytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_secretbox_boxzerobytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_boxzerobytes",
        "()J",
        constants$58.crypto_secretbox_boxzerobytes$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$58.crypto_secretbox$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_open$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_open$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_open",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$58.crypto_secretbox_open$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_chacha20_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_chacha20_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_chacha20_keybytes",
        "()J",
        constants$58.crypto_stream_chacha20_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_chacha20_noncebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_chacha20_noncebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_chacha20_noncebytes",
        "()J",
        constants$58.crypto_stream_chacha20_noncebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_chacha20_messagebytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_chacha20_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_chacha20_messagebytes_max",
        "()J",
        constants$58.crypto_stream_chacha20_messagebytes_max$FUNC, false
    );
}


