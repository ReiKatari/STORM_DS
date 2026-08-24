package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbhr extends zbuf implements zbvn {
    private static final zbhr zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private long zbi;
    private float zbm;
    private float zbn;
    private float zbo;
    private int zbe = 0;
    private byte zbp = 2;
    private zbun zbh = zbuf.zby();
    private boolean zbj = true;
    private zbuk zbk = zbuf.zbv();
    private float zbl = 0.15f;

    static {
        zbhr zbhrVar = new zbhr();
        zbb = zbhrVar;
        zbuf.zbD(zbhr.class, zbhrVar);
    }

    private zbhr() {
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
                            this.zbp = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbhq(null);
                }
                return new zbhr();
            }
            return zbuf.zbA(zbb, "\u0001\n\u0001\u0001\u0002\r\n\u0000\u0002\u0001\u0002м\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\u000bခ\u0006\fဂ\u0001\rဇ\u0002", new Object[]{"zbf", "zbe", "zbd", zbim.class, "zbg", "zbh", zbhi.class, "zbk", "zbl", "zbm", "zbn", "zbo", "zbi", "zbj"});
        }
        return Byte.valueOf(this.zbp);
    }
}
