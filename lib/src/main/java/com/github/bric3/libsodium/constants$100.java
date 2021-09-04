// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$100 {

    static final FunctionDescriptor crypto_stream_salsa2012_messagebytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa2012_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa2012_messagebytes_max",
        "()J",
        constants$100.crypto_stream_salsa2012_messagebytes_max$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa2012$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream_salsa2012$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa2012",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$100.crypto_stream_salsa2012$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa2012_xor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream_salsa2012_xor$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa2012_xor",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$100.crypto_stream_salsa2012_xor$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa2012_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_stream_salsa2012_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa2012_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$100.crypto_stream_salsa2012_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa208_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa208_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa208_keybytes",
        "()J",
        constants$100.crypto_stream_salsa208_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_salsa208_noncebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_salsa208_noncebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_salsa208_noncebytes",
        "()J",
        constants$100.crypto_stream_salsa208_noncebytes$FUNC, false
    );
}


