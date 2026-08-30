package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gt1  reason: default package */
/* loaded from: classes.dex */
public final class gt1 extends a53 {
    public final rg5 r;

    public gt1(rg5 rg5Var) {
        rg5Var.getClass();
        this.r = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gt1) && b53.x(this.r, ((gt1) obj).r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return "RomSession(rom=" + this.r + ")";
    }
}
