package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx2  reason: default package */
/* loaded from: classes.dex */
public final class rx2 extends defpackage.is7 {
    public final java.util.Map a;

    public rx2(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.is7
    public final defpackage.nx3 g(android.content.Context r1, java.lang.String r2, androidx.work.WorkerParameters r3) {
            r0 = this;
            java.util.Map r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            n55 r0 = (defpackage.n55) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.Object r0 = r0.get()
            rb1 r0 = (defpackage.rb1) r0
            int r2 = r0.a
            switch(r2) {
                case 0: goto L3f;
                case 1: goto L2b;
                default: goto L17;
            }
        L17:
            me.magnum.melonds.common.workers.RetroArchShaderInstallWorker r2 = new me.magnum.melonds.common.workers.RetroArchShaderInstallWorker
            mb1 r0 = r0.b
            java.lang.Object r0 = r0.c
            sb1 r0 = (defpackage.sb1) r0
            m55 r0 = r0.p
            java.lang.Object r0 = r0.get()
            cp5 r0 = (defpackage.cp5) r0
            r2.<init>(r1, r3, r0)
            goto L52
        L2b:
            me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker r2 = new me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker
            mb1 r0 = r0.b
            java.lang.Object r0 = r0.c
            sb1 r0 = (defpackage.sb1) r0
            m55 r0 = r0.n
            java.lang.Object r0 = r0.get()
            pn5 r0 = (defpackage.pn5) r0
            r2.<init>(r1, r3, r0)
            goto L52
        L3f:
            me.magnum.melonds.common.workers.CheatImportWorker r2 = new me.magnum.melonds.common.workers.CheatImportWorker
            mb1 r0 = r0.b
            java.lang.Object r0 = r0.c
            sb1 r0 = (defpackage.sb1) r0
            m55 r0 = r0.f
            java.lang.Object r0 = r0.get()
            hp0 r0 = (defpackage.hp0) r0
            r2.<init>(r1, r3, r0)
        L52:
            return r2
    }
}
