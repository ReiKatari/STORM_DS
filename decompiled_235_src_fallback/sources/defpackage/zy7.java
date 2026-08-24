package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zy7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zy7 implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zy7(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.a
            r0.<init>(r3, r1)
            boolean r2 = r2.b
            r0.setDaemon(r2)
            return r0
    }
}
