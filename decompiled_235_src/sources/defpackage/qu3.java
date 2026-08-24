package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu3  reason: default package */
/* loaded from: classes.dex */
public final class qu3 implements tt7 {
    public final tt7 a;
    public final int b;

    public qu3(tt7 tt7Var, int i) {
        this.a = tt7Var;
        this.b = i;
    }

    @Override // defpackage.tt7
    public final int a(qh1 qh1Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(qh1Var);
        }
        return 0;
    }

    @Override // defpackage.tt7
    public final int b(qh1 qh1Var, kk3 kk3Var) {
        int i;
        if (kk3Var == kk3.Ltr) {
            i = 4;
        } else {
            i = 1;
        }
        if ((i & this.b) != 0) {
            return this.a.b(qh1Var, kk3Var);
        }
        return 0;
    }

    @Override // defpackage.tt7
    public final int c(qh1 qh1Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(qh1Var);
        }
        return 0;
    }

    @Override // defpackage.tt7
    public final int d(qh1 qh1Var, kk3 kk3Var) {
        int i;
        if (kk3Var == kk3.Ltr) {
            i = 8;
        } else {
            i = 2;
        }
        if ((i & this.b) != 0) {
            return this.a.d(qh1Var, kk3Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu3)) {
            return false;
        }
        qu3 qu3Var = (qu3) obj;
        if (nb3.k(this.a, qu3Var.a) && this.b == qu3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = iv7.a;
        if ((i & i2) == i2) {
            iv7.b(sb3, "Start");
        }
        int i3 = iv7.c;
        if ((i & i3) == i3) {
            iv7.b(sb3, "Left");
        }
        if ((i & 16) == 16) {
            iv7.b(sb3, "Top");
        }
        int i4 = iv7.b;
        if ((i & i4) == i4) {
            iv7.b(sb3, "End");
        }
        int i5 = iv7.d;
        if ((i & i5) == i5) {
            iv7.b(sb3, "Right");
        }
        if ((i & 32) == 32) {
            iv7.b(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
