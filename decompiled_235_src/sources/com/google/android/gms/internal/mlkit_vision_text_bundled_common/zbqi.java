package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbqi extends zbuf implements zbvn {
    private static final zbqi zbb;
    private zbuk zbA;
    private zbul zbB;
    private float zbC;
    private int zbD;
    private int zbE;
    private byte zbF = 2;
    private int zbd;
    private zbpw zbe;
    private float zbf;
    private zbtc zbg;
    private zbtc zbh;
    private zbpw zbi;
    private int zbj;
    private zbun zbk;
    private boolean zbl;
    private boolean zbm;
    private zbun zbn;
    private String zbo;
    private String zbp;
    private zbun zbq;
    private zbun zbr;
    private int zbs;
    private int zbt;
    private float zbu;
    private float zbv;
    private float zbw;
    private int zbx;
    private zbqy zby;
    private zbun zbz;

    static {
        zbqi zbqiVar = new zbqi();
        zbb = zbqiVar;
        zbuf.zbD(zbqi.class, zbqiVar);
    }

    private zbqi() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbg = zbtcVar;
        this.zbh = zbtcVar;
        this.zbk = zbuf.zby();
        this.zbn = zbuf.zby();
        this.zbo = "";
        this.zbp = "";
        this.zbq = zbuf.zby();
        this.zbr = zbuf.zby();
        this.zbt = 1;
        this.zbz = zbuf.zby();
        this.zbA = zbuf.zbv();
        this.zbB = zbuf.zbw();
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
                            this.zbF = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbqh(null);
                }
                return new zbqi();
            }
            return zbuf.zbA(zbb, "\u0001\u001b\u0000\u0001\u0001d\u001b\u0000\u0007\u0007\u0001ᔉ\u0000\u0002ခ\u0001\u0003ည\u0002\u0004ည\u0003\u0005င\u0005\u0006ᐉ\u0004\u0007Л\bဇ\u0006\tဇ\u0007\nЛ\u000bဈ\b\fЛ\rЛ\u000eင\n\u000f᠌\u000b\u0010ခ\u000e\u0011ဈ\t\u0012င\u000f\u0013ဉ\u0010\u0014Л\u0015\u0013\u0016\u0016\u0017ခ\f\u0018ခ\r\u0019ခ\u0011\u001aင\u0012dင\u0013", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbj", "zbi", "zbk", zbqk.class, "zbl", "zbm", "zbn", zbse.class, "zbo", "zbq", zbpw.class, "zbr", zbqa.class, "zbs", "zbt", zbqr.zba, "zbw", "zbp", "zbx", "zby", "zbz", zbpw.class, "zbA", "zbB", "zbu", "zbv", "zbC", "zbD", "zbE"});
        }
        return Byte.valueOf(this.zbF);
    }
}
