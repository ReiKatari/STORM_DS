package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z05  reason: default package */
/* loaded from: classes.dex */
public final class z05 implements android.view.View.OnCreateContextMenuListener, android.view.MenuItem.OnMenuItemClickListener {
    public final androidx.preference.Preference A;

    public z05(androidx.preference.Preference r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
            r0 = this;
            androidx.preference.Preference r2 = r0.A
            java.lang.CharSequence r3 = r2.getSummary()
            boolean r2 = r2.isCopyingEnabled()
            if (r2 == 0) goto L21
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L13
            goto L21
        L13:
            r1.setHeaderTitle(r3)
            r2 = 2131951834(0x7f1300da, float:1.9540094E38)
            r3 = 0
            android.view.MenuItem r1 = r1.add(r3, r3, r3, r2)
            r1.setOnMenuItemClickListener(r0)
        L21:
            return
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem r3) {
            r2 = this;
            androidx.preference.Preference r2 = r2.A
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            java.lang.CharSequence r0 = r2.getSummary()
            java.lang.String r1 = "Preference"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r0)
            r3.setPrimaryClip(r1)
            android.content.Context r3 = r2.getContext()
            android.content.Context r2 = r2.getContext()
            r1 = 2131952382(0x7f1302fe, float:1.9541205E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = r2.getString(r1, r0)
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r3, r2, r0)
            r2.show()
            r2 = 1
            return r2
    }
}
