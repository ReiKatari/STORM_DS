package com.github.junrar.unsigned;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class UnsignedByte {
    public UnsignedByte() {
            r0 = this;
            r0.<init>()
            return
    }

    public static short add(byte r0, byte r1) {
            int r0 = r0 + r1
            short r0 = (short) r0
            return r0
    }

    public static byte intToByte(int r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            return r0
    }

    public static byte longToByte(long r2) {
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r0
            int r2 = (int) r2
            byte r2 = (byte) r2
            return r2
    }

    public static byte shortToByte(short r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            return r0
    }

    public static short sub(byte r0, byte r1) {
            int r0 = r0 - r1
            short r0 = (short) r0
            return r0
    }
}
