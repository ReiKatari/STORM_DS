package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kv1  reason: default package */
/* loaded from: classes.dex */
public final class kv1 {
    public final nd3 a;
    public final ti4 b;
    public final fb6 c;
    public final boolean d;
    public final int e;

    public kv1(nd3 nd3Var, ti4 ti4Var, fb6 fb6Var, boolean z, int i) {
        fb6Var.getClass();
        this.a = nd3Var;
        this.b = ti4Var;
        this.c = fb6Var;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        if (b53.x(this.a, kv1Var.a) && b53.x(this.b, kv1Var.b) && this.c == kv1Var.c && this.d == kv1Var.d && this.e == kv1Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        nd3 nd3Var = this.a;
        if (nd3Var == null) {
            hashCode = 0;
        } else {
            hashCode = nd3Var.hashCode();
        }
        int i2 = hashCode * 31;
        ti4 ti4Var = this.b;
        if (ti4Var != null) {
            i = ti4Var.hashCode();
        }
        return Integer.hashCode(this.e) + ej6.c((this.c.hashCode() + ((i2 + i) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuntimeLayoutConfiguration(layoutConfiguration=");
        sb.append(this.a);
        sb.append(", layoutVariant=");
        sb.append(this.b);
        sb.append(", softInputBehaviour=");
        sb.append(this.c);
        sb.append(", isHapticFeedbackEnabled=");
        sb.append(this.d);
        sb.append(", inputOpacity=");
        return wh1.m(sb, this.e, ")");
    }
}
