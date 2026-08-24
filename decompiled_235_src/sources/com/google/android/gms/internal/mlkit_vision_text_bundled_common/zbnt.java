package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnt extends zbuf implements zbvn {
    private static final zbnt zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private int zbf;
    private int zbg;

    static {
        zbnt zbntVar = new zbnt();
        zbb = zbntVar;
        zbuf.zbD(zbnt.class, zbntVar);
    }

    private zbnt() {
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
                    return new zbnp(null);
                }
                return new zbnt();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000\u0003᠌\u0001", new Object[]{"zbd", "zbe", zbnr.class, "zbf", zbns.zba, "zbg", zbnn.zba});
        }
        return (byte) 1;
    }
}
