package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ry0 implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String a;

    public /* synthetic */ ry0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r1.a
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }
}
