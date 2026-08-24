package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mm implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.nm b;

    public /* synthetic */ mm(int r1, defpackage.nm r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.a
            r2 = 10
            if (r0 >= r2) goto L13
            int[] r2 = defpackage.pm.a
            r2 = r2[r0]
            if (r1 < r2) goto L10
            int r2 = r0 + 1
            goto L13
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            om r0 = new om
            r0.<init>(r4, r1)
            nm r3 = r3.b
            java.lang.Thread r3 = r3.newThread(r0)
            r3.setPriority(r2)
            return r3
    }
}
