package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbcp extends zbuf implements zbvn {
    private static final zbcp zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private int zbg = 1;

    static {
        zbcp zbcpVar = new zbcp();
        zbb = zbcpVar;
        zbuf.zbD(zbcp.class, zbcpVar);
    }

    private zbcp() {
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
                    return new zbcn(null);
                }
                return new zbcp();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zbd", "zbe", "zbf", "zbg", zbco.zba});
        }
        return (byte) 1;
    }
}
