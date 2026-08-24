package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaid extends zbuf implements zbvn {
    private static final zbaid zbb;
    private float zbd;
    private float zbe;

    static {
        zbaid zbaidVar = new zbaid();
        zbb = zbaidVar;
        zbuf.zbD(zbaid.class, zbaidVar);
    }

    private zbaid() {
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
                    return new zbaic(null);
                }
                return new zbaid();
            }
            return zbuf.zbA(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"zbd", "zbe"});
        }
        return (byte) 1;
    }
}
