package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.util.concurrent.ThreadFactory a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ defpackage.uw c;

    public /* synthetic */ nm(java.util.concurrent.ThreadFactory r1, java.lang.String r2, defpackage.uw r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.util.concurrent.ThreadFactory r0 = r2.a
            java.lang.Thread r3 = r0.newThread(r3)
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.uw.b
            uw r2 = r2.c
            int r2 = r1.incrementAndGet(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1 = 2
            java.lang.String r2 = defpackage.qs6.B0(r1, r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.setName(r2)
            return r3
    }
}
