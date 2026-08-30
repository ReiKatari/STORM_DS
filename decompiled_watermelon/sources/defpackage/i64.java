package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i64  reason: default package */
/* loaded from: classes.dex */
public final class i64 extends l00 {
    public static final String c = y70.h("NetworkMeteredCtrlr");
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i64(t64 t64Var) {
        super(t64Var);
        t64Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.fy0
    public final boolean a(xh7 xh7Var) {
        xh7Var.getClass();
        if (xh7Var.j.a == v64.METERED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l00
    public final int d() {
        return this.b;
    }

    @Override // defpackage.l00
    public final boolean e(Object obj) {
        r64 r64Var = (r64) obj;
        r64Var.getClass();
        boolean z = r64Var.e;
        boolean z2 = r64Var.a;
        if (Build.VERSION.SDK_INT < 26) {
            y70.f().b(c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z2 && !z) {
                return false;
            }
            return true;
        } else if (z2 && r64Var.c && !z) {
            return false;
        } else {
            return true;
        }
    }
}
