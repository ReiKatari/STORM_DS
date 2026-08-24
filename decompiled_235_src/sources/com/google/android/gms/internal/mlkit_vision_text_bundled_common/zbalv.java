package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbalv extends zbuf implements zbvn {
    private static final zbalv zbb;
    private int zbd;
    private float zbg;
    private String zbe = "en";
    private int zbf = -1;
    private zbun zbh = zbuf.zby();
    private zbun zbi = zbuf.zby();

    static {
        zbalv zbalvVar = new zbalv();
        zbb = zbalvVar;
        zbuf.zbD(zbalv.class, zbalvVar);
    }

    private zbalv() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new zbalu(null);
                }
                return new zbalv();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ခ\u0002\u0004\u001a\u0005\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
