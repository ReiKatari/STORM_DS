package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s66  reason: default package */
/* loaded from: classes.dex */
public final class s66 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public int Y;

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            s66 r0 = (defpackage.s66) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            s66 r0 = new s66
            r2 = 2
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 != r2) goto L10
            int r1 = r6.X
            defpackage.oi2.Y(r7)
            goto L3d
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L16:
            defpackage.oi2.Y(r7)
            r7 = 10
            r1 = r7
        L1c:
            if (r1 <= 0) goto L40
            android.graphics.Bitmap r7 = me.magnum.melonds.translator.capture.ScreenCaptureService.d0
            if (r7 == 0) goto L30
            boolean r4 = r7.isRecycled()
            if (r4 != 0) goto L30
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L40
            r0 = 0
            android.graphics.Bitmap r6 = r7.copy(r6, r0)     // Catch: java.lang.Exception -> L40
            return r6
        L30:
            r6.X = r1
            r6.Y = r2
            r4 = 50
            java.lang.Object r7 = defpackage.q60.t(r4, r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            int r1 = r1 + (-1)
            goto L1c
        L40:
            return r3
    }
}
