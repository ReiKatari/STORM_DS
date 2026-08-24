package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbalm extends zbuf implements zbvn {
    private static final zbalm zbb;

    static {
        zbalm zbalmVar = new zbalm();
        zbb = zbalmVar;
        zbuf.zbD(zbalm.class, zbalmVar);
    }

    private zbalm() {
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
                    return new zball(null);
                }
                return new zbalm();
            }
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
