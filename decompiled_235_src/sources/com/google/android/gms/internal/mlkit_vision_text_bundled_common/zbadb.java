package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbadb extends zbub implements zbvn {
    private static final zbadb zbd;
    private int zbe;
    private zbact zbf;
    private float zbh;
    private float zbi;
    private zbact zbl;
    private zbacl zbm;
    private byte zbo = 2;
    private zbun zbg = zbuf.zby();
    private zbun zbj = zbuf.zby();
    private zbtc zbk = zbtc.zbb;
    private zbun zbn = zbuf.zby();

    static {
        zbadb zbadbVar = new zbadb();
        zbd = zbadbVar;
        zbuf.zbD(zbadb.class, zbadbVar);
    }

    private zbadb() {
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
                        return zbd;
                    }
                    return new zbacu(null);
                }
                return new zbadb();
            }
            return zbuf.zbA(zbd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zbe", "zbf", "zbg", zbada.class, "zbh", "zbj", zbacw.class, "zbm", "zbn", zbacr.class, "zbk", "zbl", "zbi"});
        }
        return Byte.valueOf(this.zbo);
    }
}
