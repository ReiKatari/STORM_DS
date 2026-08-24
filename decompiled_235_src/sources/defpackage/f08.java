package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f08  reason: default package */
/* loaded from: classes.dex */
public final class f08 extends zbuf implements zbvn {
    private static final f08 zbb;
    private int zbd;
    private int zbf;
    private zbun zbe = zbuf.zby();
    private zbun zbg = zbuf.zby();

    static {
        f08 f08Var = new f08();
        zbb = f08Var;
        zbuf.zbD(f08.class, f08Var);
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
                return new f08();
            }
            return zbuf.zbA(zbb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003\u001a", new Object[]{"zbd", "zbe", zbix.class, "zbf", "zbg"});
        }
        return (byte) 1;
    }
}
