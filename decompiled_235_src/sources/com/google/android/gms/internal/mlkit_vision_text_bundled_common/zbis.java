package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbis extends zbuf implements zbvn {
    private static final zbis zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private int zbf;

    static {
        zbis zbisVar = new zbis();
        zbb = zbisVar;
        zbuf.zbD(zbis.class, zbisVar);
    }

    private zbis() {
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
                    return new zbir(null);
                }
                return new zbis();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zbd", "zbe", zbgz.class, "zbf"});
        }
        return (byte) 1;
    }
}
