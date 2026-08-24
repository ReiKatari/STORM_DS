package me.magnum.melonds.common.workers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroArchShaderInstallWorker extends androidx.work.CoroutineWorker {
    public final defpackage.cp5 g;
    public long h;

    public RetroArchShaderInstallWorker(android.content.Context r1, androidx.work.WorkerParameters r2, defpackage.cp5 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>(r1, r2)
            r0.g = r3
            return
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object e(defpackage.r41 r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.qo5
            if (r0 == 0) goto L13
            r0 = r7
            qo5 r0 = (defpackage.qo5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            qo5 r0 = new qo5
            s41 r7 = (defpackage.s41) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.oi2.Y(r7)
            goto L70
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L33:
            defpackage.oi2.Y(r7)
            goto L5d
        L37:
            defpackage.oi2.Y(r7)
            android.content.Context r7 = r6.a
            r2 = 2131952832(0x7f1304c0, float:1.9542118E38)
            java.lang.String r7 = r7.getString(r2)
            r7.getClass()
            r2 = 0
            wj2 r7 = r6.g(r7, r2, r5)
            r0.Y = r5
            gx3 r7 = r6.b(r7)
            java.lang.Object r7 = defpackage.gi2.m(r7, r0)
            if (r7 != r1) goto L58
            goto L5a
        L58:
            jg7 r7 = defpackage.jg7.a
        L5a:
            if (r7 != r1) goto L5d
            goto L6f
        L5d:
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            ns3 r2 = new ns3
            r5 = 7
            r2.<init>(r6, r3, r5)
            r0.Y = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r2, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            r7.getClass()
            return r7
    }

    public final defpackage.wj2 g(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            xg4 r0 = new xg4
            java.lang.String r1 = "channel_cheat_importing"
            android.content.Context r2 = r2.a
            r0.<init>(r2, r1)
            r1 = -1
            r0.h = r1
            java.lang.CharSequence r3 = defpackage.xg4.b(r3)
            r0.k = r3
            r3 = 2131952838(0x7f1304c6, float:1.954213E38)
            java.lang.String r3 = r2.getString(r3)
            java.lang.CharSequence r3 = defpackage.xg4.b(r3)
            r0.e = r3
            r3 = 2131100536(0x7f060378, float:1.7813456E38)
            int r2 = r2.getColor(r3)
            r0.q = r2
            r2 = 2131230963(0x7f0800f3, float:1.8077994E38)
            android.app.Notification r3 = r0.t
            r3.icon = r2
            r2 = 100
            r0.l = r2
            r0.m = r4
            r0.n = r5
            r2 = 2
            r0.c(r2)
            android.app.Notification r2 = r0.a()
            r2.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            r5 = 101(0x65, float:1.42E-43)
            if (r3 < r4) goto L51
            wj2 r3 = new wj2
            r4 = 1
            r3.<init>(r5, r2, r4)
            return r3
        L51:
            wj2 r3 = new wj2
            r4 = 0
            r3.<init>(r5, r2, r4)
            return r3
    }
}
