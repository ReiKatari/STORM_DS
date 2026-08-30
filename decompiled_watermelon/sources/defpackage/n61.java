package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n61  reason: default package */
/* loaded from: classes.dex */
public final class n61 extends r61 {
    public final gw0 a;

    public n61(gw0 gw0Var) {
        gw0Var.getClass();
        this.a = gw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n61) && this.a == ((n61) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DSiSetupInvalid(status=" + this.a + ")";
    }
}
