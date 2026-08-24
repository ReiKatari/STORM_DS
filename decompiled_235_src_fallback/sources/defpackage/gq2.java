package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq2  reason: default package */
/* loaded from: classes.dex */
public final class gq2 extends defpackage.hw6 implements defpackage.eo2 {
    public boolean X;
    public int Y;
    public final /* synthetic */ defpackage.hq2 Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;

    public gq2(defpackage.hq2 r1, boolean r2, boolean r3, defpackage.r41 r4) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            gq2 r0 = (defpackage.gq2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            gq2 r4 = new gq2
            boolean r0 = r2.d0
            boolean r1 = r2.e0
            hq2 r2 = r2.Z
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r13.Y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            hq2 r6 = r13.Z
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L19
            boolean r0 = r13.X
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> La8
            goto La4
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r5
        L1f:
            boolean r0 = r13.X
            defpackage.oi2.Y(r14)
            goto L7c
        L25:
            boolean r7 = r13.X
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L2b
            goto L4b
        L2b:
            r0 = move-exception
            r14 = r0
            goto L5b
        L2e:
            defpackage.oi2.Y(r14)
            android.content.SharedPreferences r14 = r6.f
            java.lang.String r0 = "translator_pause_on_translate"
            boolean r7 = r14.getBoolean(r0, r4)
            eq2 r14 = new eq2     // Catch: java.lang.Throwable -> L2b
            r14.<init>(r6, r5, r2)     // Catch: java.lang.Throwable -> L2b
            r13.X = r7     // Catch: java.lang.Throwable -> L2b
            r13.Y = r4     // Catch: java.lang.Throwable -> L2b
            r8 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r14 = defpackage.xk2.N(r8, r14, r13)     // Catch: java.lang.Throwable -> L2b
            if (r14 != r1) goto L4b
            goto La3
        L4b:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.lang.Throwable -> L2b
            if (r14 == 0) goto L59
            boolean r0 = defpackage.hq2.b(r6, r14)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L59
            r14.recycle()     // Catch: java.lang.Throwable -> L2b
        L58:
            r14 = r5
        L59:
            r0 = r7
            goto L63
        L5b:
            java.lang.String r0 = "GameTranslatorManager"
            java.lang.String r8 = "MediaProjection capture failed"
            android.util.Log.e(r0, r8, r14)
            goto L58
        L63:
            if (r14 != 0) goto L8d
            r13.X = r0
            r13.Y = r3
            r6.getClass()
            xe1 r14 = defpackage.xk1.a
            jv2 r14 = defpackage.e04.a
            dq2 r3 = new dq2
            r3.<init>(r6, r5)
            java.lang.Object r14 = defpackage.hv.d0(r14, r3, r13)
            if (r14 != r1) goto L7c
            goto La3
        L7c:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            if (r14 == 0) goto L87
            boolean r3 = defpackage.hq2.b(r6, r14)
            if (r3 != 0) goto L87
            goto L8d
        L87:
            if (r14 == 0) goto L8c
            r14.recycle()
        L8c:
            r14 = r5
        L8d:
            if (r14 != 0) goto La6
            wc0 r14 = r6.c
            eq2 r14 = new eq2     // Catch: java.lang.Throwable -> La8
            r3 = 4
            r14.<init>(r6, r5, r3)     // Catch: java.lang.Throwable -> La8
            r13.X = r0     // Catch: java.lang.Throwable -> La8
            r13.Y = r2     // Catch: java.lang.Throwable -> La8
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r14 = defpackage.xk2.N(r2, r14, r13)     // Catch: java.lang.Throwable -> La8
            if (r14 != r1) goto La4
        La3:
            return r1
        La4:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.lang.Throwable -> La8
        La6:
            r8 = r14
            goto La9
        La8:
            r8 = r5
        La9:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r14 = r6.l
            if (r14 == 0) goto Lb2
            boolean r1 = r13.d0
            r14.setShowFloatingButton(r1)
        Lb2:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r14 = r6.l
            if (r14 == 0) goto Lb9
            r14.invalidate()
        Lb9:
            if (r0 == 0) goto Lc2
            r6.n = r4
            bv1 r14 = r6.d     // Catch: java.lang.Throwable -> Lc2
            r14.c()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r14 = 0
            if (r8 == 0) goto Le3
            int r0 = r8.getWidth()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto Ld7
            int r0 = r8.getHeight()
            r1 = 384(0x180, float:5.38E-43)
            if (r0 != r1) goto Ld7
            r9 = r4
            goto Ld8
        Ld7:
            r9 = r14
        Ld8:
            r11 = 0
            r12 = 8
            hq2 r7 = r13.Z
            boolean r10 = r13.e0
            defpackage.hq2.f(r7, r8, r9, r10, r11, r12)
            goto L101
        Le3:
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r13 = r6.l
            if (r13 == 0) goto Lea
            r13.setTranslating(r14)
        Lea:
            boolean r13 = r6.n
            if (r13 == 0) goto Lf5
            r6.n = r14
            bv1 r13 = r6.e     // Catch: java.lang.Throwable -> Lf5
            r13.c()     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            android.app.Activity r13 = r6.a
            r0 = 2131952730(0x7f13045a, float:1.954191E38)
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r0, r14)
            r13.show()
        L101:
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
