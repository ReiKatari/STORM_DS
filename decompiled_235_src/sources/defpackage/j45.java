package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j45  reason: default package */
/* loaded from: classes.dex */
public abstract class j45 extends lb0 implements fg3 {
    public final boolean Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j45(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, r7);
        boolean z;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.Z = false;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof j45) {
                j45 j45Var = (j45) obj;
                if (b().equals(j45Var.b()) && this.R.equals(j45Var.R) && this.X.equals(j45Var.X) && nb3.k(this.B, j45Var.B)) {
                    return true;
                }
                return false;
            } else if (obj instanceof fg3) {
                return obj.equals(f());
            } else {
                return false;
            }
        }
        return true;
    }

    public final yf3 f() {
        if (this.Z) {
            return this;
        }
        yf3 yf3Var = this.A;
        if (yf3Var == null) {
            yf3 a = a();
            this.A = a;
            return a;
        }
        return yf3Var;
    }

    public final int hashCode() {
        return this.X.hashCode() + xg6.d(b().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        yf3 f = f();
        if (f != this) {
            return f.toString();
        }
        return i61.n(new StringBuilder("property "), this.R, " (Kotlin reflection is not available)");
    }
}
