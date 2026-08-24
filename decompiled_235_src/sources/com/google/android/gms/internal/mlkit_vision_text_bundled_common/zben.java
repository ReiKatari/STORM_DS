package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zben extends zbuf implements zbvn {
    private static final zben zbb;
    private int zbd;
    private zbfu zbe;
    private zbnm zbf;
    private zbbn zbg;
    private zbfl zbh;
    private zbet zbi;
    private zbeq zbj;
    private zbff zbk;
    private byte zbl = 2;

    static {
        zben zbenVar = new zben();
        zbb = zbenVar;
        zbuf.zbD(zben.class, zbenVar);
    }

    private zben() {
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
                            this.zbl = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbem(null);
                }
                return new zben();
            }
            return zbuf.zbA(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        }
        return Byte.valueOf(this.zbl);
    }
}
