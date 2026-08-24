package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbrg extends zbuf implements zbvn {
    private static final zbrg zbb;
    private int zbd;
    private int zbe;
    private float zbg;
    private byte zbh = 2;
    private zbul zbf = zbuf.zbw();

    static {
        zbrg zbrgVar = new zbrg();
        zbb = zbrgVar;
        zbuf.zbD(zbrg.class, zbrgVar);
    }

    private zbrg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbrf(null);
                }
                return new zbrg();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zbd", "zbe", "zbg", "zbf"});
        }
        return Byte.valueOf(this.zbh);
    }
}
