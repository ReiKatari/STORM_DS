package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mw7 extends defpackage.po2 implements defpackage.io2 {
    public static final defpackage.mw7 d0 = null;

    static {
            mw7 r0 = new mw7
            java.lang.String r4 = "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;"
            r5 = 1
            r1 = 6
            java.lang.Class<nw7> r2 = defpackage.nw7.class
            java.lang.String r3 = "createSchedulers"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.mw7.d0 = r0
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r3 = this;
            android.content.Context r4 = (android.content.Context) r4
            az0 r5 = (defpackage.az0) r5
            ow7 r6 = (defpackage.ow7) r6
            androidx.work.impl.WorkDatabase r7 = (androidx.work.impl.WorkDatabase) r7
            w87 r8 = (defpackage.w87) r8
            o35 r9 = (defpackage.o35) r9
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            java.lang.String r3 = defpackage.h66.a
            ux6 r0 = new ux6
            r0.<init>(r4, r7, r5)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r3 = androidx.work.impl.background.systemjob.SystemJobService.class
            r1 = 1
            defpackage.fq4.a(r4, r3, r1)
            ga0 r3 = defpackage.ga0.f()
            java.lang.String r7 = defpackage.h66.a
            java.lang.String r2 = "Created SystemJobScheduler and enabled SystemJobService"
            r3.b(r7, r2)
            fu2 r3 = new fu2
            r7 = r9
            r9 = r6
            r6 = r8
            rr6 r8 = new rr6
            r8.<init>(r7, r9)
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4 = 2
            e66[] r4 = new defpackage.e66[r4]
            r5 = 0
            r4[r5] = r0
            r4[r1] = r3
            java.util.List r3 = defpackage.hf.c0(r4)
            return r3
    }
}
