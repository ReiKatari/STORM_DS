package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lj2  reason: default package */
/* loaded from: classes.dex */
public class lj2 extends d90 implements kj2, e93, wi2 {
    public final int Z;

    public lj2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.Z = i;
    }

    @Override // defpackage.d90
    public final e93 a() {
        q75.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [e93] */
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof lj2) {
                lj2 lj2Var = (lj2) obj;
                if (this.R.equals(lj2Var.R) && this.X.equals(lj2Var.X) && b53.x(this.B, lj2Var.B) && b().equals(lj2Var.b())) {
                    return true;
                }
                return false;
            } else if (obj instanceof lj2) {
                ?? r0 = this.A;
                if (r0 == 0) {
                    a();
                    this.A = this;
                } else {
                    this = r0;
                }
                return obj.equals(this);
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kj2
    public final int f() {
        return this.Z;
    }

    public final int hashCode() {
        b();
        return this.X.hashCode() + ej6.b(b().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        e93 e93Var = this.A;
        if (e93Var == null) {
            a();
            this.A = this;
            e93Var = this;
        }
        if (e93Var != this) {
            return e93Var.toString();
        }
        String str = this.R;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return wh1.A("function ", str, " (Kotlin reflection is not available)");
    }

    public lj2(int i, Class cls, String str, String str2, int i2) {
        this(i, c90.A, cls, str, str2, i2, 0);
    }
}
