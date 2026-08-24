package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbxo extends zbuf implements zbvn {
    private static final zbxo zbb;
    private int zbd;
    private String zbe = "";
    private int zbf = 1;
    private boolean zbg;
    private int zbh;

    static {
        zbxo zbxoVar = new zbxo();
        zbb = zbxoVar;
        zbuf.zbD(zbxo.class, zbxoVar);
    }

    private zbxo() {
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
                    return new zbxm(null);
                }
                return new zbxo();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zbd", "zbe", "zbf", zbxn.zba, "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
