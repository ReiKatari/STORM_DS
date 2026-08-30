package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is1  reason: default package */
/* loaded from: classes.dex */
public final class is1 extends se {
    public final rg5 p;

    public is1(rg5 rg5Var) {
        rg5Var.getClass();
        this.p = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof is1) && b53.x(this.p, ((is1) obj).p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.p + ")";
    }
}
