package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Raw {
    public Raw() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void incShortLittleEndian(byte[] r3, int r4, int r5) {
            r0 = r3[r4]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r2
            int r1 = r1 >>> 8
            int r0 = r0 + r2
            byte r0 = (byte) r0
            r3[r4] = r0
            if (r1 > 0) goto L17
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r5
            if (r0 == 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r4 = r4 + 1
            r0 = r3[r4]
            int r5 = r5 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r1
            int r5 = r5 + r0
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static int readIntBigEndian(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static int readIntLittleEndian(byte[] r2, int r3) {
            int r0 = r3 + 3
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static long readIntLittleEndianAsLong(byte[] r7, int r8) {
            int r0 = r8 + 3
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 24
            long r0 = r0 << r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
    }

    public static long readLongBigEndian(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 3
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 4
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 5
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r1 = r3 + 6
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 << 8
            int r3 = r3 + 7
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            long r2 = (long) r2
            return r2
    }

    public static long readLongLittleEndian(byte[] r5, int r6) {
            int r0 = r6 + 7
            r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            r2 = 8
            long r0 = r0 << r2
            int r3 = r6 + 6
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            int r3 = r6 + 5
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            int r3 = r6 + 4
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            int r3 = r6 + 3
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            int r3 = r6 + 2
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            int r3 = r6 + 1
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r0 = r0 | r3
            long r0 = r0 << r2
            r5 = r5[r6]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            long r5 = r5 | r0
            return r5
    }

    public static short readShortBigEndian(byte[] r1, int r2) {
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            int r0 = r0 << 8
            short r0 = (short) r0
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static short readShortLittleEndian(byte[] r1, int r2) {
            int r0 = r2 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            int r0 = r0 << 8
            short r0 = (short) r0
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            short r1 = (short) r0
            return r1
    }

    public static void writeIntBigEndian(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void writeIntLittleEndian(byte[] r2, int r3, int r4) {
            int r0 = r3 + 3
            int r1 = r4 >>> 24
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void writeLongBigEndian(byte[] r3, int r4, long r5) {
            r0 = 56
            long r0 = r5 >>> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 48
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 40
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 32
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 24
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 16
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 8
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 7
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            int r5 = (int) r5
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static void writeLongLittleEndian(byte[] r3, int r4, long r5) {
            int r0 = r4 + 7
            r1 = 56
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 48
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 40
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 32
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 24
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 16
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 1
            r1 = 8
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            int r5 = (int) r5
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static void writeShortBigEndian(byte[] r1, int r2, short r3) {
            int r0 = r3 >>> 8
            byte r0 = (byte) r0
            r1[r2] = r0
            int r2 = r2 + 1
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            return
    }

    public static void writeShortLittleEndian(byte[] r2, int r3, short r4) {
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }
}
