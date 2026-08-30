package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot1  reason: default package */
/* loaded from: classes.dex */
public final class ot1 extends wt1 {
    public final vc7 a;
    public final nd5 b;

    public ot1(vc7 vc7Var, nd5 nd5Var) {
        this.a = vc7Var;
        this.b = nd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot1)) {
            return false;
        }
        ot1 ot1Var = (ot1) obj;
        if (b53.x(this.a, ot1Var.a) && this.b == ot1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        vc7 vc7Var = this.a;
        if (vc7Var == null) {
            hashCode = 0;
        } else {
            hashCode = vc7Var.hashCode();
        }
        int i2 = hashCode * 31;
        nd5 nd5Var = this.b;
        if (nd5Var != null) {
            i = nd5Var.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "LoadingRom(vulkanCompileProgress=" + this.a + ", retroAchievementsLoadStage=" + this.b + ")";
    }
}
