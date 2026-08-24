package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oj0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.lw7 B;

    public /* synthetic */ oj0(defpackage.lw7 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r8 = this;
            int r0 = r8.A
            jg7 r1 = defpackage.jg7.a
            lw7 r8 = r8.B
            switch(r0) {
                case 0: goto L67;
                default: goto L9;
            }
        L9:
            androidx.work.impl.WorkDatabase r0 = r8.c
            android.content.Context r2 = r8.a
            java.lang.String r3 = defpackage.ux6.Y
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L1c
            android.app.job.JobScheduler r3 = defpackage.vc3.a(r2)
            r3.cancelAll()
        L1c:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            java.util.ArrayList r2 = defpackage.ux6.b(r2, r3)
            r4 = 0
            if (r2 == 0) goto L48
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L48
            int r5 = r2.size()
            r6 = r4
        L36:
            if (r6 >= r5) goto L48
            java.lang.Object r7 = r2.get(r6)
            int r6 = r6 + 1
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7
            int r7 = r7.getId()
            defpackage.ux6.a(r3, r7)
            goto L36
        L48:
            dx7 r2 = r0.w()
            m16 r2 = r2.a
            rk7 r3 = new rk7
            r5 = 21
            r3.<init>(r5)
            r5 = 1
            java.lang.Object r2 = defpackage.hv.Q(r2, r4, r5, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            az0 r2 = r8.b
            java.util.List r8 = r8.e
            defpackage.h66.b(r2, r0, r8)
            return r1
        L67:
            androidx.work.impl.WorkDatabase r0 = r8.c
            r0.getClass()
            v r2 = new v
            r3 = 7
            java.lang.String r4 = "retroarch-shader-install"
            r2.<init>(r0, r4, r8, r3)
            er2 r3 = new er2
            r4 = 26
            r3.<init>(r2, r4)
            r0.o(r3)
            az0 r2 = r8.b
            java.util.List r8 = r8.e
            defpackage.h66.b(r2, r0, r8)
            return r1
    }
}
