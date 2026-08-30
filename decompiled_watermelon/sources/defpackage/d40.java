package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d40  reason: default package */
/* loaded from: classes.dex */
public final class d40 extends dz3 {
    public final float a;
    public final mb6 b;
    public final y26 c;

    public d40(float f, mb6 mb6Var, y26 y26Var) {
        this.a = f;
        this.b = mb6Var;
        this.c = y26Var;
    }

    @Override // defpackage.dz3
    public final yy3 c() {
        return new c40(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d40) {
                d40 d40Var = (d40) obj;
                if (!ji1.b(this.a, d40Var.a) || !this.b.equals(d40Var.b) || !b53.x(this.c, d40Var.c)) {
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
        c40 c40Var = (c40) yy3Var;
        float f = c40Var.m0;
        f80 f80Var = c40Var.p0;
        float f2 = this.a;
        if (!ji1.b(f, f2)) {
            c40Var.m0 = f2;
            f80Var.R0();
        }
        mb6 mb6Var = c40Var.n0;
        mb6 mb6Var2 = this.b;
        if (!b53.x(mb6Var, mb6Var2)) {
            c40Var.n0 = mb6Var2;
            f80Var.R0();
        }
        y26 y26Var = c40Var.o0;
        y26 y26Var2 = this.c;
        if (!b53.x(y26Var, y26Var2)) {
            c40Var.o0 = y26Var2;
            f80Var.R0();
            nl2.M(c40Var);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) ji1.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
