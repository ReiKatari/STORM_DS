package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbow extends zbuf implements zbvn {
    private static final zbow zbb;
    private int zbd;
    private zbou zbe;
    private double zbf;
    private boolean zbg;
    private zbpb zbh;
    private byte zbi = 2;

    static {
        zbow zbowVar = new zbow();
        zbb = zbowVar;
        zbuf.zbD(zbow.class, zbowVar);
    }

    private zbow() {
    }

    public static zbow zbc() {
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
                            this.zbi = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbov(null);
                }
                return new zbow();
            }
            return zbuf.zbA(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh"});
        }
        return Byte.valueOf(this.zbi);
    }

    public final zbpb zbd() {
        zbpb zbpbVar = this.zbh;
        if (zbpbVar == null) {
            return zbpb.zbh();
        }
        return zbpbVar;
    }
}
