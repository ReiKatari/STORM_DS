package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj1  reason: default package */
/* loaded from: classes.dex */
public abstract class sj1 extends xc1 implements up4, wy2, jv0, pl2 {
    public yj B0;
    public vy2 C0;
    public jf4 l0;
    public mi2 m0;
    public boolean n0;
    public l14 o0;
    public ql2 p0;
    public q60 q0;
    public uj1 r0;
    public boolean s0;
    public boolean t0;
    public ui1 u0;
    public xi1 v0;
    public wi1 w0;
    public vi1 x0;
    public pu y0;
    public u57 z0;
    public long A0 = 9205357640488583168L;
    public long D0 = 0;

    public sj1(mi2 mi2Var, boolean z, l14 l14Var, jf4 jf4Var) {
        this.l0 = jf4Var;
        this.m0 = mi2Var;
        this.n0 = z;
        this.o0 = l14Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U0(defpackage.sj1 r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.oj1
            if (r0 == 0) goto L13
            r0 = r7
            oj1 r0 = (defpackage.oj1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            oj1 r0 = new oj1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r7)
            goto L47
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L2e:
            defpackage.me2.a0(r7)
            uj1 r7 = r6.r0
            if (r7 == 0) goto L49
            l14 r2 = r6.o0
            if (r2 == 0) goto L47
            tj1 r5 = new tj1
            r5.<init>(r7)
            r0.Y = r4
            java.lang.Object r7 = r2.a(r5, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r6.r0 = r3
        L49:
            bj1 r7 = new bj1
            r0 = 0
            r2 = 0
            r7.<init>(r0, r2)
            r6.e1(r7)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj1.U0(sj1, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r2.a(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, uj1, l33] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V0(defpackage.sj1 r6, defpackage.aj1 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.pj1
            if (r0 == 0) goto L13
            r0 = r8
            pj1 r0 = (defpackage.pj1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            pj1 r0 = new pj1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            uj1 r7 = r0.X
            aj1 r0 = r0.R
            defpackage.me2.a0(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L35:
            aj1 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L56
        L3b:
            defpackage.me2.a0(r8)
            uj1 r8 = r6.r0
            if (r8 == 0) goto L56
            l14 r2 = r6.o0
            if (r2 == 0) goto L56
            tj1 r5 = new tj1
            r5.<init>(r8)
            r0.R = r7
            r0.c0 = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L56
            goto L6b
        L56:
            uj1 r8 = new uj1
            r8.<init>()
            l14 r2 = r6.o0
            if (r2 == 0) goto L70
            r0.R = r7
            r0.X = r8
            r0.c0 = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.r0 = r8
            long r7 = r7.a
            r6.d1(r7)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj1.V0(sj1, aj1, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W0(defpackage.sj1 r6, defpackage.bj1 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.qj1
            if (r0 == 0) goto L13
            r0 = r8
            qj1 r0 = (defpackage.qj1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qj1 r0 = new qj1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            bj1 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L30:
            defpackage.me2.a0(r8)
            uj1 r8 = r6.r0
            if (r8 == 0) goto L4d
            l14 r2 = r6.o0
            if (r2 == 0) goto L4b
            vj1 r5 = new vj1
            r5.<init>(r8)
            r0.R = r7
            r0.Z = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r6.r0 = r3
        L4d:
            r6.e1(r7)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj1.W0(sj1, bj1, k11):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, wi1] */
    public static void b1(sj1 sj1Var, rp4 rp4Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        wi1 wi1Var = sj1Var.w0;
        wi1 wi1Var2 = wi1Var;
        if (wi1Var == null) {
            ?? obj = new Object();
            obj.z = null;
            obj.A = Long.MAX_VALUE;
            obj.B = false;
            sj1Var.w0 = obj;
            wi1Var2 = obj;
        }
        wi1Var2.z = rp4Var;
        wi1Var2.A = j;
        yj yjVar = sj1Var.B0;
        jf4 jf4Var = sj1Var.l0;
        if (yjVar == null) {
            sj1Var.B0 = new yj(jf4Var);
        } else {
            yjVar.c = jf4Var;
            yjVar.b = j2;
        }
        wi1Var2.B = false;
        sj1Var.y0 = wi1Var2;
    }

    @Override // defpackage.wy2
    public final void E() {
        vy2 vy2Var = this.C0;
        if (vy2Var != null) {
            vy2Var.a();
            sj1 sj1Var = vy2Var.a;
            if (sj1Var.s0) {
                sj1Var.c1(yi1.a);
            }
            vy2Var.g = null;
            sb sbVar = vy2Var.k;
            sbVar.B = 0;
            ((n14) sbVar.L).b = 0;
        }
    }

    @Override // defpackage.yy3
    public final void K0() {
        this.s0 = false;
        X0();
        this.D0 = 0L;
        ql2 ql2Var = this.p0;
        if (ql2Var != null) {
            S0(ql2Var);
        }
        this.p0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [xc1, pl2, sj1] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, ty2] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, ty2] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, qy2] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.wy2
    public final void L(sh shVar, lp4 lp4Var) {
        Object obj;
        Object obj2;
        Object obj3;
        oy2 oy2Var;
        ?? r9;
        py2 py2Var;
        int i = shVar.b;
        ArrayList arrayList = (ArrayList) shVar.c;
        if (this.p0 == null) {
            ql2 ql2Var = new ql2(this);
            R0(ql2Var);
            this.p0 = ql2Var;
        }
        if (this.n0) {
            if (this.C0 == null) {
                this.C0 = new vy2(this);
            }
            vy2 vy2Var = this.C0;
            if (vy2Var != null) {
                sj1 sj1Var = vy2Var.a;
                int i2 = 0;
                if (vy2Var.f == null) {
                    qy2 qy2Var = vy2Var.b;
                    qy2 qy2Var2 = qy2Var;
                    if (qy2Var == null) {
                        py2 py2Var2 = py2.NotInitialized;
                        ?? obj4 = new Object();
                        obj4.d = py2Var2;
                        obj4.e = false;
                        vy2Var.b = obj4;
                        qy2Var2 = obj4;
                    }
                    vy2Var.f = qy2Var2;
                }
                jk2 jk2Var = vy2Var.f;
                if (jk2Var != null) {
                    boolean z = true;
                    if (jk2Var instanceof qy2) {
                        qy2 qy2Var3 = (qy2) jk2Var;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                if (nk2.r((oy2) arrayList.get(i2))) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                            oy2 oy2Var2 = (oy2) tq0.K0(arrayList);
                            if (uy2.a[qy2Var3.d.ordinal()] == 1) {
                                if (!sj1Var.j1()) {
                                    py2Var = py2.Yes;
                                } else {
                                    py2Var = py2.No;
                                }
                            } else {
                                py2Var = qy2Var3.d;
                            }
                            qy2Var3.d = py2Var;
                            if (lp4Var == lp4.Initial && py2Var == py2.No) {
                                oy2Var2.i = true;
                                qy2Var3.e = true;
                            }
                            if (lp4Var == lp4.Main) {
                                if (py2Var == py2.Yes) {
                                    vy2.c(vy2Var, oy2Var2, oy2Var2.a, 0L, 12);
                                    return;
                                } else if (qy2Var3.e) {
                                    vy2Var.f(oy2Var2, oy2Var2, new ny2(i), 0L);
                                    vy2Var.e(oy2Var2, new ny2(i), 0L);
                                    long j = oy2Var2.a;
                                    ty2 ty2Var = vy2Var.c;
                                    ty2 ty2Var2 = ty2Var;
                                    if (ty2Var == null) {
                                        ?? obj5 = new Object();
                                        obj5.d = Long.MAX_VALUE;
                                        vy2Var.c = obj5;
                                        ty2Var2 = obj5;
                                    }
                                    ty2Var2.d = j;
                                    vy2Var.f = ty2Var2;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (jk2Var instanceof sy2) {
                        sy2 sy2Var = (sy2) jk2Var;
                        if (lp4Var != lp4.Initial) {
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    obj3 = arrayList.get(i3);
                                    int i4 = i3;
                                    if (cg2.y(((oy2) obj3).a, sy2Var.e)) {
                                        break;
                                    }
                                    i3 = i4 + 1;
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            }
                            oy2 oy2Var3 = (oy2) obj3;
                            if (oy2Var3 == null) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        r9 = arrayList.get(i5);
                                        if (((oy2) r9).d) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        r9 = 0;
                                        break;
                                    }
                                }
                                oy2Var3 = r9;
                                if (oy2Var3 == null) {
                                    vy2Var.a();
                                    return;
                                }
                                sy2Var.e = oy2Var3.a;
                            }
                            if (lp4Var == lp4.Main) {
                                if (!oy2Var3.i) {
                                    if (nk2.o(oy2Var3)) {
                                        int size4 = arrayList.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < size4) {
                                                ?? r6 = arrayList.get(i6);
                                                if (((oy2) r6).d) {
                                                    oy2Var = r6;
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                oy2Var = null;
                                                break;
                                            }
                                        }
                                        oy2 oy2Var4 = oy2Var;
                                        if (oy2Var4 == null) {
                                            vy2Var.a();
                                        } else {
                                            sy2Var.e = oy2Var4.a;
                                        }
                                    } else {
                                        float f = mj1.a;
                                        float d = ((fa7) mh7.t(sj1Var, ov0.t)).d();
                                        yj yjVar = vy2Var.i;
                                        if (yjVar != null) {
                                            long e = yjVar.e(d, nk2.R(oy2Var3, sj1Var.l0, new ny2(i), true), true);
                                            if ((9223372034707292159L & e) != 9205357640488583168L) {
                                                oy2Var3.i = true;
                                                oy2 oy2Var5 = sy2Var.d;
                                                oy2Var5.getClass();
                                                oy2 oy2Var6 = oy2Var3;
                                                vy2Var.f(oy2Var5, oy2Var6, new ny2(i), e);
                                                oy2Var3 = oy2Var6;
                                                vy2Var.e(oy2Var3, new ny2(i), e);
                                                long j2 = oy2Var3.a;
                                                ty2 ty2Var3 = vy2Var.c;
                                                ty2 ty2Var4 = ty2Var3;
                                                if (ty2Var3 == null) {
                                                    ?? obj6 = new Object();
                                                    obj6.d = Long.MAX_VALUE;
                                                    vy2Var.c = obj6;
                                                    ty2Var4 = obj6;
                                                }
                                                ty2Var4.d = j2;
                                                vy2Var.f = ty2Var4;
                                            } else {
                                                sy2Var.f = true;
                                            }
                                        } else {
                                            i.i("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                } else {
                                    oy2 oy2Var7 = sy2Var.d;
                                    if (oy2Var7 != null) {
                                        long j3 = sy2Var.e;
                                        yj yjVar2 = vy2Var.i;
                                        if (yjVar2 != null) {
                                            vy2Var.b(oy2Var7, j3, yjVar2);
                                        } else {
                                            i.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        i.i("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                }
                            }
                            if (lp4Var == lp4.Final && sy2Var.f) {
                                if (oy2Var3.i) {
                                    oy2 oy2Var8 = sy2Var.d;
                                    if (oy2Var8 != null) {
                                        long j4 = sy2Var.e;
                                        yj yjVar3 = vy2Var.i;
                                        if (yjVar3 != null) {
                                            vy2Var.b(oy2Var8, j4, yjVar3);
                                            return;
                                        } else {
                                            i.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    }
                                    i.i("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                                sy2Var.f = false;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (jk2Var instanceof ry2) {
                        ry2 ry2Var = (ry2) jk2Var;
                        if (lp4Var == lp4.Final) {
                            int size5 = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    break;
                                } else if (((oy2) arrayList.get(i7)).i) {
                                    z = false;
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            int size6 = arrayList.size();
                            while (true) {
                                if (i2 >= size6) {
                                    break;
                                } else if (((oy2) arrayList.get(i2)).d) {
                                    if (!arrayList.isEmpty()) {
                                        if (z) {
                                            long S = nk2.S((oy2) tq0.K0(arrayList), sj1Var.l0, new ny2(i));
                                            oy2 oy2Var9 = ry2Var.d;
                                            oy2Var9.getClass();
                                            long d2 = mb4.d(S, nk2.S(oy2Var9, sj1Var.l0, new ny2(i)));
                                            oy2 oy2Var10 = ry2Var.d;
                                            if (oy2Var10 != null) {
                                                vy2.c(vy2Var, oy2Var10, ry2Var.e, d2, 8);
                                                return;
                                            } else {
                                                i.i("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    i2++;
                                }
                            }
                            vy2Var.a();
                            return;
                        }
                        return;
                    } else if (jk2Var instanceof ty2) {
                        ty2 ty2Var5 = (ty2) jk2Var;
                        if (lp4Var == lp4.Main) {
                            long j5 = ty2Var5.d;
                            int size7 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 < size7) {
                                    obj = arrayList.get(i8);
                                    if (cg2.y(((oy2) obj).a, j5)) {
                                        break;
                                    }
                                    i8++;
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            oy2 oy2Var11 = (oy2) obj;
                            if (oy2Var11 != null) {
                                boolean o = nk2.o(oy2Var11);
                                yi1 yi1Var = yi1.a;
                                if (o) {
                                    int size8 = arrayList.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < size8) {
                                            obj2 = arrayList.get(i9);
                                            if (((oy2) obj2).d) {
                                                break;
                                            }
                                            i9++;
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    oy2 oy2Var12 = (oy2) obj2;
                                    if (oy2Var12 == null) {
                                        if (!oy2Var11.i && nk2.o(oy2Var11)) {
                                            nk2.m(vy2Var.d(), oy2Var11, sj1Var.l0, new ny2(i), vy2Var.j, vy2Var.l);
                                            float a = ((fa7) mh7.t(sj1Var, ov0.t)).a();
                                            long e2 = vy2Var.d().e(nl2.n(a, a));
                                            ac1 ac1Var = (ac1) vy2Var.d().B;
                                            s77 s77Var = (s77) ac1Var.B;
                                            nu.l0(0, r6.length, null, s77Var.d);
                                            s77Var.e = 0;
                                            s77 s77Var2 = (s77) ac1Var.L;
                                            nu.l0(0, r6.length, null, s77Var2.d);
                                            s77Var2.e = 0;
                                            ac1Var.A = 0L;
                                            sj1Var.c1(new bj1(yj1.b(e2), true));
                                        } else {
                                            sj1Var.c1(yi1Var);
                                        }
                                        vy2Var.a();
                                        return;
                                    }
                                    ty2Var5.d = oy2Var12.a;
                                    return;
                                } else if (oy2Var11.i) {
                                    sj1Var.c1(yi1Var);
                                    return;
                                } else if (mb4.c(nk2.R(oy2Var11, sj1Var.l0, new ny2(i), true)) != RecyclerView.A1) {
                                    vy2Var.e(oy2Var11, new ny2(i), nk2.R(oy2Var11, sj1Var.l0, new ny2(i), false));
                                    oy2Var11.i = true;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        i.c();
                        return;
                    }
                }
                i.i("currentDragState should not be null");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38, types: [xi1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [xi1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, ui1] */
    public void O(kp4 kp4Var, lp4 lp4Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        ql2 ql2Var;
        boolean z;
        Object obj4;
        ti1 ti1Var;
        boolean z2 = true;
        this.t0 = true;
        if (this.p0 == null) {
            ql2 ql2Var2 = new ql2(this);
            R0(ql2Var2);
            this.p0 = ql2Var2;
        }
        if (this.n0) {
            int i = 0;
            if (this.y0 == null) {
                ui1 ui1Var = this.u0;
                ui1 ui1Var2 = ui1Var;
                if (ui1Var == null) {
                    ti1 ti1Var2 = ti1.NotInitialized;
                    ?? obj5 = new Object();
                    obj5.z = ti1Var2;
                    obj5.A = false;
                    this.u0 = obj5;
                    ui1Var2 = obj5;
                }
                this.y0 = ui1Var2;
            }
            pu puVar = this.y0;
            if (puVar != null) {
                if (puVar instanceof ui1) {
                    ui1 ui1Var3 = (ui1) puVar;
                    if (!kp4Var.a.isEmpty() && xm6.e(kp4Var, false)) {
                        rp4 rp4Var = (rp4) tq0.K0(kp4Var.a);
                        if (nj1.a[ui1Var3.z.ordinal()] == 1) {
                            if (!j1()) {
                                ti1Var = ti1.Yes;
                            } else {
                                ti1Var = ti1.No;
                            }
                        } else {
                            ti1Var = ui1Var3.z;
                        }
                        ui1Var3.z = ti1Var;
                        if (lp4Var == lp4.Initial && ti1Var == ti1.No) {
                            rp4Var.a();
                            ui1Var3.A = true;
                        }
                        if (lp4Var == lp4.Main) {
                            if (ti1Var == ti1.Yes) {
                                b1(this, rp4Var, rp4Var.a, 0L, 12);
                                return;
                            } else if (ui1Var3.A) {
                                i1(rp4Var, rp4Var, 0L);
                                h1(0L, rp4Var);
                                long j2 = rp4Var.a;
                                xi1 xi1Var = this.v0;
                                xi1 xi1Var2 = xi1Var;
                                if (xi1Var == null) {
                                    ?? obj6 = new Object();
                                    obj6.z = Long.MAX_VALUE;
                                    this.v0 = obj6;
                                    xi1Var2 = obj6;
                                }
                                xi1Var2.z = j2;
                                this.y0 = xi1Var2;
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                pl2 pl2Var = null;
                if (puVar instanceof wi1) {
                    wi1 wi1Var = (wi1) puVar;
                    if (lp4Var != lp4.Initial) {
                        List list = kp4Var.a;
                        int size = list.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj3 = list.get(i2);
                                if (cg2.y(((rp4) obj3).a, wi1Var.A)) {
                                    break;
                                }
                                i2++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        rp4 rp4Var2 = (rp4) obj3;
                        if (rp4Var2 == null) {
                            int size2 = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    obj4 = list.get(i3);
                                    if (((rp4) obj4).d) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            rp4Var2 = (rp4) obj4;
                            if (rp4Var2 == null) {
                                Z0();
                                return;
                            }
                            wi1Var.A = rp4Var2.a;
                        }
                        if (lp4Var == lp4.Main) {
                            if (!rp4Var2.b()) {
                                if (ve2.q(rp4Var2)) {
                                    int size3 = list.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size3) {
                                            break;
                                        }
                                        Object obj7 = list.get(i4);
                                        if (((rp4) obj7).d) {
                                            pl2Var = obj7;
                                            break;
                                        }
                                        i4++;
                                    }
                                    rp4 rp4Var3 = (rp4) pl2Var;
                                    if (rp4Var3 == null) {
                                        Z0();
                                    } else {
                                        wi1Var.A = rp4Var3.a;
                                    }
                                } else {
                                    float g = mj1.g((fa7) mh7.t(this, ov0.t), rp4Var2.i);
                                    yj yjVar = this.B0;
                                    if (yjVar != null) {
                                        long e = yjVar.e(g, ve2.K(rp4Var2, true), true);
                                        if ((9223372034707292159L & e) != 9205357640488583168L) {
                                            boolean f = f(rp4Var2);
                                            zx6 y = ve2.y(this, ql2.k0);
                                            if (y instanceof ql2) {
                                                ql2Var = (ql2) y;
                                            } else {
                                                ql2Var = null;
                                            }
                                            if (ql2Var != null) {
                                                pl2Var = ql2Var.j0;
                                            }
                                            if (pl2Var != null && pl2Var.f(rp4Var2)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (!f && z) {
                                                wi1Var.B = true;
                                            } else {
                                                rp4Var2.a();
                                                rp4 rp4Var4 = wi1Var.z;
                                                rp4Var4.getClass();
                                                i1(rp4Var4, rp4Var2, e);
                                                h1(e, rp4Var2);
                                                long j3 = rp4Var2.a;
                                                xi1 xi1Var3 = this.v0;
                                                xi1 xi1Var4 = xi1Var3;
                                                if (xi1Var3 == null) {
                                                    ?? obj8 = new Object();
                                                    obj8.z = Long.MAX_VALUE;
                                                    this.v0 = obj8;
                                                    xi1Var4 = obj8;
                                                }
                                                xi1Var4.z = j3;
                                                this.y0 = xi1Var4;
                                            }
                                        } else {
                                            wi1Var.B = true;
                                        }
                                    } else {
                                        i.i("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                rp4 rp4Var5 = wi1Var.z;
                                if (rp4Var5 != null) {
                                    long j4 = wi1Var.A;
                                    yj yjVar2 = this.B0;
                                    if (yjVar2 != null) {
                                        a1(rp4Var5, j4, yjVar2);
                                    } else {
                                        i.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    i.i("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                        }
                        if (lp4Var == lp4.Final && wi1Var.B) {
                            if (rp4Var2.b()) {
                                rp4 rp4Var6 = wi1Var.z;
                                if (rp4Var6 != null) {
                                    long j5 = wi1Var.A;
                                    yj yjVar3 = this.B0;
                                    if (yjVar3 != null) {
                                        a1(rp4Var6, j5, yjVar3);
                                        return;
                                    } else {
                                        i.i("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                }
                                i.i("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            wi1Var.B = false;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (puVar instanceof vi1) {
                    vi1 vi1Var = (vi1) puVar;
                    if (lp4Var == lp4.Final) {
                        List list2 = kp4Var.a;
                        int size4 = list2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size4) {
                                break;
                            } else if (((rp4) list2.get(i5)).b()) {
                                z2 = false;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        int size5 = list2.size();
                        while (true) {
                            if (i >= size5) {
                                break;
                            } else if (((rp4) list2.get(i)).d) {
                                if (!list2.isEmpty()) {
                                    if (z2) {
                                        long j6 = ((rp4) tq0.K0(list2)).c;
                                        rp4 rp4Var7 = vi1Var.z;
                                        rp4Var7.getClass();
                                        long d = mb4.d(j6, rp4Var7.c);
                                        rp4 rp4Var8 = vi1Var.z;
                                        if (rp4Var8 != null) {
                                            b1(this, rp4Var8, vi1Var.A, d, 8);
                                            return;
                                        } else {
                                            i.i("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                i++;
                            }
                        }
                        Z0();
                        return;
                    }
                    return;
                } else if (puVar instanceof xi1) {
                    xi1 xi1Var5 = (xi1) puVar;
                    if (lp4Var == lp4.Main) {
                        long j7 = xi1Var5.z;
                        List list3 = kp4Var.a;
                        int size6 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size6) {
                                obj = list3.get(i6);
                                if (cg2.y(((rp4) obj).a, j7)) {
                                    break;
                                }
                                i6++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        rp4 rp4Var9 = (rp4) obj;
                        if (rp4Var9 != null) {
                            boolean q = ve2.q(rp4Var9);
                            Object obj9 = yi1.a;
                            if (q) {
                                List list4 = kp4Var.a;
                                int size7 = list4.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size7) {
                                        obj2 = list4.get(i7);
                                        if (((rp4) obj2).d) {
                                            break;
                                        }
                                        i7++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                rp4 rp4Var10 = (rp4) obj2;
                                if (rp4Var10 == null) {
                                    if (!rp4Var9.b() && ve2.q(rp4Var9)) {
                                        ln2.q(g1(), rp4Var9, 0L);
                                        float a = ((fa7) mh7.t(this, ov0.t)).a();
                                        long e2 = g1().e(nl2.n(a, a));
                                        ac1 ac1Var = (ac1) g1().B;
                                        s77 s77Var = (s77) ac1Var.B;
                                        nu.l0(0, r6.length, null, s77Var.d);
                                        s77Var.e = 0;
                                        s77 s77Var2 = (s77) ac1Var.L;
                                        nu.l0(0, r6.length, null, s77Var2.d);
                                        s77Var2.e = 0;
                                        ac1Var.A = 0L;
                                        f1().c(new bj1(yj1.b(e2), false));
                                        this.t0 = false;
                                    } else {
                                        f1().c(obj9);
                                    }
                                    Z0();
                                    return;
                                }
                                xi1Var5.z = rp4Var10.a;
                                return;
                            } else if (rp4Var9.b()) {
                                f1().c(obj9);
                                return;
                            } else if (mb4.c(ve2.K(rp4Var9, true)) != RecyclerView.A1) {
                                h1(ve2.K(rp4Var9, false), rp4Var9);
                                rp4Var9.a();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } else {
                    i.c();
                    return;
                }
            }
            i.i("currentDragState should not be null");
        }
    }

    @Override // defpackage.pl2
    public final boolean R(oy2 oy2Var) {
        if (nk2.r(oy2Var) && this.n0) {
            return true;
        }
        return false;
    }

    public final void X0() {
        uj1 uj1Var = this.r0;
        if (uj1Var != null) {
            l14 l14Var = this.o0;
            if (l14Var != null) {
                l14Var.b(new tj1(uj1Var));
            }
            this.r0 = null;
        }
    }

    public abstract Object Y0(rj1 rj1Var, rj1 rj1Var2);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ui1] */
    public final void Z0() {
        ui1 ui1Var = this.u0;
        ui1 ui1Var2 = ui1Var;
        if (ui1Var == null) {
            ti1 ti1Var = ti1.NotInitialized;
            ?? obj = new Object();
            obj.z = ti1Var;
            obj.A = false;
            this.u0 = obj;
            ui1Var2 = obj;
        }
        ui1Var2.z = ti1.NotInitialized;
        ui1Var2.A = false;
        this.y0 = ui1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vi1] */
    public final void a1(rp4 rp4Var, long j, yj yjVar) {
        vi1 vi1Var = this.x0;
        vi1 vi1Var2 = vi1Var;
        if (vi1Var == null) {
            ?? obj = new Object();
            obj.z = null;
            obj.A = Long.MAX_VALUE;
            this.x0 = obj;
            vi1Var2 = obj;
        }
        vi1Var2.z = rp4Var;
        vi1Var2.A = j;
        yjVar.b = 0L;
        this.y0 = vi1Var2;
    }

    public final void c1(cj1 cj1Var) {
        if ((cj1Var instanceof aj1) && !this.s0) {
            this.s0 = true;
            k1();
        }
        f1().c(cj1Var);
    }

    public abstract void d1(long j);

    public abstract void e1(bj1 bj1Var);

    @Override // defpackage.pl2
    public final boolean f(rp4 rp4Var) {
        int i;
        if (ve2.o(rp4Var)) {
            return this.n0;
        }
        if (!ve2.q(rp4Var)) {
            if (this.B0 == null) {
                this.B0 = new yj(this.l0);
            }
            float d = ((fa7) mh7.t(this, ov0.t)).d();
            long K = ve2.K(rp4Var, false);
            yj yjVar = this.B0;
            if (yjVar != null) {
                if (!mb4.b(yjVar.e(d, K, false), 9205357640488583168L)) {
                    long e = mb4.e(yjVar.b, K);
                    double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (e & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (e >> 32))))) * 180.0f) / 3.141592653589793d;
                    jf4 jf4Var = (jf4) yjVar.c;
                    if (jf4Var == null) {
                        i = -1;
                    } else {
                        i = gw6.a[jf4Var.ordinal()];
                    }
                    if (i == 1 ? atan2 < 30.0d : !(i != 2 || atan2 <= 30.0d)) {
                        return true;
                    }
                }
            } else {
                i.i("Touch slop detector not initialized.");
                return false;
            }
        }
        return false;
    }

    public final lj0 f1() {
        q60 q60Var = this.q0;
        if (q60Var != null) {
            return q60Var;
        }
        i.i("Events channel not initialized.");
        return null;
    }

    public final u57 g1() {
        u57 u57Var = this.z0;
        if (u57Var != null) {
            return u57Var;
        }
        i.i("Velocity Tracker not initialized.");
        return null;
    }

    public final void h1(long j, rp4 rp4Var) {
        long a = l.O(this.A).a(0L);
        if (!mb4.b(this.A0, 9205357640488583168L) && !mb4.b(a, this.A0)) {
            this.D0 = mb4.e(this.D0, mb4.d(a, this.A0));
        }
        this.A0 = a;
        ln2.q(g1(), rp4Var, this.D0);
        f1().c(new zi1(j, false));
    }

    public final void i1(rp4 rp4Var, rp4 rp4Var2, long j) {
        if (this.z0 == null) {
            this.z0 = new u57();
        }
        ln2.q(g1(), rp4Var, 0L);
        long d = mb4.d(rp4Var2.c, j);
        this.D0 = 0L;
        if (((Boolean) this.m0.n(new xp4(rp4Var.i))).booleanValue()) {
            if (!this.s0) {
                if (this.q0 == null) {
                    this.q0 = n40.f(Preference.DEFAULT_ORDER, null, null, 6);
                }
                k1();
            }
            this.A0 = l.O(this).a(0L);
            f1().c(new aj1(d));
        }
    }

    public abstract boolean j1();

    public final void k1() {
        this.s0 = true;
        if (this.q0 == null) {
            this.q0 = n40.f(Preference.DEFAULT_ORDER, null, null, 6);
        }
        tq5.w(F0(), null, null, new rj1(this, null), 3);
    }

    public final void l1(mi2 mi2Var, boolean z, l14 l14Var, jf4 jf4Var, boolean z2) {
        this.m0 = mi2Var;
        boolean z3 = true;
        if (this.n0 != z) {
            this.n0 = z;
            if (!z) {
                X0();
                this.C0 = null;
            }
            z2 = true;
        }
        if (!b53.x(this.o0, l14Var)) {
            X0();
            this.o0 = l14Var;
        }
        if (this.l0 != jf4Var) {
            this.l0 = jf4Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.t0;
            yi1 yi1Var = yi1.a;
            if (z4) {
                Z0();
                if (this.s0) {
                    f1().c(yi1Var);
                }
                this.z0 = null;
            }
            vy2 vy2Var = this.C0;
            if (vy2Var != null) {
                vy2Var.a();
                sj1 sj1Var = vy2Var.a;
                if (sj1Var.s0) {
                    sj1Var.c1(yi1Var);
                }
                vy2Var.g = null;
                sb sbVar = vy2Var.k;
                sbVar.B = 0;
                ((n14) sbVar.L).b = 0;
            }
        }
    }

    @Override // defpackage.up4
    public final void q0() {
        if (this.t0) {
            Z0();
            if (this.s0) {
                f1().c(yi1.a);
            }
            this.z0 = null;
        }
        this.t0 = false;
    }
}
