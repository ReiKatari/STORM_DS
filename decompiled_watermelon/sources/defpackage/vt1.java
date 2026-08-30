package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vt1  reason: default package */
/* loaded from: classes.dex */
public final class vt1 extends wt1 {
    public final rg5 a;

    public vt1(rg5 rg5Var) {
        rg5Var.getClass();
        this.a = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vt1) && b53.x(this.a, ((vt1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.a + ")";
    }
}
