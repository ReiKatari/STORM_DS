package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends defpackage.po2 implements defpackage.qn2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ a0(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.d0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.d0
            java.lang.String r2 = "bios7.bin"
            r3 = 65536(0x10000, double:3.2379E-319)
            java.lang.String r5 = "bios9.bin"
            java.lang.String r8 = "firmware.bin"
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            java.lang.String r14 = "r"
            java.lang.String r15 = ""
            r16 = 131072(0x20000, double:6.4758E-319)
            java.lang.String r6 = "file"
            r7 = 3
            r18 = -1
            r9 = 0
            r10 = 1
            r11 = 0
            jg7 r20 = defpackage.jg7.a
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L71d;
                case 1: goto L703;
                case 2: goto L6da;
                case 3: goto L69c;
                case 4: goto L683;
                case 5: goto L656;
                case 6: goto L643;
                case 7: goto L630;
                case 8: goto L620;
                case 9: goto L610;
                case 10: goto L582;
                case 11: goto L574;
                case 12: goto L566;
                case 13: goto L4e7;
                case 14: goto L41e;
                case 15: goto L405;
                case 16: goto L3cb;
                case 17: goto L3b1;
                case 18: goto L39a;
                case 19: goto L377;
                case 20: goto L354;
                case 21: goto L32d;
                case 22: goto L2fe;
                case 23: goto L2c7;
                case 24: goto L2bd;
                case 25: goto L2b3;
                case 26: goto L29a;
                case 27: goto L281;
                case 28: goto L9d;
                default: goto L26;
            }
        L26:
            r1 = r22
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            n65 r0 = (defpackage.n65) r0
            rs4 r2 = r0.f
            rs4 r3 = r0.g
            boolean r4 = r0.b()
            if (r4 == 0) goto L3b
            goto L98
        L3b:
            float r4 = r2.h()
            float r4 = r4 + r1
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 >= 0) goto L45
            r4 = r13
        L45:
            float r1 = r2.h()
            float r1 = r4 - r1
            rs4 r2 = r0.f
            r2.i(r4)
            float r2 = r0.a()
            float r4 = r3.h()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L61
            float r2 = r0.a()
            goto L92
        L61:
            float r2 = r0.a()
            float r4 = r3.h()
            float r2 = r2 / r4
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 - r12
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 >= 0) goto L74
            goto L75
        L74:
            r13 = r2
        L75:
            r2 = 1073741824(0x40000000, float:2.0)
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L7c
            r13 = r2
        L7c:
            double r4 = (double) r13
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r4, r6)
            float r2 = (float) r4
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r4
            float r13 = r13 - r2
            float r2 = r3.h()
            float r2 = r2 * r13
            float r3 = r3.h()
            float r2 = r2 + r3
        L92:
            rs4 r0 = r0.e
            r0.i(r2)
            r13 = r1
        L98:
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            return r0
        L9d:
            r1 = r22
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            e65 r0 = (defpackage.e65) r0
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        Lb2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc7
            java.lang.Object r3 = r2.next()
            r4 = r3
            lh0 r4 = (defpackage.lh0) r4
            boolean r4 = r4 instanceof defpackage.pk5
            if (r4 == 0) goto Lb2
            r0.add(r3)
            goto Lb2
        Lc7:
            r1.removeAll(r0)
            java.util.List r0 = defpackage.gt0.a1(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le2
            java.lang.Object r2 = r0.next()
            lh0 r2 = (defpackage.lh0) r2
            r1.add(r9, r2)
            goto Ld2
        Le2:
            int r0 = r1.size()
            java.util.ListIterator r0 = r1.listIterator(r0)
        Lea:
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto Lff
            java.lang.Object r2 = r0.previous()
            lh0 r2 = (defpackage.lh0) r2
            boolean r2 = r2 instanceof defpackage.qk5
            if (r2 == 0) goto Lea
            int r0 = r0.nextIndex()
            goto L100
        Lff:
            r0 = -1
        L100:
            if (r0 <= 0) goto L143
            java.lang.Object r2 = r1.get(r0)
            r2.getClass()
            qk5 r2 = (defpackage.qk5) r2
            r3 = r9
        L10c:
            if (r3 >= r0) goto L143
            java.lang.Object r4 = r1.remove(r9)
            lh0 r4 = (defpackage.lh0) r4
            boolean r5 = r4 instanceof defpackage.rk5
            if (r5 == 0) goto L11e
            r5 = r4
            rk5 r5 = (defpackage.rk5) r5
            tu0 r5 = r5.b
            goto L129
        L11e:
            boolean r5 = r4 instanceof defpackage.qk5
            if (r5 == 0) goto L128
            r5 = r4
            qk5 r5 = (defpackage.qk5) r5
            tu0 r5 = r5.a
            goto L129
        L128:
            r5 = r11
        L129:
            if (r5 == 0) goto L135
            tu0 r6 = r2.a
            cz1 r7 = new cz1
            r7.<init>(r10, r5)
            r6.a0(r7)
        L135:
            boolean r5 = r4 instanceof defpackage.al5
            if (r5 == 0) goto L140
            al5 r4 = (defpackage.al5) r4
            pq7 r4 = r4.a
            r4.a(r11)
        L140:
            int r3 = r3 + 1
            goto L10c
        L143:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
            r3 = r9
        L14d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L23c
            int r4 = r3 + 1
            java.lang.Object r5 = r2.next()
            lh0 r5 = (defpackage.lh0) r5
            boolean r6 = r5 instanceof defpackage.al5
            if (r6 == 0) goto L1c9
            r6 = r5
            al5 r6 = (defpackage.al5) r6
            pq7 r7 = r6.a
            java.lang.String r7 = r7.a
            java.util.List r6 = r6.b
            xf0 r8 = new xf0
            r8.<init>(r7)
            java.util.ArrayList r6 = defpackage.gt0.U0(r8, r6)
            java.util.Set r6 = defpackage.gt0.p1(r6)
            int r8 = r1.size()
            r12 = r4
        L17a:
            if (r12 >= r8) goto L1c7
            java.lang.Object r13 = r1.get(r12)
            lh0 r13 = (defpackage.lh0) r13
            boolean r14 = r13 instanceof defpackage.rk5
            if (r14 == 0) goto L194
            rk5 r13 = (defpackage.rk5) r13
            java.lang.String r13 = r13.a
            xf0 r14 = new xf0
            r14.<init>(r13)
            boolean r13 = r6.contains(r14)
            goto L1bd
        L194:
            boolean r14 = r13 instanceof defpackage.al5
            if (r14 == 0) goto L1ba
            al5 r13 = (defpackage.al5) r13
            pq7 r14 = r13.a
            java.lang.String r14 = r14.a
            java.util.List r13 = r13.b
            xf0 r15 = new xf0
            r15.<init>(r14)
            java.util.ArrayList r13 = defpackage.gt0.U0(r15, r13)
            java.util.Set r13 = defpackage.gt0.p1(r13)
            boolean r14 = defpackage.nb3.k(r7, r14)
            if (r14 != 0) goto L1bc
            boolean r13 = r6.equals(r13)
            if (r13 != 0) goto L1ba
            goto L1bc
        L1ba:
            r13 = r9
            goto L1bd
        L1bc:
            r13 = r10
        L1bd:
            if (r13 == 0) goto L1c4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            goto L1f5
        L1c4:
            int r12 = r12 + 1
            goto L17a
        L1c7:
            r6 = r11
            goto L1f5
        L1c9:
            boolean r6 = r5 instanceof defpackage.rk5
            if (r6 == 0) goto L1c7
            int r6 = r1.size()
            r7 = r4
        L1d2:
            if (r7 >= r6) goto L1c7
            java.lang.Object r8 = r1.get(r7)
            lh0 r8 = (defpackage.lh0) r8
            boolean r12 = r8 instanceof defpackage.rk5
            if (r12 == 0) goto L1f2
            rk5 r8 = (defpackage.rk5) r8
            java.lang.String r8 = r8.a
            r12 = r5
            rk5 r12 = (defpackage.rk5) r12
            java.lang.String r12 = r12.a
            boolean r8 = defpackage.nb3.k(r8, r12)
            if (r8 == 0) goto L1f2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L1f5
        L1f2:
            int r7 = r7 + 1
            goto L1d2
        L1f5:
            if (r6 == 0) goto L239
            int r6 = r6.intValue()
            java.lang.Object r6 = r1.get(r6)
            lh0 r6 = (defpackage.lh0) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r8 = " is pruned by "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "CXCP"
            android.util.Log.d(r8, r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            boolean r3 = r5 instanceof defpackage.rk5
            if (r3 == 0) goto L239
            boolean r3 = r6 instanceof defpackage.rk5
            if (r3 == 0) goto L239
            rk5 r6 = (defpackage.rk5) r6
            tu0 r3 = r6.b
            bg2 r6 = new bg2
            rk5 r5 = (defpackage.rk5) r5
            r7 = 21
            r6.<init>(r5, r7)
            r3.a0(r6)
        L239:
            r3 = r4
            goto L14d
        L23c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = defpackage.gt0.c1(r0)
            java.util.Iterator r0 = r0.iterator()
        L249:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L266
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r4 = r2.size()
            int r3 = r3 - r4
            java.lang.Object r3 = r1.remove(r3)
            r2.add(r3)
            goto L249
        L266:
            int r0 = r2.size()
        L26a:
            if (r9 >= r0) goto L280
            java.lang.Object r1 = r2.get(r9)
            int r9 = r9 + 1
            lh0 r1 = (defpackage.lh0) r1
            boolean r3 = r1 instanceof defpackage.al5
            if (r3 == 0) goto L26a
            al5 r1 = (defpackage.al5) r1
            pq7 r1 = r1.a
            r1.a(r11)
            goto L26a
        L280:
            return r20
        L281:
            r1 = r22
            fk3 r1 = (defpackage.fk3) r1
            r1.getClass()
            m20 r0 = (defpackage.m20) r0
            r0.getClass()
            as0 r2 = defpackage.to7.a(r0)
            i20 r3 = new i20
            r3.<init>(r0, r1, r11)
            defpackage.hv.L(r2, r11, r11, r3, r7)
            return r20
        L29a:
            r1 = r22
            fk3 r1 = (defpackage.fk3) r1
            r1.getClass()
            m20 r0 = (defpackage.m20) r0
            r0.getClass()
            as0 r2 = defpackage.to7.a(r0)
            i20 r3 = new i20
            r3.<init>(r1, r0, r11)
            defpackage.hv.L(r2, r11, r11, r3, r7)
            return r20
        L2b3:
            r1 = r22
            java.util.UUID r1 = (java.util.UUID) r1
            m20 r0 = (defpackage.m20) r0
            r0.g(r1)
            return r20
        L2bd:
            r1 = r22
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            uc3 r0 = (defpackage.uc3) r0
            r0.r(r1)
            return r20
        L2c7:
            r1 = r22
            java.util.Set r1 = (java.util.Set) r1
            r1.getClass()
            zb3 r0 = (defpackage.zb3) r0
            java.util.concurrent.locks.ReentrantLock r1 = r0.d
            r1.lock()
            java.util.LinkedHashMap r0 = r0.c     // Catch: java.lang.Throwable -> L2f9
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L2f9
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L2f9
            java.util.List r0 = defpackage.gt0.k1(r0)     // Catch: java.lang.Throwable -> L2f9
            r1.unlock()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L2ef
            return r20
        L2ef:
            java.lang.Object r0 = r0.next()
            ii4 r0 = (defpackage.ii4) r0
            r0.getClass()
            throw r11
        L2f9:
            r0 = move-exception
            r1.unlock()
            throw r0
        L2fe:
            r1 = r22
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            tp6 r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            r11 = r2
            kk6 r11 = (defpackage.kk6) r11
            if (r1 == 0) goto L319
            java.lang.Integer r1 = r11.a
            if (r1 == 0) goto L319
            r13 = r10
            goto L31a
        L319:
            r13 = r9
        L31a:
            r18 = 0
            r19 = 125(0x7d, float:1.75E-43)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            kk6 r1 = defpackage.kk6.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.h(r1)
            return r20
        L32d:
            r1 = r22
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            tp6 r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            r3 = r2
            kk6 r3 = (defpackage.kk6) r3
            float r10 = defpackage.gi2.p(r1, r13, r12)
            r11 = 63
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            kk6 r1 = defpackage.kk6.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.h(r1)
            return r20
        L354:
            r1 = r22
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = r1.booleanValue()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            tp6 r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            kk6 r2 = (defpackage.kk6) r2
            r9 = 0
            r10 = 95
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            kk6 r1 = defpackage.kk6.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.h(r1)
            return r20
        L377:
            r1 = r22
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            tp6 r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            kk6 r2 = (defpackage.kk6) r2
            r9 = 0
            r10 = 111(0x6f, float:1.56E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            kk6 r1 = defpackage.kk6.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.h(r1)
            return r20
        L39a:
            r1 = r22
            b63 r1 = (defpackage.b63) r1
            r1.getClass()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            r0.getClass()
            g63 r2 = defpackage.g63.a
            r0.g(r1, r2)
            tp6 r0 = r0.i
            r0.l(r11)
            return r20
        L3b1:
            r1 = r22
            b63 r1 = (defpackage.b63) r1
            r1.getClass()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            r0.getClass()
            tp6 r2 = r0.k
            r2.l(r11)
            tp6 r0 = r0.i
            r0.getClass()
            r0.m(r11, r1)
            return r20
        L3cb:
            r1 = r22
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            ft2 r0 = (defpackage.ft2) r0
            r0.getClass()
            java.util.Iterator r1 = r1.iterator()
        L3db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L404
            java.lang.Object r2 = r1.next()
            at2 r2 = (defpackage.at2) r2
            boolean r3 = r2 instanceof defpackage.us2
            if (r3 == 0) goto L3ef
            r0.e(r11)
            goto L3db
        L3ef:
            boolean r3 = r2 instanceof defpackage.ys2
            if (r3 == 0) goto L3db
            w61 r3 = r0.X
            a71 r4 = defpackage.a71.UNDISPATCHED
            a6 r5 = new a6
            ys2 r2 = (defpackage.ys2) r2
            r6 = 23
            r5.<init>(r2, r11, r6)
            defpackage.hv.L(r3, r11, r4, r5, r10)
            goto L3db
        L404:
            return r20
        L405:
            r1 = r22
            ki5 r1 = (defpackage.ki5) r1
            r1.getClass()
            ds2 r0 = (defpackage.ds2) r0
            r0.getClass()
            java.lang.String r0 = r1.f
            java.lang.String r1 = "https://github.com/ReiKatari/STORM_DS/releases/tag/"
            boolean r0 = defpackage.xs6.g0(r0, r1, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L41e:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            r2 = r0
            fb2 r2 = (defpackage.fb2) r2
            r2.getClass()
            java.lang.String r0 = "nand.bin"
            zl1 r1 = r1.f(r0)
            if (r1 != 0) goto L437
            bz0 r0 = defpackage.bz0.MISSING
            goto L4e6
        L437:
            boolean r0 = r1.l()     // Catch: java.lang.Throwable -> L440
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L440
            goto L447
        L440:
            r0 = move-exception
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        L447:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof defpackage.em5
            if (r4 == 0) goto L44e
            r0 = r3
        L44e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L45a
            bz0 r0 = defpackage.bz0.MISSING
            goto L4e6
        L45a:
            android.net.Uri r0 = r1.j()     // Catch: java.lang.Throwable -> L4d6
            java.lang.String r0 = r0.getScheme()     // Catch: java.lang.Throwable -> L4d6
            boolean r0 = defpackage.nb3.k(r0, r6)     // Catch: java.lang.Throwable -> L4d6
            r3 = 1048576(0x100000, double:5.180654E-318)
            if (r0 == 0) goto L4a7
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4d6
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L4d6
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L4d6
            if (r1 != 0) goto L478
            goto L479
        L478:
            r15 = r1
        L479:
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L4d6
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L4d6
            if (r1 == 0) goto L493
            boolean r1 = r0.canRead()     // Catch: java.lang.Throwable -> L4d6
            if (r1 == 0) goto L493
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L4d6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L493
            bz0 r0 = defpackage.bz0.PRESENT     // Catch: java.lang.Throwable -> L4d6
            goto L4dd
        L493:
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L4d6
            if (r1 == 0) goto L4a4
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L4d6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4a4
            bz0 r0 = defpackage.bz0.INVALID     // Catch: java.lang.Throwable -> L4d6
            goto L4dd
        L4a4:
            bz0 r0 = defpackage.bz0.MISSING     // Catch: java.lang.Throwable -> L4d6
            goto L4dd
        L4a7:
            android.content.Context r0 = r2.b     // Catch: java.lang.Throwable -> L4d6
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L4d6
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L4d6
            android.os.ParcelFileDescriptor r1 = r0.openFileDescriptor(r1, r14)     // Catch: java.lang.Throwable -> L4d6
            if (r1 == 0) goto L4d3
            long r5 = r1.getStatSize()     // Catch: java.lang.Throwable -> L4c2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L4c5
            bz0 r0 = defpackage.bz0.PRESENT     // Catch: java.lang.Throwable -> L4c2
            goto L4c7
        L4c2:
            r0 = move-exception
            r2 = r0
            goto L4cd
        L4c5:
            bz0 r0 = defpackage.bz0.INVALID     // Catch: java.lang.Throwable -> L4c2
        L4c7:
            r1.close()     // Catch: java.lang.Throwable -> L4d6
            if (r0 != 0) goto L4dd
            goto L4d3
        L4cd:
            throw r2     // Catch: java.lang.Throwable -> L4ce
        L4ce:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)     // Catch: java.lang.Throwable -> L4d6
            throw r0     // Catch: java.lang.Throwable -> L4d6
        L4d3:
            bz0 r0 = defpackage.bz0.MISSING     // Catch: java.lang.Throwable -> L4d6
            goto L4dd
        L4d6:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L4dd:
            bz0 r1 = defpackage.bz0.MISSING
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L4e4
            r0 = r1
        L4e4:
            bz0 r0 = (defpackage.bz0) r0
        L4e6:
            return r0
        L4e7:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            r0.getClass()
            zl1 r1 = r1.f(r8)
            if (r1 != 0) goto L4fd
            bz0 r0 = defpackage.bz0.MISSING
            goto L565
        L4fd:
            android.net.Uri r2 = r1.j()     // Catch: java.lang.Throwable -> L555
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.Throwable -> L555
            boolean r2 = defpackage.nb3.k(r2, r6)     // Catch: java.lang.Throwable -> L555
            if (r2 == 0) goto L521
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L555
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L555
            if (r1 != 0) goto L518
            goto L519
        L518:
            r15 = r1
        L519:
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L555
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L555
            goto L544
        L521:
            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L555
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L555
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L555
            android.content.res.AssetFileDescriptor r1 = r0.openAssetFileDescriptor(r1, r14)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L542
            long r2 = r1.getLength()     // Catch: java.lang.Throwable -> L53a
            r1.close()     // Catch: java.lang.Throwable -> L555
            r0 = r2
            goto L544
        L53a:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L53d
        L53d:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)     // Catch: java.lang.Throwable -> L555
            throw r0     // Catch: java.lang.Throwable -> L555
        L542:
            r0 = r18
        L544:
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L54b
            bz0 r0 = defpackage.bz0.MISSING     // Catch: java.lang.Throwable -> L555
            goto L55c
        L54b:
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L552
            bz0 r0 = defpackage.bz0.PRESENT     // Catch: java.lang.Throwable -> L555
            goto L55c
        L552:
            bz0 r0 = defpackage.bz0.INVALID     // Catch: java.lang.Throwable -> L555
            goto L55c
        L555:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L55c:
            bz0 r1 = defpackage.bz0.MISSING
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L563
            r0 = r1
        L563:
            bz0 r0 = (defpackage.bz0) r0
        L565:
            return r0
        L566:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            bz0 r0 = r0.d(r1, r5, r3)
            return r0
        L574:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            bz0 r0 = r0.d(r1, r2, r3)
            return r0
        L582:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            r0.getClass()
            zl1 r1 = r1.f(r8)
            if (r1 != 0) goto L598
            bz0 r0 = defpackage.bz0.MISSING
            goto L60f
        L598:
            android.net.Uri r2 = r1.j()     // Catch: java.lang.Throwable -> L5ff
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.Throwable -> L5ff
            boolean r2 = defpackage.nb3.k(r2, r6)     // Catch: java.lang.Throwable -> L5ff
            if (r2 == 0) goto L5bc
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L5ff
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L5ff
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L5ff
            if (r1 != 0) goto L5b3
            goto L5b4
        L5b3:
            r15 = r1
        L5b4:
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L5ff
            long r0 = r0.length()     // Catch: java.lang.Throwable -> L5ff
            goto L5df
        L5bc:
            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L5ff
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L5ff
            android.net.Uri r1 = r1.j()     // Catch: java.lang.Throwable -> L5ff
            android.content.res.AssetFileDescriptor r1 = r0.openAssetFileDescriptor(r1, r14)     // Catch: java.lang.Throwable -> L5ff
            if (r1 == 0) goto L5dd
            long r2 = r1.getLength()     // Catch: java.lang.Throwable -> L5d5
            r1.close()     // Catch: java.lang.Throwable -> L5ff
            r0 = r2
            goto L5df
        L5d5:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L5d8
        L5d8:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)     // Catch: java.lang.Throwable -> L5ff
            throw r0     // Catch: java.lang.Throwable -> L5ff
        L5dd:
            r0 = r18
        L5df:
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L5e6
            bz0 r0 = defpackage.bz0.MISSING     // Catch: java.lang.Throwable -> L5ff
            goto L606
        L5e6:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L5fc
            r2 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L5fc
            r2 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5f9
            goto L5fc
        L5f9:
            bz0 r0 = defpackage.bz0.INVALID     // Catch: java.lang.Throwable -> L5ff
            goto L606
        L5fc:
            bz0 r0 = defpackage.bz0.PRESENT     // Catch: java.lang.Throwable -> L5ff
            goto L606
        L5ff:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L606:
            bz0 r1 = defpackage.bz0.MISSING
            boolean r2 = r0 instanceof defpackage.em5
            if (r2 == 0) goto L60d
            r0 = r1
        L60d:
            bz0 r0 = (defpackage.bz0) r0
        L60f:
            return r0
        L610:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            r2 = 4096(0x1000, double:2.0237E-320)
            bz0 r0 = r0.d(r1, r5, r2)
            return r0
        L620:
            r1 = r22
            zl1 r1 = (defpackage.zl1) r1
            r1.getClass()
            fb2 r0 = (defpackage.fb2) r0
            r3 = 16384(0x4000, double:8.095E-320)
            bz0 r0 = r0.d(r1, r2, r3)
            return r0
        L630:
            r1 = r22
            java.lang.String r1 = (java.lang.String) r1
            sz1 r0 = (defpackage.sz1) r0
            r0.getClass()
            c70 r2 = new c70
            r3 = 6
            r2.<init>(r1, r3)
            r0.j1(r2)
            return r20
        L643:
            r1 = r22
            java.lang.String r1 = (java.lang.String) r1
            sz1 r0 = (defpackage.sz1) r0
            r0.getClass()
            c70 r2 = new c70
            r3 = 5
            r2.<init>(r1, r3)
            r0.j1(r2)
            return r20
        L656:
            r1 = r22
            me.magnum.melonds.domain.model.DSiWareTitle r1 = (me.magnum.melonds.domain.model.DSiWareTitle) r1
            r1.getClass()
            la1 r0 = (defpackage.la1) r0
            r0.getClass()
            r2 = 32
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r2, r3)
            byte[] r1 = r1.getIcon()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r2.copyPixelsFromBuffer(r1)
            kd6 r0 = r0.c
            ng6 r0 = (defpackage.ng6) r0
            jx5 r0 = r0.q()
            ix5 r1 = new ix5
            r1.<init>(r2, r0)
            return r1
        L683:
            r1 = r22
            me.magnum.melonds.domain.model.DSiWareTitle r1 = (me.magnum.melonds.domain.model.DSiWareTitle) r1
            r1.getClass()
            la1 r0 = (defpackage.la1) r0
            r0.getClass()
            as0 r2 = defpackage.to7.a(r0)
            ga1 r3 = new ga1
            r3.<init>(r0, r1, r11, r10)
            defpackage.hv.L(r2, r11, r11, r3, r7)
            return r20
        L69c:
            r15 = r22
            jo0 r15 = (defpackage.jo0) r15
            r15.getClass()
            r13 = r0
            aq0 r13 = (defpackage.aq0) r13
            r13.getClass()
            java.lang.String r0 = r15.a
            boolean r0 = defpackage.qs6.v0(r0)
            if (r0 != 0) goto L6d9
            java.lang.String r0 = r15.c
            boolean r0 = defpackage.qs6.v0(r0)
            if (r0 != 0) goto L6d9
            v46 r0 = r13.c
            java.lang.String r1 = "selected_folder"
            java.lang.Object r0 = r0.a(r1)
            r14 = r0
            dn0 r14 = (defpackage.dn0) r14
            if (r14 != 0) goto L6c7
            goto L6d9
        L6c7:
            as0 r0 = defpackage.to7.a(r13)
            b0 r12 = new b0
            r17 = 14
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            r1 = r16
            defpackage.hv.L(r0, r1, r1, r12, r7)
        L6d9:
            return r20
        L6da:
            r1 = r22
            n00 r1 = (defpackage.n00) r1
            me.magnum.melonds.ui.backgrounds.BackgroundsActivity r0 = (me.magnum.melonds.ui.backgrounds.BackgroundsActivity) r0
            int r2 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r0.getClass()
            if (r1 == 0) goto L6ea
            java.util.UUID r1 = r1.a
            goto L6eb
        L6ea:
            r1 = r11
        L6eb:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            if (r1 == 0) goto L6f6
            java.lang.String r11 = r1.toString()
        L6f6:
            java.lang.String r1 = "selected_background_id"
            r2.putExtra(r1, r11)
            r1 = -1
            r0.setResult(r1, r2)
            r0.finish()
            return r20
        L703:
            r1 = r22
            ta5 r1 = (defpackage.ta5) r1
            r1.getClass()
            nx1 r0 = (defpackage.nx1) r0
            r0.getClass()
            long r1 = r1.a
            java.lang.String r3 = "https://retroachievements.org/leaderboardinfo.php?i="
            java.lang.String r1 = defpackage.lb1.h(r1, r3)
            of6 r0 = r0.f
            r0.k(r1)
            return r20
        L71d:
            r1 = r22
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            h0 r0 = (defpackage.h0) r0
            u94 r2 = r0.z0
            if (r1 == 0) goto L730
            r0.b1()
            goto L7a5
        L730:
            r94 r1 = r0.m0
            if (r1 == 0) goto L79d
            java.lang.Object[] r1 = r2.c
            long[] r3 = r2.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L78c
            r5 = r9
        L73e:
            r12 = r3[r5]
            long r14 = ~r12
            r6 = 7
            long r14 = r14 << r6
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 == 0) goto L786
            int r6 = r5 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            r8 = 8
            int r6 = 8 - r6
            r14 = r9
        L759:
            if (r14 >= r6) goto L784
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L77a
            int r15 = r5 << 3
            int r15 = r15 + r14
            r15 = r1[r15]
            l25 r15 = (defpackage.l25) r15
            w61 r10 = r0.F0()
            r21 = r8
            f0 r8 = new f0
            r8.<init>(r0, r15, r11, r9)
            defpackage.hv.L(r10, r11, r11, r8, r7)
            goto L77c
        L77a:
            r21 = r8
        L77c:
            long r12 = r12 >> r21
            int r14 = r14 + 1
            r8 = r21
            r10 = 1
            goto L759
        L784:
            if (r6 != r8) goto L78c
        L786:
            if (r5 == r4) goto L78c
            int r5 = r5 + 1
            r10 = 1
            goto L73e
        L78c:
            l25 r1 = r0.B0
            if (r1 == 0) goto L79d
            w61 r3 = r0.F0()
            f0 r4 = new f0
            r5 = 1
            r4.<init>(r0, r1, r11, r5)
            defpackage.hv.L(r3, r11, r11, r4, r7)
        L79d:
            r2.a()
            r0.B0 = r11
            r0.c1()
        L7a5:
            return r20
    }
}
