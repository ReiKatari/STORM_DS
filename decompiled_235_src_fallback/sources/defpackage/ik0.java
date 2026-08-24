package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ik0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.re5 B;

    public /* synthetic */ ik0(defpackage.re5 r1, int r2) {
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
            re5 r1 = r1.B
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L15;
                case 2: goto Lf;
                case 3: goto Lb;
                default: goto L7;
            }
        L7:
            r1.i()
            return
        Lb:
            r1.i()
            return
        Lf:
            if (r1 == 0) goto L14
            r1.i()
        L14:
            return
        L15:
            if (r1 == 0) goto L1a
            r1.i()
        L1a:
            return
        L1b:
            r1.i()
            return
    }
}
