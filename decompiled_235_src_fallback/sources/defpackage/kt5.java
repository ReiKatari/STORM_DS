package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kt5 implements defpackage.on2 {
    public final /* synthetic */ int A;

    public /* synthetic */ kt5(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ kt5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r20 = this;
            r0 = r20
            int r0 = r0.A
            r1 = 0
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            switch(r0) {
                case 0: goto L16e;
                case 1: goto L15f;
                case 2: goto L158;
                case 3: goto L14d;
                case 4: goto L14a;
                case 5: goto L147;
                case 6: goto L141;
                case 7: goto L13e;
                case 8: goto L138;
                case 9: goto L12f;
                case 10: goto La6;
                case 11: goto La3;
                case 12: goto La0;
                case 13: goto L9a;
                case 14: goto L94;
                case 15: goto L91;
                case 16: goto L8e;
                case 17: goto L78;
                case 18: goto L6e;
                case 19: goto L6b;
                case 20: goto L1b;
                case 21: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`"
            r0.<init>(r1)
            throw r0
        L15:
            xd5 r0 = new xd5
            r0.<init>(r6)
            return r0
        L1b:
            java.lang.Class<rt7> r0 = defpackage.rt7.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L2e
            x36 r1 = new x36     // Catch: java.lang.Throwable -> L6a
            e31 r2 = new e31     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0, r6)     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L6a
            goto L2f
        L2e:
            r1 = r5
        L2f:
            if (r1 == 0) goto L6a
            androidx.window.extensions.layout.WindowLayoutComponent r1 = r1.a()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6a
            e31 r2 = new e31     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0, r6)     // Catch: java.lang.Throwable -> L6a
            int r0 = defpackage.s82.a()     // Catch: java.lang.Throwable -> L6a
            r6 = 9
            if (r0 < r6) goto L4b
            r82 r0 = new r82     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6a
        L49:
            r5 = r0
            goto L6a
        L4b:
            if (r0 < r3) goto L53
            q82 r0 = new q82     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6a
            goto L49
        L53:
            r3 = 2
            if (r0 < r3) goto L5c
            p82 r0 = new p82     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6a
            goto L49
        L5c:
            if (r0 != r4) goto L64
            o82 r0 = new o82     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6a
            goto L49
        L64:
            m82 r0 = new m82     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            goto L49
        L6a:
            return r5
        L6b:
            es7 r0 = defpackage.fs7.a
            return r0
        L6e:
            tj7$b r0 = defpackage.tj7.Companion
            ru r0 = new ru
            fz3 r1 = defpackage.fz3.a
            r0.<init>(r1, r6)
            return r0
        L78:
            xe7 r7 = new xe7
            r18 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r7
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L91:
            m47 r0 = defpackage.yf1.a
            return r0
        L94:
            i93 r0 = new i93
            r0.<init>(r1)
            return r0
        L9a:
            i93 r0 = new i93
            r0.<init>(r1)
            return r0
        La0:
            s47 r0 = defpackage.ye7.a
            return r0
        La3:
            py0 r0 = defpackage.v07.a
            return r5
        La6:
            java.lang.String r0 = ""
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = "get"
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Exception -> Lca
            java.lang.reflect.Method r1 = r2.getMethod(r5, r1)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = "ro.build.backported_fixes.alias_bitset.long_list"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0}     // Catch: java.lang.Exception -> Lca
            java.lang.Object r1 = r1.invoke(r2, r5)     // Catch: java.lang.Exception -> Lca
            r1.getClass()     // Catch: java.lang.Exception -> Lca
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lca
            r0 = r1
        Lca:
            kw3 r1 = defpackage.hf.I()
            char[] r2 = new char[r4]
            r4 = 44
            r2[r6] = r4
            java.util.List r0 = defpackage.qs6.J0(r0, r2, r3)
            java.util.Iterator r0 = r0.iterator()
        Ldc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf4
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Lf4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> Lf4
            r1.add(r2)     // Catch: java.lang.NumberFormatException -> Lf4
            goto Ldc
        Lf4:
            kw3 r0 = defpackage.hf.A(r1)
            long[] r0 = defpackage.gt0.l1(r0)
            java.util.BitSet r0 = java.util.BitSet.valueOf(r0)
            int r1 = r0.size()
            if (r1 != 0) goto L109
            du1 r0 = defpackage.du1.A
            goto L12e
        L109:
            ad6 r2 = new ad6
            r2.<init>(r1)
        L10e:
            if (r6 < 0) goto L12a
            boolean r1 = r0.get(r6)
            if (r1 == 0) goto L11d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.add(r1)
        L11d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r1) goto L123
            goto L12a
        L123:
            int r6 = r6 + 1
            int r6 = r0.nextSetBit(r6)
            goto L10e
        L12a:
            ad6 r0 = defpackage.ii2.p(r2)
        L12e:
            return r0
        L12f:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L138:
            ye6 r0 = new ye6
            r0.<init>()
            return r0
        L13e:
            py0 r0 = defpackage.ra6.a
            return r5
        L141:
            s76 r0 = new s76
            r0.<init>(r6)
            return r0
        L147:
            nq6 r0 = defpackage.v56.a
            return r5
        L14a:
            nq6 r0 = defpackage.s46.a
            return r5
        L14d:
            p46 r0 = new p46
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.<init>(r1)
            return r0
        L158:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            return r0
        L15f:
            t52 r0 = defpackage.vv5.getEntries()
            l0 r0 = (defpackage.l0) r0
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L16e:
            ep3 r0 = new ep3
            r1 = 12
            r0.<init>(r1, r6)
            return r0
    }
}
