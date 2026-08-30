package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qg6  reason: default package */
/* loaded from: classes.dex */
public final class qg6 extends dt3 {
    public final i40 q0;
    public final t63 r0;
    public final ej7 s0;
    public final qg6[] t0;
    public final vn1 u0;
    public final e73 v0;
    public boolean w0;
    public String x0;
    public String y0;

    public qg6(i40 i40Var, t63 t63Var, ej7 ej7Var, qg6[] qg6VarArr) {
        i40Var.getClass();
        this.q0 = i40Var;
        this.r0 = t63Var;
        this.s0 = ej7Var;
        this.t0 = qg6VarArr;
        this.u0 = t63Var.b;
        this.v0 = t63Var.a;
        int ordinal = ej7Var.ordinal();
        if (qg6VarArr != null) {
            qg6 qg6Var = qg6VarArr[ordinal];
            if (qg6Var != null || qg6Var != this) {
                qg6VarArr[ordinal] = this;
            }
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void E(int i) {
        if (this.w0) {
            b0(String.valueOf(i));
        } else {
            this.q0.i(i);
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void H(float f) {
        if (this.w0) {
            b0(String.valueOf(f));
        } else {
            ((b43) this.q0.B).f(String.valueOf(f));
        }
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new s73(io2.a0(Float.valueOf(f), null), 2, null);
    }

    @Override // defpackage.dt3, defpackage.zu0
    public final void N(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        if (obj == null && !this.v0.b) {
            return;
        }
        super.N(h06Var, i, m93Var, obj);
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void P(long j) {
        if (this.w0) {
            b0(String.valueOf(j));
        } else {
            this.q0.j(j);
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void S(char c) {
        b0(String.valueOf(c));
    }

    @Override // defpackage.dt3, defpackage.zu0
    public final void a(h06 h06Var) {
        h06Var.getClass();
        ej7 ej7Var = this.s0;
        if (ej7Var.end != 0) {
            i40 i40Var = this.q0;
            i40Var.getClass();
            i40Var.A = false;
            i40Var.h(ej7Var.end);
        }
    }

    @Override // defpackage.mz1
    public final vn1 b() {
        return this.u0;
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void b0(String str) {
        str.getClass();
        this.q0.l(str);
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final zu0 c(h06 h06Var) {
        qg6 qg6Var;
        h06Var.getClass();
        t63 t63Var = this.r0;
        ej7 c = fj7.c(t63Var, h06Var);
        char c2 = c.begin;
        i40 i40Var = this.q0;
        if (c2 != 0) {
            i40Var.h(c2);
            i40Var.A = true;
        }
        String str = this.x0;
        if (str != null) {
            String str2 = this.y0;
            if (str2 == null) {
                str2 = h06Var.b();
            }
            i40Var.e();
            i40Var.l(str);
            i40Var.h(':');
            b0(str2);
            this.x0 = null;
            this.y0 = null;
        }
        if (this.s0 == c) {
            return this;
        }
        qg6[] qg6VarArr = this.t0;
        if (qg6VarArr != null && (qg6Var = qg6VarArr[c.ordinal()]) != null) {
            return qg6Var;
        }
        return new qg6(i40Var, t63Var, c, qg6VarArr);
    }

    @Override // defpackage.dt3
    public final void c0(h06 h06Var, int i) {
        h06Var.getClass();
        int i2 = pg6.a[this.s0.ordinal()];
        i40 i40Var = this.q0;
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!i40Var.A) {
                        i40Var.h(',');
                    }
                    i40Var.e();
                    a83.d(this.r0, h06Var);
                    b0(h06Var.e(i));
                    i40Var.h(':');
                    i40Var.m();
                    return;
                }
                if (i == 0) {
                    this.w0 = true;
                }
                if (i == 1) {
                    i40Var.h(',');
                    i40Var.m();
                    this.w0 = false;
                    return;
                }
                return;
            } else if (!i40Var.A) {
                if (i % 2 == 0) {
                    i40Var.h(',');
                    i40Var.e();
                } else {
                    i40Var.h(':');
                    i40Var.m();
                    z = false;
                }
                this.w0 = z;
                return;
            } else {
                this.w0 = true;
                i40Var.e();
                return;
            }
        }
        if (!i40Var.A) {
            i40Var.h(',');
        }
        i40Var.e();
    }

    @Override // defpackage.mz1
    public final void g() {
        i40 i40Var = this.q0;
        i40Var.getClass();
        ((b43) i40Var.B).f("null");
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void g0(h06 h06Var, int i) {
        h06Var.getClass();
        b0(h06Var.e(i));
    }

    @Override // defpackage.zu0
    public final boolean k(h06 h06Var) {
        h06Var.getClass();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (defpackage.b53.x(r3, defpackage.kh6.k) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != defpackage.po0.NONE) goto L40;
     */
    @Override // defpackage.mz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.m93 r7, java.lang.Object r8) {
        /*
            r6 = this;
            r7.getClass()
            t63 r0 = r6.r0
            e73 r1 = r0.a
            boolean r2 = r7 instanceof defpackage.bq4
            po0 r3 = r1.f
            r4 = 0
            if (r2 == 0) goto L13
            po0 r5 = defpackage.po0.NONE
            if (r3 == r5) goto L49
            goto L3c
        L13:
            int[] r5 = defpackage.aq4.a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            r5 = 1
            if (r3 == r5) goto L49
            r5 = 2
            if (r3 == r5) goto L49
            r5 = 3
            if (r3 != r5) goto L45
            h06 r3 = r7.e()
            ep2 r3 = r3.c()
            kh6 r5 = defpackage.kh6.h
            boolean r5 = defpackage.b53.x(r3, r5)
            if (r5 != 0) goto L3c
            kh6 r5 = defpackage.kh6.k
            boolean r3 = defpackage.b53.x(r3, r5)
            if (r3 == 0) goto L49
        L3c:
            h06 r3 = r7.e()
            java.lang.String r3 = defpackage.hi2.g(r0, r3)
            goto L4a
        L45:
            defpackage.i.c()
            return
        L49:
            r3 = r4
        L4a:
            if (r2 == 0) goto L60
            bq4 r7 = (defpackage.bq4) r7
            if (r8 != 0) goto L5c
            h06 r6 = r7.e()
            java.lang.String r7 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r8 = "Value for serializer "
            defpackage.c44.t(r6, r7, r8)
            return
        L5c:
            defpackage.mj2.v(r7, r6, r8)
            throw r4
        L60:
            if (r3 == 0) goto Leb
            h06 r2 = r7.e()
            r2.getClass()
            defpackage.a83.d(r0, r2)
            java.util.Set r0 = defpackage.mh7.o(r2)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lb5
            h06 r6 = r7.e()
            java.lang.String r6 = r6.b()
            h06 r7 = r7.e()
            java.lang.String r7 = r7.b()
            po0 r8 = r1.f
            po0 r0 = defpackage.po0.ALL_JSON_OBJECTS
            if (r8 != r0) goto L95
            boolean r8 = defpackage.b53.x(r6, r7)
            if (r8 == 0) goto L95
            java.lang.String r6 = "in ALL_JSON_OBJECTS class discriminator mode"
            goto L9d
        L95:
            java.lang.String r8 = "as base class '"
            r0 = 39
            java.lang.String r6 = defpackage.b31.n(r0, r8, r6)
        L9d:
            java.lang.String r8 = "' cannot be serialized "
            java.lang.String r0 = " because it has property name that conflicts with JSON class discriminator '"
            java.lang.String r1 = "Class '"
            java.lang.StringBuilder r6 = defpackage.b31.v(r1, r7, r8, r6, r0)
            java.lang.String r7 = "'."
            java.lang.String r6 = defpackage.b31.q(r6, r3, r7)
            s73 r7 = new s73
            java.lang.String r8 = "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."
            r7.<init>(r6, r8)
            throw r7
        Lb5:
            h06 r0 = r7.e()
            ep2 r0 = r0.c()
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.m06
            if (r1 != 0) goto Le5
            boolean r1 = r0 instanceof defpackage.tt4
            if (r1 != 0) goto Ldf
            boolean r0 = r0 instanceof defpackage.zp4
            if (r0 != 0) goto Ld9
            h06 r0 = r7.e()
            java.lang.String r0 = r0.b()
            r6.x0 = r3
            r6.y0 = r0
            goto Leb
        Ld9:
            java.lang.String r6 = "Actual serializer for polymorphic cannot be polymorphic itself"
            defpackage.i.n(r6)
            return
        Ldf:
            java.lang.String r6 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.i.n(r6)
            return
        Le5:
            java.lang.String r6 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.i.n(r6)
            return
        Leb:
            r7.d(r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg6.l(m93, java.lang.Object):void");
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void o(double d) {
        if (this.w0) {
            b0(String.valueOf(d));
        } else {
            ((b43) this.q0.B).f(String.valueOf(d));
        }
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new s73(io2.a0(Double.valueOf(d), null), 2, null);
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void p(short s) {
        if (this.w0) {
            b0(String.valueOf((int) s));
        } else {
            this.q0.k(s);
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void s(byte b) {
        if (this.w0) {
            b0(String.valueOf((int) b));
        } else {
            this.q0.g(b);
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final void w(boolean z) {
        if (this.w0) {
            b0(String.valueOf(z));
        } else {
            ((b43) this.q0.B).f(String.valueOf(z));
        }
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final mz1 x(h06 h06Var) {
        h06Var.getClass();
        boolean a = rg6.a(h06Var);
        ej7 ej7Var = this.s0;
        t63 t63Var = this.r0;
        i40 i40Var = this.q0;
        if (a) {
            if (!(i40Var instanceof wu0)) {
                i40Var = new wu0((b43) i40Var.B, this.w0);
            }
            return new qg6(i40Var, t63Var, ej7Var, null);
        } else if (h06Var.f() && h06Var.equals(m73.a)) {
            if (!(i40Var instanceof vu0)) {
                i40Var = new vu0((b43) i40Var.B, this.w0);
            }
            return new qg6(i40Var, t63Var, ej7Var, null);
        } else {
            if (this.x0 != null) {
                this.y0 = h06Var.b();
            }
            return this;
        }
    }
}
