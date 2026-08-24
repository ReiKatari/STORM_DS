package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbacl extends zbub implements zbvn {
    private static final zbacl zbd;
    private int zbe;
    private zbacb zbf;
    private float zbh;
    private float zbi;
    private float zbj;
    private float zbk;
    private float zbl;
    private long zbo;
    private long zbp;
    private long zbq;
    private float zbr;
    private zbacg zbs;
    private byte zbt = 2;
    private zbun zbg = zbuf.zby();
    private zbun zbm = zbuf.zby();
    private zbun zbn = zbuf.zby();

    static {
        zbacl zbaclVar = new zbacl();
        zbd = zbaclVar;
        zbuf.zbD(zbacl.class, zbaclVar);
    }

    private zbacl() {
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
                            this.zbt = b;
                            return null;
                        }
                        return zbd;
                    }
                    return new zbacc(null);
                }
                return new zbacl();
            }
            return zbuf.zbA(zbd, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005\u000eဉ\n", new Object[]{"zbe", "zbf", "zbg", zback.class, "zbh", "zbi", "zbj", "zbk", "zbm", zbace.class, "zbn", zbabz.class, "zbp", "zbr", "zbq", "zbo", "zbl", "zbs"});
        }
        return Byte.valueOf(this.zbt);
    }
}
