package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf1  reason: default package */
/* loaded from: classes.dex */
public final class mf1 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public mf1(androidx.fragment.app.g r2, java.lang.Object r3, android.view.ViewGroup r4) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r2 = 0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ mf1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.B = r4
            r0.L = r1
            r0.X = r2
            r0.R = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r11 = this;
            int r0 = r11.B
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r11.R
            java.lang.Object r3 = r11.X
            java.lang.Object r11 = r11.L
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L20;
                default: goto Ld;
            }
        Ld:
            p0 r11 = (defpackage.p0) r11
            wh r3 = (defpackage.wh) r3
            r11.removeOnAttachStateChangeListener(r3)
            do7 r2 = (defpackage.do7) r2
            sz4 r11 = defpackage.bl2.D(r11)
            java.util.ArrayList r11 = r11.a
            r11.remove(r2)
            return r1
        L20:
            androidx.fragment.app.g r11 = (androidx.fragment.app.g) r11
            java.util.ArrayList r0 = r11.c
            dm2 r4 = r11.f
            boolean r5 = r0.isEmpty()
            java.lang.String r6 = "FragmentManager"
            r7 = 2
            if (r5 == 0) goto L30
            goto L6e
        L30:
            int r5 = r0.size()
            r8 = 0
            r9 = r8
        L36:
            if (r9 >= r5) goto L6e
            java.lang.Object r10 = r0.get(r9)
            int r9 = r9 + 1
            nf1 r10 = (defpackage.nf1) r10
            androidx.fragment.app.b0 r10 = r10.a
            boolean r10 = r10.g
            if (r10 != 0) goto L36
            boolean r3 = androidx.fragment.app.u.K(r7)
            if (r3 == 0) goto L51
            java.lang.String r3 = "Completing animating immediately"
            android.util.Log.v(r6, r3)
        L51:
            uj0 r3 = new uj0
            r3.<init>()
            java.lang.Object r0 = r0.get(r8)
            nf1 r0 = (defpackage.nf1) r0
            androidx.fragment.app.b0 r0 = r0.a
            androidx.fragment.app.o r0 = r0.c
            n0 r5 = new n0
            r6 = 16
            r5.<init>(r11, r6)
            r4.u(r0, r2, r3, r5)
            r3.a()
            goto L8a
        L6e:
            boolean r0 = androidx.fragment.app.u.K(r7)
            if (r0 == 0) goto L79
            java.lang.String r0 = "Animating to start"
            android.util.Log.v(r6, r0)
        L79:
            java.lang.Object r0 = r11.q
            r0.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            mf r2 = new mf
            r5 = 15
            r2.<init>(r5, r11, r3)
            r4.d(r0, r2)
        L8a:
            return r1
        L8b:
            androidx.fragment.app.g r11 = (androidx.fragment.app.g) r11
            dm2 r11 = r11.f
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r11.e(r3, r2)
            return r1
    }
}
