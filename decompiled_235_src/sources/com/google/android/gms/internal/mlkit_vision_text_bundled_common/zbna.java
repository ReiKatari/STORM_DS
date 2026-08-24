package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbna extends zbuf implements zbvn {
    private static final zbna zbb;
    private int zbd;
    private zbmd zbf;
    private byte zbg = 2;
    private String zbe = "DefaultInputStreamHandler";

    static {
        zbna zbnaVar = new zbna();
        zbb = zbnaVar;
        zbuf.zbD(zbna.class, zbnaVar);
    }

    private zbna() {
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
                            this.zbg = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbmz(null);
                }
                return new zbna();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
