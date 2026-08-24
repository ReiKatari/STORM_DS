package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbqm extends zbuf implements zbvn {
    private static final zbqm zbb;
    private int zbd;
    private zbtc zbe;
    private zbtc zbf;
    private zbtc zbg;
    private zbpw zbh;
    private String zbi;
    private byte zbj = 2;

    static {
        zbqm zbqmVar = new zbqm();
        zbb = zbqmVar;
        zbuf.zbD(zbqm.class, zbqmVar);
    }

    private zbqm() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbe = zbtcVar;
        this.zbf = zbtcVar;
        this.zbg = zbtcVar;
        this.zbi = "";
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
                    return new zbql(null);
                }
                return new zbqm();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return Byte.valueOf(this.zbj);
    }
}
