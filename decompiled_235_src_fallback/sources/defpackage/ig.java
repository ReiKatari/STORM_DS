package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig  reason: default package */
/* loaded from: classes.dex */
public final class ig extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.io.Serializable Y;

    public /* synthetic */ ig(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.io.Serializable r4, int r5) {
            r0 = this;
            r0.B = r5
            r0.L = r1
            r0.R = r2
            r0.X = r3
            r0.Y = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r7 = this;
            int r0 = r7.B
            jg7 r1 = defpackage.jg7.a
            java.io.Serializable r2 = r7.Y
            java.lang.Object r3 = r7.L
            java.lang.Object r4 = r7.R
            java.lang.Object r7 = r7.X
            switch(r0) {
                case 0: goto L67;
                default: goto Lf;
            }
        Lf:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            androidx.fragment.app.g r3 = (androidx.fragment.app.g) r3
            r0 = 2
            boolean r5 = androidx.fragment.app.u.K(r0)
            java.lang.String r6 = "FragmentManager"
            if (r5 == 0) goto L21
            java.lang.String r5 = "Attempting to create TransitionSeekController"
            android.util.Log.v(r6, r5)
        L21:
            dm2 r5 = r3.f
            java.lang.Object r5 = r5.i(r4, r7)
            r3.q = r5
            if (r5 != 0) goto L3a
            boolean r7 = androidx.fragment.app.u.K(r0)
            if (r7 == 0) goto L36
            java.lang.String r7 = "TransitionSeekController was not created."
            android.util.Log.v(r6, r7)
        L36:
            r7 = 1
            r3.r = r7
            goto L66
        L3a:
            dh5 r2 = (defpackage.dh5) r2
            mf1 r5 = new mf1
            r5.<init>(r3, r7, r4)
            r2.A = r5
            boolean r7 = androidx.fragment.app.u.K(r0)
            if (r7 == 0) goto L66
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Started executing operations from "
            r7.<init>(r0)
            androidx.fragment.app.b0 r0 = r3.d
            r7.append(r0)
            java.lang.String r0 = " to "
            r7.append(r0)
            androidx.fragment.app.b0 r0 = r3.e
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        L66:
            return r1
        L67:
            mj1 r3 = (defpackage.mj1) r3
            on2 r4 = (defpackage.on2) r4
            jj1 r7 = (defpackage.jj1) r7
            kk3 r2 = (defpackage.kk3) r2
            r3.g(r4, r7, r2)
            return r1
    }
}
