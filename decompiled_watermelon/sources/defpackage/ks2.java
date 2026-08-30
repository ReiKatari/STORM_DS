package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ks2  reason: default package */
/* loaded from: classes.dex */
public final class ks2 extends be7 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x023f, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // defpackage.ud1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ud1 r23) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks2.a(ud1):void");
    }

    @Override // defpackage.be7
    public final void d() {
        gz0 gz0Var;
        gz0 gz0Var2;
        fz0 fz0Var;
        gz0 gz0Var3;
        gz0 gz0Var4;
        fz0 fz0Var2;
        gz0 gz0Var5 = this.b;
        boolean z = gz0Var5.a;
        nf1 nf1Var = this.e;
        if (z) {
            nf1Var.d(gz0Var5.r());
        }
        boolean z2 = nf1Var.j;
        ArrayList arrayList = nf1Var.k;
        ArrayList arrayList2 = nf1Var.l;
        yd1 yd1Var = this.i;
        yd1 yd1Var2 = this.h;
        if (!z2) {
            gz0 gz0Var6 = this.b;
            fz0 fz0Var3 = gz0Var6.T[0];
            this.d = fz0Var3;
            if (fz0Var3 != fz0.MATCH_CONSTRAINT) {
                fz0 fz0Var4 = fz0.MATCH_PARENT;
                if (fz0Var3 == fz0Var4 && (gz0Var4 = gz0Var6.U) != null && ((fz0Var2 = gz0Var4.T[0]) == fz0.FIXED || fz0Var2 == fz0Var4)) {
                    int r = (gz0Var4.r() - this.b.I.e()) - this.b.K.e();
                    be7.b(yd1Var2, gz0Var4.d.h, this.b.I.e());
                    be7.b(yd1Var, gz0Var4.d.i, -this.b.K.e());
                    nf1Var.d(r);
                    return;
                } else if (fz0Var3 == fz0.FIXED) {
                    nf1Var.d(gz0Var6.r());
                }
            }
        } else {
            fz0 fz0Var5 = this.d;
            fz0 fz0Var6 = fz0.MATCH_PARENT;
            if (fz0Var5 == fz0Var6 && (gz0Var2 = (gz0Var = this.b).U) != null && ((fz0Var = gz0Var2.T[0]) == fz0.FIXED || fz0Var == fz0Var6)) {
                be7.b(yd1Var2, gz0Var2.d.h, gz0Var.I.e());
                be7.b(yd1Var, gz0Var2.d.i, -this.b.K.e());
                return;
            }
        }
        if (nf1Var.j) {
            gz0 gz0Var7 = this.b;
            if (gz0Var7.a) {
                cy0[] cy0VarArr = gz0Var7.Q;
                cy0 cy0Var = cy0VarArr[0];
                cy0 cy0Var2 = cy0Var.f;
                if (cy0Var2 != null && cy0VarArr[1].f != null) {
                    boolean y = gz0Var7.y();
                    gz0 gz0Var8 = this.b;
                    if (y) {
                        yd1Var2.f = gz0Var8.Q[0].e();
                        yd1Var.f = -this.b.Q[1].e();
                        return;
                    }
                    yd1 h = be7.h(gz0Var8.Q[0]);
                    if (h != null) {
                        be7.b(yd1Var2, h, this.b.Q[0].e());
                    }
                    yd1 h2 = be7.h(this.b.Q[1]);
                    if (h2 != null) {
                        be7.b(yd1Var, h2, -this.b.Q[1].e());
                    }
                    yd1Var2.b = true;
                    yd1Var.b = true;
                    return;
                } else if (cy0Var2 != null) {
                    yd1 h3 = be7.h(cy0Var);
                    if (h3 != null) {
                        be7.b(yd1Var2, h3, this.b.Q[0].e());
                        be7.b(yd1Var, yd1Var2, nf1Var.g);
                        return;
                    }
                    return;
                } else {
                    cy0 cy0Var3 = cy0VarArr[1];
                    if (cy0Var3.f != null) {
                        yd1 h4 = be7.h(cy0Var3);
                        if (h4 != null) {
                            be7.b(yd1Var, h4, -this.b.Q[1].e());
                            be7.b(yd1Var2, yd1Var, -nf1Var.g);
                            return;
                        }
                        return;
                    } else if (!(gz0Var7 instanceof fr2) && gz0Var7.U != null && gz0Var7.j(by0.CENTER).f == null) {
                        gz0 gz0Var9 = this.b;
                        be7.b(yd1Var2, gz0Var9.U.d.h, gz0Var9.s());
                        be7.b(yd1Var, yd1Var2, nf1Var.g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.d == fz0.MATCH_CONSTRAINT) {
            gz0 gz0Var10 = this.b;
            int i = gz0Var10.r;
            if (i != 2) {
                if (i == 3) {
                    if (gz0Var10.s == 3) {
                        yd1Var2.a = this;
                        yd1Var.a = this;
                        m87 m87Var = gz0Var10.e;
                        m87Var.h.a = this;
                        m87Var.i.a = this;
                        nf1Var.a = this;
                        if (gz0Var10.z()) {
                            arrayList2.add(this.b.e.e);
                            this.b.e.e.k.add(nf1Var);
                            m87 m87Var2 = this.b.e;
                            m87Var2.e.a = this;
                            arrayList2.add(m87Var2.h);
                            arrayList2.add(this.b.e.i);
                            this.b.e.h.k.add(nf1Var);
                            this.b.e.i.k.add(nf1Var);
                        } else {
                            boolean y2 = this.b.y();
                            gz0 gz0Var11 = this.b;
                            if (y2) {
                                gz0Var11.e.e.l.add(nf1Var);
                                arrayList.add(this.b.e.e);
                            } else {
                                gz0Var11.e.e.l.add(nf1Var);
                            }
                        }
                    } else {
                        nf1 nf1Var2 = gz0Var10.e.e;
                        arrayList2.add(nf1Var2);
                        nf1Var2.k.add(nf1Var);
                        this.b.e.h.k.add(nf1Var);
                        this.b.e.i.k.add(nf1Var);
                        nf1Var.b = true;
                        arrayList.add(yd1Var2);
                        arrayList.add(yd1Var);
                        yd1Var2.l.add(nf1Var);
                        yd1Var.l.add(nf1Var);
                    }
                }
            } else {
                gz0 gz0Var12 = gz0Var10.U;
                if (gz0Var12 != null) {
                    nf1 nf1Var3 = gz0Var12.e.e;
                    arrayList2.add(nf1Var3);
                    nf1Var3.k.add(nf1Var);
                    nf1Var.b = true;
                    arrayList.add(yd1Var2);
                    arrayList.add(yd1Var);
                }
            }
        }
        gz0 gz0Var13 = this.b;
        cy0[] cy0VarArr2 = gz0Var13.Q;
        cy0 cy0Var4 = cy0VarArr2[0];
        cy0 cy0Var5 = cy0Var4.f;
        if (cy0Var5 != null && cy0VarArr2[1].f != null) {
            boolean y3 = gz0Var13.y();
            gz0 gz0Var14 = this.b;
            if (y3) {
                yd1Var2.f = gz0Var14.Q[0].e();
                yd1Var.f = -this.b.Q[1].e();
                return;
            }
            yd1 h5 = be7.h(gz0Var14.Q[0]);
            yd1 h6 = be7.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = ae7.CENTER;
        } else if (cy0Var5 != null) {
            yd1 h7 = be7.h(cy0Var4);
            if (h7 != null) {
                be7.b(yd1Var2, h7, this.b.Q[0].e());
                c(yd1Var, yd1Var2, 1, nf1Var);
            }
        } else {
            cy0 cy0Var6 = cy0VarArr2[1];
            if (cy0Var6.f != null) {
                yd1 h8 = be7.h(cy0Var6);
                if (h8 != null) {
                    be7.b(yd1Var, h8, -this.b.Q[1].e());
                    c(yd1Var2, yd1Var, -1, nf1Var);
                }
            } else if (!(gz0Var13 instanceof fr2) && (gz0Var3 = gz0Var13.U) != null) {
                be7.b(yd1Var2, gz0Var3.d.h, gz0Var13.s());
                c(yd1Var, yd1Var2, 1, nf1Var);
            }
        }
    }

    @Override // defpackage.be7
    public final void e() {
        yd1 yd1Var = this.h;
        if (yd1Var.j) {
            this.b.Z = yd1Var.g;
        }
    }

    @Override // defpackage.be7
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.be7
    public final boolean k() {
        if (this.d != fz0.MATCH_CONSTRAINT || this.b.r == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.g = false;
        yd1 yd1Var = this.h;
        yd1Var.c();
        yd1Var.j = false;
        yd1 yd1Var2 = this.i;
        yd1Var2.c();
        yd1Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.j0;
    }
}
