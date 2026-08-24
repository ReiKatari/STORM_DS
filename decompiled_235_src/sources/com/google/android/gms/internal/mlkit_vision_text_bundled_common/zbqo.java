package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbqo extends zbuf implements zbvn {
    private static final zbqo zbb;
    private int zbd;
    private float zbe = 1.5f;
    private float zbf = 3.0f;
    private float zbg = 3.0f;
    private float zbh = 2.0f;
    private float zbi = 0.5f;
    private float zbj = 1.5f;
    private float zbk = 1.7f;
    private float zbl = 2.0f;
    private boolean zbm;

    static {
        zbqo zbqoVar = new zbqo();
        zbb = zbqoVar;
        zbuf.zbD(zbqo.class, zbqoVar);
    }

    private zbqo() {
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
                    return new zbqn(null);
                }
                return new zbqo();
            }
            return zbuf.zbA(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm"});
        }
        return (byte) 1;
    }
}
