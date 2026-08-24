package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbhc extends zbuf implements zbvn {
    private static final zbhc zbb;
    private int zbd;
    private String zbe = "";
    private float zbf;

    static {
        zbhc zbhcVar = new zbhc();
        zbb = zbhcVar;
        zbuf.zbD(zbhc.class, zbhcVar);
    }

    private zbhc() {
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
                    return new zbhb(null);
                }
                return new zbhc();
            }
            return zbuf.zbA(zbb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
