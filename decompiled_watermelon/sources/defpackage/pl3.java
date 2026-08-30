package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl3  reason: default package */
/* loaded from: classes.dex */
public final class pl3 extends ql3 {
    public final o15 a;

    public pl3(o15 o15Var) {
        o15Var.getClass();
        this.a = o15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pl3) && b53.x(this.a, ((pl3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(ranking=" + this.a + ")";
    }
}
