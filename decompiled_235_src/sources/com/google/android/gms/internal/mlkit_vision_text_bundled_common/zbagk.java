package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbagk extends zbuf implements zbvn {
    private static final zbagk zbb;
    private int zbd;
    private long zbe;
    private int zbh;
    private int zbi;
    private zbagc zbl;
    private zbtc zbm;
    private zbagw zbn;
    private String zbo;
    private zbun zbp;
    private zbun zbq;
    private zbtc zbr;
    private String zbs;
    private byte zbt = 2;
    private String zbf = "";
    private String zbg = "";
    private zbun zbj = zbuf.zby();
    private String zbk = "";

    static {
        zbagk zbagkVar = new zbagk();
        zbb = zbagkVar;
        zbuf.zbD(zbagk.class, zbagkVar);
    }

    private zbagk() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbm = zbtcVar;
        this.zbo = "";
        this.zbp = zbuf.zby();
        this.zbq = zbuf.zby();
        this.zbr = zbtcVar;
        this.zbs = "";
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
                            this.zbt = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbagh(null);
                }
                return new zbagk();
            }
            return zbuf.zbA(zbb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zbd", "zbe", "zbp", zbagj.class, "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbm", "zbn", "zbl", "zbr", "zbo", "zbs", "zbq", zbagf.class});
        }
        return Byte.valueOf(this.zbt);
    }
}
