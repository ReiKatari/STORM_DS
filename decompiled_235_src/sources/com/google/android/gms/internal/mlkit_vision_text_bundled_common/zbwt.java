package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwt {
    public static /* bridge */ /* synthetic */ void zba(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zbe(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zbe(b3) && !zbe(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        fa6.j("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zbb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zbe(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zbe(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        fa6.j("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zbc(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zbe(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        } else {
            fa6.j("Protocol message had invalid UTF-8.");
        }
    }

    public static /* bridge */ /* synthetic */ boolean zbd(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    private static boolean zbe(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
