package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbxf extends zbuf implements zbvn {
    private static final zbxf zbb;
    private int zbd;
    private zbyw zbe;
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        zbxf zbxfVar = new zbxf();
        zbb = zbxfVar;
        zbuf.zbD(zbxf.class, zbxfVar);
    }

    private zbxf() {
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
                    return new zbxe(null);
                }
                return new zbxf();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", zbzm.class, "zbg", zbxb.class});
        }
        return (byte) 1;
    }
}
