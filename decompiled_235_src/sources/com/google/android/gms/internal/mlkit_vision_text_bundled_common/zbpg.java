package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbpg extends zbuf implements zbvn {
    private static final zbpg zbb;
    private int zbd;
    private zbpk zbe;
    private double zbf;
    private double zbg;

    static {
        zbpg zbpgVar = new zbpg();
        zbb = zbpgVar;
        zbuf.zbD(zbpg.class, zbpgVar);
    }

    private zbpg() {
    }

    public static zbpf zba() {
        return (zbpf) zbb.zbq();
    }

    public static /* synthetic */ void zbd(zbpg zbpgVar, zbpk zbpkVar) {
        zbpkVar.getClass();
        zbpgVar.zbe = zbpkVar;
        zbpgVar.zbd |= 1;
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
                    return new zbpf(null);
                }
                return new zbpg();
            }
            return zbuf.zbA(zbb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000\u0003\u0000", new Object[]{"zbd", "zbe", "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
