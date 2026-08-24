package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbpp extends zbuf implements zbvn {
    private static final zbpp zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private String zbh = "";

    static {
        zbpp zbppVar = new zbpp();
        zbb = zbppVar;
        zbuf.zbD(zbpp.class, zbppVar);
    }

    private zbpp() {
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
                    return new zbpo(null);
                }
                return new zbpp();
            }
            return zbuf.zbA(zbb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဏ\u0002\u0004ဈ\u0003", new Object[]{"zbd", "zbe", zbpt.zba, "zbf", zbps.zba, "zbg", "zbh"});
        }
        return (byte) 1;
    }
}
