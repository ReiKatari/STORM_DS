package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz6 */
/* loaded from: classes.dex */
public abstract class hz6 {
    public static final do1 a = new do1(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0047 -> B:40:0x004a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.mw6 r5, boolean r6, defpackage.py4 r7, defpackage.d20 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.yy6
            if (r0 == 0) goto L13
            r0 = r8
            yy6 r0 = (defpackage.yy6) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            yy6 r0 = new yy6
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.Y
            py4 r6 = r0.X
            mw6 r7 = r0.R
            defpackage.oi2.Y(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L38:
            defpackage.oi2.Y(r8)
        L3b:
            r0.R = r5
            r0.X = r7
            r0.Y = r6
            r0.d0 = r3
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            oy4 r8 = (defpackage.oy4) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz6.a(mw6, boolean, py4, d20):java.lang.Object");
    }

    public static /* synthetic */ Object b(mw6 mw6Var, d20 d20Var, int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        return a(mw6Var, z, py4.Main, d20Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c A[LOOP:0: B:51:0x004a->B:52:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x003d -> B:50:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(mw6 mw6Var, s41 s41Var) {
        zy6 zy6Var;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (s41Var instanceof zy6) {
            zy6 zy6Var2 = (zy6) s41Var;
            int i4 = zy6Var2.Y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zy6Var2.Y = i4 - Integer.MIN_VALUE;
                zy6Var = zy6Var2;
                Object obj = zy6Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = zy6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        mw6 mw6Var2 = zy6Var.R;
                        oi2.Y(obj);
                        mw6Var = mw6Var2;
                        oy4 oy4Var = (oy4) obj;
                        List list = oy4Var.a;
                        size = list.size();
                        i2 = 0;
                        for (i3 = 0; i3 < size; i3++) {
                            ((vy4) list.get(i3)).a();
                        }
                        List list2 = oy4Var.a;
                        size2 = list2.size();
                        while (i2 < size2) {
                            if (((vy4) list2.get(i2)).d) {
                                zy6Var.R = mw6Var;
                                zy6Var.Y = 1;
                                obj = mw6Var.c(py4.Main, zy6Var);
                                mw6Var = mw6Var;
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                                oy4 oy4Var2 = (oy4) obj;
                                List list3 = oy4Var2.a;
                                size = list3.size();
                                i2 = 0;
                                while (i3 < size) {
                                }
                                List list22 = oy4Var2.a;
                                size2 = list22.size();
                                while (i2 < size2) {
                                }
                            } else {
                                i2++;
                            }
                        }
                        return jg7.a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                zy6Var.R = mw6Var;
                zy6Var.Y = 1;
                obj = mw6Var.c(py4.Main, zy6Var);
                mw6Var = mw6Var;
                if (obj == x61Var) {
                }
                oy4 oy4Var22 = (oy4) obj;
                List list32 = oy4Var22.a;
                size = list32.size();
                i2 = 0;
                while (i3 < size) {
                }
                List list222 = oy4Var22.a;
                size2 = list222.size();
                while (i2 < size2) {
                }
                return jg7.a;
            }
        }
        zy6Var = new s41(s41Var);
        Object obj2 = zy6Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = zy6Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [do1] */
    public static Object d(zy4 zy4Var, hk6 hk6Var, qn2 qn2Var, r41 r41Var, int i) {
        hk6 hk6Var2 = hk6Var;
        if ((i & 4) != 0) {
            hk6Var2 = a;
        }
        Object C = g04.C(new hn(zy4Var, (Object) null, (Object) null, hk6Var2, qn2Var, (r41) null, 11), r41Var);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return jg7.a;
    }

    public static boolean e(oy4 oy4Var, boolean z) {
        boolean n;
        List list = oy4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vy4 vy4Var = (vy4) list.get(i);
            if (z) {
                n = ej2.m(vy4Var);
            } else {
                n = ej2.n(vy4Var);
            }
            if (!n) {
                return false;
            }
        }
        return true;
    }

    public static ap6 f(w61 w61Var, rc3 rc3Var, eo2 eo2Var) {
        return hv.L(w61Var, null, a71.UNDISPATCHED, new vy5(rc3Var, eo2Var, (r41) null, 12), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c5  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14, types: [l61, java.lang.Object, r41] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v21, types: [qn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v8, types: [qn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dz6, s41, d20] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(mw6 mw6Var, w61 w61Var, j25 j25Var, qn2 qn2Var, qn2 qn2Var2, fo2 fo2Var, qn2 qn2Var3, d20 d20Var) {
        dz6 dz6Var;
        int i;
        j25 j25Var2;
        qn2 qn2Var4;
        qn2 qn2Var5;
        fo2 fo2Var2;
        mw6 mw6Var2;
        qn2 qn2Var6;
        w61 w61Var2;
        r41 r41Var;
        j25 j25Var3;
        vy4 vy4Var;
        qn2 qn2Var7;
        rc3 rc3Var;
        qn2 qn2Var8;
        vy4 vy4Var2;
        j25 j25Var4;
        mw6 mw6Var3;
        qn2 qn2Var9;
        qn2 qn2Var10;
        mw6 mw6Var4;
        w61 w61Var3;
        j25 j25Var5;
        qn2 qn2Var11;
        fo2 fo2Var3;
        r41 r41Var2;
        vy4 vy4Var3;
        r41 r41Var3;
        jg7 jg7Var;
        ap6 f;
        qn2 qn2Var12;
        qn2 qn2Var13;
        fo2 fo2Var4;
        qn2 qn2Var14;
        vy4 vy4Var4;
        rc3 rc3Var2;
        ?? r11;
        bz3 bz3Var;
        j25 j25Var6;
        w61 w61Var4;
        r41 r41Var4;
        ?? r112;
        vy4 vy4Var5;
        az3 az3Var;
        vy4 vy4Var6;
        j25 j25Var7;
        rc3 rc3Var3;
        vy4 vy4Var7;
        j25 j25Var8;
        mw6 mw6Var5;
        qn2 qn2Var15;
        rc3 rc3Var4;
        vy4 vy4Var8;
        qn2 qn2Var16;
        w61 w61Var5;
        qn2 qn2Var17;
        r41 r41Var5;
        vy4 vy4Var9;
        r41 r41Var6;
        ?? r113;
        bz3 bz3Var2;
        rc3 rc3Var5;
        w61 w61Var6;
        j25 j25Var9;
        r41 r41Var7;
        if (d20Var instanceof dz6) {
            dz6 dz6Var2 = (dz6) d20Var;
            int i2 = dz6Var2.j0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dz6Var2.j0 = i2 - Integer.MIN_VALUE;
                dz6Var = dz6Var2;
                Object obj = dz6Var.i0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = dz6Var.j0;
                az3 az3Var2 = az3.a;
                do1 do1Var = a;
                jg7 jg7Var2 = jg7.a;
                switch (i) {
                    case 0:
                        oi2.Y(obj);
                        dz6Var.R = mw6Var;
                        dz6Var.X = w61Var;
                        j25Var2 = j25Var;
                        dz6Var.Y = j25Var2;
                        qn2Var4 = qn2Var;
                        dz6Var.Z = qn2Var4;
                        qn2Var5 = qn2Var2;
                        dz6Var.d0 = qn2Var5;
                        fo2Var2 = fo2Var;
                        dz6Var.e0 = fo2Var2;
                        dz6Var.f0 = qn2Var3;
                        dz6Var.j0 = 1;
                        Object b = b(mw6Var, dz6Var, 3);
                        if (b != x61Var) {
                            mw6Var2 = mw6Var;
                            qn2Var6 = qn2Var3;
                            w61Var2 = w61Var;
                            obj = b;
                            vy4 vy4Var10 = (vy4) obj;
                            vy4Var10.a();
                            ap6 L = hv.L(w61Var2, null, a71.UNDISPATCHED, new bz6(j25Var2, null, 1), 1);
                            if (fo2Var2 == do1Var) {
                                j25 j25Var10 = j25Var2;
                                ez6 ez6Var = new ez6(fo2Var2, j25Var10, vy4Var10, null, 0);
                                j25Var3 = j25Var10;
                                vy4Var = vy4Var10;
                                r41Var = null;
                                f(w61Var2, L, ez6Var);
                            } else {
                                r41Var = null;
                                j25Var3 = j25Var2;
                                vy4Var = vy4Var10;
                            }
                            if (qn2Var5 != null) {
                                dz6Var.R = mw6Var2;
                                dz6Var.X = w61Var2;
                                dz6Var.Y = j25Var3;
                                dz6Var.Z = qn2Var4;
                                dz6Var.d0 = qn2Var5;
                                dz6Var.e0 = fo2Var2;
                                dz6Var.f0 = qn2Var6;
                                dz6Var.g0 = L;
                                dz6Var.j0 = 2;
                                Object i3 = i(mw6Var2, py4.Main, dz6Var);
                                if (i3 != x61Var) {
                                    qn2Var10 = qn2Var6;
                                    rc3Var = L;
                                    mw6Var4 = mw6Var2;
                                    w61Var3 = w61Var2;
                                    j25Var5 = j25Var3;
                                    obj = i3;
                                    fo2 fo2Var5 = fo2Var2;
                                    qn2Var11 = qn2Var4;
                                    fo2Var3 = fo2Var5;
                                    r41Var2 = r41Var;
                                    vy4Var3 = (vy4) obj;
                                    r41Var3 = r41Var2;
                                    if (vy4Var3 == null) {
                                        jg7Var = jg7Var2;
                                        f = f(w61Var3, rc3Var, new az6(j25Var5, r41Var3, 3));
                                    } else {
                                        jg7Var = jg7Var2;
                                        vy4Var3.a();
                                        f = f(w61Var3, rc3Var, new az6(j25Var5, r41Var3, 4));
                                    }
                                    if (vy4Var3 != null) {
                                        if (qn2Var11 == null) {
                                            if (qn2Var10 != null) {
                                                qn2Var10.g(new jk4(vy4Var3.c));
                                                return jg7Var;
                                            }
                                        } else {
                                            dz6Var.R = mw6Var4;
                                            dz6Var.X = w61Var3;
                                            dz6Var.Y = j25Var5;
                                            dz6Var.Z = qn2Var11;
                                            dz6Var.d0 = qn2Var5;
                                            dz6Var.e0 = fo2Var3;
                                            dz6Var.f0 = qn2Var10;
                                            dz6Var.g0 = vy4Var3;
                                            dz6Var.h0 = f;
                                            dz6Var.j0 = 5;
                                            ap6 ap6Var = f;
                                            Object l = mw6Var4.l(mw6Var4.f().a(), new la6(vy4Var3, r41Var3), dz6Var);
                                            if (l != x61Var) {
                                                qn2Var12 = qn2Var11;
                                                qn2Var13 = qn2Var5;
                                                fo2Var4 = fo2Var3;
                                                qn2Var14 = qn2Var10;
                                                vy4Var4 = vy4Var3;
                                                obj = l;
                                                rc3Var2 = ap6Var;
                                                r112 = r41Var3;
                                                vy4Var5 = (vy4) obj;
                                                if (vy4Var5 != null) {
                                                    if (qn2Var14 != null) {
                                                        qn2Var14.g(new jk4(vy4Var4.c));
                                                        return jg7Var;
                                                    }
                                                } else {
                                                    az3Var = az3Var2;
                                                    ap6 L2 = hv.L(w61Var3, r112, a71.UNDISPATCHED, new bf4(rc3Var2, j25Var5, r112, 22), 1);
                                                    if (fo2Var4 != do1Var) {
                                                        j25 j25Var11 = j25Var5;
                                                        ez6 ez6Var2 = new ez6(fo2Var4, j25Var11, vy4Var5, r112, 1);
                                                        j25Var7 = j25Var11;
                                                        vy4Var6 = vy4Var5;
                                                        f(w61Var3, L2, ez6Var2);
                                                    } else {
                                                        vy4Var6 = vy4Var5;
                                                        j25Var7 = j25Var5;
                                                    }
                                                    if (qn2Var13 == null) {
                                                        dz6Var.R = w61Var3;
                                                        dz6Var.X = j25Var7;
                                                        dz6Var.Y = qn2Var12;
                                                        dz6Var.Z = qn2Var14;
                                                        dz6Var.d0 = L2;
                                                        dz6Var.e0 = vy4Var4;
                                                        dz6Var.f0 = r112;
                                                        dz6Var.g0 = r112;
                                                        dz6Var.h0 = r112;
                                                        dz6Var.j0 = 6;
                                                        obj = i(mw6Var4, py4.Main, dz6Var);
                                                        if (obj != x61Var) {
                                                            rc3Var4 = L2;
                                                            vy4Var8 = vy4Var4;
                                                            qn2Var16 = qn2Var14;
                                                            w61Var5 = w61Var3;
                                                            qn2Var17 = qn2Var12;
                                                            r41Var5 = r112;
                                                            vy4Var9 = (vy4) obj;
                                                            r41Var6 = r41Var5;
                                                            if (vy4Var9 != null) {
                                                                vy4Var9.a();
                                                                f(w61Var5, rc3Var4, new az6(j25Var7, r41Var6, 5));
                                                                qn2Var17.g(new jk4(vy4Var9.c));
                                                                return jg7Var;
                                                            }
                                                            f(w61Var5, rc3Var4, new az6(j25Var7, r41Var6, 6));
                                                            if (qn2Var16 != null) {
                                                                qn2Var16.g(new jk4(vy4Var8.c));
                                                                return jg7Var;
                                                            }
                                                        }
                                                    } else {
                                                        dz6Var.R = mw6Var4;
                                                        dz6Var.X = w61Var3;
                                                        dz6Var.Y = j25Var7;
                                                        dz6Var.Z = qn2Var12;
                                                        dz6Var.d0 = qn2Var13;
                                                        dz6Var.e0 = qn2Var14;
                                                        dz6Var.f0 = L2;
                                                        dz6Var.g0 = vy4Var4;
                                                        dz6Var.h0 = vy4Var6;
                                                        dz6Var.j0 = 7;
                                                        Object h = h(mw6Var4, py4.Main, dz6Var);
                                                        if (h != x61Var) {
                                                            rc3Var3 = L2;
                                                            vy4Var7 = vy4Var6;
                                                            obj = h;
                                                            j25Var8 = j25Var7;
                                                            mw6Var5 = mw6Var4;
                                                            qn2Var15 = qn2Var12;
                                                            r113 = r112;
                                                            bz3Var2 = (bz3) obj;
                                                            if (!nb3.k(bz3Var2, az3Var)) {
                                                                qn2Var13.g(new jk4(vy4Var7.c));
                                                                dz6Var.R = w61Var3;
                                                                dz6Var.X = j25Var8;
                                                                dz6Var.Y = rc3Var3;
                                                                dz6Var.Z = r113;
                                                                dz6Var.d0 = r113;
                                                                dz6Var.e0 = r113;
                                                                dz6Var.f0 = r113;
                                                                dz6Var.g0 = r113;
                                                                dz6Var.h0 = r113;
                                                                dz6Var.j0 = 8;
                                                                if (c(mw6Var5, dz6Var) != x61Var) {
                                                                    rc3Var5 = rc3Var3;
                                                                    w61Var6 = w61Var3;
                                                                    j25Var9 = j25Var8;
                                                                    r41Var7 = r113;
                                                                    f(w61Var6, rc3Var5, new az6(j25Var9, r41Var7, 7));
                                                                    return jg7Var;
                                                                }
                                                            } else {
                                                                if (bz3Var2 instanceof zy3) {
                                                                    vy4Var9 = ((zy3) bz3Var2).a;
                                                                    vy4Var8 = vy4Var4;
                                                                    qn2Var16 = qn2Var14;
                                                                    rc3Var4 = rc3Var3;
                                                                    w61Var5 = w61Var3;
                                                                } else if (bz3Var2 instanceof yy3) {
                                                                    vy4Var8 = vy4Var4;
                                                                    qn2Var16 = qn2Var14;
                                                                    rc3Var4 = rc3Var3;
                                                                    w61Var5 = w61Var3;
                                                                    vy4Var9 = r113;
                                                                } else {
                                                                    i.d();
                                                                    return null;
                                                                }
                                                                qn2Var17 = qn2Var15;
                                                                j25Var7 = j25Var8;
                                                                r41Var6 = r113;
                                                                if (vy4Var9 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return jg7Var;
                                }
                            } else {
                                dz6Var.R = mw6Var2;
                                dz6Var.X = w61Var2;
                                dz6Var.Y = j25Var3;
                                dz6Var.Z = qn2Var4;
                                dz6Var.d0 = qn2Var5;
                                dz6Var.e0 = fo2Var2;
                                dz6Var.f0 = qn2Var6;
                                dz6Var.g0 = vy4Var;
                                dz6Var.h0 = L;
                                dz6Var.j0 = 3;
                                Object h2 = h(mw6Var2, py4.Main, dz6Var);
                                if (h2 != x61Var) {
                                    qn2 qn2Var18 = qn2Var5;
                                    qn2Var7 = qn2Var6;
                                    rc3Var = L;
                                    qn2Var8 = qn2Var4;
                                    vy4Var2 = vy4Var;
                                    j25Var4 = j25Var3;
                                    obj = h2;
                                    mw6Var3 = mw6Var2;
                                    qn2Var9 = qn2Var18;
                                    r11 = r41Var;
                                    bz3Var = (bz3) obj;
                                    if (!nb3.k(bz3Var, az3Var2)) {
                                        qn2Var9.g(new jk4(vy4Var2.c));
                                        dz6Var.R = w61Var2;
                                        dz6Var.X = j25Var4;
                                        dz6Var.Y = rc3Var;
                                        dz6Var.Z = r11;
                                        dz6Var.d0 = r11;
                                        dz6Var.e0 = r11;
                                        dz6Var.f0 = r11;
                                        dz6Var.g0 = r11;
                                        dz6Var.h0 = r11;
                                        dz6Var.j0 = 4;
                                        if (c(mw6Var3, dz6Var) != x61Var) {
                                            j25Var6 = j25Var4;
                                            w61Var4 = w61Var2;
                                            r41Var4 = r11;
                                            f(w61Var4, rc3Var, new az6(j25Var6, r41Var4, 2));
                                            return jg7Var2;
                                        }
                                    } else {
                                        if (bz3Var instanceof zy3) {
                                            vy4Var3 = ((zy3) bz3Var).a;
                                        } else if (bz3Var instanceof yy3) {
                                            vy4Var3 = r11;
                                        } else {
                                            i.d();
                                            return null;
                                        }
                                        w61 w61Var7 = w61Var2;
                                        j25Var5 = j25Var4;
                                        qn2Var10 = qn2Var7;
                                        qn2Var5 = qn2Var9;
                                        w61Var3 = w61Var7;
                                        fo2Var3 = fo2Var2;
                                        qn2Var11 = qn2Var8;
                                        mw6Var4 = mw6Var3;
                                        r41Var3 = r11;
                                        if (vy4Var3 == null) {
                                        }
                                        if (vy4Var3 != null) {
                                        }
                                        return jg7Var;
                                    }
                                }
                            }
                        }
                        return x61Var;
                    case 1:
                        qn2Var6 = (qn2) dz6Var.f0;
                        qn2 qn2Var19 = dz6Var.Z;
                        j25 j25Var12 = (j25) dz6Var.Y;
                        w61Var2 = (w61) dz6Var.X;
                        mw6Var2 = (mw6) dz6Var.R;
                        oi2.Y(obj);
                        fo2Var2 = (fo2) dz6Var.e0;
                        j25Var2 = j25Var12;
                        qn2Var5 = (qn2) dz6Var.d0;
                        qn2Var4 = qn2Var19;
                        vy4 vy4Var102 = (vy4) obj;
                        vy4Var102.a();
                        ap6 L3 = hv.L(w61Var2, null, a71.UNDISPATCHED, new bz6(j25Var2, null, 1), 1);
                        if (fo2Var2 == do1Var) {
                        }
                        if (qn2Var5 != null) {
                        }
                        return x61Var;
                    case 2:
                        rc3Var = (rc3) dz6Var.g0;
                        qn2Var10 = (qn2) dz6Var.f0;
                        fo2Var3 = (fo2) dz6Var.e0;
                        qn2Var5 = (qn2) dz6Var.d0;
                        qn2Var11 = dz6Var.Z;
                        j25Var5 = (j25) dz6Var.Y;
                        w61Var3 = (w61) dz6Var.X;
                        mw6Var4 = (mw6) dz6Var.R;
                        oi2.Y(obj);
                        r41Var2 = null;
                        vy4Var3 = (vy4) obj;
                        r41Var3 = r41Var2;
                        if (vy4Var3 == null) {
                        }
                        if (vy4Var3 != null) {
                        }
                        return jg7Var;
                    case 3:
                        rc3Var = (rc3) dz6Var.h0;
                        qn2 qn2Var20 = (qn2) dz6Var.f0;
                        qn2Var8 = dz6Var.Z;
                        oi2.Y(obj);
                        vy4Var2 = (vy4) dz6Var.g0;
                        j25Var4 = (j25) dz6Var.Y;
                        w61Var2 = (w61) dz6Var.X;
                        qn2Var9 = (qn2) dz6Var.d0;
                        fo2Var2 = (fo2) dz6Var.e0;
                        qn2Var7 = qn2Var20;
                        mw6Var3 = (mw6) dz6Var.R;
                        r11 = 0;
                        bz3Var = (bz3) obj;
                        if (!nb3.k(bz3Var, az3Var2)) {
                        }
                        break;
                    case 4:
                        rc3Var = (rc3) dz6Var.Y;
                        j25Var6 = (j25) dz6Var.X;
                        w61Var4 = (w61) dz6Var.R;
                        oi2.Y(obj);
                        r41Var4 = null;
                        f(w61Var4, rc3Var, new az6(j25Var6, r41Var4, 2));
                        return jg7Var2;
                    case 5:
                        rc3Var2 = (rc3) dz6Var.h0;
                        vy4Var4 = (vy4) dz6Var.g0;
                        qn2Var14 = (qn2) dz6Var.f0;
                        fo2Var4 = (fo2) dz6Var.e0;
                        qn2 qn2Var21 = dz6Var.Z;
                        mw6Var4 = (mw6) dz6Var.R;
                        oi2.Y(obj);
                        jg7Var = jg7Var2;
                        qn2Var12 = qn2Var21;
                        w61Var3 = (w61) dz6Var.X;
                        qn2Var13 = (qn2) dz6Var.d0;
                        j25Var5 = (j25) dz6Var.Y;
                        r112 = 0;
                        vy4Var5 = (vy4) obj;
                        if (vy4Var5 != null) {
                        }
                        break;
                    case 6:
                        vy4Var8 = (vy4) dz6Var.e0;
                        rc3Var4 = (rc3) dz6Var.d0;
                        qn2Var16 = dz6Var.Z;
                        qn2Var17 = (qn2) dz6Var.Y;
                        j25Var7 = (j25) dz6Var.X;
                        w61Var5 = (w61) dz6Var.R;
                        oi2.Y(obj);
                        jg7Var = jg7Var2;
                        r41Var5 = null;
                        vy4Var9 = (vy4) obj;
                        r41Var6 = r41Var5;
                        if (vy4Var9 != null) {
                        }
                        break;
                    case 7:
                        vy4Var7 = (vy4) dz6Var.h0;
                        vy4Var4 = (vy4) dz6Var.g0;
                        rc3Var3 = (rc3) dz6Var.f0;
                        qn2 qn2Var22 = (qn2) dz6Var.e0;
                        qn2Var15 = dz6Var.Z;
                        j25Var8 = (j25) dz6Var.Y;
                        mw6Var5 = (mw6) dz6Var.R;
                        oi2.Y(obj);
                        w61Var3 = (w61) dz6Var.X;
                        qn2Var14 = qn2Var22;
                        qn2Var13 = (qn2) dz6Var.d0;
                        az3Var = az3Var2;
                        jg7Var = jg7Var2;
                        r113 = 0;
                        bz3Var2 = (bz3) obj;
                        if (!nb3.k(bz3Var2, az3Var)) {
                        }
                        break;
                    case 8:
                        rc3Var5 = (rc3) dz6Var.Y;
                        j25Var9 = (j25) dz6Var.X;
                        w61Var6 = (w61) dz6Var.R;
                        oi2.Y(obj);
                        jg7Var = jg7Var2;
                        r41Var7 = null;
                        f(w61Var6, rc3Var5, new az6(j25Var9, r41Var7, 7));
                        return jg7Var;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dz6Var = new s41(d20Var);
        Object obj2 = dz6Var.i0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = dz6Var.j0;
        az3 az3Var22 = az3.a;
        do1 do1Var2 = a;
        jg7 jg7Var22 = jg7.a;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0030  */
    /* JADX WARN: Type inference failed for: r10v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(mw6 mw6Var, py4 py4Var, s41 s41Var) {
        fz6 fz6Var;
        int i;
        dh5 dh5Var;
        try {
            if (s41Var instanceof fz6) {
                fz6 fz6Var2 = (fz6) s41Var;
                int i2 = fz6Var2.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fz6Var2.Y = i2 - Integer.MIN_VALUE;
                    fz6Var = fz6Var2;
                    Object obj = fz6Var.X;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = fz6Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            dh5Var = fz6Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ?? obj3 = new Object();
                        obj3.A = yy3.a;
                        long b = mw6Var.f().b();
                        eo2 tj2Var = new tj2(py4Var, obj3, null, 3);
                        fz6Var.R = obj3;
                        fz6Var.Y = 1;
                        if (mw6Var.k(b, tj2Var, fz6Var) == obj2) {
                            return obj2;
                        }
                        dh5Var = obj3;
                    }
                    return dh5Var.A;
                }
            }
            if (i == 0) {
            }
            return dh5Var.A;
        } catch (qy4 unused) {
            return az3.a;
        }
        fz6Var = new s41(s41Var);
        Object obj4 = fz6Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = fz6Var.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ad, code lost:
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00ad -> B:67:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(mw6 mw6Var, py4 py4Var, d20 d20Var) {
        gz6 gz6Var;
        int i;
        mw6 mw6Var2;
        gz6 gz6Var2;
        py4 py4Var2;
        mw6 mw6Var3;
        py4 py4Var3;
        gz6 gz6Var3;
        int size;
        int i2;
        Object c;
        if (d20Var instanceof gz6) {
            gz6 gz6Var4 = (gz6) d20Var;
            int i3 = gz6Var4.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gz6Var4.Z = i3 - Integer.MIN_VALUE;
                gz6Var = gz6Var4;
                Object obj = gz6Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = gz6Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            py4Var3 = gz6Var.X;
                            mw6Var3 = gz6Var.R;
                            oi2.Y(obj);
                            gz6 gz6Var5 = gz6Var;
                            py4 py4Var4 = py4Var3;
                            gz6Var2 = gz6Var5;
                            py4Var2 = py4Var4;
                            List list = ((oy4) obj).a;
                            int size2 = list.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                if (((vy4) list.get(i4)).c()) {
                                    break;
                                }
                            }
                            mw6Var2 = mw6Var3;
                            gz6Var2.R = mw6Var2;
                            gz6Var2.X = py4Var2;
                            gz6Var2.Z = 1;
                            c = mw6Var2.c(py4Var2, gz6Var2);
                            if (c != x61Var) {
                                mw6Var3 = mw6Var2;
                                obj = c;
                                gz6 gz6Var6 = gz6Var2;
                                py4Var3 = py4Var2;
                                gz6Var3 = gz6Var6;
                                List list2 = ((oy4) obj).a;
                                size = list2.size();
                                for (i2 = 0; i2 < size; i2++) {
                                    if (!ej2.o((vy4) list2.get(i2))) {
                                        int size3 = list2.size();
                                        for (int i5 = 0; i5 < size3; i5++) {
                                            vy4 vy4Var = (vy4) list2.get(i5);
                                            if (vy4Var.c() || ej2.K(vy4Var, mw6Var3.Y.u0, mw6Var3.d())) {
                                                break;
                                            }
                                        }
                                        py4 py4Var5 = py4.Final;
                                        gz6Var3.R = mw6Var3;
                                        gz6Var3.X = py4Var3;
                                        gz6Var3.Z = 2;
                                        obj = mw6Var3.c(py4Var5, gz6Var3);
                                        gz6Var5 = gz6Var3;
                                    }
                                }
                                return list2.get(0);
                            }
                            return x61Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    py4Var3 = gz6Var.X;
                    mw6Var3 = gz6Var.R;
                    oi2.Y(obj);
                    gz6Var3 = gz6Var;
                    List list22 = ((oy4) obj).a;
                    size = list22.size();
                    while (i2 < size) {
                    }
                    return list22.get(0);
                }
                oi2.Y(obj);
                mw6Var2 = mw6Var;
                gz6Var2 = gz6Var;
                py4Var2 = py4Var;
                gz6Var2.R = mw6Var2;
                gz6Var2.X = py4Var2;
                gz6Var2.Z = 1;
                c = mw6Var2.c(py4Var2, gz6Var2);
                if (c != x61Var) {
                }
                return x61Var;
            }
        }
        gz6Var = new s41(d20Var);
        Object obj2 = gz6Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gz6Var.Z;
        if (i == 0) {
        }
    }
}
