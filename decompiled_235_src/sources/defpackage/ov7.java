package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov7  reason: default package */
/* loaded from: classes.dex */
public final class ov7 implements nv7 {
    public final rh1 b;

    public ov7() {
        rh1 rh1Var;
        if (Build.VERSION.SDK_INT >= 34) {
            rh1Var = sh1.A;
        } else {
            rh1Var = xd5.d0;
        }
        this.b = rh1Var;
        hf.w(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
