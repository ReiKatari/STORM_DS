package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbafm extends zbuf implements zbvn {
    private static final zbafm zbb;
    private int zbd;
    private String zbe = "";
    private zbtc zbf;
    private zbafo zbg;
    private String zbh;
    private zbtc zbi;
    private zbafo zbj;
    private String zbk;
    private zbtc zbl;
    private zbafo zbm;
    private String zbn;
    private String zbo;
    private zbafo zbp;

    static {
        zbafm zbafmVar = new zbafm();
        zbb = zbafmVar;
        zbuf.zbD(zbafm.class, zbafmVar);
    }

    private zbafm() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbf = zbtcVar;
        this.zbh = "";
        this.zbi = zbtcVar;
        this.zbk = "";
        this.zbl = zbtcVar;
        this.zbn = "";
        this.zbo = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zbb;
                    }
                    return new zbafl(null);
                }
                return new zbafm();
            }
            return zbuf.zbA(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0004\u0004ဈ\u0003\u0005ဈ\u0006\u0006ည\u0007\u0007ဈ\t\bဈ\n\tဉ\u0002\nဉ\u0005\u000bဉ\b\fဉ\u000b", new Object[]{"zbd", "zbe", "zbf", "zbi", "zbh", "zbk", "zbl", "zbn", "zbo", "zbg", "zbj", "zbm", "zbp"});
        }
        return (byte) 1;
    }
}
