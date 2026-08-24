package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lv6 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.pv6 B;

    public /* synthetic */ lv6(defpackage.pv6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            pv6 r1 = r1.B
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L1b;
                default: goto L7;
            }
        L7:
            wv6 r0 = r1.q
            if (r0 == 0) goto Le
            r0.k()
        Le:
            ig1 r0 = r1.p
            if (r0 != 0) goto L17
            qb0 r0 = r1.o
            r0.b()
        L17:
            r0 = 0
            r1.p = r0
            return
        L1b:
            r1.b()
            return
        L1f:
            r1.a()
            return
    }
}
