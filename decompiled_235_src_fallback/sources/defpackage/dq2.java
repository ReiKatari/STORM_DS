package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq2  reason: default package */
/* loaded from: classes.dex */
public final class dq2 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public int Y;
    public int Z;
    public final /* synthetic */ defpackage.hq2 d0;

    public dq2(defpackage.hq2 r1, defpackage.r41 r2) {
            r0 = this;
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            dq2 r0 = (defpackage.dq2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            dq2 r2 = new dq2
            hq2 r0 = r0.d0
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 400(0x190, double:1.976E-321)
            r5 = 2
            r6 = 1
            r11 = 0
            if (r2 == 0) goto L2a
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L18
            defpackage.oi2.Y(r21)
            r0 = r21
            goto Lbd
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L1f:
            int r2 = r0.Y
            int r6 = r0.X
            defpackage.oi2.Y(r21)
            r13 = r6
            r6 = r21
            goto L94
        L2a:
            defpackage.oi2.Y(r21)
            hq2 r10 = r0.d0
            bv1 r2 = r10.b
            java.lang.Object r2 = r2.c()
            r8 = r2
            android.view.SurfaceView r8 = (android.view.SurfaceView) r8
            android.app.Activity r2 = r10.a
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.getClass()
            int r7 = r2.getWidth()
            if (r7 >= r6) goto L4d
            r13 = r6
            goto L4e
        L4d:
            r13 = r7
        L4e:
            int r2 = r2.getHeight()
            if (r2 >= r6) goto L55
            r2 = r6
        L55:
            android.view.SurfaceHolder r7 = r8.getHolder()
            android.view.Surface r7 = r7.getSurface()
            boolean r7 = r7.isValid()
            if (r7 == 0) goto L99
            int r7 = r8.getWidth()
            if (r7 <= 0) goto L99
            int r7 = r8.getHeight()
            if (r7 <= 0) goto L99
            int r7 = r8.getWidth()
            int r9 = r8.getHeight()
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r7, r9, r12)
            r9.getClass()
            u12 r7 = new u12
            r12 = 9
            r7.<init>(r8, r9, r10, r11, r12)
            r0.X = r13
            r0.Y = r2
            r0.Z = r6
            java.lang.Object r6 = defpackage.xk2.N(r3, r7, r0)
            if (r6 != r1) goto L94
            goto Lbc
        L94:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L99
            return r6
        L99:
            r15 = r13
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r18 = android.graphics.Bitmap.createBitmap(r15, r2, r6)
            r18.getClass()
            cq2 r14 = new cq2
            hq2 r6 = r0.d0
            r19 = 0
            r16 = r2
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r0.X = r15
            r0.Y = r2
            r0.Z = r5
            java.lang.Object r0 = defpackage.xk2.N(r3, r14, r0)
            if (r0 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lc2
            return r0
        Lc2:
            return r11
    }
}
