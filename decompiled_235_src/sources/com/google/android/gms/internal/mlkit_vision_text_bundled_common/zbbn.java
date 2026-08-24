package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbbn extends zbuf implements zbvn {
    private static final zbbn zbb;
    private int zbd;
    private float zbh;
    private byte zbi = 2;
    private String zbe = "";
    private String zbf = "";
    private zbun zbg = zbuf.zby();

    static {
        zbbn zbbnVar = new zbbn();
        zbb = zbbnVar;
        zbuf.zbD(zbbn.class, zbbnVar);
    }

    private zbbn() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbbm(null);
                }
                return new zbbn();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", zbre.class, "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }
}
