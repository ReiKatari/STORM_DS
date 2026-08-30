package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k17  reason: default package */
/* loaded from: classes.dex */
public final class k17 {
    public final mv5 a;
    public final mv5 b;

    public k17(mv5 mv5Var, mv5 mv5Var2) {
        mv5Var.getClass();
        mv5Var2.getClass();
        this.a = mv5Var;
        this.b = mv5Var2;
    }

    public static k17 a(mv5 mv5Var, mv5 mv5Var2) {
        mv5Var.getClass();
        mv5Var2.getClass();
        return new k17(mv5Var, mv5Var2);
    }

    public static /* synthetic */ k17 b(k17 k17Var, mv5 mv5Var, mv5 mv5Var2, int i) {
        if ((i & 1) != 0) {
            mv5Var = k17Var.a;
        }
        if ((i & 2) != 0) {
            mv5Var2 = k17Var.b;
        }
        k17Var.getClass();
        return a(mv5Var, mv5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k17)) {
            return false;
        }
        k17 k17Var = (k17) obj;
        if (b53.x(this.a, k17Var.a) && b53.x(this.b, k17Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UILayout(mainScreenLayout=" + this.a + ", secondaryScreenLayout=" + this.b + ")";
    }
}
