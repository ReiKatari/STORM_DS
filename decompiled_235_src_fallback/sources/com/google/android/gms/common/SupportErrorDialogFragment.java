package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends androidx.fragment.app.i {
    private android.app.Dialog zaa;
    private android.content.DialogInterface.OnCancelListener zab;
    private android.app.Dialog zac;

    public SupportErrorDialogFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(android.app.Dialog r1) {
            r0 = 0
            com.google.android.gms.common.SupportErrorDialogFragment r1 = newInstance(r1, r0)
            return r1
    }

    public static com.google.android.gms.common.SupportErrorDialogFragment newInstance(android.app.Dialog r2, android.content.DialogInterface.OnCancelListener r3) {
            com.google.android.gms.common.SupportErrorDialogFragment r0 = new com.google.android.gms.common.SupportErrorDialogFragment
            r0.<init>()
            java.lang.String r1 = "Cannot display null dialog"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnCancelListener(r1)
            r2.setOnDismissListener(r1)
            r0.zaa = r2
            if (r3 == 0) goto L1a
            r0.zab = r3
        L1a:
            return r0
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            android.content.DialogInterface$OnCancelListener r0 = r0.zab
            if (r0 == 0) goto L7
            r0.onCancel(r1)
        L7:
            return
    }

    @Override // androidx.fragment.app.i
    public android.app.Dialog onCreateDialog(android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = r1.zaa
            if (r2 != 0) goto L24
            r2 = 0
            r1.setShowsDialog(r2)
            android.app.Dialog r2 = r1.zac
            if (r2 != 0) goto L21
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r0 = r1.getContext()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.Context r0 = (android.content.Context) r0
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            r1.zac = r2
        L21:
            android.app.Dialog r1 = r1.zac
            return r1
        L24:
            return r2
    }

    @Override // androidx.fragment.app.i
    public void show(androidx.fragment.app.u r1, java.lang.String r2) {
            r0 = this;
            super.show(r1, r2)
            return
    }
}
