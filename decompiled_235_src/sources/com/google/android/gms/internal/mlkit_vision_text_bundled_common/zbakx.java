package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbakx extends zbuf implements zbvn {
    private static final zbakx zbb;
    private Object zbe;
    private int zbd = 0;
    private String zbf = "";
    private String zbg = "";
    private String zbh = "";

    static {
        zbakx zbakxVar = new zbakx();
        zbb = zbakxVar;
        zbuf.zbD(zbakx.class, zbakxVar);
    }

    private zbakx() {
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
                    return new zbakw(null);
                }
                return new zbakx();
            }
            return zbuf.zbA(zbb, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"zbe", "zbd", "zbf", "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
