package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i54  reason: default package */
/* loaded from: classes.dex */
public final class i54 extends yf2 {
    public final b54 e;

    public i54(b54 b54Var) {
        b54Var.getClass();
        this.e = b54Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i54.class == obj.getClass() && b53.x(this.e, ((i54) obj).e)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.e + ", direction=-1)";
    }
}
