package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zblu extends zbuf implements zbvn {
    private static final zblu zbb;
    private int zbd;
    private int zbh;
    private int zbn;
    private boolean zbo;
    private zbna zbp;
    private zbnc zbq;
    private zbma zbs;
    private zbmd zbv;
    private byte zbx = 2;
    private zbun zbe = zbuf.zby();
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();
    private zbun zbi = zbuf.zby();
    private zbun zbj = zbuf.zby();
    private zbun zbk = zbuf.zby();
    private zbun zbl = zbuf.zby();
    private zbun zbm = zbuf.zby();
    private zbun zbr = zbuf.zby();
    private String zbt = "";
    private String zbu = "";
    private zbun zbw = zbuf.zby();

    static {
        zblu zbluVar = new zblu();
        zbb = zbluVar;
        zbuf.zbD(zblu.class, zbluVar);
    }

    private zblu() {
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
                            this.zbx = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zblr(null);
                }
                return new zblu();
            }
            return zbuf.zbA(zbb, "\u0000\u0013\u0000\u0001\u0001Ϫ\u0013\u0000\n\b\u0001Л\u0006Л\u0007Л\b\u0004\tЛ\nȚ\u000b\u0004\fᐉ\u0000\rᐉ\u0001\u000eЛ\u000fȚ\u0010Ț\u0011Ț\u0012ဉ\u0002\u0013Ȉ\u0014Ȉ\u0015\u0007ϩᐉ\u0003Ϫ\u001b", new Object[]{"zbd", "zbe", zblt.class, "zbf", zbmn.class, "zbg", zbms.class, "zbh", "zbi", zbmx.class, "zbj", "zbn", "zbp", "zbq", "zbr", zblw.class, "zbk", "zbl", "zbm", "zbs", "zbt", "zbu", "zbo", "zbv", "zbw", zbsp.class});
        }
        return Byte.valueOf(this.zbx);
    }
}
