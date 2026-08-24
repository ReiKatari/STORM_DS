package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaax extends zbuf implements zbvn {
    private static final zbaax zbb;
    private byte zbe = 2;
    private zbun zbd = zbuf.zby();

    static {
        zbaax zbaaxVar = new zbaax();
        zbb = zbaaxVar;
        zbuf.zbD(zbaax.class, zbaaxVar);
    }

    private zbaax() {
    }

    public static zbaax zbe() {
        return zbb;
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
                            this.zbe = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbaau(null);
                }
                return new zbaax();
            }
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbd", zbaaw.class});
        }
        return Byte.valueOf(this.zbe);
    }

    public final List zbf() {
        return this.zbd;
    }
}
