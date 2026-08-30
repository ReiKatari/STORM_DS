package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p01  reason: default package */
/* loaded from: classes.dex */
public final class p01 extends dz3 {
    public final tv a;
    public final ub b;
    public final s01 c;
    public final float d;

    public p01(tv tvVar, ub ubVar, s01 s01Var, float f) {
        this.a = tvVar;
        this.b = ubVar;
        this.c = s01Var;
        this.d = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, q01] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = this.d;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p01) {
                p01 p01Var = (p01) obj;
                if (this.a == p01Var.a && b53.x(this.b, p01Var.b) && b53.x(this.c, p01Var.c) && Float.compare(this.d, p01Var.d) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        q01 q01Var = (q01) yy3Var;
        long h = q01Var.j0.h();
        tv tvVar = this.a;
        boolean b = i76.b(h, tvVar.h());
        q01Var.j0 = tvVar;
        q01Var.k0 = this.b;
        q01Var.l0 = this.c;
        q01Var.m0 = this.d;
        if (!b) {
            hi2.D(q01Var);
        }
        n40.M(q01Var);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return ej6.a(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.a + ", alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=null)";
    }
}
