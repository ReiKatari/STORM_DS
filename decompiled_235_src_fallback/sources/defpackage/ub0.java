package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub0  reason: default package */
/* loaded from: classes.dex */
public final class ub0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final int B;
    public final java.lang.Object L;

    public /* synthetic */ ub0(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public ub0(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r3 = 1
            r0.A = r3
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            defpackage.np2.x(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.L = r3
            r0.B = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.A
            int r1 = r4.B
            java.lang.Object r4 = r4.L
            switch(r0) {
                case 0: goto L38;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            f24 r4 = (defpackage.f24) r4
            androidx.recyclerview.widget.RecyclerView r4 = r4.d0
            r4.k0(r1)
            return
        L11:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L29
        L1b:
            if (r3 >= r0) goto L37
            java.lang.Object r1 = r4.get(r3)
            us1 r1 = (defpackage.us1) r1
            r1.a()
            int r3 = r3 + 1
            goto L1b
        L29:
            if (r3 >= r0) goto L37
            java.lang.Object r1 = r4.get(r3)
            us1 r1 = (defpackage.us1) r1
            r1.b()
            int r3 = r3 + 1
            goto L29
        L37:
            return
        L38:
            j97 r4 = (defpackage.j97) r4
            java.lang.Object r4 = r4.B
            gi2 r4 = (defpackage.gi2) r4
            if (r4 == 0) goto L43
            r4.K(r1)
        L43:
            return
    }
}
