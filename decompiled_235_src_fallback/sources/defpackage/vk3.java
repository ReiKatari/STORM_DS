package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk3  reason: default package */
/* loaded from: classes.dex */
public final class vk3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorActivity Z;

    public /* synthetic */ vk3(me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L58;
                case 1: goto L4d;
                case 2: goto L42;
                case 3: goto L37;
                case 4: goto L2c;
                case 5: goto L21;
                case 6: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L42:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L4d:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L58:
            r41 r2 = r2.q(r4, r3)
            vk3 r2 = (defpackage.vk3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1 = r1.Z
            switch(r3) {
                case 0: goto L38;
                case 1: goto L31;
                case 2: goto L2a;
                case 3: goto L23;
                case 4: goto L1c;
                case 5: goto L15;
                case 6: goto Le;
                default: goto L7;
            }
        L7:
            vk3 r3 = new vk3
            r0 = 7
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            vk3 r3 = new vk3
            r0 = 6
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            vk3 r3 = new vk3
            r0 = 5
            r3.<init>(r1, r2, r0)
            return r3
        L1c:
            vk3 r3 = new vk3
            r0 = 4
            r3.<init>(r1, r2, r0)
            return r3
        L23:
            vk3 r3 = new vk3
            r0 = 3
            r3.<init>(r1, r2, r0)
            return r3
        L2a:
            vk3 r3 = new vk3
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L31:
            vk3 r3 = new vk3
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L38:
            vk3 r3 = new vk3
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            r1 = 0
            r2 = 2
            jg7 r3 = defpackage.jg7.a
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r4 = r8.Z
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L14d;
                case 1: goto L126;
                case 2: goto Lf6;
                case 3: goto Lcf;
                case 4: goto L9f;
                case 5: goto L77;
                case 6: goto L37;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L20
            if (r1 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L36
        L1b:
            defpackage.i.m(r5)
            r3 = r7
            goto L36
        L20:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r1 = defpackage.tt3.STARTED
            vk3 r2 = new vk3
            r5 = 6
            r2.<init>(r4, r7, r5)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r1, r2, r8)
            if (r8 != r0) goto L36
            r3 = r0
        L36:
            return r3
        L37:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L48
            if (r1 != r6) goto L43
            defpackage.oi2.Y(r9)
            goto L76
        L43:
            defpackage.i.m(r5)
            r3 = r7
            goto L76
        L48:
            defpackage.oi2.Y(r9)
            qt7 r9 = defpackage.rt7.c0
            r9.getClass()
            j97 r9 = defpackage.qt7.a(r4)
            vy5 r1 = new vy5
            r2 = 19
            r1.<init>(r9, r4, r7, r2)
            pb0 r9 = defpackage.f04.p(r1)
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            le2 r9 = defpackage.f04.E(r9, r1)
            uk3 r1 = new uk3
            r2 = 3
            r1.<init>(r4, r2)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto L76
            r3 = r0
        L76:
            return r3
        L77:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L88
            if (r1 != r6) goto L83
            defpackage.oi2.Y(r9)
            goto L9e
        L83:
            defpackage.i.m(r5)
            r3 = r7
            goto L9e
        L88:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r1 = defpackage.tt3.STARTED
            vk3 r2 = new vk3
            r5 = 4
            r2.<init>(r4, r7, r5)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r1, r2, r8)
            if (r8 != r0) goto L9e
            r3 = r0
        L9e:
            return r3
        L9f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto Laf
            if (r1 == r6) goto Lab
            defpackage.i.m(r5)
            goto Lce
        Lab:
            defpackage.oi2.Y(r9)
            goto Lcb
        Laf:
            defpackage.oi2.Y(r9)
            int r9 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            yl3 r9 = r4.C()
            de5 r9 = r9.n
            uk3 r1 = new uk3
            r1.<init>(r4, r2)
            r8.Y = r6
            rp6 r9 = r9.A
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto Lcb
            r7 = r0
            goto Lce
        Lcb:
            defpackage.e41.c()
        Lce:
            return r7
        Lcf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto Le0
            if (r1 != r6) goto Ldb
            defpackage.oi2.Y(r9)
            goto Lf5
        Ldb:
            defpackage.i.m(r5)
            r3 = r7
            goto Lf5
        Le0:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r1 = defpackage.tt3.STARTED
            vk3 r5 = new vk3
            r5.<init>(r4, r7, r2)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r1, r5, r8)
            if (r8 != r0) goto Lf5
            r3 = r0
        Lf5:
            return r3
        Lf6:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L106
            if (r1 == r6) goto L102
            defpackage.i.m(r5)
            goto L125
        L102:
            defpackage.oi2.Y(r9)
            goto L122
        L106:
            defpackage.oi2.Y(r9)
            int r9 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            yl3 r9 = r4.C()
            de5 r9 = r9.l
            uk3 r1 = new uk3
            r1.<init>(r4, r6)
            r8.Y = r6
            rp6 r9 = r9.A
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto L122
            r7 = r0
            goto L125
        L122:
            defpackage.e41.c()
        L125:
            return r7
        L126:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.Y
            if (r2 == 0) goto L137
            if (r2 != r6) goto L132
            defpackage.oi2.Y(r9)
            goto L14c
        L132:
            defpackage.i.m(r5)
            r3 = r7
            goto L14c
        L137:
            defpackage.oi2.Y(r9)
            ku3 r9 = r4.A
            tt3 r2 = defpackage.tt3.STARTED
            vk3 r5 = new vk3
            r5.<init>(r4, r7, r1)
            r8.Y = r6
            java.lang.Object r8 = defpackage.np2.c0(r9, r2, r5, r8)
            if (r8 != r0) goto L14c
            r3 = r0
        L14c:
            return r3
        L14d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r8.Y
            if (r2 == 0) goto L15d
            if (r2 == r6) goto L159
            defpackage.i.m(r5)
            goto L17c
        L159:
            defpackage.oi2.Y(r9)
            goto L179
        L15d:
            defpackage.oi2.Y(r9)
            int r9 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            yl3 r9 = r4.C()
            de5 r9 = r9.p
            uk3 r2 = new uk3
            r2.<init>(r4, r1)
            r8.Y = r6
            rp6 r9 = r9.A
            java.lang.Object r8 = r9.b(r2, r8)
            if (r8 != r0) goto L179
            r7 = r0
            goto L17c
        L179:
            defpackage.e41.c()
        L17c:
            return r7
    }
}
