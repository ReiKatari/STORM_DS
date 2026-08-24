package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qu1 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ qu1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r14, int r15) {
            r13 = this;
            int r14 = r13.A
            r0 = 0
            r1 = 3
            java.lang.Object r2 = r13.R
            java.lang.Object r3 = r13.L
            java.lang.Object r13 = r13.B
            switch(r14) {
                case 0: goto L11e;
                case 1: goto Ldf;
                case 2: goto L8e;
                case 3: goto L54;
                case 4: goto L3a;
                case 5: goto L1b;
                default: goto Ld;
            }
        Ld:
            ne4 r13 = (defpackage.ne4) r13
            dh5 r3 = (defpackage.dh5) r3
            dh5 r2 = (defpackage.dh5) r2
            java.lang.Object r14 = r3.A
            java.lang.Object r15 = r2.A
            r13.o(r14, r15)
            return
        L1b:
            me.magnum.melonds.ui.romlist.a r13 = (me.magnum.melonds.ui.romlist.a) r13
            r4 = r3
            pq5 r4 = (defpackage.pq5) r4
            r5 = r2
            android.net.Uri r5 = (android.net.Uri) r5
            hu3 r14 = r13.getViewLifecycleOwner()
            r14.getClass()
            au3 r14 = defpackage.bl2.C(r14)
            sy5 r2 = new sy5
            r7 = 0
            r6 = 0
            r3 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            defpackage.hv.L(r14, r6, r6, r2, r1)
            return
        L3a:
            r8 = r13
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r8 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r8
            r9 = r3
            pq5 r9 = (defpackage.pq5) r9
            r10 = r2
            android.net.Uri r10 = (android.net.Uri) r10
            int r13 = me.magnum.melonds.ui.romdetails.RomDetailsActivity.J0
            au3 r13 = defpackage.bl2.C(r8)
            ev5 r7 = new ev5
            r12 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            defpackage.hv.L(r13, r11, r11, r7, r1)
            return
        L54:
            p15 r13 = (defpackage.p15) r13
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r3 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r3
            java.lang.String r2 = (java.lang.String) r2
            r13.getClass()
            du1 r13 = defpackage.du1.A
            java.util.Set r13 = r3.getPersistedStringSet(r13)
            if (r13 == 0) goto L6c
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Set r13 = defpackage.gt0.o1(r13)
            goto L71
        L6c:
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
        L71:
            boolean r14 = r13.remove(r2)
            if (r14 == 0) goto L8d
            java.util.Set r13 = defpackage.gt0.o1(r13)
            boolean r14 = r3.isPersistent()
            if (r14 == 0) goto L84
            r3.persistStringSet(r13)
        L84:
            x05 r14 = r3.getOnPreferenceChangeListener()
            if (r14 == 0) goto L8d
            r14.a(r3, r13)
        L8d:
            return
        L8e:
            java.util.List r13 = (java.util.List) r13
            p15 r3 = (defpackage.p15) r3
            me.magnum.melonds.ui.settings.preferences.StoragePickerPreference r2 = (me.magnum.melonds.ui.settings.preferences.StoragePickerPreference) r2
            java.lang.Object r13 = r13.get(r15)
            java.lang.String r13 = (java.lang.String) r13
            r3.getClass()
            android.content.Context r14 = r2.getContext()
            r14.getClass()
            java.lang.String r14 = defpackage.p15.b(r14, r13)
            zb r15 = new zb
            k15 r4 = r3.a
            android.content.Context r5 = r4.requireContext()
            r15.<init>(r5)
            r5 = 2131952431(0x7f13032f, float:1.9541305E38)
            r15.z(r5)
            r5 = 2131952430(0x7f13032e, float:1.9541303E38)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r14 = r4.getString(r5, r14)
            java.lang.Object r4 = r15.L
            wb r4 = (defpackage.wb) r4
            r4.f = r14
            qu1 r14 = new qu1
            r14.<init>(r3, r2, r13, r1)
            r13 = 2131951680(0x7f130040, float:1.9539781E38)
            r15.y(r13, r14)
            r13 = 2131951750(0x7f130086, float:1.9539923E38)
            r15.x(r13, r0)
            r15.B()
            return
        Ldf:
            java.util.List r13 = (java.util.List) r13
            me.magnum.melonds.ui.layouteditor.b r3 = (me.magnum.melonds.ui.layouteditor.b) r3
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r2
            java.lang.Object r13 = r13.get(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r14 = 2131952101(0x7f1301e5, float:1.9540635E38)
            if (r13 != r14) goto Lf8
            r3.y()
            goto L11d
        Lf8:
            r14 = 2131952113(0x7f1301f1, float:1.954066E38)
            if (r13 != r14) goto L103
            oj3 r13 = defpackage.oj3.SIZE
            r3.z(r13)
            goto L11d
        L103:
            r14 = 2131951768(0x7f130098, float:1.953996E38)
            if (r13 != r14) goto L10c
            r2.j()
            goto L11d
        L10c:
            r14 = 2131951769(0x7f130099, float:1.9539962E38)
            if (r13 != r14) goto L115
            r2.k()
            goto L11d
        L115:
            r14 = 2131951851(0x7f1300eb, float:1.9540128E38)
            if (r13 != r14) goto L11d
            r2.m()
        L11d:
            return
        L11e:
            me.magnum.melonds.ui.emulator.EmulatorActivity r13 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r13
            android.content.Intent r3 = (android.content.Intent) r3
            yh2 r2 = (defpackage.yh2) r2
            int r14 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r13.setIntent(r3)
            sz1 r13 = r13.W()
            r13.getClass()
            tp6 r14 = r13.p0
            java.lang.Object r14 = r14.getValue()
            hy1 r14 = (defpackage.hy1) r14
            boolean r14 = r14.a()
            if (r14 != 0) goto L142
            r13.x0(r2)
            goto L14c
        L142:
            o41 r14 = r13.z
            ja1 r15 = new ja1
            r15.<init>(r13, r2, r0)
            defpackage.hv.L(r14, r0, r0, r15, r1)
        L14c:
            return
    }
}
