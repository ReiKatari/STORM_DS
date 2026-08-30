package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc3  reason: default package */
/* loaded from: classes.dex */
public final class kc3 extends ln2 {
    public final rg5 L;

    public kc3(rg5 rg5Var) {
        rg5Var.getClass();
        this.L = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kc3) && b53.x(this.L, ((kc3) obj).L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "RomObject(rom=" + this.L + ")";
    }
}
