package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaac extends zbub implements zbvn {
    private static final zbaac zbd;
    private int zbe;
    private int zbf;
    private byte zbg = 2;

    static {
        zbaac zbaacVar = new zbaac();
        zbd = zbaacVar;
        zbuf.zbD(zbaac.class, zbaacVar);
    }

    private zbaac() {
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
                        return zbd;
                    }
                    return new zbaaa(null);
                }
                return new zbaac();
            }
            return zbuf.zbA(zbd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zbe", "zbf", zbaab.zba});
        }
        return Byte.valueOf(this.zbg);
    }
}
