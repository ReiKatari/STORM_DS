package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbse extends zbuf implements zbvn {
    private static final zbse zbb;
    private int zbd;
    private float zbe;
    private float zbf;
    private float zbg;
    private boolean zbl;
    private float zbm;
    private float zbn;
    private byte zbo = 2;
    private String zbh = "";
    private int zbi = -1;
    private float zbj = -1.0f;
    private float zbk = -1.0f;

    static {
        zbse zbseVar = new zbse();
        zbb = zbseVar;
        zbuf.zbD(zbse.class, zbseVar);
    }

    private zbse() {
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
                            this.zbo = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbsd(null);
                }
                return new zbse();
            }
            return zbuf.zbA(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn"});
        }
        return Byte.valueOf(this.zbo);
    }
}
