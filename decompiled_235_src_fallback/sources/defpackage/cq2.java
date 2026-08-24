package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq2  reason: default package */
/* loaded from: classes.dex */
public final class cq2 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ defpackage.hq2 d0;
    public final /* synthetic */ android.graphics.Bitmap e0;

    public cq2(int r1, int r2, defpackage.hq2 r3, android.graphics.Bitmap r4, defpackage.r41 r5) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            cq2 r0 = (defpackage.cq2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            cq2 r0 = new cq2
            hq2 r3 = r6.d0
            android.graphics.Bitmap r4 = r6.e0
            int r1 = r6.Y
            int r2 = r6.Z
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r9)
            return r9
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r2
        L14:
            defpackage.oi2.Y(r9)
            int r9 = r8.Y
            int r1 = r8.Z
            hq2 r4 = r8.d0
            r8.X = r3
            rj0 r5 = new rj0
            r41 r6 = defpackage.np2.V(r8)
            r5.<init>(r3, r6)
            r5.v()
            bq2 r6 = new bq2
            android.graphics.Bitmap r8 = r8.e0
            r6.<init>(r5, r8, r3)
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L44
            r7 = 0
            r3.<init>(r7, r7, r9, r1)     // Catch: java.lang.Throwable -> L44
            android.app.Activity r9 = r4.a     // Catch: java.lang.Throwable -> L44
            android.view.Window r9 = r9.getWindow()     // Catch: java.lang.Throwable -> L44
            android.os.Handler r1 = r4.k     // Catch: java.lang.Throwable -> L44
            defpackage.wa2.x(r9, r3, r8, r6, r1)     // Catch: java.lang.Throwable -> L44
            goto L4f
        L44:
            java.lang.Object r8 = r5.u()
            boolean r8 = r8 instanceof defpackage.sg4
            if (r8 == 0) goto L4f
            r5.G(r2, r2)
        L4f:
            java.lang.Object r8 = r5.s()
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            if (r8 != r0) goto L58
            return r0
        L58:
            return r8
    }
}
