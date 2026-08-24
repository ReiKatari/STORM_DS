package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g28  reason: default package */
/* loaded from: classes.dex */
public final class g28 extends zbuf implements zbvn {
    private static final g28 zbb;
    private int zbd;
    private int zbe = 1;
    private boolean zbf;

    static {
        g28 g28Var = new g28();
        zbb = g28Var;
        zbuf.zbD(g28.class, g28Var);
    }

    public static f28 a() {
        return (f28) zbb.zbq();
    }

    public static /* synthetic */ void b(g28 g28Var) {
        g28Var.zbe = 1;
        g28Var.zbd = 1 | g28Var.zbd;
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
                    return new zbtz(zbb);
                }
                return new g28();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zbd", "zbe", e08.j, "zbf"});
        }
        return (byte) 1;
    }
}
