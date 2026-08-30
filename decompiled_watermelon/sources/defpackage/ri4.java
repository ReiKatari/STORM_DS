package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ri4  reason: default package */
/* loaded from: classes.dex */
public final class ri4 extends dz3 {
    public final qi4 a;
    public final ub b;
    public final s01 c;
    public final float d;
    public final b30 e;

    public ri4(qi4 qi4Var, ub ubVar, s01 s01Var, float f, b30 b30Var) {
        this.a = qi4Var;
        this.b = ubVar;
        this.c = s01Var;
        this.d = f;
        this.e = b30Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, si4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = true;
        yy3Var.l0 = this.b;
        yy3Var.m0 = this.c;
        yy3Var.n0 = this.d;
        yy3Var.o0 = this.e;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ri4) {
                ri4 ri4Var = (ri4) obj;
                if (!b53.x(this.a, ri4Var.a) || !b53.x(this.b, ri4Var.b) || !b53.x(this.c, ri4Var.c) || Float.compare(this.d, ri4Var.d) != 0 || !b53.x(this.e, ri4Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        boolean z;
        si4 si4Var = (si4) yy3Var;
        boolean z2 = si4Var.k0;
        qi4 qi4Var = this.a;
        if (z2 && i76.b(si4Var.j0.h(), qi4Var.h())) {
            z = false;
        } else {
            z = true;
        }
        si4Var.j0 = qi4Var;
        si4Var.k0 = true;
        si4Var.l0 = this.b;
        si4Var.m0 = this.c;
        si4Var.n0 = this.d;
        si4Var.o0 = this.e;
        if (z) {
            hi2.D(si4Var);
        }
        n40.M(si4Var);
    }

    public final int hashCode() {
        int hashCode;
        int c = ej6.c(this.a.hashCode() * 31, true, 31);
        int hashCode2 = this.c.hashCode();
        int a = ej6.a(this.d, (hashCode2 + ((this.b.hashCode() + c) * 31)) * 31, 31);
        b30 b30Var = this.e;
        if (b30Var == null) {
            hashCode = 0;
        } else {
            hashCode = b30Var.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
