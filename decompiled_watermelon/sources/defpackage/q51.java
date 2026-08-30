package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q51  reason: default package */
/* loaded from: classes.dex */
public final class q51 extends l {
    public final int u;

    public q51(int i) {
        this.u = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q51) && this.u == ((q51) obj).u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u);
    }

    public final String toString() {
        return wh1.j("Running(activeCamera=", this.u, ")");
    }
}
