package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbagc extends zbuf implements zbvn {
    private static final zbagc zbb;
    private int zbd;
    private double zbe;
    private double zbf;
    private double zbh;
    private boolean zbi;
    private double zbj;
    private double zbk;
    private byte zbl = 2;
    private String zbg = "";

    static {
        zbagc zbagcVar = new zbagc();
        zbb = zbagcVar;
        zbuf.zbD(zbagc.class, zbagcVar);
    }

    private zbagc() {
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
                            this.zbl = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbagb(null);
                }
                return new zbagc();
            }
            return zbuf.zbA(zbb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zbd", "zbe", "zbf", "zbj", "zbk", "zbi", "zbh", "zbg"});
        }
        return Byte.valueOf(this.zbl);
    }
}
