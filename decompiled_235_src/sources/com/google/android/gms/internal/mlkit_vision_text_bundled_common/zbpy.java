package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbpy extends zbuf implements zbvn {
    private static final zbpy zbb;
    private int zbd;
    private int zbe = -1;
    private int zbf = -1;
    private zbuk zbg = zbuf.zbv();
    private zbul zbh = zbuf.zbw();
    private zbuk zbi = zbuf.zbv();

    static {
        zbpy zbpyVar = new zbpy();
        zbb = zbpyVar;
        zbuf.zbD(zbpy.class, zbpyVar);
    }

    private zbpy() {
    }

    public static /* synthetic */ zbpy zba() {
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
                    return new zbpx(null);
                }
                return new zbpy();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return (byte) 1;
    }
}
