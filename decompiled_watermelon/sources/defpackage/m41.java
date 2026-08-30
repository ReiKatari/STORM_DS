package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m41  reason: default package */
/* loaded from: classes.dex */
public final class m41 {
    public final k17 a;
    public final kd3 b;

    public m41(k17 k17Var, kd3 kd3Var) {
        k17Var.getClass();
        kd3Var.getClass();
        this.a = k17Var;
        this.b = kd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m41)) {
            return false;
        }
        m41 m41Var = (m41) obj;
        if (b53.x(this.a, m41Var.a) && this.b == m41Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentLayoutState(layout=" + this.a + ", orientation=" + this.b + ")";
    }
}
