package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnc extends zbuf implements zbvn {
    private static final zbnc zbb;
    private int zbd;
    private zbmd zbg;
    private byte zbh = 2;
    private String zbe = "InOrderOutputStreamHandler";
    private zbun zbf = zbuf.zby();

    static {
        zbnc zbncVar = new zbnc();
        zbb = zbncVar;
        zbuf.zbD(zbnc.class, zbncVar);
    }

    private zbnc() {
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
                    return new zbnb(null);
                }
                return new zbnc();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
