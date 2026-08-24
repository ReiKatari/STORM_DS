package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbagn extends zbuf implements zbvn {
    private static final zbagn zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private zbagq zbi;
    private float zbj;
    private zbafz zbk;
    private float zbl;
    private zbtc zbm;
    private zbtc zbn;
    private byte zbo = 2;

    static {
        zbagn zbagnVar = new zbagn();
        zbb = zbagnVar;
        zbuf.zbD(zbagn.class, zbagnVar);
    }

    private zbagn() {
        zbtc zbtcVar = zbtc.zbb;
        this.zbm = zbtcVar;
        this.zbn = zbtcVar;
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
                    return new zbagm(null);
                }
                return new zbagn();
            }
            return zbuf.zbA(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbl", "zbm", "zbj", "zbk", "zbi", "zbn"});
        }
        return Byte.valueOf(this.zbo);
    }
}
