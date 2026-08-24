package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he6  reason: default package */
/* loaded from: classes.dex */
public final class he6 extends e74 {
    public final float a;
    public final ke6 b;
    public final boolean c;
    public final long d;
    public final long e;

    public he6(float f, ke6 ke6Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = ke6Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.e74
    public final z64 e() {
        return new d50(new mc(this, 24));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof he6) {
                he6 he6Var = (he6) obj;
                if (!om1.b(this.a, he6Var.a) || !nb3.k(this.b, he6Var.b) || this.c != he6Var.c || !kt0.d(this.d, he6Var.d) || !kt0.d(this.e, he6Var.e)) {
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
        eg4 eg4Var;
        d50 d50Var = (d50) z64Var;
        mc mcVar = new mc(this, 24);
        d50Var.k0 = mcVar;
        if (d50Var.A.j0 && (eg4Var = nc1.d0(d50Var, 2).n0) != null) {
            eg4Var.x1(mcVar, true);
        }
    }

    public final int hashCode() {
        int e = xg6.e((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, this.c, 31);
        int i = kt0.i;
        return Long.hashCode(this.e) + i61.c(this.d, e, 31);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) om1.c(this.a)) + ", shape=" + this.b + ", clip=" + this.c + ", ambientColor=" + ((Object) kt0.j(this.d)) + ", spotColor=" + ((Object) kt0.j(this.e)) + ')';
    }
}
