package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Raw {
    public static void incShortLittleEndian(byte[] bArr, int i, int i2) {
        int i3 = bArr[i];
        int i4 = i2 & 255;
        int i5 = ((i3 & 255) + i4) >>> 8;
        bArr[i] = (byte) (i3 + i4);
        if (i5 <= 0 && (65280 & i2) == 0) {
            return;
        }
        int i6 = i + 1;
        bArr[i6] = (byte) (((i2 >>> 8) & 255) + i5 + bArr[i6]);
    }

    public static int readIntBigEndian(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((((((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)) << 8) | (bArr[i + 2] & 255)) << 8);
    }

    public static int readIntLittleEndian(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long readIntLittleEndianAsLong(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long readLongBigEndian(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((((((((((((((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)) << 8) | (bArr[i + 2] & 255)) << 8) | (bArr[i + 3] & 255)) << 8) | (bArr[i + 4] & 255)) << 8) | (bArr[i + 5] & 255)) << 8) | (bArr[i + 6] & 255)) << 8);
    }

    public static long readLongLittleEndian(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((((((((((((((bArr[i + 7] & 255) << 8) | (bArr[i + 6] & 255)) << 8) | (bArr[i + 5] & 255)) << 8) | (bArr[i + 4] & 255)) << 8) | (bArr[i + 3] & 255)) << 8) | (bArr[i + 2] & 255)) << 8) | (bArr[i + 1] & 255)) << 8);
    }

    public static short readShortBigEndian(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((short) (((short) (bArr[i] & 255)) << 8)));
    }

    public static short readShortLittleEndian(byte[] bArr, int i) {
        return (short) (((short) (((short) (bArr[i + 1] & 255)) << 8)) + (bArr[i] & 255));
    }

    public static void writeIntBigEndian(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >>> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    public static void writeIntLittleEndian(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) (i2 >>> 24);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i] = (byte) (i2 & 255);
    }

    public static void writeLongBigEndian(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) (j & 255);
    }

    public static void writeLongLittleEndian(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) (j >>> 56);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i] = (byte) (j & 255);
    }

    public static void writeShortBigEndian(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) (s & 255);
    }

    public static void writeShortLittleEndian(byte[] bArr, int i, short s) {
        bArr[i + 1] = (byte) (s >>> 8);
        bArr[i] = (byte) (s & 255);
    }
}
