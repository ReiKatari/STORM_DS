package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x08  reason: default package */
/* loaded from: classes.dex */
public final class x08 extends zbuf implements zbvn {
    private static final x08 zbb;
    private int zbd;
    private zbun zbe = zbuf.zby();
    private long zbf;

    static {
        x08 x08Var = new x08();
        zbb = x08Var;
        zbuf.zbD(x08.class, x08Var);
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
                return new x08();
            }
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        return (byte) 1;
    }
}
