package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class em2 implements defpackage.rb0, defpackage.y05 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ em2(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public /* synthetic */ em2(java.lang.Runnable r2, defpackage.ea7 r3, java.lang.Runnable r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.R = r3
            r1.L = r4
            return
    }

    @Override // defpackage.y05
    public void i(androidx.preference.Preference r8) {
            r7 = this;
            java.lang.Object r0 = r7.B
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r0 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r0
            java.lang.Object r1 = r7.L
            p15 r1 = (defpackage.p15) r1
            java.lang.Object r7 = r7.R
            d9 r7 = (defpackage.d9) r7
            du1 r2 = defpackage.du1.A
            java.util.Set r8 = r8.getPersistedStringSet(r2)
            if (r8 == 0) goto L1a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r2 = defpackage.gt0.p1(r8)
        L1a:
            boolean r8 = r0.A
            r3 = 0
            if (r8 == 0) goto L94
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L94
            r1.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r8 = defpackage.gt0.k1(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            android.content.Context r6 = r0.getContext()
            r6.getClass()
            java.lang.String r5 = defpackage.p15.b(r6, r5)
            r2.add(r5)
            goto L40
        L5b:
            zb r4 = new zb
            k15 r5 = r1.a
            android.content.Context r5 = r5.requireContext()
            r4.<init>(r5)
            r5 = 2131952183(0x7f130237, float:1.9540802E38)
            r4.z(r5)
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            qu1 r5 = new qu1
            r6 = 2
            r5.<init>(r8, r1, r0, r6)
            r4.v(r2, r5)
            nu1 r0 = new nu1
            r1 = 3
            r0.<init>(r1, r8, r7)
            r7 = 2131951691(0x7f13004b, float:1.9539804E38)
            r4.y(r7, r0)
            r7 = 2131951750(0x7f130086, float:1.9539923E38)
            r4.x(r7, r3)
            r4.B()
            goto La5
        L94:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r8 = defpackage.gt0.I0(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto La2
            android.net.Uri r3 = android.net.Uri.parse(r8)
        La2:
            r7.a(r3)
        La5:
            return
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r8) {
            r7 = this;
            int r0 = r7.A
            java.lang.Object r1 = r7.R
            java.lang.Object r2 = r7.L
            java.lang.Object r7 = r7.B
            switch(r0) {
                case 1: goto L2e;
                default: goto Lb;
            }
        Lb:
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            java.lang.String r2 = (java.lang.String) r2
            on2 r1 = (defpackage.on2) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r0.<init>(r3)
            hx3 r4 = new hx3
            r4.<init>(r0, r3)
            tj1 r5 = defpackage.tj1.INSTANCE
            hl5 r6 = r8.c
            if (r6 == 0) goto L25
            r6.a(r5, r4)
        L25:
            ix3 r4 = new ix3
            r4.<init>(r0, r8, r1, r3)
            r7.execute(r4)
            return r2
        L2e:
            l61 r7 = (defpackage.l61) r7
            a71 r2 = (defpackage.a71) r2
            eo2 r1 = (defpackage.eo2) r1
            vs0 r0 = defpackage.vs0.h0
            j61 r0 = r7.Z(r0)
            rc3 r0 = (defpackage.rc3) r0
            rk3 r3 = new rk3
            r4 = 2
            r3.<init>(r0, r4)
            tj1 r0 = defpackage.tj1.INSTANCE
            hl5 r4 = r8.c
            if (r4 == 0) goto L4b
            r4.a(r0, r3)
        L4b:
            o41 r7 = defpackage.g04.i(r7)
            u12 r0 = new u12
            r3 = 15
            r4 = 0
            r0.<init>(r1, r8, r4, r3)
            r8 = 1
            ap6 r7 = defpackage.hv.L(r7, r4, r2, r0, r8)
            return r7
    }
}
