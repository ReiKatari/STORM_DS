package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kf1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.fragment.app.b0 B;
    public final /* synthetic */ androidx.fragment.app.g L;

    public /* synthetic */ kf1(androidx.fragment.app.b0 r1, androidx.fragment.app.g r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.A
            java.lang.String r1 = " has completed"
            java.lang.String r2 = "Transition for operation "
            java.lang.String r3 = "FragmentManager"
            r4 = 2
            androidx.fragment.app.g r5 = r6.L
            androidx.fragment.app.b0 r6 = r6.B
            switch(r0) {
                case 0: goto L2c;
                default: goto L10;
            }
        L10:
            boolean r0 = androidx.fragment.app.u.K(r4)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L28:
            r6.c(r5)
            return
        L2c:
            boolean r0 = androidx.fragment.app.u.K(r4)
            if (r0 == 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L44:
            r6.c(r5)
            return
    }
}
