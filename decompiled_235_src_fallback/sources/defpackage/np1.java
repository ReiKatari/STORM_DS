package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np1  reason: default package */
/* loaded from: classes.dex */
public final class np1 implements android.widget.AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ np1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final void a(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    private final void b(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    private final void c(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    private final void d(android.widget.AdapterView r1) {
            r0 = this;
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            int r2 = r0.A
            java.lang.Object r0 = r0.B
            switch(r2) {
                case 0: goto L77;
                case 1: goto L1b;
                case 2: goto Ld;
                default: goto L7;
            }
        L7:
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            r0.o(r3)
            return
        Ld:
            r1 = -1
            if (r3 == r1) goto L1a
            ax3 r0 = (defpackage.ax3) r0
            mp1 r0 = r0.L
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setListSelectionHidden(r1)
        L1a:
            return
        L1b:
            r1.getClass()
            me.magnum.melonds.ui.layouteditor.b r0 = (me.magnum.melonds.ui.layouteditor.b) r0
            nb1 r1 = r0.L
            boolean r2 = r0.k0
            if (r2 == 0) goto L76
            boolean r2 = r0.p0
            if (r2 == 0) goto L2b
            goto L76
        L2b:
            nj3 r2 = r0.l0
            if (r2 != 0) goto L30
            goto L76
        L30:
            t52 r4 = defpackage.kl3.getEntries()
            u52 r4 = (defpackage.u52) r4
            java.lang.Object r3 = r4.get(r3)
            kl3 r3 = (defpackage.kl3) r3
            r0.m0 = r3
            int[] r3 = defpackage.hl3.a
            int r4 = r2.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L52
            r4 = 2
            if (r3 == r4) goto L4d
            goto L56
        L4d:
            kl3 r3 = r0.m0
            r0.o0 = r3
            goto L56
        L52:
            kl3 r3 = r0.m0
            r0.n0 = r3
        L56:
            kl3 r3 = r0.m0
            il3 r4 = defpackage.il3.WIDTH
            r0.q(r3, r4)
            java.lang.Object r3 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r3 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r3
            float r4 = r0.h0
            float r5 = r0.i0
            r3.u(r4, r5)
            java.lang.Object r1 = r1.u
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            mf r3 = new mf
            r4 = 26
            r3.<init>(r4, r0, r2)
            r1.post(r3)
        L76:
            return
        L77:
            androidx.preference.DropDownPreference r0 = (androidx.preference.DropDownPreference) r0
            if (r3 < 0) goto L94
            java.lang.CharSequence[] r1 = r0.d0
            r1 = r1[r3]
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r0.e0
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L94
            boolean r2 = r0.callChangeListener(r1)
            if (r2 == 0) goto L94
            r0.h(r1)
        L94:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView r1) {
            r0 = this;
            int r0 = r0.A
            return
    }
}
