package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbagf extends zbuf implements zbvn {
    private static final zbagf zbb;
    private int zbd;
    private Object zbf;
    private int zbe = 0;
    private String zbg = "";
    private String zbh = "";
    private zbtc zbi = zbtc.zbb;

    static {
        zbagf zbagfVar = new zbagf();
        zbb = zbagfVar;
        zbuf.zbD(zbagf.class, zbagfVar);
    }

    private zbagf() {
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
                    return new zbage(null);
                }
                return new zbagf();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005ည\u0002", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", zbafz.class, zbagt.class, "zbi"});
        }
        return (byte) 1;
    }
}
