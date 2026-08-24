package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys1  reason: default package */
/* loaded from: classes.dex */
public final class ys1 extends defpackage.hv {
    public final /* synthetic */ defpackage.hv p;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor q;

    public ys1(defpackage.hv r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.p = r1
            r0.q = r2
            return
    }

    @Override // defpackage.hv
    public final void O(java.lang.Throwable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.q
            hv r1 = r1.p     // Catch: java.lang.Throwable -> Lb
            r1.O(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }

    @Override // defpackage.hv
    public final void P(defpackage.eb r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.q
            hv r1 = r1.p     // Catch: java.lang.Throwable -> Lb
            r1.P(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }
}
