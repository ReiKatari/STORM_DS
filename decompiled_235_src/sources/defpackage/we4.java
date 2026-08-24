package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we4  reason: default package */
/* loaded from: classes.dex */
public final class we4 extends c20 {
    public static final String c = ga0.h("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we4(if4 if4Var) {
        super(if4Var);
        if4Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.k11
    public final boolean c(yw7 yw7Var) {
        yw7Var.getClass();
        if (yw7Var.j.a == kf4.METERED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c20
    public final int d() {
        return this.b;
    }

    @Override // defpackage.c20
    public final boolean e(Object obj) {
        gf4 gf4Var = (gf4) obj;
        gf4Var.getClass();
        boolean z = gf4Var.e;
        boolean z2 = gf4Var.a;
        if (Build.VERSION.SDK_INT < 26) {
            ga0.f().b(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z2 && !z) {
                return false;
            }
            return true;
        } else if (z2 && gf4Var.c && !z) {
            return false;
        } else {
            return true;
        }
    }
}
