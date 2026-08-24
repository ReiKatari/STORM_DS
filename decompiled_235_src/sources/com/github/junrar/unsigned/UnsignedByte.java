package com.github.junrar.unsigned;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnsignedByte {
    public static short add(byte b, byte b2) {
        return (short) (b + b2);
    }

    public static byte intToByte(int i) {
        return (byte) (i & 255);
    }

    public static byte longToByte(long j) {
        return (byte) (j & 255);
    }

    public static byte shortToByte(short s) {
        return (byte) (s & 255);
    }

    public static short sub(byte b, byte b2) {
        return (short) (b - b2);
    }
}
