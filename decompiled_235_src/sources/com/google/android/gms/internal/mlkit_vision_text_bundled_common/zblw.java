package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zblw extends zbuf implements zbvn {
    private static final zblw zbb;
    private int zbd;
    private zbmd zbg;
    private byte zbh = 2;
    private String zbe = "";
    private String zbf = "";

    static {
        zblw zblwVar = new zblw();
        zbb = zblwVar;
        zbuf.zbD(zblw.class, zblwVar);
    }

    private zblw() {
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
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zblv(null);
                }
                return new zblw();
            }
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ᐉ\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
