package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbkj {
    public static int zba(int i, int i2, String str) {
        String zba;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                i.h(lb1.g(i2, "negative size: "));
                return 0;
            }
            zba = zbkp.zba("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zba = zbkp.zba("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zba);
    }

    public static int zbb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        e41.q(zbe(i, i2, "index"));
        return 0;
    }

    public static void zbc(boolean z) {
        if (z) {
            return;
        }
        u34.t();
    }

    public static void zbd(int i, int i2, int i3) {
        String zbe;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zbe = zbkp.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zbe = zbe(i2, i3, "end index");
            }
        } else {
            zbe = zbe(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zbe);
    }

    private static String zbe(int i, int i2, String str) {
        if (i < 0) {
            return zbkp.zba("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zbkp.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        i.h(lb1.g(i2, "negative size: "));
        return null;
    }
}
