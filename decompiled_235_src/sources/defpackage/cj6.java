package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj6  reason: default package */
/* loaded from: classes.dex */
public final class cj6 extends e74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ cj6(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ej6, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        z64Var.o0 = this.e;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cj6) {
                cj6 cj6Var = (cj6) obj;
                if (!om1.b(this.a, cj6Var.a) || !om1.b(this.b, cj6Var.b) || !om1.b(this.c, cj6Var.c) || !om1.b(this.d, cj6Var.d) || this.e != cj6Var.e) {
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
        ej6 ej6Var = (ej6) z64Var;
        ej6Var.k0 = this.a;
        ej6Var.l0 = this.b;
        ej6Var.m0 = this.c;
        ej6Var.n0 = this.d;
        ej6Var.o0 = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xg6.a(this.d, xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public cj6(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
