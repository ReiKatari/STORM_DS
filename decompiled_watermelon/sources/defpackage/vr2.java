package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vr2  reason: default package */
/* loaded from: classes.dex */
public final class vr2 {
    public final rd3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final w14 f = new w14();
    public final r74 g = new r74();
    public final o14 h = new o14(10);

    public vr2(rd3 rd3Var) {
        this.a = rd3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        o14 o14Var;
        long[] jArr;
        long[] jArr2;
        int i;
        h74 h74Var;
        h74 h74Var2;
        int size = list.size();
        r74 r74Var = this.g;
        h74 h74Var3 = r74Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            o14Var = this.h;
            if (i2 >= size) {
                break;
            }
            yy3 yy3Var = (yy3) list.get(i2);
            if (yy3Var.i0) {
                yy3Var.h0 = new wd(6, this, yy3Var);
                if (z2) {
                    o24 o24Var = h74Var3.a;
                    ?? r14 = o24Var.A;
                    int i3 = o24Var.L;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            h74Var2 = r14[i4];
                            if (b53.x(((h74) h74Var2).c, yy3Var)) {
                                break;
                            }
                            i4++;
                        } else {
                            h74Var2 = null;
                            break;
                        }
                    }
                    h74Var = h74Var2;
                    if (h74Var != null) {
                        h74Var.i = true;
                        h74Var.d.i(j);
                        if (z) {
                            Object d = o14Var.d(j);
                            if (d == null) {
                                d = new w14();
                                o14Var.g(j, d);
                            }
                            ((w14) d).a(h74Var);
                        }
                        h74Var3 = h74Var;
                    } else {
                        z2 = false;
                    }
                }
                h74Var = new h74(yy3Var);
                h74Var.d.i(j);
                if (z) {
                    Object d2 = o14Var.d(j);
                    if (d2 == null) {
                        d2 = new w14();
                        o14Var.g(j, d2);
                    }
                    ((w14) d2).a(h74Var);
                }
                h74Var3.a.b(h74Var);
                h74Var3 = h74Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = o14Var.b;
            Object[] objArr = o14Var.c;
            long[] jArr4 = o14Var.a;
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
                                w14 w14Var = (w14) objArr[i9];
                                o24 o24Var2 = r74Var.a;
                                i = i6;
                                Object[] objArr2 = o24Var2.A;
                                int i10 = o24Var2.L;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((h74) objArr2[i11]).f(j3, w14Var);
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
        o14Var.a();
    }

    public final boolean b(k91 k91Var, boolean z) {
        rd3 rd3Var = this.a;
        r74 r74Var = this.g;
        boolean a = r74Var.a((cs3) k91Var.A, rd3Var, k91Var, z);
        o24 o24Var = r74Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((h74) objArr[i2]).e(k91Var, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        Object[] objArr2 = o24Var.A;
        int i3 = o24Var.L;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!((h74) objArr2[i4]).d(k91Var) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        r74Var.b(k91Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            w14 w14Var = this.f;
            int i5 = w14Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((yy3) w14Var.f(i6));
            }
            w14Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            r74Var.a.h();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        r74 r74Var = this.g;
        o24 o24Var = r74Var.a;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            ((h74) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            r74Var.a.h();
        }
    }

    public final void d(yy3 yy3Var) {
        if (this.b) {
            this.e = true;
            this.f.a(yy3Var);
            return;
        }
        r74 r74Var = this.g;
        w14 w14Var = r74Var.b;
        w14Var.d();
        w14Var.a(r74Var);
        while (w14Var.i()) {
            r74 r74Var2 = (r74) w14Var.k(w14Var.b - 1);
            int i = 0;
            while (true) {
                o24 o24Var = r74Var2.a;
                if (i < o24Var.L) {
                    h74 h74Var = (h74) o24Var.A[i];
                    if (b53.x(h74Var.c, yy3Var)) {
                        r74Var2.a.k(h74Var);
                        h74Var.c();
                    } else {
                        w14Var.a(h74Var);
                        i++;
                    }
                }
            }
        }
    }
}
