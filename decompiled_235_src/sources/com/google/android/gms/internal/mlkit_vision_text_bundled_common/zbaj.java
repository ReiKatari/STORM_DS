package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaj extends zbuf implements zbvn {
    private static final zbaj zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private int zbh;

    static {
        zbaj zbajVar = new zbaj();
        zbb = zbajVar;
        zbuf.zbD(zbaj.class, zbajVar);
    }

    private zbaj() {
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
                    return new zbah(null);
                }
                return new zbaj();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", zbai.zba});
        }
        return (byte) 1;
    }
}
