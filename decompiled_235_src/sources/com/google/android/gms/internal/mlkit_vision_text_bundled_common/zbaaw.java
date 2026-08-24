package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaaw extends zbuf implements zbvn {
    private static final zbaaw zbb;
    private int zbd;
    private byte zbg = 2;
    private String zbe = "";
    private float zbf = 1.0f;

    static {
        zbaaw zbaawVar = new zbaaw();
        zbb = zbaawVar;
        zbuf.zbD(zbaaw.class, zbaawVar);
    }

    private zbaaw() {
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
                    return new zbaav(null);
                }
                return new zbaaw();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zbd", "zbe", "zbf"});
        }
        return Byte.valueOf(this.zbg);
    }

    public final float zbc() {
        return this.zbf;
    }

    public final String zbf() {
        return this.zbe;
    }
}
