package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b28  reason: default package */
/* loaded from: classes.dex */
public final class b28 extends zbuf implements zbvn {
    private static final b28 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private zbun zbg = zbuf.zby();

    static {
        b28 b28Var = new b28();
        zbb = b28Var;
        zbuf.zbD(b28.class, b28Var);
    }

    public static b28 b(byte[] bArr, zbtp zbtpVar) {
        return (b28) zbuf.zbu(zbb, bArr, zbtpVar);
    }

    public final int a() {
        return this.zbe;
    }

    public final String c() {
        return this.zbf;
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
                return new b28();
            }
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", h08.class});
        }
        return (byte) 1;
    }

    public final List zbf() {
        return this.zbg;
    }
}
