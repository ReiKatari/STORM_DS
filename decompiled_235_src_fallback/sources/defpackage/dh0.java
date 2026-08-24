package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dh0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.gh0 B;
    public final /* synthetic */ java.util.List L;
    public final /* synthetic */ int R;

    public /* synthetic */ dh0(defpackage.gh0 r1, java.util.List r2, int r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.A
            r1 = 1
            switch(r0) {
                case 0: goto L3c;
                default: goto L6;
            }
        L6:
            gh0 r0 = r5.B
            java.util.List r2 = r5.L
            int r5 = r5.R
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.l
            boolean r3 = r3.get()
            if (r3 == 0) goto L3b
            java.util.List r3 = r0.k
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L1d
            goto L3b
        L1d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Triggering refresh. Attempts left: "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "CameraPresencePrvdr"
            defpackage.kj2.t(r4, r3)
            bx4 r3 = r0.h
            if (r3 == 0) goto L37
            r3.a()
        L37:
            int r5 = r5 - r1
            r0.d(r5, r2)
        L3b:
            return
        L3c:
            gh0 r0 = r5.B
            java.util.List r2 = r5.L
            int r5 = r5.R
            java.util.concurrent.Executor r3 = r0.a
            dh0 r4 = new dh0
            r4.<init>(r0, r2, r5, r1)
            r3.execute(r4)
            return
    }
}
