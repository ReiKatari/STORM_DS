package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbagw extends zbuf implements zbvn {
    private static final zbagw zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private byte zbi = 2;

    static {
        zbagw zbagwVar = new zbagw();
        zbb = zbagwVar;
        zbuf.zbD(zbagw.class, zbagwVar);
    }

    private zbagw() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbagv(null);
                }
                return new zbagw();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
