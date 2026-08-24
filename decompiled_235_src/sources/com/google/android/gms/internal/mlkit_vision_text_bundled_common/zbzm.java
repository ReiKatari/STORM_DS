package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbzm extends zbuf implements zbvn {
    private static final zbzm zbb;
    private int zbd;
    private int zbf;
    private boolean zbh;
    private int zbm;
    private String zbe = "";
    private String zbg = "";
    private String zbi = "";
    private zbun zbj = zbuf.zby();
    private zbun zbk = zbuf.zby();
    private zbun zbl = zbuf.zby();

    static {
        zbzm zbzmVar = new zbzm();
        zbb = zbzmVar;
        zbuf.zbD(zbzm.class, zbzmVar);
    }

    private zbzm() {
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
                    return new zbzl(null);
                }
                return new zbzm();
            }
            return zbuf.zbA(zbb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004\u001b\u0006ဈ\u0002\u0007ဇ\u0003\bဈ\u0004\t\u001a\nင\u0005", new Object[]{"zbd", "zbe", "zbf", "zbj", "zbk", zbzg.class, "zbg", "zbh", "zbi", "zbl", "zbm"});
        }
        return (byte) 1;
    }
}
