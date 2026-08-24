package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ju0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.jk5 B;
    public final /* synthetic */ defpackage.yk5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ defpackage.th X;

    public /* synthetic */ ju0(defpackage.jk5 r1, defpackage.yk5 r2, long r3, defpackage.th r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.A
            th r1 = r5.X
            long r2 = r5.R
            yk5 r4 = r5.L
            jk5 r5 = r5.B
            switch(r0) {
                case 0: goto L11;
                default: goto Ld;
            }
        Ld:
            r5.x(r4, r2, r1)
            return
        L11:
            r5.J(r4, r2, r1)
            return
    }
}
