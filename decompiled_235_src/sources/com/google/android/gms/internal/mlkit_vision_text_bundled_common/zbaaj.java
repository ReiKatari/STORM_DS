package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaaj extends zbuf implements zbvn {
    private static final zbaaj zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbf = 2;

    static {
        zbaaj zbaajVar = new zbaaj();
        zbb = zbaajVar;
        zbuf.zbD(zbaaj.class, zbaajVar);
    }

    private zbaaj() {
    }

    public static zbaaj zbh() {
        return zbb;
    }

    public final boolean zbH() {
        if (this.zbd == 1) {
            return true;
        }
        return false;
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
                            this.zbf = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbaae(null);
                }
                return new zbaaj();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"zbe", "zbd", zbaai.class, zbpb.class, zbow.class});
        }
        return Byte.valueOf(this.zbf);
    }

    public final zbow zbc() {
        if (this.zbd == 3) {
            return (zbow) this.zbe;
        }
        return zbow.zbc();
    }

    public final zbpb zbe() {
        if (this.zbd == 2) {
            return (zbpb) this.zbe;
        }
        return zbpb.zbh();
    }

    public final zbaai zbf() {
        if (this.zbd == 1) {
            return (zbaai) this.zbe;
        }
        return zbaai.zbf();
    }

    public final boolean zbi() {
        if (this.zbd == 3) {
            return true;
        }
        return false;
    }
}
