package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be7  reason: default package */
/* loaded from: classes.dex */
public abstract class be7 implements ud1 {
    public int a;
    public gz0 b;
    public as5 c;
    public fz0 d;
    public final nf1 e = new nf1(this);
    public int f = 0;
    public boolean g = false;
    public final yd1 h = new yd1(this);
    public final yd1 i = new yd1(this);
    public ae7 j = ae7.NONE;

    public be7(gz0 gz0Var) {
        this.b = gz0Var;
    }

    public static void b(yd1 yd1Var, yd1 yd1Var2, int i) {
        yd1Var.l.add(yd1Var2);
        yd1Var.f = i;
        yd1Var2.k.add(yd1Var);
    }

    public static yd1 h(cy0 cy0Var) {
        cy0 cy0Var2 = cy0Var.f;
        if (cy0Var2 != null) {
            gz0 gz0Var = cy0Var2.d;
            int i = zd7.a[cy0Var2.e.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return gz0Var.e.i;
                        }
                        return gz0Var.e.k;
                    }
                    return gz0Var.e.h;
                }
                return gz0Var.d.i;
            }
            return gz0Var.d.h;
        }
        return null;
    }

    public static yd1 i(cy0 cy0Var, int i) {
        be7 be7Var;
        cy0 cy0Var2 = cy0Var.f;
        if (cy0Var2 != null) {
            gz0 gz0Var = cy0Var2.d;
            if (i == 0) {
                be7Var = gz0Var.d;
            } else {
                be7Var = gz0Var.e;
            }
            int i2 = zd7.a[cy0Var2.e.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            return null;
                        }
                    }
                }
                return be7Var.i;
            }
            return be7Var.h;
        }
        return null;
    }

    public final void c(yd1 yd1Var, yd1 yd1Var2, int i, nf1 nf1Var) {
        yd1Var.l.add(yd1Var2);
        yd1Var.l.add(this.e);
        yd1Var.h = i;
        yd1Var.i = nf1Var;
        yd1Var2.k.add(yd1Var);
        nf1Var.k.add(yd1Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        gz0 gz0Var = this.b;
        if (i2 == 0) {
            int i3 = gz0Var.v;
            int max = Math.max(gz0Var.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = gz0Var.y;
            int max2 = Math.max(gz0Var.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        nf1 nf1Var = this.e;
        if (nf1Var.j) {
            return nf1Var.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10.a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.cy0 r13, defpackage.cy0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be7.l(cy0, cy0, int):void");
    }
}
