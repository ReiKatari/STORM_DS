package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h18  reason: default package */
/* loaded from: classes.dex */
public final class h18 extends zbuf implements zbvn {
    private static final h18 zbb;
    private int zbd;
    private int zbe;
    private int zbf = 2;
    private String zbg = "";

    static {
        h18 h18Var = new h18();
        zbb = h18Var;
        zbuf.zbD(h18.class, h18Var);
    }

    public static g18 a() {
        return (g18) zbb.zbq();
    }

    public static /* synthetic */ void b(h18 h18Var, int i) {
        h18Var.zbe = i - 1;
        h18Var.zbd |= 1;
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
                return new h18();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zbd", "zbe", e08.e, "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
