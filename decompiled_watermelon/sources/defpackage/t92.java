package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t92  reason: default package */
/* loaded from: classes.dex */
public final class t92 {
    public int a;
    public cy0 d;
    public cy0 e;
    public cy0 f;
    public cy0 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ v92 r;
    public gz0 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public t92(v92 v92Var, int i, cy0 cy0Var, cy0 cy0Var2, cy0 cy0Var3, cy0 cy0Var4, int i2) {
        this.r = v92Var;
        this.a = i;
        this.d = cy0Var;
        this.e = cy0Var2;
        this.f = cy0Var3;
        this.g = cy0Var4;
        this.h = v92Var.z0;
        this.i = v92Var.v0;
        this.j = v92Var.A0;
        this.k = v92Var.w0;
        this.q = i2;
    }

    public final void a(gz0 gz0Var) {
        int i = this.a;
        int i2 = this.q;
        int i3 = 0;
        v92 v92Var = this.r;
        if (i == 0) {
            int Y = v92Var.Y(gz0Var, i2);
            if (gz0Var.T[0] == fz0.MATCH_CONSTRAINT) {
                this.p++;
                Y = 0;
            }
            int i4 = v92Var.S0;
            if (gz0Var.h0 != 8) {
                i3 = i4;
            }
            this.l = Y + i3 + this.l;
            int X = v92Var.X(gz0Var, this.q);
            if (this.b == null || this.c < X) {
                this.b = gz0Var;
                this.c = X;
                this.m = X;
            }
        } else {
            int Y2 = v92Var.Y(gz0Var, i2);
            int X2 = v92Var.X(gz0Var, this.q);
            if (gz0Var.T[1] == fz0.MATCH_CONSTRAINT) {
                this.p++;
                X2 = 0;
            }
            int i5 = v92Var.T0;
            if (gz0Var.h0 != 8) {
                i3 = i5;
            }
            this.m = X2 + i3 + this.m;
            if (this.b == null || this.c < Y2) {
                this.b = gz0Var;
                this.c = Y2;
                this.l = Y2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0103, code lost:
        if (r24 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0105, code lost:
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
        if (r24 != false) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t92.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        if (i == 1) {
            return i2 - this.r.T0;
        }
        return i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        if (i == 0) {
            return i2 - this.r.S0;
        }
        return i2;
    }

    public final void e(int i) {
        v92 v92Var;
        int i2;
        int i3 = this.p;
        if (i3 != 0) {
            int i4 = this.o;
            int i5 = i / i3;
            int i6 = 0;
            while (true) {
                v92Var = this.r;
                if (i6 >= i4 || (i2 = this.n + i6) >= v92Var.e1) {
                    break;
                }
                gz0 gz0Var = v92Var.d1[i2];
                if (this.a == 0) {
                    if (gz0Var != null) {
                        fz0[] fz0VarArr = gz0Var.T;
                        if (fz0VarArr[0] == fz0.MATCH_CONSTRAINT && gz0Var.r == 0) {
                            v92Var.W(gz0Var, fz0.FIXED, i5, fz0VarArr[1], gz0Var.l());
                        }
                    }
                } else if (gz0Var != null) {
                    fz0[] fz0VarArr2 = gz0Var.T;
                    if (fz0VarArr2[1] == fz0.MATCH_CONSTRAINT && gz0Var.s == 0) {
                        int i7 = i5;
                        v92Var.W(gz0Var, fz0VarArr2[0], gz0Var.r(), fz0.FIXED, i7);
                        i5 = i7;
                    }
                }
                i6++;
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i8 = this.o;
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = this.n + i9;
                if (i10 < v92Var.e1) {
                    gz0 gz0Var2 = v92Var.d1[i10];
                    if (this.a == 0) {
                        int r = gz0Var2.r();
                        int i11 = v92Var.S0;
                        if (gz0Var2.h0 == 8) {
                            i11 = 0;
                        }
                        this.l = r + i11 + this.l;
                        int X = v92Var.X(gz0Var2, this.q);
                        if (this.b == null || this.c < X) {
                            this.b = gz0Var2;
                            this.c = X;
                            this.m = X;
                        }
                    } else {
                        int Y = v92Var.Y(gz0Var2, this.q);
                        int X2 = v92Var.X(gz0Var2, this.q);
                        int i12 = v92Var.T0;
                        if (gz0Var2.h0 == 8) {
                            i12 = 0;
                        }
                        this.m = X2 + i12 + this.m;
                        if (this.b == null || this.c < Y) {
                            this.b = gz0Var2;
                            this.c = Y;
                            this.l = Y;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i, cy0 cy0Var, cy0 cy0Var2, cy0 cy0Var3, cy0 cy0Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = cy0Var;
        this.e = cy0Var2;
        this.f = cy0Var3;
        this.g = cy0Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
