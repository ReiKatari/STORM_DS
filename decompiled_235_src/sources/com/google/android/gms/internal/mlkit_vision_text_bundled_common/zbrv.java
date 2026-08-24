package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbrv extends zbuf implements zbvn {
    private static final zbrv zbb;
    private int zbd;
    private String zbe = "";
    private double zbf = 1.0d;
    private zbun zbg = zbuf.zby();

    static {
        zbrv zbrvVar = new zbrv();
        zbb = zbrvVar;
        zbuf.zbD(zbrv.class, zbrvVar);
    }

    private zbrv() {
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
                    return new zbru(null);
                }
                return new zbrv();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u000f\u001a", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
