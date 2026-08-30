package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n76  reason: default package */
/* loaded from: classes.dex */
public final class n76 extends dz3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ n76(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, p76] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = this.d;
        yy3Var.n0 = this.e;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n76) {
                n76 n76Var = (n76) obj;
                if (!ji1.b(this.a, n76Var.a) || !ji1.b(this.b, n76Var.b) || !ji1.b(this.c, n76Var.c) || !ji1.b(this.d, n76Var.d) || this.e != n76Var.e) {
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
        p76 p76Var = (p76) yy3Var;
        p76Var.j0 = this.a;
        p76Var.k0 = this.b;
        p76Var.l0 = this.c;
        p76Var.m0 = this.d;
        p76Var.n0 = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ej6.a(this.d, ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public n76(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
