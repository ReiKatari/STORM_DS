package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbre extends zbuf implements zbvn {
    private static final zbre zbb;
    private int zbd;
    private int zbe;
    private zbpw zbg;
    private zbpw zbh;
    private float zbj;
    private zbpw zbl;
    private zbpw zbm;
    private zbqm zbn;
    private zbri zbp;
    private byte zbq = 2;
    private zbul zbf = zbuf.zbw();
    private String zbi = "";
    private zbun zbk = zbuf.zby();
    private boolean zbo = true;

    static {
        zbre zbreVar = new zbre();
        zbb = zbreVar;
        zbuf.zbD(zbre.class, zbreVar);
    }

    private zbre() {
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
                            this.zbq = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbrd(null);
                }
                return new zbre();
            }
            return zbuf.zbA(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\b\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\f\u0016", new Object[]{"zbd", "zbe", "zbg", "zbh", "zbi", "zbj", "zbl", "zbm", "zbn", "zbo", "zbp", "zbk", zbqa.class, "zbf"});
        }
        return Byte.valueOf(this.zbq);
    }
}
