package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnw extends zbuf implements zbvn {
    private static final zbnw zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private long zbj;
    private byte zbk = 2;

    static {
        zbnw zbnwVar = new zbnw();
        zbb = zbnwVar;
        zbuf.zbD(zbnw.class, zbnwVar);
    }

    private zbnw() {
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
                            this.zbk = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbnv(null);
                }
                return new zbnw();
            }
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        }
        return Byte.valueOf(this.zbk);
    }
}
