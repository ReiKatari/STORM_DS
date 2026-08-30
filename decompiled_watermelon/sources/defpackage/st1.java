package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: st1  reason: default package */
/* loaded from: classes.dex */
public final class st1 extends wt1 {
    public final rg5 a;

    public st1(rg5 rg5Var) {
        rg5Var.getClass();
        this.a = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof st1) && b53.x(this.a, ((st1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RunningRom(rom=" + this.a + ")";
    }
}
