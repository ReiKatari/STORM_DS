package androidx.work;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements defpackage.j53 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "WrkMgrInitializer"
            java.lang.String r0 = defpackage.ga0.h(r0)
            androidx.work.WorkManagerInitializer.a = r0
            return
    }

    public WorkManagerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.j53
    public final java.util.List a() {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // defpackage.j53
    public final java.lang.Object b(android.content.Context r3) {
            r2 = this;
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r0 = androidx.work.WorkManagerInitializer.a
            java.lang.String r1 = "Initializing WorkManager with default configuration."
            r2.b(r0, r1)
            os0 r2 = new os0
            r0 = 26
            r1 = 0
            r2.<init>(r0, r1)
            az0 r0 = new az0
            r0.<init>(r2)
            r3.getClass()
            defpackage.lw7.d(r3, r0)
            lw7 r2 = defpackage.lw7.b(r3)
            r2.getClass()
            return r2
    }
}
