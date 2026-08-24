package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaat extends zbub implements zbvn {
    private static final zbaat zbd;
    private int zbe;
    private Object zbg;
    private int zbi;
    private int zbj;
    private int zbk;
    private int zbf = 0;
    private byte zbl = 2;
    private String zbh = "";

    static {
        zbaat zbaatVar = new zbaat();
        zbd = zbaatVar;
        zbuf.zbD(zbaat.class, zbaatVar);
    }

    private zbaat() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zbl = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbaas(null);
                }
                return new zbaat();
            }
            return zbuf.zbA(zbd, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006=\u0000\u0007=\u0000\b6\u0000", new Object[]{"zbg", "zbf", "zbe", "zbh", "zbi", "zbj", "zbk"});
        }
        return Byte.valueOf(this.zbl);
    }
}
