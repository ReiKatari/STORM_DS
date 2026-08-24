package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbrm extends zbuf implements zbvn {
    private static final zbrm zbb;
    private int zbd;
    private zbpw zbe;
    private int zbh;
    private int zbi;
    private byte zbj = 2;
    private String zbf = "";
    private zbul zbg = zbuf.zbw();

    static {
        zbrm zbrmVar = new zbrm();
        zbb = zbrmVar;
        zbuf.zbD(zbrm.class, zbrmVar);
    }

    private zbrm() {
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
                            this.zbj = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbrl(null);
                }
                return new zbrm();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005᠌\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", zbabe.zba()});
        }
        return Byte.valueOf(this.zbj);
    }
}
