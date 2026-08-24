package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv6 implements java.lang.Runnable {
    public final /* synthetic */ defpackage.qv6 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;

    public /* synthetic */ nv6(defpackage.qv6 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            qv6 r0 = r4.A
            int r1 = r0.i
            int r2 = r4.B
            r3 = 1
            if (r1 == r2) goto Ld
            r0.i = r2
            r1 = r3
            goto Le
        Ld:
            r1 = 0
        Le:
            int r2 = r0.h
            int r4 = r4.L
            if (r2 == r4) goto L17
            r0.h = r4
            goto L18
        L17:
            r3 = r1
        L18:
            if (r3 == 0) goto L1d
            r0.e()
        L1d:
            return
    }
}
