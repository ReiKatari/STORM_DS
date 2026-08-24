package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as  reason: default package */
/* loaded from: classes.dex */
public final class as implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ as(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
            r9 = this;
            int r10 = r9.A
            java.lang.Object r9 = r9.B
            switch(r10) {
                case 0: goto L82;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            androidx.appcompat.widget.SearchView r9 = (androidx.appcompat.widget.SearchView) r9
            r9.n(r12)
            return
        Ld:
            p14 r9 = (defpackage.p14) r9
            ax3 r10 = r9.d0
            r0 = 0
            if (r12 >= 0) goto L25
            pr r1 = r10.v0
            boolean r1 = r1.isShowing()
            if (r1 != 0) goto L1e
            r1 = r0
            goto L2d
        L1e:
            mp1 r1 = r10.L
            java.lang.Object r1 = r1.getSelectedItem()
            goto L2d
        L25:
            android.widget.ListAdapter r1 = r9.getAdapter()
            java.lang.Object r1 = r1.getItem(r12)
        L2d:
            java.lang.CharSequence r1 = defpackage.p14.a(r9, r1)
            r2 = 0
            r9.setText(r1, r2)
            android.widget.AdapterView$OnItemClickListener r3 = r9.getOnItemClickListener()
            if (r3 == 0) goto L7e
            if (r11 == 0) goto L44
            if (r12 >= 0) goto L40
            goto L44
        L40:
            r5 = r11
            r6 = r12
            r7 = r13
            goto L79
        L44:
            pr r9 = r10.v0
            boolean r9 = r9.isShowing()
            if (r9 != 0) goto L4e
            r11 = r0
            goto L55
        L4e:
            mp1 r9 = r10.L
            android.view.View r9 = r9.getSelectedView()
            r11 = r9
        L55:
            pr r9 = r10.v0
            boolean r9 = r9.isShowing()
            if (r9 != 0) goto L60
            r9 = -1
        L5e:
            r12 = r9
            goto L67
        L60:
            mp1 r9 = r10.L
            int r9 = r9.getSelectedItemPosition()
            goto L5e
        L67:
            pr r9 = r10.v0
            boolean r9 = r9.isShowing()
            if (r9 != 0) goto L72
            r13 = -9223372036854775808
            goto L40
        L72:
            mp1 r9 = r10.L
            long r13 = r9.getSelectedItemId()
            goto L40
        L79:
            mp1 r4 = r10.L
            r3.onItemClick(r4, r5, r6, r7)
        L7e:
            r10.dismiss()
            return
        L82:
            cs r9 = (defpackage.cs) r9
            fs r10 = r9.C0
            r10.setSelection(r12)
            android.widget.AdapterView$OnItemClickListener r13 = r10.getOnItemClickListener()
            if (r13 == 0) goto L98
            zr r13 = r9.z0
            long r13 = r13.getItemId(r12)
            r10.performItemClick(r11, r12, r13)
        L98:
            r9.dismiss()
            return
    }
}
