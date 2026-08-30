package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uq4  reason: default package */
/* loaded from: classes.dex */
public final class uq4 extends vq4 {
    public final h15 a;

    public uq4(h15 h15Var) {
        h15Var.getClass();
        this.a = h15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof uq4) && b53.x(this.a, ((uq4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RAIntegrationPopup(event=" + this.a + ")";
    }
}
