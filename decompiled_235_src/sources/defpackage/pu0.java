package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu0  reason: default package */
/* loaded from: classes.dex */
public final class pu0 implements ds1 {
    public final fp a;
    public final int b;

    public pu0(String str, int i) {
        this(new fp(str), i);
    }

    @Override // defpackage.ds1
    public final void a(gs1 gs1Var) {
        int length;
        int i = gs1Var.R;
        fp fpVar = this.a;
        int i2 = -1;
        if (i != -1) {
            gs1Var.d(i, gs1Var.X, fpVar.B);
        } else {
            gs1Var.d(gs1Var.B, gs1Var.L, fpVar.B);
        }
        int i3 = gs1Var.B;
        int i4 = gs1Var.L;
        if (i3 == i4) {
            i2 = i4;
        }
        int i5 = this.b;
        if (i5 > 0) {
            length = (i2 + i5) - 1;
        } else {
            length = (i2 + i5) - fpVar.B.length();
        }
        int q = gi2.q(length, 0, ((m42) gs1Var.Y).b());
        gs1Var.f(q, q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu0)) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        if (nb3.k(this.a.B, pu0Var.a.B) && this.b == pu0Var.b) {
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
        return xg6.q(sb, this.b, ')');
    }

    public pu0(fp fpVar, int i) {
        this.a = fpVar;
        this.b = i;
    }
}
