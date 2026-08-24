package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbmg extends zbuf implements zbvn {
    private static final zbmg zbb;
    private Object zbe;
    private int zbd = 0;
    private zbun zbf = zbuf.zby();

    static {
        zbmg zbmgVar = new zbmg();
        zbb = zbmgVar;
        zbuf.zbD(zbmg.class, zbmgVar);
    }

    private zbmg() {
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
                    return new zbmf(null);
                }
                return new zbmg();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b", new Object[]{"zbe", "zbd", zbmk.class, "zbf", zbmg.class});
        }
        return (byte) 1;
    }
}
