package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@Deprecated
/* loaded from: classes.dex */
public final class zbms extends zbuf implements zbvn {
    private static final zbms zbb;
    private int zbd;
    private zbmu zbj;
    private byte zbk = 2;
    private String zbe = "";
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();
    private zbun zbh = zbuf.zby();
    private zbun zbi = zbuf.zby();

    static {
        zbms zbmsVar = new zbms();
        zbb = zbmsVar;
        zbuf.zbD(zbms.class, zbmsVar);
    }

    private zbms() {
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
                            this.zbk = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbmr(null);
                }
                return new zbms();
            }
            return zbuf.zbA(zbb, "\u0001\u0006\u0000\u0001\u0001ϫ\u0006\u0000\u0004\u0001\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ᐉ\u0001Ϫ\u001aϫ\u001a", new Object[]{"zbd", "zbe", "zbf", "zbh", "zbj", "zbg", "zbi"});
        }
        return Byte.valueOf(this.zbk);
    }
}
