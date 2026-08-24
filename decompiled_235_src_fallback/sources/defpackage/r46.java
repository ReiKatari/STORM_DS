package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r46  reason: default package */
/* loaded from: classes.dex */
public final class r46 implements defpackage.q46 {
    public final defpackage.qn2 A;
    public final defpackage.ja4 B;
    public defpackage.ja4 L;

    public r46(java.util.Map r3, defpackage.qn2 r4) {
            r2 = this;
            r2.<init>()
            r2.A = r4
            if (r3 == 0) goto L37
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Le
            goto L37
        Le:
            ja4 r4 = new ja4
            int r0 = r3.size()
            r4.<init>(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.m(r1, r0)
            goto L1f
        L37:
            r4 = 0
        L38:
            r2.B = r4
            return
    }

    @Override // defpackage.q46
    public final defpackage.m44 a(java.lang.String r4, defpackage.on2 r5) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3c
            char r2 = r4.charAt(r1)
            boolean r2 = defpackage.g04.J(r2)
            if (r2 != 0) goto L39
            ja4 r0 = r3.L
            if (r0 != 0) goto L1e
            long[] r0 = defpackage.b66.a
            ja4 r0 = new ja4
            r0.<init>()
            r3.L = r0
        L1e:
            java.lang.Object r3 = r0.g(r4)
            if (r3 != 0) goto L2c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m(r4, r3)
        L2c:
            java.util.List r3 = (java.util.List) r3
            r3.add(r5)
            m44 r3 = new m44
            r1 = 13
            r3.<init>(r0, r4, r5, r1)
            return r3
        L39:
            int r1 = r1 + 1
            goto L5
        L3c:
            java.lang.String r3 = "Registered key is empty or blank"
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    @Override // defpackage.q46
    public final boolean c(java.lang.Object r1) {
            r0 = this;
            qn2 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // defpackage.q46
    public final java.util.Map d() {
            r27 = this;
            r0 = r27
            ja4 r1 = r0.B
            if (r1 != 0) goto Ld
            ja4 r2 = r0.L
            if (r2 != 0) goto Ld
            zt1 r0 = defpackage.zt1.A
            return r0
        Ld:
            r2 = 0
            if (r1 == 0) goto L13
            int r3 = r1.e
            goto L14
        L13:
            r3 = r2
        L14:
            ja4 r4 = r0.L
            if (r4 == 0) goto L1b
            int r4 = r4.e
            goto L1c
        L1b:
            r4 = r2
        L1c:
            int r3 = r3 + r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r3)
            r3 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = 8
            if (r1 == 0) goto L8e
            java.lang.Object[] r12 = r1.b
            java.lang.Object[] r13 = r1.c
            long[] r1 = r1.a
            int r14 = r1.length
            int r14 = r14 + (-2)
            if (r14 < 0) goto L8e
            r15 = r2
            r16 = 128(0x80, double:6.3E-322)
        L3a:
            r5 = r1[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r3
            long r7 = r7 & r5
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L81
            int r7 = r15 - r14
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r2
        L4e:
            if (r8 >= r7) goto L7a
            long r20 = r5 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L6e
            int r20 = r15 << 3
            int r20 = r20 + r8
            r21 = r12[r20]
            r20 = r13[r20]
            r22 = r3
            r3 = r20
            java.util.List r3 = (java.util.List) r3
            r23 = r9
            r9 = r21
            java.lang.String r9 = (java.lang.String) r9
            r4.put(r9, r3)
            goto L72
        L6e:
            r22 = r3
            r23 = r9
        L72:
            long r5 = r5 >> r11
            int r8 = r8 + 1
            r3 = r22
            r9 = r23
            goto L4e
        L7a:
            r22 = r3
            r23 = r9
            if (r7 != r11) goto L96
            goto L85
        L81:
            r22 = r3
            r23 = r9
        L85:
            if (r15 == r14) goto L96
            int r15 = r15 + 1
            r3 = r22
            r9 = r23
            goto L3a
        L8e:
            r22 = r3
            r23 = r9
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L96:
            ja4 r1 = r0.L
            if (r1 == 0) goto L158
            java.lang.Object[] r3 = r1.b
            java.lang.Object[] r5 = r1.c
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L158
            r7 = r2
        La6:
            r8 = r1[r7]
            long r12 = ~r8
            long r12 = r12 << r22
            long r12 = r12 & r8
            long r12 = r12 & r23
            int r10 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r10 == 0) goto L14b
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r2
        Lba:
            if (r12 >= r10) goto L145
            long r13 = r8 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L136
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            java.util.List r13 = (java.util.List) r13
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r13.size()
            r20 = 0
            r21 = r11
            r11 = 1
            if (r15 != r11) goto L100
            java.lang.Object r11 = r13.get(r2)
            on2 r11 = (defpackage.on2) r11
            java.lang.Object r11 = r11.c()
            if (r11 == 0) goto Lf5
            boolean r13 = r0.c(r11)
            if (r13 == 0) goto Lf8
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.ArrayList r11 = defpackage.hf.w(r11)
            r4.put(r14, r11)
        Lf5:
            r26 = r1
            goto L13a
        Lf8:
            java.lang.String r0 = defpackage.qo2.z(r11)
            defpackage.u34.f(r0)
            return r20
        L100:
            int r11 = r13.size()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r11)
        L109:
            if (r2 >= r11) goto L130
            java.lang.Object r25 = r13.get(r2)
            on2 r25 = (defpackage.on2) r25
            r26 = r1
            java.lang.Object r1 = r25.c()
            if (r1 == 0) goto L128
            boolean r25 = r0.c(r1)
            if (r25 == 0) goto L120
            goto L128
        L120:
            java.lang.String r0 = defpackage.qo2.z(r1)
            defpackage.u34.f(r0)
            return r20
        L128:
            r15.add(r1)
            int r2 = r2 + 1
            r1 = r26
            goto L109
        L130:
            r26 = r1
            r4.put(r14, r15)
            goto L13a
        L136:
            r26 = r1
            r21 = r11
        L13a:
            long r8 = r8 >> r21
            int r12 = r12 + 1
            r11 = r21
            r1 = r26
            r2 = 0
            goto Lba
        L145:
            r26 = r1
            r1 = r11
            if (r10 != r1) goto L158
            goto L14e
        L14b:
            r26 = r1
            r1 = r11
        L14e:
            if (r7 == r6) goto L158
            int r7 = r7 + 1
            r11 = r1
            r1 = r26
            r2 = 0
            goto La6
        L158:
            return r4
    }

    @Override // defpackage.q46
    public final java.lang.Object e(java.lang.String r6) {
            r5 = this;
            r0 = 0
            ja4 r5 = r5.B
            if (r5 == 0) goto Lc
            java.lang.Object r1 = r5.k(r6)
            java.util.List r1 = (java.util.List) r1
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L40
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L16
            goto L40
        L16:
            int r0 = r1.size()
            r2 = 1
            if (r0 <= r2) goto L3a
            if (r5 == 0) goto L3a
            int r0 = r1.size()
            java.util.List r0 = r1.subList(r2, r0)
            int r2 = r5.f(r6)
            if (r2 >= 0) goto L2e
            int r2 = ~r2
        L2e:
            java.lang.Object[] r3 = r5.c
            r4 = r3[r2]
            java.lang.Object[] r5 = r5.b
            r5[r2] = r6
            r3[r2] = r0
            java.util.List r4 = (java.util.List) r4
        L3a:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            return r5
        L40:
            return r0
    }
}
