package me.magnum.melonds.common.workers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsSubmissionWorker extends androidx.work.CoroutineWorker {
    public final defpackage.pn5 g;

    public RetroAchievementsSubmissionWorker(android.content.Context r1, androidx.work.WorkerParameters r2, defpackage.pn5 r3) {
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
            boolean r0 = r7 instanceof defpackage.go5
            if (r0 == 0) goto L13
            r0 = r7
            go5 r0 = (defpackage.go5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            go5 r0 = new go5
            s41 r7 = (defpackage.s41) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.oi2.Y(r7)
            goto L46
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r7)
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            ns3 r2 = new ns3
            r5 = 6
            r2.<init>(r6, r3, r5)
            r0.Y = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r2, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r6 = r7.A
            boolean r6 = r6 instanceof defpackage.em5
            if (r6 != 0) goto L54
            lx3 r6 = new lx3
            r6.<init>()
            return r6
        L54:
            kx3 r6 = new kx3
            r6.<init>()
            return r6
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object f() {
            r3 = this;
            xg4 r0 = new xg4
            java.lang.String r1 = "channel_cheat_importing"
            android.content.Context r3 = r3.a
            r0.<init>(r3, r1)
            r1 = -1
            r0.h = r1
            r1 = 2131952693(0x7f130435, float:1.9541836E38)
            java.lang.String r1 = r3.getString(r1)
            java.lang.CharSequence r1 = defpackage.xg4.b(r1)
            r0.e = r1
            r1 = 2131100536(0x7f060378, float:1.7813456E38)
            int r3 = r3.getColor(r1)
            r0.q = r3
            r3 = 2131230963(0x7f0800f3, float:1.8077994E38)
            android.app.Notification r1 = r0.t
            r1.icon = r3
            android.app.Notification r3 = r0.a()
            r3.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L3f
            wj2 r0 = new wj2
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        L3f:
            wj2 r0 = new wj2
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
