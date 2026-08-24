package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lu0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.jk5 B;
    public final /* synthetic */ defpackage.yk5 L;
    public final /* synthetic */ long R;
    public final /* synthetic */ defpackage.hh7 X;

    public /* synthetic */ lu0(defpackage.jk5 r1, defpackage.yk5 r2, long r3, defpackage.hh7 r5, int r6) {
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
            hh7 r1 = r5.X
            long r2 = r5.R
            yk5 r4 = r5.L
            jk5 r5 = r5.B
            switch(r0) {
                case 0: goto L13;
                default: goto Ld;
            }
        Ld:
            uh r1 = (defpackage.uh) r1
            r5.D(r4, r2, r1)
            return
        L13:
            wk5 r1 = (defpackage.wk5) r1
            r5.F(r4, r2, r1)
            return
    }
}
