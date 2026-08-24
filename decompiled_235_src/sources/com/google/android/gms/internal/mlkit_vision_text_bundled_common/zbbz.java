package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbbz extends zbuf implements zbvn {
    private static final zbbz zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private zbbw zbf;

    static {
        zbbz zbbzVar = new zbbz();
        zbb = zbbzVar;
        zbuf.zbD(zbbz.class, zbbzVar);
    }

    private zbbz() {
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
                    return new zbby(null);
                }
                return new zbbz();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zbd", "zbe", zbgr.class, "zbf"});
        }
        return (byte) 1;
    }
}
