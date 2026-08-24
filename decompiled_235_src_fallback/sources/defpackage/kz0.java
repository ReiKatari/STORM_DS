package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz0  reason: default package */
/* loaded from: classes.dex */
public final class kz0 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ kz0(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r3 = r3.d0
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L37;
                case 2: goto L20;
                default: goto L9;
            }
        L9:
            fk3 r4 = (defpackage.fk3) r4
            jf7 r5 = (defpackage.jf7) r5
            r41 r6 = (defpackage.r41) r6
            kz0 r0 = new kz0
            ci0 r3 = (defpackage.ci0) r3
            r2 = 3
            r0.<init>(r3, r6, r2)
            r0.Y = r4
            r0.Z = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L20:
            java.util.List r4 = (java.util.List) r4
            java.util.List r5 = (java.util.List) r5
            r41 r6 = (defpackage.r41) r6
            kz0 r0 = new kz0
            tz5 r3 = (defpackage.tz5) r3
            r2 = 2
            r0.<init>(r3, r6, r2)
            r0.Y = r4
            r0.Z = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L37:
            vz1 r4 = (defpackage.vz1) r4
            jz1 r5 = (defpackage.jz1) r5
            r41 r6 = (defpackage.r41) r6
            kz0 r0 = new kz0
            sz1 r3 = (defpackage.sz1) r3
            r2 = 1
            r0.<init>(r3, r6, r2)
            r0.Y = r4
            r0.Z = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L4e:
            java.util.List r4 = (java.util.List) r4
            u41 r5 = (defpackage.u41) r5
            r41 r6 = (defpackage.r41) r6
            kz0 r0 = new kz0
            lz0 r3 = (defpackage.lz0) r3
            r2 = 0
            r0.<init>(r3, r6, r2)
            r0.Y = r4
            r0.Z = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r35) {
            r34 = this;
            r0 = r34
            int r1 = r0.X
            r2 = 1
            java.lang.Object r3 = r0.d0
            r4 = 0
            switch(r1) {
                case 0: goto L4ae;
                case 1: goto L3d4;
                case 2: goto L354;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r1 = r0.Y
            fk3 r1 = (defpackage.fk3) r1
            java.lang.Object r0 = r0.Z
            jf7 r0 = (defpackage.jf7) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r35)
            if (r1 == 0) goto L1c
            if (r0 != 0) goto L1f
        L1c:
            r15 = 0
            goto L352
        L1f:
            ci0 r3 = (defpackage.ci0) r3
            java.lang.Object r2 = r3.a
            ne1 r2 = (defpackage.ne1) r2
            java.util.Map r1 = r1.g
            java.lang.Object r7 = r1.get(r0)
            ff7 r7 = (defpackage.ff7) r7
            if (r7 == 0) goto L35
            ff7 r1 = r3.k(r7, r0)
            goto L34c
        L35:
            ok3 r7 = r0.e
            mk3 r8 = r7.b
            d83 r9 = r0.b
            ko4 r10 = r0.c
            my4 r11 = r0.a
            r12 = 2
            if (r8 == 0) goto L18c
            my4 r14 = new my4
            r14.<init>(r4, r4)
            ko4 r15 = defpackage.ko4.PORTRAIT
            mk3 r5 = r7.a
            ok3 r13 = new ok3
            r13.<init>(r8, r5)
            jf7 r5 = defpackage.jf7.a(r0, r14, r15, r13, r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r1.size()
            r13.<init>(r14)
            java.util.Set r14 = r1.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L65:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L9e
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r16 = r15.getKey()
            r12 = r16
            jf7 r12 = (defpackage.jf7) r12
            my4 r6 = new my4
            r6.<init>(r4, r4)
            ko4 r4 = defpackage.ko4.PORTRAIT
            r18 = r8
            r8 = 18
            r19 = r14
            r14 = 0
            jf7 r4 = defpackage.jf7.a(r12, r6, r4, r14, r8)
            java.lang.Object r6 = r15.getValue()
            vr4 r8 = new vr4
            r8.<init>(r4, r6)
            r13.add(r8)
            r8 = r18
            r14 = r19
            r4 = 0
            r12 = 2
            goto L65
        L9e:
            r18 = r8
            java.util.Map r4 = defpackage.c14.r0(r13)
            java.lang.Object r4 = r4.get(r5)
            ff7 r4 = (defpackage.ff7) r4
            if (r4 == 0) goto Lb6
            z66 r1 = r4.b
            z66 r4 = r4.a
            ff7 r6 = defpackage.ff7.a(r1, r4)
            goto L341
        Lb6:
            mk3 r4 = defpackage.mk3.a(r18)
            ok3 r4 = defpackage.ok3.a(r7, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r1.size()
            r5.<init>(r6)
            java.util.Set r6 = r1.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lcf:
            boolean r8 = r6.hasNext()
            r12 = 15
            if (r8 == 0) goto L113
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r13 = r8.getKey()
            jf7 r13 = (defpackage.jf7) r13
            ok3 r13 = r13.e
            java.lang.Object r14 = r8.getKey()
            jf7 r14 = (defpackage.jf7) r14
            ok3 r14 = r14.e
            mk3 r14 = r14.b
            if (r14 == 0) goto Lf6
            mk3 r14 = defpackage.mk3.a(r14)
            goto Lf7
        Lf6:
            r14 = 0
        Lf7:
            ok3 r13 = defpackage.ok3.a(r13, r14)
            java.lang.Object r14 = r8.getKey()
            jf7 r14 = (defpackage.jf7) r14
            r15 = 0
            jf7 r12 = defpackage.jf7.a(r14, r15, r15, r13, r12)
            java.lang.Object r8 = r8.getValue()
            vr4 r13 = new vr4
            r13.<init>(r12, r8)
            r5.add(r13)
            goto Lcf
        L113:
            r15 = 0
            java.util.Map r5 = defpackage.c14.r0(r5)
            jf7 r4 = defpackage.jf7.a(r0, r15, r15, r4, r12)
            java.lang.Object r4 = r5.get(r4)
            ff7 r4 = (defpackage.ff7) r4
            if (r4 == 0) goto L127
        L124:
            r6 = r4
            goto L341
        L127:
            ok3 r4 = defpackage.ok3.a(r7, r15)
            jf7 r4 = defpackage.jf7.a(r0, r15, r15, r4, r12)
            java.lang.Object r4 = r1.get(r4)
            ff7 r4 = (defpackage.ff7) r4
            if (r4 == 0) goto L18c
            z66 r1 = r4.a
            ff7 r4 = r2.c(r0)
            java.util.List r5 = r1.c
            if (r5 != 0) goto L143
            yt1 r5 = defpackage.yt1.A
        L143:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            h37 r5 = new h37
            r7 = 12
            r5.<init>(r7)
            defpackage.gt0.W0(r6, r5)
            z66 r5 = r4.a
            java.util.List r5 = r5.c
            if (r5 == 0) goto L17e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L161:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L17a
            java.lang.Object r8 = r5.next()
            r9 = r8
            j05 r9 = (defpackage.j05) r9
            nj3 r9 = r9.b
            boolean r9 = r9.isScreen()
            if (r9 == 0) goto L161
            r7.add(r8)
            goto L161
        L17a:
            r8 = 0
            r6.addAll(r8, r7)
        L17e:
            r5 = 3
            r14 = 0
            z66 r1 = defpackage.z66.a(r1, r14, r14, r6, r5)
            z66 r4 = r4.b
            ff7 r6 = defpackage.ff7.a(r1, r4)
            goto L341
        L18c:
            java.util.Set r4 = r1.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L196:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1bc
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            jf7 r7 = (defpackage.jf7) r7
            ko4 r7 = r7.c
            if (r7 != r10) goto L196
            java.lang.Object r6 = r6.getKey()
            jf7 r6 = (defpackage.jf7) r6
            my4 r6 = r6.a
            boolean r6 = defpackage.nb3.k(r6, r11)
            if (r6 == 0) goto L196
            goto L1bd
        L1bc:
            r5 = 0
        L1bd:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 != 0) goto L1e7
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L1cb:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1e3
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            jf7 r5 = (defpackage.jf7) r5
            ko4 r5 = r5.c
            if (r5 != r10) goto L1cb
            goto L1e4
        L1e3:
            r4 = 0
        L1e4:
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
        L1e7:
            if (r5 == 0) goto L33f
            java.lang.Object r1 = r5.getKey()
            jf7 r1 = (defpackage.jf7) r1
            java.lang.Object r4 = r5.getValue()
            ff7 r4 = (defpackage.ff7) r4
            my4 r5 = r1.a
            d83 r1 = r1.b
            boolean r6 = defpackage.nb3.k(r5, r11)
            if (r6 == 0) goto L207
            boolean r6 = defpackage.nb3.k(r1, r9)
            if (r6 == 0) goto L207
            goto L124
        L207:
            boolean r6 = defpackage.nb3.k(r5, r11)
            if (r6 == 0) goto L26e
            d83 r5 = new d83
            int r6 = r1.c
            int r7 = r1.a
            int r8 = r1.d
            int r10 = r1.b
            r5.<init>(r6, r8, r7, r10)
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L124
            int r5 = -r7
            int r1 = r1.c
            int r5 = r5 + r1
            z66 r1 = r4.a
            java.util.List r1 = r1.c
            if (r1 == 0) goto L25e
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ht0.v0(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L239:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L25f
            java.lang.Object r7 = r1.next()
            j05 r7 = (defpackage.j05) r7
            me.magnum.melonds.domain.model.Rect r8 = r7.a
            int r9 = r8.getX()
            int r9 = r9 + r5
            r13 = 14
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            me.magnum.melonds.domain.model.Rect r8 = me.magnum.melonds.domain.model.Rect.copy$default(r8, r9, r10, r11, r12, r13, r14)
            j05 r7 = defpackage.j05.a(r7, r8)
            r6.add(r7)
            goto L239
        L25e:
            r6 = 0
        L25f:
            z66 r1 = r4.a
            r5 = 3
            r14 = 0
            z66 r1 = defpackage.z66.a(r1, r14, r14, r6, r5)
            r5 = 2
            ff7 r6 = defpackage.ff7.b(r4, r1, r14, r5)
            goto L341
        L26e:
            int r1 = r5.a
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r1 <= 0) goto L27a
            int r7 = r11.a
            float r7 = (float) r7
            float r1 = (float) r1
            float r7 = r7 / r1
            goto L27b
        L27a:
            r7 = r6
        L27b:
            int r1 = r5.b
            if (r1 <= 0) goto L285
            int r5 = r11.b
            float r5 = (float) r5
            float r1 = (float) r1
            float r6 = r5 / r1
        L285:
            ff7 r1 = r2.c(r0)
            z66 r5 = r4.a
            java.util.List r5 = r5.c
            if (r5 == 0) goto L330
            java.util.ArrayList r14 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.ht0.v0(r5, r8)
            r14.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L29e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L331
            java.lang.Object r8 = r5.next()
            j05 r8 = (defpackage.j05) r8
            nj3 r9 = r8.b
            me.magnum.melonds.domain.model.Rect r10 = r8.a
            boolean r9 = r9.isScreen()
            if (r9 == 0) goto L306
            z66 r9 = r1.a
            java.util.List r9 = r9.c
            if (r9 == 0) goto L2d7
            java.util.Iterator r9 = r9.iterator()
        L2be:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L2d2
            java.lang.Object r11 = r9.next()
            r12 = r11
            j05 r12 = (defpackage.j05) r12
            nj3 r12 = r12.b
            nj3 r13 = r8.b
            if (r12 != r13) goto L2be
            goto L2d3
        L2d2:
            r11 = 0
        L2d3:
            r9 = r11
            j05 r9 = (defpackage.j05) r9
            goto L2d8
        L2d7:
            r9 = 0
        L2d8:
            if (r9 == 0) goto L2e1
            me.magnum.melonds.domain.model.Rect r9 = r9.a
            j05 r8 = defpackage.j05.a(r8, r9)
            goto L32b
        L2e1:
            int r9 = r10.getWidth()
            float r9 = (float) r9
            float r9 = r9 * r7
            int r9 = (int) r9
            float r11 = (float) r9
            r12 = 1068149419(0x3faaaaab, float:1.3333334)
            float r11 = r11 / r12
            int r11 = (int) r11
            int r12 = r10.getX()
            float r12 = (float) r12
            float r12 = r12 * r7
            int r12 = (int) r12
            int r10 = r10.getY()
            float r10 = (float) r10
            float r10 = r10 * r6
            int r10 = (int) r10
            me.magnum.melonds.domain.model.Rect r13 = new me.magnum.melonds.domain.model.Rect
            r13.<init>(r12, r10, r9, r11)
            j05 r8 = defpackage.j05.a(r8, r13)
            goto L32b
        L306:
            me.magnum.melonds.domain.model.Rect r9 = new me.magnum.melonds.domain.model.Rect
            int r11 = r10.getX()
            float r11 = (float) r11
            float r11 = r11 * r7
            int r11 = (int) r11
            int r12 = r10.getY()
            float r12 = (float) r12
            float r12 = r12 * r6
            int r12 = (int) r12
            int r13 = r10.getWidth()
            float r13 = (float) r13
            float r13 = r13 * r7
            int r13 = (int) r13
            int r10 = r10.getHeight()
            float r10 = (float) r10
            float r10 = r10 * r6
            int r10 = (int) r10
            r9.<init>(r11, r12, r13, r10)
            j05 r8 = defpackage.j05.a(r8, r9)
        L32b:
            r14.add(r8)
            goto L29e
        L330:
            r14 = 0
        L331:
            z66 r1 = r4.a
            r5 = 3
            r15 = 0
            z66 r1 = defpackage.z66.a(r1, r15, r15, r14, r5)
            r5 = 2
            ff7 r6 = defpackage.ff7.b(r4, r1, r15, r5)
            goto L341
        L33f:
            r15 = 0
            r6 = r15
        L341:
            if (r6 == 0) goto L348
            ff7 r1 = r3.k(r6, r0)
            goto L34c
        L348:
            ff7 r1 = r2.c(r0)
        L34c:
            vr4 r6 = new vr4
            r6.<init>(r0, r1)
            goto L353
        L352:
            r6 = r15
        L353:
            return r6
        L354:
            r15 = 0
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.Z
            java.util.List r0 = (java.util.List) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r35)
            xh5 r2 = defpackage.tz5.L
            r7 = 10
            int r2 = defpackage.ht0.v0(r0, r7)
            int r2 = defpackage.c14.k0(r2)
            r3 = 16
            if (r2 >= r3) goto L373
            r2 = r3
        L373:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L37c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L393
            java.lang.Object r2 = r0.next()
            r4 = r2
            kw5 r4 = (defpackage.kw5) r4
            android.net.Uri r4 = r4.a
            java.lang.String r4 = r4.toString()
            r3.put(r4, r2)
            goto L37c
        L393:
            java.util.ArrayList r0 = new java.util.ArrayList
            r7 = 10
            int r2 = defpackage.ht0.v0(r1, r7)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L3a2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d3
            java.lang.Object r2 = r1.next()
            lz5 r2 = (defpackage.lz5) r2
            android.net.Uri r4 = r2.a
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r3.get(r4)
            kw5 r4 = (defpackage.kw5) r4
            iz5 r5 = new iz5
            java.lang.String r2 = r2.c
            if (r4 == 0) goto L3c3
            java.lang.Long r14 = r4.b
            goto L3c4
        L3c3:
            r14 = r15
        L3c4:
            if (r4 == 0) goto L3ca
            jw5 r4 = r4.c
            if (r4 != 0) goto L3cc
        L3ca:
            jw5 r4 = defpackage.jw5.NOT_SCANNED
        L3cc:
            r5.<init>(r2, r14, r4)
            r0.add(r5)
            goto L3a2
        L3d3:
            return r0
        L3d4:
            r15 = 0
            java.lang.Object r1 = r0.Y
            vz1 r1 = (defpackage.vz1) r1
            java.lang.Object r0 = r0.Z
            jz1 r0 = (defpackage.jz1) r0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r35)
            fk3 r3 = r1.a
            vr4 r4 = r1.b
            if (r4 == 0) goto L3ee
            java.lang.Object r5 = r4.A
            r14 = r5
            jf7 r14 = (defpackage.jf7) r14
            goto L3ef
        L3ee:
            r14 = r15
        L3ef:
            if (r4 == 0) goto L3f6
            java.lang.Object r4 = r4.B
            ff7 r4 = (defpackage.ff7) r4
            goto L3f7
        L3f6:
            r4 = r15
        L3f7:
            if (r3 == 0) goto L4ac
            if (r4 == 0) goto L4ac
            if (r14 != 0) goto L3ff
            goto L4ac
        L3ff:
            ok3 r5 = r14.e
            mk3 r5 = r5.b
            boolean r6 = r3.e
            if (r6 == 0) goto L40b
            int r6 = r3.f
        L409:
            r9 = r6
            goto L40e
        L40b:
            int r6 = r1.e
            goto L409
        L40e:
            jq1 r6 = r0.a
            jq1 r7 = defpackage.jq1.OFF
            if (r6 == r7) goto L49e
            if (r5 != 0) goto L418
            goto L49e
        L418:
            boolean r7 = r0.b
            if (r7 != 0) goto L423
            boolean r7 = r0.c
            if (r7 == 0) goto L421
            goto L423
        L421:
            r7 = 0
            goto L424
        L423:
            r7 = r2
        L424:
            p66 r8 = r0.h
            if (r8 != 0) goto L42c
            p66 r8 = defpackage.lb4.r(r6)
        L42c:
            r25 = r8
            p66 r6 = r0.i
            if (r6 != 0) goto L438
            jq1 r6 = r0.a
            p66 r6 = defpackage.lb4.q(r6)
        L438:
            r33 = r6
            z66 r6 = r4.a
            my4 r8 = r14.a
            int r10 = r8.a
            int r8 = r8.b
            boolean r11 = r0.b
            boolean r12 = r0.c
            boolean r13 = r0.d
            if (r13 == 0) goto L44f
            if (r7 == 0) goto L44f
            r23 = r2
            goto L451
        L44f:
            r23 = 0
        L451:
            boolean r13 = r0.e
            if (r13 == 0) goto L464
            if (r7 == 0) goto L464
            r24 = r2
        L459:
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r22 = r12
            goto L467
        L464:
            r24 = 0
            goto L459
        L467:
            z66 r6 = defpackage.sz1.X(r18, r19, r20, r21, r22, r23, r24, r25)
            z66 r4 = r4.b
            int r8 = r5.c
            int r5 = r5.d
            boolean r10 = r0.b
            boolean r11 = r0.c
            boolean r12 = r0.f
            if (r12 == 0) goto L47e
            if (r7 == 0) goto L47e
            r31 = r2
            goto L480
        L47e:
            r31 = 0
        L480:
            boolean r0 = r0.g
            if (r0 == 0) goto L493
            if (r7 == 0) goto L493
            r32 = r2
        L488:
            r26 = r4
            r28 = r5
            r27 = r8
            r29 = r10
            r30 = r11
            goto L496
        L493:
            r32 = 0
            goto L488
        L496:
            z66 r0 = defpackage.sz1.X(r26, r27, r28, r29, r30, r31, r32, r33)
            ff7 r4 = defpackage.ff7.a(r6, r0)
        L49e:
            r12 = r4
            w26 r7 = new w26
            um6 r8 = r1.c
            boolean r10 = r1.d
            ck3 r11 = r3.d
            r7.<init>(r8, r9, r10, r11, r12)
            r6 = r7
            goto L4ad
        L4ac:
            r6 = r15
        L4ad:
            return r6
        L4ae:
            r15 = 0
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.Z
            u41 r0 = (defpackage.u41) r0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r35)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L68b
            if (r0 != 0) goto L4c6
            goto L68b
        L4c6:
            java.util.ArrayList r0 = r0.b
            lz0 r3 = (defpackage.lz0) r3
            r3.getClass()
            a63 r3 = defpackage.b63.Companion
            r3.getClass()
            java.util.List r3 = defpackage.b63.access$getSYSTEM_BUTTONS$cp()
            g63 r4 = defpackage.g63.a
            if (r3 == 0) goto L4e2
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L4e2
            goto L5ad
        L4e2:
            java.util.Iterator r3 = r3.iterator()
        L4e6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5ad
            java.lang.Object r5 = r3.next()
            b63 r5 = (defpackage.b63) r5
            r5.getClass()
            int r6 = r0.size()
            r7 = 0
        L4fa:
            if (r7 >= r6) goto L510
            java.lang.Object r14 = r0.get(r7)
            int r7 = r7 + 1
            r8 = r14
            i63 r8 = (defpackage.i63) r8
            b63 r9 = r8.a
            if (r9 != r5) goto L4fa
            boolean r8 = r8.b()
            if (r8 == 0) goto L4fa
            goto L511
        L510:
            r14 = r15
        L511:
            i63 r14 = (defpackage.i63) r14
            if (r14 == 0) goto L532
            h63 r5 = r14.b
            boolean r6 = defpackage.nb3.k(r5, r4)
            if (r6 != 0) goto L51e
            goto L51f
        L51e:
            r5 = r15
        L51f:
            h63 r14 = r14.c
            boolean r6 = defpackage.nb3.k(r14, r4)
            if (r6 != 0) goto L528
            goto L529
        L528:
            r14 = r15
        L529:
            h63[] r5 = new defpackage.h63[]{r5, r14}
            java.util.ArrayList r14 = defpackage.fv.C0(r5)
            goto L533
        L532:
            r14 = r15
        L533:
            if (r14 == 0) goto L5a2
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L53d
        L53b:
            r8 = 0
            goto L59d
        L53d:
            int r5 = r14.size()
            r6 = 0
        L542:
            if (r6 >= r5) goto L53b
            java.lang.Object r7 = r14.get(r6)
            int r6 = r6 + 1
            h63 r7 = (defpackage.h63) r7
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L553
            goto L542
        L553:
            java.util.Iterator r8 = r1.iterator()
        L557:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L542
            java.lang.Object r9 = r8.next()
            android.view.InputDevice r9 = (android.view.InputDevice) r9
            boolean r10 = r7 instanceof defpackage.e63
            if (r10 == 0) goto L576
            r10 = r7
            e63 r10 = (defpackage.e63) r10
            int r10 = r10.b
            android.view.InputDevice$MotionRange r9 = r9.getMotionRange(r10)
            if (r9 == 0) goto L574
            r9 = r2
            goto L593
        L574:
            r9 = 0
            goto L593
        L576:
            boolean r10 = r7 instanceof defpackage.f63
            if (r10 == 0) goto L58c
            r10 = r7
            f63 r10 = (defpackage.f63) r10
            int r10 = r10.b
            int[] r10 = new int[]{r10}
            boolean[] r9 = r9.hasKeys(r10)
            r17 = 0
            boolean r9 = r9[r17]
            goto L593
        L58c:
            boolean r9 = defpackage.nb3.k(r7, r4)
            if (r9 == 0) goto L597
            goto L574
        L593:
            if (r9 == 0) goto L557
            r8 = r2
            goto L59d
        L597:
            defpackage.i.d()
        L59a:
            r6 = r15
            goto L68d
        L59d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
            goto L5a3
        L5a2:
            r14 = r15
        L5a3:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.nb3.k(r14, r5)
            if (r5 != 0) goto L4e6
            goto L68b
        L5ad:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.size()
            r8 = 0
        L5b7:
            if (r8 >= r3) goto L662
            java.lang.Object r5 = r0.get(r8)
            int r8 = r8 + 1
            r6 = r5
            i63 r6 = (defpackage.i63) r6
            h63 r14 = r6.b
            boolean r7 = defpackage.nb3.k(r14, r4)
            if (r7 != 0) goto L5cb
            goto L5cc
        L5cb:
            r14 = r15
        L5cc:
            h63 r6 = r6.c
            boolean r7 = defpackage.nb3.k(r6, r4)
            if (r7 != 0) goto L5d5
            goto L5d6
        L5d5:
            r6 = r15
        L5d6:
            h63[] r6 = new defpackage.h63[]{r14, r6}
            java.util.ArrayList r6 = defpackage.fv.C0(r6)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L5e7
        L5e4:
            r17 = 0
            goto L5b7
        L5e7:
            int r7 = r6.size()
            r9 = 0
        L5ec:
            if (r9 >= r7) goto L5e4
            java.lang.Object r10 = r6.get(r9)
            int r9 = r9 + 1
            h63 r10 = (defpackage.h63) r10
            boolean r11 = r10 instanceof defpackage.e63
            if (r11 == 0) goto L621
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L603
        L600:
            r17 = 0
            goto L5ec
        L603:
            java.util.Iterator r11 = r1.iterator()
        L607:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L600
            java.lang.Object r12 = r11.next()
            android.view.InputDevice r12 = (android.view.InputDevice) r12
            r13 = r10
            e63 r13 = (defpackage.e63) r13
            int r13 = r13.b
            android.view.InputDevice$MotionRange r12 = r12.getMotionRange(r13)
            if (r12 == 0) goto L607
            r17 = 0
            goto L64f
        L621:
            boolean r11 = r10 instanceof defpackage.f63
            if (r11 == 0) goto L654
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L62c
            goto L600
        L62c:
            java.util.Iterator r11 = r1.iterator()
        L630:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L600
            java.lang.Object r12 = r11.next()
            android.view.InputDevice r12 = (android.view.InputDevice) r12
            r13 = r10
            f63 r13 = (defpackage.f63) r13
            int r13 = r13.b
            int[] r13 = new int[]{r13}
            boolean[] r12 = r12.hasKeys(r13)
            r17 = 0
            boolean r12 = r12[r17]
            if (r12 == 0) goto L630
        L64f:
            r2.add(r5)
            goto L5b7
        L654:
            r17 = 0
            boolean r10 = defpackage.nb3.k(r10, r4)
            if (r10 == 0) goto L65d
            goto L5ec
        L65d:
            defpackage.i.d()
            goto L59a
        L662:
            r17 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r7 = 10
            int r1 = defpackage.ht0.v0(r2, r7)
            r0.<init>(r1)
            int r1 = r2.size()
            r4 = r17
        L675:
            if (r4 >= r1) goto L685
            java.lang.Object r3 = r2.get(r4)
            int r4 = r4 + 1
            i63 r3 = (defpackage.i63) r3
            b63 r3 = r3.a
            r0.add(r3)
            goto L675
        L685:
            mz0 r6 = new mz0
            r6.<init>(r0)
            goto L68d
        L68b:
            nz0 r6 = defpackage.nz0.a
        L68d:
            return r6
    }
}
