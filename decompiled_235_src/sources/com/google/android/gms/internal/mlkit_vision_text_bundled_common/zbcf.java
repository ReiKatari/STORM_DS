package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbcf extends zbuf implements zbvn {
    private static final zbcf zbb;
    private int zbd;
    private float zbf;
    private int zbi;
    private float zbj;
    private zbun zbe = zbuf.zby();
    private boolean zbg = true;
    private float zbh = 0.8f;

    static {
        zbcf zbcfVar = new zbcf();
        zbb = zbcfVar;
        zbuf.zbD(zbcf.class, zbcfVar);
    }

    private zbcf() {
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
                    return new zbce(null);
                }
                return new zbcf();
            }
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001a\u0002ခ\u0000\u0003ဇ\u0001\u0004ခ\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return (byte) 1;
    }
}
