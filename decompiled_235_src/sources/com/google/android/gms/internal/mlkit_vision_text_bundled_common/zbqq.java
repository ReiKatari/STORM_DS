package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbqq extends zbub implements zbvn {
    private static final zbqq zbd;
    private int zbA;
    private float zbB;
    private boolean zbC;
    private int zbD;
    private int zbe;
    private zbpw zbg;
    private zbpw zbh;
    private zbpw zbi;
    private float zbk;
    private float zbn;
    private boolean zbp;
    private int zbr;
    private int zbs;
    private boolean zbt;
    private zbqi zbu;
    private boolean zbv;
    private int zbw;
    private int zbx;
    private int zby;
    private zbrz zbz;
    private byte zbE = 2;
    private zbun zbf = zbuf.zby();
    private String zbj = "";
    private zbun zbl = zbuf.zby();
    private zbun zbm = zbuf.zby();
    private String zbo = "";
    private zbun zbq = zbuf.zby();

    static {
        zbqq zbqqVar = new zbqq();
        zbd = zbqqVar;
        zbuf.zbD(zbqq.class, zbqqVar);
    }

    private zbqq() {
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
                            this.zbE = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbqp(null);
                }
                return new zbqq();
            }
            return zbuf.zbA(zbd, "\u0001\u0019\u0000\u0001\u0001d\u0019\u0000\u0004\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0003\u0005ခ\u0004\u0006\u001b\u0007ခ\u0005\bဈ\u0006\tЛ\nဇ\u0007\u000b\u001b\fင\b\rင\t\u000eဇ\n\u000fᐉ\u000b\u0010ဇ\f\u0011င\r\u0012င\u000e\u0013ᐉ\u0002\u0014င\u000f\u0015ဉ\u0010\u0016᠌\u0011\u0017ခ\u0012\u0018ဇ\u0013dင\u0014", new Object[]{"zbe", "zbf", zbrs.class, "zbg", "zbh", "zbj", "zbk", "zbm", zbpy.class, "zbn", "zbo", "zbl", zbqa.class, "zbp", "zbq", zbrc.class, "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zbi", "zby", "zbz", "zbA", zbabe.zba(), "zbB", "zbC", "zbD"});
        }
        return Byte.valueOf(this.zbE);
    }
}
