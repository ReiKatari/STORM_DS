package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc3  reason: default package */
/* loaded from: classes.dex */
public final class wc3 extends defpackage.rj0 {
    public final defpackage.ed3 g0;

    public wc3(defpackage.r41 r2, defpackage.ed3 r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            r1.g0 = r3
            return
    }

    @Override // defpackage.rj0
    public final java.lang.String D() {
            r0 = this;
            java.lang.String r0 = "AwaitContinuation"
            return r0
    }

    @Override // defpackage.rj0
    public final java.lang.Throwable q(defpackage.ed3 r2) {
            r1 = this;
            ed3 r1 = r1.g0
            java.lang.Object r1 = r1.Q()
            boolean r0 = r1 instanceof defpackage.yc3
            if (r0 == 0) goto L14
            r0 = r1
            yc3 r0 = (defpackage.yc3) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L14
            return r0
        L14:
            boolean r0 = r1 instanceof defpackage.av0
            if (r0 == 0) goto L1d
            av0 r1 = (defpackage.av0) r1
            java.lang.Throwable r1 = r1.a
            return r1
        L1d:
            java.util.concurrent.CancellationException r1 = r2.v()
            return r1
    }
}
