package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaam extends zbuf implements zbvn {
    private static final zbaam zbb;
    private int zbd;
    private zbpb zbf;
    private float zbg;
    private byte zbh = 2;
    private int zbe = 2;

    static {
        zbaam zbaamVar = new zbaam();
        zbb = zbaamVar;
        zbuf.zbD(zbaam.class, zbaamVar);
    }

    private zbaam() {
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
                            this.zbh = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbaal(null);
                }
                return new zbaam();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zbd", "zbe", zbaak.zba, "zbf", "zbg"});
        }
        return Byte.valueOf(this.zbh);
    }
}
