package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: es5  reason: default package */
/* loaded from: classes.dex */
public final class es5 {
    public final fb6 a;
    public final int b;
    public final boolean c;
    public final kd3 d;
    public final k17 e;

    public es5(fb6 fb6Var, int i, boolean z, kd3 kd3Var, k17 k17Var) {
        fb6Var.getClass();
        kd3Var.getClass();
        this.a = fb6Var;
        this.b = i;
        this.c = z;
        this.d = kd3Var;
        this.e = k17Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof es5) {
                es5 es5Var = (es5) obj;
                if (this.a != es5Var.a || this.b != es5Var.b || this.c != es5Var.c || this.d != es5Var.d || !this.e.equals(es5Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(wh1.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
        return this.e.hashCode() + ((this.d.hashCode() + c) * 31);
    }

    public final String toString() {
        return "RuntimeInputLayoutConfiguration(softInputBehaviour=" + this.a + ", softInputOpacity=" + this.b + ", isHapticFeedbackEnabled=" + this.c + ", layoutOrientation=" + this.d + ", layout=" + this.e + ")";
    }
}
