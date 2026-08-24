package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c86  reason: default package */
/* loaded from: classes.dex */
public final class c86 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.e86 Z;
    public /* synthetic */ long d0;

    public /* synthetic */ c86(defpackage.e86 r1, long r2, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public c86(defpackage.e86 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 3
            r1.X = r0
            r1.Z = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L39;
                case 1: goto L2a;
                case 2: goto L1b;
                default: goto L7;
            }
        L7:
            jk4 r5 = (defpackage.jk4) r5
            long r2 = r5.a
            r41 r6 = (defpackage.r41) r6
            c86 r5 = new c86
            e86 r4 = r4.Z
            r5.<init>(r4, r6)
            r5.d0 = r2
            java.lang.Object r4 = r5.s(r1)
            return r4
        L1b:
            w61 r5 = (defpackage.w61) r5
            r41 r6 = (defpackage.r41) r6
            r41 r4 = r4.q(r6, r5)
            c86 r4 = (defpackage.c86) r4
            java.lang.Object r4 = r4.s(r1)
            return r4
        L2a:
            w61 r5 = (defpackage.w61) r5
            r41 r6 = (defpackage.r41) r6
            r41 r4 = r4.q(r6, r5)
            c86 r4 = (defpackage.c86) r4
            java.lang.Object r4 = r4.s(r1)
            return r4
        L39:
            w61 r5 = (defpackage.w61) r5
            r41 r6 = (defpackage.r41) r6
            r41 r4 = r4.q(r6, r5)
            c86 r4 = (defpackage.c86) r4
            java.lang.Object r4 = r4.s(r1)
            return r4
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.X
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L1f;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            c86 r0 = new c86
            e86 r8 = r8.Z
            r0.<init>(r8, r9)
            jk4 r10 = (defpackage.jk4) r10
            long r8 = r10.a
            r0.d0 = r8
            return r0
        L13:
            c86 r1 = new c86
            long r3 = r8.d0
            r6 = 2
            e86 r2 = r8.Z
            r5 = r9
            r1.<init>(r2, r3, r5, r6)
            return r1
        L1f:
            r6 = r9
            c86 r2 = new c86
            long r4 = r8.d0
            r7 = 1
            e86 r3 = r8.Z
            r2.<init>(r3, r4, r6, r7)
            return r2
        L2b:
            r6 = r9
            c86 r2 = new c86
            long r4 = r8.d0
            r7 = 0
            e86 r3 = r8.Z
            r2.<init>(r3, r4, r6, r7)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            e86 r2 = r8.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L74;
                case 1: goto L51;
                case 2: goto L2f;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L1e
            if (r1 != r4) goto L19
            defpackage.oi2.Y(r9)
            goto L2e
        L19:
            defpackage.i.m(r3)
            r9 = r5
            goto L2e
        L1e:
            defpackage.oi2.Y(r9)
            long r5 = r8.d0
            m86 r9 = r2.J0
            r8.Y = r4
            java.lang.Object r9 = defpackage.y76.a(r9, r5, r8)
            if (r9 != r0) goto L2e
            r9 = r0
        L2e:
            return r9
        L2f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L40
            if (r6 != r4) goto L3b
            defpackage.oi2.Y(r9)
            goto L50
        L3b:
            defpackage.i.m(r3)
            r1 = r5
            goto L50
        L40:
            defpackage.oi2.Y(r9)
            m86 r9 = r2.J0
            long r2 = r8.d0
            r8.Y = r4
            java.lang.Object r8 = r9.b(r2, r4, r8)
            if (r8 != r0) goto L50
            r1 = r0
        L50:
            return r1
        L51:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L62
            if (r6 != r4) goto L5d
            defpackage.oi2.Y(r9)
            goto L73
        L5d:
            defpackage.i.m(r3)
            r1 = r5
            goto L73
        L62:
            defpackage.oi2.Y(r9)
            m86 r9 = r2.J0
            long r2 = r8.d0
            r8.Y = r4
            r4 = 0
            java.lang.Object r8 = r9.b(r2, r4, r8)
            if (r8 != r0) goto L73
            r1 = r0
        L73:
            return r1
        L74:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L85
            if (r6 != r4) goto L80
            defpackage.oi2.Y(r9)
            goto L9c
        L80:
            defpackage.i.m(r3)
            r1 = r5
            goto L9c
        L85:
            defpackage.oi2.Y(r9)
            m86 r9 = r2.J0
            xa4 r2 = defpackage.xa4.UserInput
            b86 r3 = new b86
            long r6 = r8.d0
            r3.<init>(r6, r5)
            r8.Y = r4
            java.lang.Object r8 = r9.f(r2, r3, r8)
            if (r8 != r0) goto L9c
            r1 = r0
        L9c:
            return r1
    }
}
