package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaht extends zbuf implements zbvn {
    private static final zbaht zbb;
    private int zbd = 0;
    private Object zbe;
    private int zbf;
    private float zbg;

    static {
        zbaht zbahtVar = new zbaht();
        zbb = zbahtVar;
        zbuf.zbD(zbaht.class, zbahtVar);
    }

    private zbaht() {
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
                    return new zbahs(null);
                }
                return new zbaht();
            }
            return zbuf.zbA(zbb, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003?\u0000\u0004Ȼ\u0000", new Object[]{"zbe", "zbd", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
