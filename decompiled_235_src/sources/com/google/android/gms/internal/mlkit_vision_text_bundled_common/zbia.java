package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbia extends zbuf implements zbvn {
    private static final zbia zbb;
    private int zbd;
    private Object zbf;
    private int zbg;
    private int zbh;
    private int zbe = 0;
    private zbun zbi = zbuf.zby();

    static {
        zbia zbiaVar = new zbia();
        zbb = zbiaVar;
        zbuf.zbD(zbia.class, zbiaVar);
    }

    private zbia() {
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
                    return new zbht(null);
                }
                return new zbia();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001=\u0000\u0002င\u0000\u0003င\u0001\u0004<\u0000\u0005\u001b", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", zbhz.class, "zbi", zbhv.class});
        }
        return (byte) 1;
    }
}
