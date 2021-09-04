// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$17 {

    static final FunctionDescriptor crypto_stream_xsalsa20_noncebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_xsalsa20_noncebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_noncebytes",
        "()J",
        constants$17.crypto_stream_xsalsa20_noncebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20_messagebytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_stream_xsalsa20_messagebytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_messagebytes_max",
        "()J",
        constants$17.crypto_stream_xsalsa20_messagebytes_max$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream_xsalsa20$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.crypto_stream_xsalsa20$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20_xor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_stream_xsalsa20_xor$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_xor",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.crypto_stream_xsalsa20_xor$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20_xor_ic$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle crypto_stream_xsalsa20_xor_ic$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_xor_ic",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$17.crypto_stream_xsalsa20_xor_ic$FUNC, false
    );
    static final FunctionDescriptor crypto_stream_xsalsa20_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_stream_xsalsa20_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_stream_xsalsa20_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$17.crypto_stream_xsalsa20_keygen$FUNC, false
    );
}


