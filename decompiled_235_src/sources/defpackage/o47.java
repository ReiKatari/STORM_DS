package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o47  reason: default package */
/* loaded from: classes.dex */
public final class o47 extends e74 {
    public final String a;
    public final s47 b;
    public final ki2 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final lt0 h;

    public o47(String str, s47 s47Var, ki2 ki2Var, int i, boolean z, int i2, int i3, lt0 lt0Var) {
        this.a = str;
        this.b = s47Var;
        this.c = ki2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = lt0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r47, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        z64Var.o0 = this.e;
        z64Var.p0 = this.f;
        z64Var.q0 = this.g;
        z64Var.r0 = this.h;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o47)) {
            return false;
        }
        o47 o47Var = (o47) obj;
        if (nb3.k(this.h, o47Var.h) && nb3.k(this.a, o47Var.a) && nb3.k(this.b, o47Var.b) && nb3.k(this.c, o47Var.c) && this.d == o47Var.d && this.e == o47Var.e && this.f == o47Var.f && this.g == o47Var.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r5.a.b(r2.a) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.e74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(z64 z64Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ki2 ki2Var;
        ki2 ki2Var2;
        int i5;
        int i6;
        r47 r47Var = (r47) z64Var;
        lt0 lt0Var = r47Var.r0;
        lt0 lt0Var2 = this.h;
        boolean k = nb3.k(lt0Var2, lt0Var);
        r47Var.r0 = lt0Var2;
        boolean z4 = false;
        boolean z5 = true;
        s47 s47Var = this.b;
        if (k) {
            s47 s47Var2 = r47Var.l0;
            if (s47Var == s47Var2) {
                s47Var.getClass();
            }
            z = false;
            str = r47Var.k0;
            str2 = this.a;
            if (!nb3.k(str, str2)) {
                r47Var.k0 = str2;
                r47Var.w0 = null;
                z4 = true;
            }
            boolean z6 = !r47Var.l0.c(s47Var);
            r47Var.l0 = s47Var;
            i = r47Var.q0;
            i2 = this.g;
            if (i != i2) {
                r47Var.q0 = i2;
                z6 = true;
            }
            i3 = r47Var.p0;
            i4 = this.f;
            if (i3 != i4) {
                r47Var.p0 = i4;
                z6 = true;
            }
            z2 = r47Var.o0;
            z3 = this.e;
            if (z2 != z3) {
                r47Var.o0 = z3;
                z6 = true;
            }
            ki2Var = r47Var.m0;
            ki2Var2 = this.c;
            if (!nb3.k(ki2Var, ki2Var2)) {
                r47Var.m0 = ki2Var2;
                z6 = true;
            }
            i5 = r47Var.n0;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                r47Var.n0 = i6;
            }
            if (!z || z4 || z5) {
                r47Var.u0 = null;
            }
            if (!z4 || z5) {
                r47Var.R0().f(r47Var.k0, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
            }
            if (!r47Var.j0) {
                if (z4 || (z && r47Var.v0 != null)) {
                    bl2.G(r47Var);
                }
                if (z4 || z5) {
                    xk2.w(r47Var);
                    f04.I(r47Var);
                }
                if (z) {
                    f04.I(r47Var);
                    return;
                }
                return;
            }
            return;
        }
        z = true;
        str = r47Var.k0;
        str2 = this.a;
        if (!nb3.k(str, str2)) {
        }
        boolean z62 = !r47Var.l0.c(s47Var);
        r47Var.l0 = s47Var;
        i = r47Var.q0;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = r47Var.p0;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = r47Var.o0;
        z3 = this.e;
        if (z2 != z3) {
        }
        ki2Var = r47Var.m0;
        ki2Var2 = this.c;
        if (!nb3.k(ki2Var, ki2Var2)) {
        }
        i5 = r47Var.n0;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z) {
        }
        r47Var.u0 = null;
        if (!z4) {
        }
        r47Var.R0().f(r47Var.k0, r47Var.l0, r47Var.m0, r47Var.n0, r47Var.o0, r47Var.p0, r47Var.q0);
        if (!r47Var.j0) {
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int e = (((xg6.e(lb1.a(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31) + this.f) * 31) + this.g) * 31;
        lt0 lt0Var = this.h;
        if (lt0Var != null) {
            i = lt0Var.hashCode();
        } else {
            i = 0;
        }
        return e + i;
    }
}
