package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z08  reason: default package */
/* loaded from: classes.dex */
public final class z08 extends zbuf implements zbvn {
    private static final z08 zbb;
    private int zbd;
    private Object zbf;
    private q18 zbg;
    private boolean zbh;
    private h28 zbi;
    private g28 zbj;
    private l18 zbk;
    private int zbl;
    private int zbe = 0;
    private byte zbm = 2;

    static {
        z08 z08Var = new z08();
        zbb = z08Var;
        zbuf.zbD(z08.class, z08Var);
    }

    public static y08 b() {
        return (y08) zbb.zbq();
    }

    public static /* synthetic */ void c(z08 z08Var, g28 g28Var) {
        g28Var.getClass();
        z08Var.zbj = g28Var;
        z08Var.zbd |= 8;
    }

    public static /* synthetic */ void d(z08 z08Var, q18 q18Var) {
        q18Var.getClass();
        z08Var.zbg = q18Var;
        z08Var.zbd |= 1;
    }

    public final int a() {
        return this.zbl;
    }

    public final boolean e() {
        if (this.zbe == 6) {
            return ((Boolean) this.zbf).booleanValue();
        }
        return false;
    }

    public final boolean f() {
        if (this.zbe == 5) {
            return ((Boolean) this.zbf).booleanValue();
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
                            this.zbm = b;
                            return null;
                        }
                        return zbb;
                    }
                    return new zbtz(zbb);
                }
                return new z08();
            }
            return zbuf.zbA(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zbf", "zbe", "zbd", "zbg", "zbh", "zbj", "zbi", "zbk", "zbl"});
        }
        return Byte.valueOf(this.zbm);
    }

    public final boolean zbi() {
        if ((this.zbd & 32) != 0) {
            return true;
        }
        return false;
    }
}
