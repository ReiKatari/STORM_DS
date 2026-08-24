package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbadm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p08  reason: default package */
/* loaded from: classes.dex */
public final class p08 extends zbuf implements zbvn {
    private static final p08 zbb;
    private Object zbe;
    private int zbd = 0;
    private byte zbg = 2;
    private zbun zbf = zbuf.zby();

    static {
        p08 p08Var = new p08();
        zbb = p08Var;
        zbuf.zbD(p08.class, p08Var);
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
                    return new zbtz(zbb);
                }
                return new p08();
            }
            return zbuf.zbA(zbb, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0001\u0001:\u0000\u0003Л", new Object[]{"zbe", "zbd", "zbf", zbadm.class});
        }
        return Byte.valueOf(this.zbg);
    }
}
