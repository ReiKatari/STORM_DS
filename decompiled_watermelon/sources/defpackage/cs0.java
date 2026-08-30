package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cs0  reason: default package */
/* loaded from: classes.dex */
public final class cs0 implements tn1 {
    public final to a;
    public final int b;

    public cs0(String str, int i) {
        this(new to(str), i);
    }

    @Override // defpackage.tn1
    public final void a(xn1 xn1Var) {
        int length;
        int i = xn1Var.R;
        to toVar = this.a;
        int i2 = -1;
        if (i != -1) {
            xn1Var.d(i, xn1Var.X, toVar.B);
        } else {
            xn1Var.d(xn1Var.B, xn1Var.L, toVar.B);
        }
        int i3 = xn1Var.B;
        int i4 = xn1Var.L;
        if (i3 == i4) {
            i2 = i4;
        }
        int i5 = this.b;
        if (i5 > 0) {
            length = (i2 + i5) - 1;
        } else {
            length = (i2 + i5) - toVar.B.length();
        }
        int m = io2.m(length, 0, ((xz1) xn1Var.Y).b());
        xn1Var.f(m, m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs0)) {
            return false;
        }
        cs0 cs0Var = (cs0) obj;
        if (b53.x(this.a.B, cs0Var.a.B) && this.b == cs0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.B.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.B);
        sb.append("', newCursorPosition=");
        return ej6.g(sb, this.b, ')');
    }

    public cs0(to toVar, int i) {
        this.a = toVar;
        this.b = i;
    }
}
