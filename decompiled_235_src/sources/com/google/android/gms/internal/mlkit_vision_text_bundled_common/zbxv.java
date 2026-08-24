package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbxv extends zbuf implements zbvn {
    private static final zbxv zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private zbun zbg = zbuf.zby();
    private int zbh;

    static {
        zbxv zbxvVar = new zbxv();
        zbb = zbxvVar;
        zbuf.zbD(zbxv.class, zbxvVar);
    }

    private zbxv() {
    }

    public static /* synthetic */ zbxv zbc() {
        return zbb;
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
                    return new zbxt(null);
                }
                return new zbxv();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zbd", "zbe", zbxu.zba, "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
