package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v76  reason: default package */
/* loaded from: classes.dex */
public final class v76 extends e74 {
    public final f86 a;
    public final lo4 b;
    public final boolean c;
    public final boolean d;
    public final r94 e;

    public v76(f86 f86Var, lo4 lo4Var, boolean z, boolean z2, r94 r94Var) {
        this.a = f86Var;
        this.b = lo4Var;
        this.c = z;
        this.d = z2;
        this.e = r94Var;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new e86(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v76) {
                v76 v76Var = (v76) obj;
                if (!nb3.k(this.a, v76Var.a) || this.b != v76Var.b || this.c != v76Var.c || this.d != v76Var.d || !nb3.k(this.e, v76Var.e)) {
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
        ((e86) z64Var).m1(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int i;
        int e = xg6.e(xg6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, this.c, 31), this.d, 961);
        r94 r94Var = this.e;
        if (r94Var != null) {
            i = r94Var.hashCode();
        } else {
            i = 0;
        }
        return (e + i) * 31;
    }
}
