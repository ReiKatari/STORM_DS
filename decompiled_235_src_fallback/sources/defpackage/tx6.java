package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx6  reason: default package */
/* loaded from: classes.dex */
public final class tx6 {
    public static final java.lang.String d = null;
    public final android.content.ComponentName a;
    public final defpackage.q61 b;
    public final boolean c;

    static {
            java.lang.String r0 = "SystemJobInfoConverter"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.tx6.d = r0
            return
    }

    public tx6(android.content.Context r2, defpackage.q61 r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.b = r3
            android.content.Context r2 = r2.getApplicationContext()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r0 = androidx.work.impl.background.systemjob.SystemJobService.class
            r3.<init>(r2, r0)
            r1.a = r3
            r1.c = r4
            return
    }
}
