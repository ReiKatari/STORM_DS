package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk3  reason: default package */
/* loaded from: classes.dex */
public final class uk3 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorActivity B;

    public /* synthetic */ uk3(me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r11, defpackage.r41 r12) {
            r10 = this;
            int r12 = r10.A
            java.lang.String r0 = "layoutEditorManager"
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r10 = r10.B
            switch(r12) {
                case 0: goto La1;
                case 1: goto L90;
                case 2: goto L80;
                default: goto Lc;
            }
        Lc:
            kv7 r11 = (defpackage.kv7) r11
            java.util.List r11 = r11.a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L19:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r11.next()
            lw2 r0 = (defpackage.lw2) r0
            boolean r3 = r0 instanceof defpackage.lw2
            if (r3 == 0) goto L6a
            x66 r3 = new x66
            w60 r4 = r0.a
            gr1 r5 = r0.a()
            gr1 r6 = defpackage.gr1.d0
            if (r5 == r6) goto L38
            ko4 r5 = defpackage.ko4.PORTRAIT
            goto L3a
        L38:
            ko4 r5 = defpackage.ko4.LANDSCAPE
        L3a:
            boolean r0 = r0.b()
            if (r0 == 0) goto L43
            w66 r0 = defpackage.w66.SEAMLESS
            goto L45
        L43:
            w66 r0 = defpackage.w66.GAP
        L45:
            me.magnum.melonds.domain.model.Rect r6 = new me.magnum.melonds.domain.model.Rect
            android.graphics.Rect r7 = r4.c()
            int r7 = r7.left
            android.graphics.Rect r8 = r4.c()
            int r8 = r8.top
            android.graphics.Rect r9 = r4.c()
            int r9 = r9.width()
            android.graphics.Rect r4 = r4.c()
            int r4 = r4.height()
            r6.<init>(r7, r8, r9, r4)
            r3.<init>(r5, r0, r6)
            goto L6b
        L6a:
            r3 = r1
        L6b:
            if (r3 == 0) goto L19
            r12.add(r3)
            goto L19
        L71:
            int r11 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r10.D()
            yl3 r10 = r10.C()
            ci0 r10 = r10.d
            r10.n(r12)
            return r2
        L80:
            t26 r11 = (defpackage.t26) r11
            if (r11 == 0) goto L8f
            z82 r10 = r10.I0
            if (r10 == 0) goto L8f
            me.magnum.melonds.ui.layouteditor.b r10 = r10.A
            if (r10 == 0) goto L8f
            r10.C(r11)
        L8f:
            return r2
        L90:
            t26 r11 = (defpackage.t26) r11
            if (r11 == 0) goto La0
            me.magnum.melonds.ui.layouteditor.b r10 = r10.F0
            if (r10 == 0) goto L9c
            r10.C(r11)
            goto La0
        L9c:
            defpackage.nb3.a0(r0)
            throw r1
        La0:
            return r2
        La1:
            w71 r11 = (defpackage.w71) r11
            if (r11 != 0) goto Lc6
            me.magnum.melonds.ui.layouteditor.b r11 = r10.F0
            if (r11 == 0) goto Lc2
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r11 = r11.getLayoutEditorView()
            r11.b()
            z82 r10 = r10.I0
            if (r10 == 0) goto Ldd
            me.magnum.melonds.ui.layouteditor.b r10 = r10.A
            if (r10 == 0) goto Ldd
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r10 = r10.getLayoutEditorView()
            if (r10 == 0) goto Ldd
            r10.b()
            goto Ldd
        Lc2:
            defpackage.nb3.a0(r0)
            throw r1
        Lc6:
            android.os.Handler r12 = r10.G0
            java.lang.String r0 = "handler"
            if (r12 == 0) goto Le2
            r12.removeCallbacksAndMessages(r1)
            android.os.Handler r12 = r10.G0
            if (r12 == 0) goto Lde
            mf r0 = new mf
            r1 = 25
            r0.<init>(r1, r10, r11)
            r12.post(r0)
        Ldd:
            return r2
        Lde:
            defpackage.nb3.a0(r0)
            throw r1
        Le2:
            defpackage.nb3.a0(r0)
            throw r1
    }
}
