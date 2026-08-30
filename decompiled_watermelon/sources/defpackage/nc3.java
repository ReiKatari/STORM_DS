package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc3  reason: default package */
/* loaded from: classes.dex */
public final class nc3 extends pc3 {
    public final g82 a;

    public nc3(g82 g82Var) {
        g82Var.getClass();
        this.a = g82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nc3) && b53.x(this.a, ((nc3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Firmware(result=" + this.a + ")";
    }
}
