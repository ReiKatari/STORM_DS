package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbro extends zbuf implements zbvn {
    private static final zbro zbb;
    private int zbd;
    private int zbf;
    private int zbg;
    private zbrq zbj;
    private zbqw zbl;
    private zbqt zbm;
    private byte zbo = 2;
    private zbtc zbe = zbtc.zbb;
    private String zbh = "";
    private zbun zbi = zbuf.zby();
    private zbun zbk = zbuf.zby();
    private zbun zbn = zbuf.zby();

    static {
        zbro zbroVar = new zbro();
        zbb = zbroVar;
        zbuf.zbD(zbro.class, zbroVar);
    }

    private zbro() {
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
                            this.zbo = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbrn(null);
                }
                return new zbro();
            }
            return zbuf.zbA(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zbd", "zbe", "zbh", "zbi", zbqq.class, "zbj", "zbk", zbrm.class, "zbl", "zbm", "zbn", zbrk.class, "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbo);
    }
}
