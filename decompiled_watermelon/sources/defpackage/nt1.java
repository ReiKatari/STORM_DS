package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nt1  reason: default package */
/* loaded from: classes.dex */
public final class nt1 extends wt1 {
    public final vc7 a;

    public nt1(vc7 vc7Var) {
        this.a = vc7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nt1) && b53.x(this.a, ((nt1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        vc7 vc7Var = this.a;
        if (vc7Var == null) {
            return 0;
        }
        return vc7Var.hashCode();
    }

    public final String toString() {
        return "LoadingFirmware(vulkanCompileProgress=" + this.a + ")";
    }
}
