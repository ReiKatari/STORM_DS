package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaai extends zbuf implements zbvn {
    private static final zbaai zbb;
    private int zbd;
    private zbpb zbf;
    private byte zbg = 2;
    private zbun zbe = zbuf.zby();

    static {
        zbaai zbaaiVar = new zbaai();
        zbb = zbaaiVar;
        zbuf.zbD(zbaai.class, zbaaiVar);
    }

    private zbaai() {
    }

    public static zbaai zbf() {
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
                            this.zbg = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbaah(null);
                }
                return new zbaai();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zbd", "zbe", zbaag.class, "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }

    public final zbpb zbc() {
        zbpb zbpbVar = this.zbf;
        if (zbpbVar == null) {
            return zbpb.zbh();
        }
        return zbpbVar;
    }
}
