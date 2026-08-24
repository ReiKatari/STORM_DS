package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge4  reason: default package */
/* loaded from: classes.dex */
public final class ge4 extends z64 implements ub7, ae4 {
    public ae4 k0;
    public eb l0;
    public ge4 m0;
    public final String n0;

    public ge4(ae4 ae4Var, eb ebVar) {
        this.k0 = ae4Var;
        this.l0 = ebVar == null ? new eb(14) : ebVar;
        this.n0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // defpackage.ae4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(long j, r41 r41Var) {
        fe4 fe4Var;
        Object obj;
        x61 x61Var;
        int i;
        long j2;
        long j3;
        if (r41Var instanceof fe4) {
            fe4Var = (fe4) r41Var;
            int i2 = fe4Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fe4Var.Z = i2 - Integer.MIN_VALUE;
                obj = fe4Var.X;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = fe4Var.Z;
                ge4 ge4Var = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j3 = fe4Var.R;
                            oi2.Y(obj);
                            return new ol7(ol7.e(j3, ((ol7) obj).a));
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = fe4Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (this.j0) {
                        ge4Var = S0();
                    }
                    if (ge4Var != null) {
                        fe4Var.R = j;
                        fe4Var.Z = 1;
                        obj = ge4Var.H(j, fe4Var);
                    } else {
                        j2 = 0;
                        ae4 ae4Var = this.k0;
                        long d = ol7.d(j, j2);
                        fe4Var.R = j2;
                        fe4Var.Z = 2;
                        obj = ae4Var.H(d, fe4Var);
                        if (obj != x61Var) {
                            j3 = j2;
                            return new ol7(ol7.e(j3, ((ol7) obj).a));
                        }
                        return x61Var;
                    }
                }
                j2 = ((ol7) obj).a;
                ae4 ae4Var2 = this.k0;
                long d2 = ol7.d(j, j2);
                fe4Var.R = j2;
                fe4Var.Z = 2;
                obj = ae4Var2.H(d2, fe4Var);
                if (obj != x61Var) {
                }
                return x61Var;
            }
        }
        fe4Var = new fe4(this, (s41) r41Var);
        obj = fe4Var.X;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = fe4Var.Z;
        ge4 ge4Var2 = null;
        if (i == 0) {
        }
        j2 = ((ol7) obj).a;
        ae4 ae4Var22 = this.k0;
        long d22 = ol7.d(j, j2);
        fe4Var.R = j2;
        fe4Var.Z = 2;
        obj = ae4Var22.H(d22, fe4Var);
        if (obj != x61Var) {
        }
        return x61Var;
    }

    @Override // defpackage.z64
    public final void J0() {
        eb ebVar = this.l0;
        ebVar.B = this;
        ebVar.L = null;
        this.m0 = null;
        ebVar.R = new pj(this, 14);
        ebVar.X = F0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dh5, java.lang.Object] */
    @Override // defpackage.z64
    public final void K0() {
        ?? obj = new Object();
        ii2.W(this, new me(2, obj));
        ge4 ge4Var = (ge4) ((ub7) obj.A);
        this.m0 = ge4Var;
        eb ebVar = this.l0;
        ebVar.L = ge4Var;
        if (((ge4) ebVar.B) == this) {
            ebVar.B = null;
        }
    }

    @Override // defpackage.ae4
    public final long N(int i, long j) {
        ge4 ge4Var;
        long j2;
        if (this.j0) {
            ge4Var = S0();
        } else {
            ge4Var = null;
        }
        if (ge4Var != null) {
            j2 = ge4Var.N(i, j);
        } else {
            j2 = 0;
        }
        return jk4.f(j2, this.k0.N(i, jk4.e(j, j2)));
    }

    public final w61 R0() {
        w61 w61Var;
        ge4 S0 = S0();
        if (S0 != null) {
            w61Var = S0.R0();
        } else {
            w61Var = null;
        }
        if (w61Var != null && g04.H(w61Var)) {
            return w61Var;
        }
        w61 w61Var2 = (w61) this.l0.X;
        if (w61Var2 != null) {
            return w61Var2;
        }
        i.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final ge4 S0() {
        if0 if0Var;
        ub7 ub7Var = null;
        if (!this.j0) {
            return null;
        }
        if (!this.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = this.A.X;
        sm3 f0 = nc1.f0(this);
        loop0: while (true) {
            if (f0 == null) {
                break;
            }
            if ((((z64) f0.B0.g).R & 262144) != 0) {
                while (z64Var != null) {
                    if ((z64Var.L & 262144) != 0) {
                        z64 z64Var2 = z64Var;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            if (z64Var2 instanceof ub7) {
                                ub7 ub7Var2 = (ub7) z64Var2;
                                if (nb3.k(this.n0, ub7Var2.n()) && ge4.class == ub7Var2.getClass()) {
                                    ub7Var = ub7Var2;
                                    break loop0;
                                }
                            }
                            if ((z64Var2.L & 262144) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var2 = z64Var3;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var2 != null) {
                                                ua4Var.b(z64Var2);
                                                z64Var2 = null;
                                            }
                                            ua4Var.b(z64Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var2 = nc1.A(ua4Var);
                        }
                        continue;
                    }
                    z64Var = z64Var.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var = (vy6) if0Var.f;
            } else {
                z64Var = null;
            }
        }
        return (ge4) ub7Var;
    }

    @Override // defpackage.ub7
    public final Object n() {
        return this.n0;
    }

    @Override // defpackage.ae4
    public final long w0(long j, long j2, int i) {
        ge4 ge4Var;
        long j3;
        long w0 = this.k0.w0(j, j2, i);
        if (this.j0) {
            ge4Var = S0();
        } else {
            ge4Var = null;
        }
        ge4 ge4Var2 = ge4Var;
        if (ge4Var2 != null) {
            j3 = ge4Var2.w0(jk4.f(j, w0), jk4.e(j2, w0), i);
        } else {
            j3 = 0;
        }
        return jk4.f(w0, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    @Override // defpackage.ae4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j, long j2, r41 r41Var) {
        ee4 ee4Var;
        int i;
        long j3;
        long j4;
        boolean z;
        ge4 ge4Var;
        long j5;
        long j6;
        if (r41Var instanceof ee4) {
            ee4Var = (ee4) r41Var;
            int i2 = ee4Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ee4Var.d0 = i2 - Integer.MIN_VALUE;
                ee4 ee4Var2 = ee4Var;
                Object obj = ee4Var2.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ee4Var2.d0;
                ge4 ge4Var2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j6 = ee4Var2.R;
                            oi2.Y(obj);
                            j5 = ((ol7) obj).a;
                            j4 = j6;
                            return new ol7(ol7.e(j4, j5));
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j7 = ee4Var2.X;
                    long j8 = ee4Var2.R;
                    oi2.Y(obj);
                    j3 = j7;
                    j = j8;
                } else {
                    oi2.Y(obj);
                    ae4 ae4Var = this.k0;
                    ee4Var2.R = j;
                    ee4Var2.X = j2;
                    ee4Var2.d0 = 1;
                    obj = ae4Var.z0(j, j2, ee4Var2);
                    if (obj != x61Var) {
                        j3 = j2;
                    }
                    return x61Var;
                }
                j4 = ((ol7) obj).a;
                z = this.j0;
                if (!z) {
                    if (z) {
                        ge4Var2 = S0();
                    }
                } else {
                    ge4Var2 = this.m0;
                }
                ge4Var = ge4Var2;
                if (ge4Var == null) {
                    long e = ol7.e(j, j4);
                    long d = ol7.d(j3, j4);
                    ee4Var2.R = j4;
                    ee4Var2.d0 = 2;
                    obj = ge4Var.z0(e, d, ee4Var2);
                    if (obj != x61Var) {
                        j6 = j4;
                        j5 = ((ol7) obj).a;
                        j4 = j6;
                        return new ol7(ol7.e(j4, j5));
                    }
                    return x61Var;
                }
                j5 = 0;
                return new ol7(ol7.e(j4, j5));
            }
        }
        ee4Var = new ee4(this, (s41) r41Var);
        ee4 ee4Var22 = ee4Var;
        Object obj2 = ee4Var22.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ee4Var22.d0;
        ge4 ge4Var22 = null;
        if (i == 0) {
        }
        j4 = ((ol7) obj2).a;
        z = this.j0;
        if (!z) {
        }
        ge4Var = ge4Var22;
        if (ge4Var == null) {
        }
    }
}
