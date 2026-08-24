package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b implements android.view.View.OnKeyListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView A;

    public b(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r7, int r8, android.view.KeyEvent r9) {
            r6 = this;
            androidx.appcompat.widget.SearchView r6 = r6.A
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.o0
            android.app.SearchableInfo r1 = r6.Z0
            r2 = 0
            if (r1 != 0) goto Lb
            goto L9f
        Lb:
            boolean r1 = r0.isPopupShowing()
            r3 = 66
            r4 = 1
            if (r1 == 0) goto L6c
            int r1 = r0.getListSelection()
            r5 = -1
            if (r1 == r5) goto L6c
            android.app.SearchableInfo r7 = r6.Z0
            if (r7 != 0) goto L21
            goto L9f
        L21:
            z71 r7 = r6.O0
            if (r7 != 0) goto L27
            goto L9f
        L27:
            int r7 = r9.getAction()
            if (r7 != 0) goto L9f
            boolean r7 = r9.hasNoModifiers()
            if (r7 == 0) goto L9f
            if (r8 == r3) goto L64
            r7 = 84
            if (r8 == r7) goto L64
            r7 = 61
            if (r8 != r7) goto L3e
            goto L64
        L3e:
            r6 = 21
            if (r8 == r6) goto L4f
            r7 = 22
            if (r8 != r7) goto L47
            goto L4f
        L47:
            r6 = 19
            if (r8 != r6) goto L9f
            r0.getListSelection()
            return r2
        L4f:
            if (r8 != r6) goto L53
            r6 = r2
            goto L57
        L53:
            int r6 = r0.length()
        L57:
            r0.setSelection(r6)
            r0.setListSelection(r2)
            r0.clearListSelection()
            r0.a()
            return r4
        L64:
            int r7 = r0.getListSelection()
            r6.n(r7)
            return r4
        L6c:
            android.text.Editable r1 = r0.getText()
            int r1 = android.text.TextUtils.getTrimmedLength(r1)
            if (r1 != 0) goto L77
            goto L9f
        L77:
            boolean r1 = r9.hasNoModifiers()
            if (r1 == 0) goto L9f
            int r9 = r9.getAction()
            if (r9 != r4) goto L9f
            if (r8 != r3) goto L9f
            r7.cancelLongPress()
            android.text.Editable r7 = r0.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "android.intent.action.SEARCH"
            r9 = 0
            android.content.Intent r7 = r6.j(r9, r8, r9, r7)
            android.content.Context r6 = r6.getContext()
            r6.startActivity(r7)
            return r4
        L9f:
            return r2
    }
}
