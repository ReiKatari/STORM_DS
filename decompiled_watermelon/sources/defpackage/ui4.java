package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ui4  reason: default package */
/* loaded from: classes.dex */
public final class ui4 {
    public final Object a;
    public final Object b;

    public ui4(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ui4) {
            ui4 ui4Var = (ui4) obj;
            if (ui4Var.a.equals(this.a) && ui4Var.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
