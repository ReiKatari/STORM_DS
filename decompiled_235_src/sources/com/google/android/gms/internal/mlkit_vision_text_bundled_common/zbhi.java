package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbhi extends zbuf implements zbvn {
    private static final zbhi zbb;
    private int zbd;
    private Object zbf;
    private float zbg;
    private boolean zbi;
    private int zbe = 0;
    private String zbh = "";

    static {
        zbhi zbhiVar = new zbhi();
        zbb = zbhiVar;
        zbuf.zbD(zbhi.class, zbhiVar);
    }

    private zbhi() {
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
                    return new zbhh(null);
                }
                return new zbhi();
            }
            return zbuf.zbA(zbb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u0002ခ\u0000\u0003;\u0000\u0004ဈ\u0001\u0005ဇ\u0002", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
