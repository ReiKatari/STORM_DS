package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd6  reason: default package */
/* loaded from: classes.dex */
public final class cd6 implements ds1 {
    public final fp a;
    public final int b;

    public cd6(String str, int i) {
        this.a = new fp(str);
        this.b = i;
    }

    @Override // defpackage.ds1
    public final void a(gs1 gs1Var) {
        int length;
        int i = gs1Var.R;
        fp fpVar = this.a;
        int i2 = -1;
        if (i != -1) {
            int i3 = gs1Var.X;
            String str = fpVar.B;
            String str2 = fpVar.B;
            gs1Var.d(i, i3, str);
            if (str2.length() > 0) {
                gs1Var.e(i, str2.length() + i);
            }
        } else {
            int i4 = gs1Var.B;
            int i5 = gs1Var.L;
            String str3 = fpVar.B;
            String str4 = fpVar.B;
            gs1Var.d(i4, i5, str3);
            if (str4.length() > 0) {
                gs1Var.e(i4, str4.length() + i4);
            }
        }
        int i6 = gs1Var.B;
        int i7 = gs1Var.L;
        if (i6 == i7) {
            i2 = i7;
        }
        int i8 = this.b;
        if (i8 > 0) {
            length = (i2 + i8) - 1;
        } else {
            length = (i2 + i8) - fpVar.B.length();
        }
        int q = gi2.q(length, 0, ((m42) gs1Var.Y).b());
        gs1Var.f(q, q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd6)) {
            return false;
        }
        cd6 cd6Var = (cd6) obj;
        if (nb3.k(this.a.B, cd6Var.a.B) && this.b == cd6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.B.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.B);
        sb.append("', newCursorPosition=");
        return xg6.q(sb, this.b, ')');
    }
}
