package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vr0  reason: default package */
/* loaded from: classes.dex */
public final class vr0 implements zy3 {
    public final zy3 a;
    public final zy3 b;

    public vr0(zy3 zy3Var, zy3 zy3Var2) {
        this.a = zy3Var;
        this.b = zy3Var2;
    }

    @Override // defpackage.zy3
    public final Object a(aj2 aj2Var, Object obj) {
        return this.b.a(aj2Var, this.a.a(aj2Var, obj));
    }

    @Override // defpackage.zy3
    public final boolean b(mi2 mi2Var) {
        if (this.a.b(mi2Var) && this.b.b(mi2Var)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr0) {
            vr0 vr0Var = (vr0) obj;
            if (this.a.equals(vr0Var.a) && b53.x(this.b, vr0Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return wh1.o(new StringBuilder("["), (String) a(dn.X, ""), ']');
    }
}
