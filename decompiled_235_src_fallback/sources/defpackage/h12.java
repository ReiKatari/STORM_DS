package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h12  reason: default package */
/* loaded from: classes.dex */
public final class h12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.sz1 Y;
    public final /* synthetic */ defpackage.pq5 Z;
    public final /* synthetic */ defpackage.c46 d0;

    public /* synthetic */ h12(defpackage.sz1 r1, defpackage.pq5 r2, defpackage.c46 r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
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
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            h12 r2 = (defpackage.h12) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            h12 r2 = (defpackage.h12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            h12 r0 = new h12
            c46 r3 = r7.d0
            r5 = 1
            sz1 r1 = r7.Y
            pq5 r2 = r7.Z
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            h12 r1 = new h12
            r5 = r4
            c46 r4 = r7.d0
            r6 = 0
            sz1 r2 = r7.Y
            pq5 r3 = r7.Z
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            c46 r1 = r4.d0
            pq5 r2 = r4.Z
            sz1 r4 = r4.Y
            switch(r0) {
                case 0: goto L59;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            yb2 r5 = r4.s
            r5.getClass()
            r2.getClass()
            r1.getClass()
            b46 r0 = r5.c
            r3 = 0
            java.io.File r3 = r0.a(r2, r1, r3)
            if (r3 == 0) goto L2a
            r0.c(r3)
            r3.delete()
        L2a:
            d76 r4 = r4.t
            android.graphics.Bitmap r4 = r4.a()
            r5.getClass()
            b46 r5 = r5.c
            r0 = 1
            java.io.File r0 = r5.a(r2, r1, r0)
            if (r0 != 0) goto L3d
            goto L4f
        L3d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L52
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L52
            r1.close()
            r5.c(r0)
        L4f:
            jg7 r4 = defpackage.jg7.a
            return r4
        L52:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L54
        L54:
            r5 = move-exception
            defpackage.ge7.t(r1, r4)
            throw r5
        L59:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            yb2 r4 = r4.s
            android.net.Uri r4 = r4.b(r2, r1)
            return r4
    }
}
