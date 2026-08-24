package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbjm extends zbub implements zbvn {
    private static final zbjm zbd;
    private int zbe;
    private long zbf;
    private zbgo zbg;
    private zbgw zbh;
    private byte zbj = 2;
    private zbun zbi = zbuf.zby();

    static {
        zbjm zbjmVar = new zbjm();
        zbd = zbjmVar;
        zbuf.zbD(zbjm.class, zbjmVar);
    }

    private zbjm() {
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
                        return zbd;
                    }
                    return new zbjl(null);
                }
                return new zbjm();
            }
            return zbuf.zbA(zbd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbi", zbgz.class, "zbh"});
        }
        return Byte.valueOf(this.zbj);
    }
}
