package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbpb extends zbuf implements zbvn {
    private static final zbpb zbb;
    private int zbd;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private float zbi;
    private byte zbj = 2;

    static {
        zbpb zbpbVar = new zbpb();
        zbb = zbpbVar;
        zbuf.zbD(zbpb.class, zbpbVar);
    }

    private zbpb() {
    }

    public static zbpb zbh() {
        return zbb;
    }

    public final float zba() {
        return this.zbi;
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
                            this.zbj = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbpa(null);
                }
                return new zbpb();
            }
            return zbuf.zbA(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", "zbi"});
        }
        return Byte.valueOf(this.zbj);
    }

    public final int zbc() {
        return this.zbh;
    }

    public final int zbd() {
        return this.zbe;
    }

    public final int zbe() {
        return this.zbf;
    }

    public final int zbf() {
        return this.zbg;
    }
}
