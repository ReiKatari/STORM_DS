package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ce7  reason: default package */
/* loaded from: classes.dex */
public final class ce7 {
    public final vg7 a;
    public final ir4 b;

    public ce7(vg7 vg7Var, ir4 ir4Var) {
        this.a = vg7Var;
        this.b = ir4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ce7) {
                ce7 ce7Var = (ce7) obj;
                if (!this.a.equals(ce7Var.a) || !this.b.equals(ce7Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
