package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@Deprecated
/* loaded from: classes.dex */
public final class zbmu extends zbub implements zbvn {
    private static final zbmu zbd;
    private int zbe;
    private byte zbg = 2;
    private boolean zbf = true;

    static {
        zbmu zbmuVar = new zbmu();
        zbd = zbmuVar;
        zbuf.zbD(zbmu.class, zbmuVar);
    }

    private zbmu() {
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
                        return zbd;
                    }
                    return new zbmt(null);
                }
                return new zbmu();
            }
            return zbuf.zbA(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }
}
