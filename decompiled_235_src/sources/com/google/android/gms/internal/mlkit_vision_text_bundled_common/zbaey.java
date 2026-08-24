package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaey extends zbuf implements zbvn {
    private static final zbaey zbb;
    private zbuk zbd = zbuf.zbv();
    private zbuk zbe = zbuf.zbv();
    private zbuk zbf = zbuf.zbv();
    private zbuk zbg = zbuf.zbv();
    private zbuk zbh = zbuf.zbv();
    private zbuk zbi = zbuf.zbv();

    static {
        zbaey zbaeyVar = new zbaey();
        zbb = zbaeyVar;
        zbuf.zbD(zbaey.class, zbaeyVar);
    }

    private zbaey() {
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
                    return new zbaex(null);
                }
                return new zbaey();
            }
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013\u0005\u0013\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
