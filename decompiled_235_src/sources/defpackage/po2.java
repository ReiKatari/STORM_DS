package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po2  reason: default package */
/* loaded from: classes.dex */
public class po2 extends lb0 implements oo2, yf3, ao2 {
    public final int Z;

    public po2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.Z = i;
    }

    @Override // defpackage.lb0
    public final yf3 a() {
        gh5.a.getClass();
        return this;
    }

    @Override // defpackage.oo2
    public final int d() {
        return this.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [yf3] */
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof po2) {
                po2 po2Var = (po2) obj;
                if (this.R.equals(po2Var.R) && this.X.equals(po2Var.X) && nb3.k(this.B, po2Var.B) && b().equals(po2Var.b())) {
                    return true;
                }
                return false;
            } else if (obj instanceof po2) {
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

    public final int hashCode() {
        b();
        return this.X.hashCode() + xg6.d(b().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        yf3 yf3Var = this.A;
        if (yf3Var == null) {
            a();
            this.A = this;
            yf3Var = this;
        }
        if (yf3Var != this) {
            return yf3Var.toString();
        }
        String str = this.R;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return lb1.A("function ", str, " (Kotlin reflection is not available)");
    }

    public po2(int i, Class cls, String str, String str2, int i2) {
        this(i, kb0.A, cls, str, str2, i2, 0);
    }
}
