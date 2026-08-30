package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h96  reason: default package */
/* loaded from: classes.dex */
public final class h96 {
    public final hb4 a;

    public h96(hb4 hb4Var) {
        hb4Var.getClass();
        this.a = hb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h96) && b53.x(this.a, ((h96) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SmartSyncPlanItem(unlock=" + this.a + ")";
    }
}
