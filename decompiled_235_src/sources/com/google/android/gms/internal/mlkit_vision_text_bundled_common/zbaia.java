package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaia extends zbuf implements zbvn {
    private static final zbaia zbb;
    private zbun zbd = zbuf.zby();
    private zbun zbe = zbuf.zby();
    private zbun zbf = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        zbaia zbaiaVar = new zbaia();
        zbb = zbaiaVar;
        zbuf.zbD(zbaia.class, zbaiaVar);
    }

    private zbaia() {
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
                    return new zbahz(null);
                }
                return new zbaia();
            }
            return zbuf.zbA(zbb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zbd", zbahm.class, "zbe", zbahb.class, "zbf", zbaif.class, "zbg", zbahy.class});
        }
        return (byte) 1;
    }
}
