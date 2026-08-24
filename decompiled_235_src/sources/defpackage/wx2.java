package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx2  reason: default package */
/* loaded from: classes.dex */
public final class wx2 {
    public final jk3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ca4 f = new ca4();
    public final jg4 g = new jg4();
    public final u94 h = new u94(10);

    public wx2(jk3 jk3Var) {
        this.a = jk3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        u94 u94Var;
        long[] jArr;
        long[] jArr2;
        int i;
        zf4 zf4Var;
        zf4 zf4Var2;
        int size = list.size();
        jg4 jg4Var = this.g;
        zf4 zf4Var3 = jg4Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            u94Var = this.h;
            if (i2 >= size) {
                break;
            }
            z64 z64Var = (z64) list.get(i2);
            if (z64Var.j0) {
                z64Var.i0 = new le(6, this, z64Var);
                if (z2) {
                    ua4 ua4Var = zf4Var3.a;
                    ?? r14 = ua4Var.A;
                    int i3 = ua4Var.L;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            zf4Var2 = r14[i4];
                            if (nb3.k(((zf4) zf4Var2).c, z64Var)) {
                                break;
                            }
                            i4++;
                        } else {
                            zf4Var2 = null;
                            break;
                        }
                    }
                    zf4Var = zf4Var2;
                    if (zf4Var != null) {
                        zf4Var.i = true;
                        zf4Var.d.i(j);
                        if (z) {
                            Object d = u94Var.d(j);
                            if (d == null) {
                                d = new ca4();
                                u94Var.g(j, d);
                            }
                            ((ca4) d).a(zf4Var);
                        }
                        zf4Var3 = zf4Var;
                    } else {
                        z2 = false;
                    }
                }
                zf4Var = new zf4(z64Var);
                zf4Var.d.i(j);
                if (z) {
                    Object d2 = u94Var.d(j);
                    if (d2 == null) {
                        d2 = new ca4();
                        u94Var.g(j, d2);
                    }
                    ((ca4) d2).a(zf4Var);
                }
                zf4Var3.a.b(zf4Var);
                zf4Var3 = zf4Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = u94Var.b;
            Object[] objArr = u94Var.c;
            long[] jArr4 = u94Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                ca4 ca4Var = (ca4) objArr[i9];
                                ua4 ua4Var2 = jg4Var.a;
                                i = i6;
                                Object[] objArr2 = ua4Var2.A;
                                int i10 = ua4Var2.L;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((zf4) objArr2[i11]).f(j3, ca4Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        u94Var.a();
    }

    public final boolean b(yc1 yc1Var, boolean z) {
        jk3 jk3Var = this.a;
        jg4 jg4Var = this.g;
        boolean a = jg4Var.a((hz3) yc1Var.A, jk3Var, yc1Var, z);
        ua4 ua4Var = jg4Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((zf4) objArr[i2]).e(yc1Var, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        Object[] objArr2 = ua4Var.A;
        int i3 = ua4Var.L;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!((zf4) objArr2[i4]).d(yc1Var) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        jg4Var.b(yc1Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            ca4 ca4Var = this.f;
            int i5 = ca4Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((z64) ca4Var.f(i6));
            }
            ca4Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            jg4Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        jg4 jg4Var = this.g;
        ua4 ua4Var = jg4Var.a;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((zf4) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            jg4Var.a.g();
        }
    }

    public final void d(z64 z64Var) {
        if (this.b) {
            this.e = true;
            this.f.a(z64Var);
            return;
        }
        jg4 jg4Var = this.g;
        ca4 ca4Var = jg4Var.b;
        ca4Var.d();
        ca4Var.a(jg4Var);
        while (ca4Var.i()) {
            jg4 jg4Var2 = (jg4) ca4Var.k(ca4Var.b - 1);
            int i = 0;
            while (true) {
                ua4 ua4Var = jg4Var2.a;
                if (i < ua4Var.L) {
                    zf4 zf4Var = (zf4) ua4Var.A[i];
                    if (nb3.k(zf4Var.c, z64Var)) {
                        jg4Var2.a.j(zf4Var);
                        zf4Var.c();
                    } else {
                        ca4Var.a(zf4Var);
                        i++;
                    }
                }
            }
        }
    }
}
