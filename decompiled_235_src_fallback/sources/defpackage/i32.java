package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i32  reason: default package */
/* loaded from: classes.dex */
public final class i32 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ defpackage.ne2 Z;
    public /* synthetic */ java.lang.Object[] d0;

    public /* synthetic */ i32(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r3 = r3.X
            jg7 r0 = defpackage.jg7.a
            r1 = 3
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r41 r6 = (defpackage.r41) r6
            switch(r3) {
                case 0: goto L1d;
                default: goto Le;
            }
        Le:
            i32 r3 = new i32
            r2 = 1
            r3.<init>(r1, r6, r2)
            r3.Z = r4
            r3.d0 = r5
            java.lang.Object r3 = r3.s(r0)
            return r3
        L1d:
            i32 r3 = new i32
            r2 = 0
            r3.<init>(r1, r6, r2)
            r3.Z = r4
            r3.d0 = r5
            java.lang.Object r3 = r3.s(r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.X
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r1) {
                case 0: goto L48;
                default: goto Le;
            }
        Le:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto L1f
            if (r7 != r5) goto L1a
            defpackage.oi2.Y(r19)
            goto L47
        L1a:
            defpackage.i.m(r4)
            r2 = r6
            goto L47
        L1f:
            defpackage.oi2.Y(r19)
            ne2 r4 = r0.Z
            java.lang.Object[] r7 = r0.d0
            x21[] r7 = (defpackage.x21[]) r7
            int r8 = r7.length
        L29:
            v21 r9 = defpackage.v21.a
            if (r3 >= r8) goto L3a
            r10 = r7[r3]
            boolean r11 = defpackage.nb3.k(r10, r9)
            if (r11 != 0) goto L37
            r6 = r10
            goto L3a
        L37:
            int r3 = r3 + 1
            goto L29
        L3a:
            if (r6 != 0) goto L3d
            goto L3e
        L3d:
            r9 = r6
        L3e:
            r0.Y = r5
            java.lang.Object r0 = r4.a(r9, r0)
            if (r0 != r1) goto L47
            r2 = r1
        L47:
            return r2
        L48:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto L5a
            if (r7 != r5) goto L55
            defpackage.oi2.Y(r19)
            goto Ld1
        L55:
            defpackage.i.m(r4)
            r2 = r6
            goto Ld1
        L5a:
            defpackage.oi2.Y(r19)
            ne2 r4 = r0.Z
            java.lang.Object[] r7 = r0.d0
            jz1 r8 = new jz1
            r3 = r7[r3]
            r3.getClass()
            r9 = r3
            jq1 r9 = (defpackage.jq1) r9
            r3 = r7[r5]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r10 = r3.booleanValue()
            r3 = 2
            r3 = r7[r3]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r11 = r3.booleanValue()
            r3 = 3
            r3 = r7[r3]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r12 = r3.booleanValue()
            r3 = 4
            r3 = r7[r3]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r13 = r3.booleanValue()
            r3 = 5
            r3 = r7[r3]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r14 = r3.booleanValue()
            r3 = 6
            r3 = r7[r3]
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r15 = r3.booleanValue()
            r3 = 7
            r3 = r7[r3]
            r16 = r3
            p66 r16 = (defpackage.p66) r16
            r3 = 8
            r3 = r7[r3]
            r17 = r3
            p66 r17 = (defpackage.p66) r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.Z = r6
            r0.d0 = r6
            r0.Y = r5
            java.lang.Object r0 = r4.a(r8, r0)
            if (r0 != r1) goto Ld1
            r2 = r1
        Ld1:
            return r2
    }
}
