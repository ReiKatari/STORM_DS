package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o16  reason: default package */
/* loaded from: classes.dex */
public final class o16 implements tn1 {
    public final to a;
    public final int b;

    public o16(String str, int i) {
        this.a = new to(str);
        this.b = i;
    }

    @Override // defpackage.tn1
    public final void a(xn1 xn1Var) {
        int length;
        int i = xn1Var.R;
        to toVar = this.a;
        int i2 = -1;
        if (i != -1) {
            int i3 = xn1Var.X;
            String str = toVar.B;
            String str2 = toVar.B;
            xn1Var.d(i, i3, str);
            if (str2.length() > 0) {
                xn1Var.e(i, str2.length() + i);
            }
        } else {
            int i4 = xn1Var.B;
            int i5 = xn1Var.L;
            String str3 = toVar.B;
            String str4 = toVar.B;
            xn1Var.d(i4, i5, str3);
            if (str4.length() > 0) {
                xn1Var.e(i4, str4.length() + i4);
            }
        }
        int i6 = xn1Var.B;
        int i7 = xn1Var.L;
        if (i6 == i7) {
            i2 = i7;
        }
        int i8 = this.b;
        if (i8 > 0) {
            length = (i2 + i8) - 1;
        } else {
            length = (i2 + i8) - toVar.B.length();
        }
        int m = io2.m(length, 0, ((xz1) xn1Var.Y).b());
        xn1Var.f(m, m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o16)) {
            return false;
        }
        o16 o16Var = (o16) obj;
        if (b53.x(this.a.B, o16Var.a.B) && this.b == o16Var.b) {
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
        return ej6.g(sb, this.b, ')');
    }
}
