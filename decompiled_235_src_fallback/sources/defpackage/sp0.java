package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp0  reason: default package */
/* loaded from: classes.dex */
public final class sp0 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ defpackage.ne2 Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.aq0 e0;

    public /* synthetic */ sp0(defpackage.r41 r1, defpackage.aq0 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.e0 = r2
            r2 = 3
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            aq0 r3 = r3.e0
            ne2 r4 = (defpackage.ne2) r4
            r41 r6 = (defpackage.r41) r6
            switch(r0) {
                case 0: goto L49;
                case 1: goto L3a;
                case 2: goto L2b;
                case 3: goto L1c;
                default: goto Ld;
            }
        Ld:
            sp0 r0 = new sp0
            r2 = 4
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L1c:
            sp0 r0 = new sp0
            r2 = 3
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L2b:
            sp0 r0 = new sp0
            r2 = 2
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L3a:
            sp0 r0 = new sp0
            r2 = 1
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L49:
            sp0 r0 = new sp0
            r2 = 0
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.X
            jg7 r3 = defpackage.jg7.a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            aq0 r6 = r0.e0
            switch(r1) {
                case 0: goto L21c;
                case 1: goto L1d9;
                case 2: goto L1a2;
                case 3: goto L163;
                default: goto Le;
            }
        Le:
            tp6 r1 = r6.e
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r0.Y
            if (r8 == 0) goto L23
            if (r8 != r5) goto L1d
            defpackage.oi2.Y(r18)
            goto L162
        L1d:
            defpackage.i.m(r4)
            r3 = 0
            goto L162
        L23:
            defpackage.oi2.Y(r18)
            ne2 r4 = r0.Z
            java.lang.Object r8 = r0.d0
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r8.iterator()
        L35:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r10.next()
            an0 r11 = (defpackage.an0) r11
            java.util.ArrayList r12 = r11.c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r14 = r12.size()
            r15 = 0
        L4d:
            if (r15 >= r14) goto L64
            java.lang.Object r5 = r12.get(r15)
            int r15 = r15 + 1
            r16 = r5
            me.magnum.melonds.domain.model.Cheat r16 = (me.magnum.melonds.domain.model.Cheat) r16
            boolean r16 = r16.getEnabled()
            if (r16 == 0) goto L62
            r13.add(r5)
        L62:
            r5 = 1
            goto L4d
        L64:
            java.util.ArrayList r5 = new java.util.ArrayList
            r12 = 10
            int r12 = defpackage.ht0.v0(r13, r12)
            r5.<init>(r12)
            int r12 = r13.size()
            r14 = 0
        L74:
            if (r14 >= r12) goto L89
            java.lang.Object r15 = r13.get(r14)
            int r14 = r14 + 1
            me.magnum.melonds.domain.model.Cheat r15 = (me.magnum.melonds.domain.model.Cheat) r15
            co0 r7 = new co0
            java.lang.String r2 = r11.b
            r7.<init>(r15, r2)
            r5.add(r7)
            goto L74
        L89:
            defpackage.gt0.A0(r9, r5)
            r5 = 1
            goto L35
        L8e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
            java.lang.Object r5 = r1.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L9d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L13a
            java.lang.Object r7 = r5.next()
            me.magnum.melonds.domain.model.Cheat r7 = (me.magnum.melonds.domain.model.Cheat) r7
            int r9 = r2.size()
            r10 = 0
            r11 = 0
        Laf:
            if (r11 >= r9) goto Lcd
            java.lang.Object r12 = r2.get(r11)
            int r11 = r11 + 1
            co0 r12 = (defpackage.co0) r12
            me.magnum.melonds.domain.model.Cheat r12 = r12.a
            java.lang.Long r12 = r12.getId()
            java.lang.Long r13 = r7.getId()
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto Lca
            goto Lce
        Lca:
            int r10 = r10 + 1
            goto Laf
        Lcd:
            r10 = -1
        Lce:
            if (r10 < 0) goto Leb
            boolean r9 = r7.getEnabled()
            if (r9 == 0) goto Le7
            co0 r9 = new co0
            java.lang.Object r11 = r2.get(r10)
            co0 r11 = (defpackage.co0) r11
            java.lang.String r11 = r11.b
            r9.<init>(r7, r11)
            r2.set(r10, r9)
            goto L9d
        Le7:
            r2.remove(r10)
            goto L9d
        Leb:
            boolean r9 = r7.getEnabled()
            if (r9 == 0) goto L9d
            java.util.Iterator r9 = r8.iterator()
        Lf5:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L129
            java.lang.Object r10 = r9.next()
            r11 = r10
            an0 r11 = (defpackage.an0) r11
            java.util.ArrayList r11 = r11.c
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L10b
            goto Lf5
        L10b:
            int r12 = r11.size()
            r13 = 0
        L110:
            if (r13 >= r12) goto Lf5
            java.lang.Object r14 = r11.get(r13)
            int r13 = r13 + 1
            me.magnum.melonds.domain.model.Cheat r14 = (me.magnum.melonds.domain.model.Cheat) r14
            java.lang.Long r14 = r14.getId()
            java.lang.Long r15 = r7.getId()
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 == 0) goto L110
            goto L12a
        L129:
            r10 = 0
        L12a:
            an0 r10 = (defpackage.an0) r10
            if (r10 == 0) goto L9d
            co0 r9 = new co0
            java.lang.String r10 = r10.b
            r9.<init>(r7, r10)
            r2.add(r9)
            goto L9d
        L13a:
            b7 r5 = new b7
            r7 = 9
            r5.<init>(r1, r7)
            wp0 r1 = new wp0
            r7 = 0
            r1.<init>(r7, r5, r2)
            z r5 = new z
            r7 = 19
            r8 = 0
            r5.<init>(r2, r8, r7)
            cf2 r2 = new cf2
            r2.<init>(r5, r1)
            r0.Z = r8
            r0.d0 = r8
            r1 = 1
            r0.Y = r1
            java.lang.Object r0 = defpackage.f04.A(r4, r2, r0)
            if (r0 != r6) goto L162
            r3 = r6
        L162:
            return r3
        L163:
            r1 = r5
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.Y
            if (r5 == 0) goto L175
            if (r5 != r1) goto L170
            defpackage.oi2.Y(r18)
            goto L1a1
        L170:
            defpackage.i.m(r4)
            r3 = 0
            goto L1a1
        L175:
            defpackage.oi2.Y(r18)
            ne2 r1 = r0.Z
            java.lang.Object r4 = r0.d0
            cp2 r4 = (defpackage.cp2) r4
            if (r4 != 0) goto L18a
            g21 r4 = new g21
            r5 = 4
            yt1 r6 = defpackage.yt1.A
            r4.<init>(r6, r5)
        L188:
            r8 = 0
            goto L193
        L18a:
            hp0 r5 = r6.b
            h16 r5 = (defpackage.h16) r5
            le2 r4 = r5.i(r4)
            goto L188
        L193:
            r0.Z = r8
            r0.d0 = r8
            r5 = 1
            r0.Y = r5
            java.lang.Object r0 = defpackage.f04.A(r1, r4, r0)
            if (r0 != r2) goto L1a1
            r3 = r2
        L1a1:
            return r3
        L1a2:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L1b3
            if (r2 != r5) goto L1ae
            defpackage.oi2.Y(r18)
            goto L1d8
        L1ae:
            defpackage.i.m(r4)
            r3 = 0
            goto L1d8
        L1b3:
            defpackage.oi2.Y(r18)
            ne2 r2 = r0.Z
            java.lang.Object r4 = r0.d0
            cp2 r4 = (defpackage.cp2) r4
            b0 r5 = new b0
            r7 = 16
            r8 = 0
            r5.<init>(r4, r6, r8, r7)
            g21 r4 = new g21
            r6 = 7
            r4.<init>(r5, r6)
            r0.Z = r8
            r0.d0 = r8
            r5 = 1
            r0.Y = r5
            java.lang.Object r0 = defpackage.f04.A(r2, r4, r0)
            if (r0 != r1) goto L1d8
            r3 = r1
        L1d8:
            return r3
        L1d9:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L1ea
            if (r2 != r5) goto L1e5
            defpackage.oi2.Y(r18)
            goto L216
        L1e5:
            defpackage.i.m(r4)
            r3 = 0
            goto L216
        L1ea:
            defpackage.oi2.Y(r18)
            ne2 r2 = r0.Z
            java.lang.Object r4 = r0.d0
            java.util.List r4 = (java.util.List) r4
            tp6 r5 = r6.e
            r8 = 0
            r0.Z = r8
            r0.d0 = r8
            r6 = 1
            r0.Y = r6
            boolean r6 = r2 instanceof defpackage.w57
            if (r6 != 0) goto L217
            zb0 r6 = new zb0
            r7 = 2
            r6.<init>(r7, r2, r4)
            java.lang.Object r0 = r5.b(r6, r0)
            if (r0 != r1) goto L20e
            goto L20f
        L20e:
            r0 = r3
        L20f:
            if (r0 != r1) goto L212
            goto L213
        L212:
            r0 = r3
        L213:
            if (r0 != r1) goto L216
            r3 = r1
        L216:
            return r3
        L217:
            w57 r2 = (defpackage.w57) r2
            java.lang.Throwable r0 = r2.A
            throw r0
        L21c:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L22e
            r5 = 1
            if (r2 != r5) goto L229
            defpackage.oi2.Y(r18)
            goto L285
        L229:
            defpackage.i.m(r4)
            r3 = 0
            goto L285
        L22e:
            defpackage.oi2.Y(r18)
            ne2 r2 = r0.Z
            java.lang.Object r4 = r0.d0
            an0 r4 = (defpackage.an0) r4
            hp0 r5 = r6.b
            h16 r5 = (defpackage.h16) r5
            r5.getClass()
            r4.getClass()
            me.magnum.melonds.database.MelonDatabase r5 = r5.b
            vm0 r5 = r5.s()
            java.lang.Long r4 = r4.a
            r4.getClass()
            long r6 = r4.longValue()
            m16 r4 = r5.a
            java.lang.String r5 = "cheat"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            t4 r8 = new t4
            r9 = 5
            r8.<init>(r9, r6)
            r7 = 0
            ng2 r4 = defpackage.yv7.a(r4, r7, r5, r8)
            r8 = 0
            r0.Z = r8
            r0.d0 = r8
            r5 = 1
            r0.Y = r5
            boolean r5 = r2 instanceof defpackage.w57
            if (r5 != 0) goto L286
            a7 r5 = new a7
            r6 = 28
            r5.<init>(r2, r6)
            java.lang.Object r0 = r4.b(r5, r0)
            if (r0 != r1) goto L27d
            goto L27e
        L27d:
            r0 = r3
        L27e:
            if (r0 != r1) goto L281
            goto L282
        L281:
            r0 = r3
        L282:
            if (r0 != r1) goto L285
            r3 = r1
        L285:
            return r3
        L286:
            w57 r2 = (defpackage.w57) r2
            java.lang.Throwable r0 = r2.A
            throw r0
    }
}
