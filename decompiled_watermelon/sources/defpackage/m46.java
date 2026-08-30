package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m46  reason: default package */
/* loaded from: classes.dex */
public final class m46 {
    public final k46 a;
    public final l46 b;

    public m46(k46 k46Var, l46 l46Var) {
        k46Var.getClass();
        l46Var.getClass();
        this.a = k46Var;
        this.b = l46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m46)) {
            return false;
        }
        m46 m46Var = (m46) obj;
        if (b53.x(this.a, m46Var.a) && b53.x(this.b, m46Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RenderConfigurationInputs(core=" + this.a + ", coverageFix=" + this.b + ")";
    }
}
