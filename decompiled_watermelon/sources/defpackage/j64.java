package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j64  reason: default package */
/* loaded from: classes.dex */
public final class j64 extends l00 {
    public final int b;

    static {
        y70.h("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j64(t64 t64Var) {
        super(t64Var);
        t64Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.fy0
    public final boolean a(xh7 xh7Var) {
        xh7Var.getClass();
        if (xh7Var.j.a == v64.NOT_ROAMING) {
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
        if (r64Var.a && r64Var.d && !r64Var.e) {
            return false;
        }
        return true;
    }
}
