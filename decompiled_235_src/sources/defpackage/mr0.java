package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr0  reason: default package */
/* loaded from: classes.dex */
public final class mr0 extends e74 {
    public final r94 a;
    public final n43 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final mq5 f;
    public final on2 g;

    public mr0(r94 r94Var, n43 n43Var, boolean z, boolean z2, String str, mq5 mq5Var, on2 on2Var) {
        this.a = r94Var;
        this.b = n43Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = mq5Var;
        this.g = on2Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new h0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && mr0.class == obj.getClass()) {
                mr0 mr0Var = (mr0) obj;
                if (!nb3.k(this.a, mr0Var.a) || !nb3.k(this.b, mr0Var.b) || this.c != mr0Var.c || this.d != mr0Var.d || !nb3.k(this.e, mr0Var.e) || !nb3.k(this.f, mr0Var.f) || this.g != mr0Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((or0) z64Var).f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        r94 r94Var = this.a;
        if (r94Var != null) {
            i = r94Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        n43 n43Var = this.b;
        if (n43Var != null) {
            i2 = n43Var.hashCode();
        } else {
            i2 = 0;
        }
        int e = xg6.e(xg6.e((i5 + i2) * 31, this.c, 31), this.d, 31);
        String str = this.e;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (e + i3) * 31;
        mq5 mq5Var = this.f;
        if (mq5Var != null) {
            i4 = Integer.hashCode(mq5Var.a);
        }
        return this.g.hashCode() + ((i6 + i4) * 31);
    }
}
