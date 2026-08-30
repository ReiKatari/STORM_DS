package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public final class lr implements rr, DialogInterface.OnClickListener {
    public tb A;
    public mr B;
    public CharSequence L;
    public final /* synthetic */ sr R;

    public lr(sr srVar) {
        this.R = srVar;
    }

    @Override // defpackage.rr
    public final boolean a() {
        tb tbVar = this.A;
        if (tbVar != null) {
            return tbVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.rr
    public final int b() {
        return 0;
    }

    @Override // defpackage.rr
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.rr
    public final void dismiss() {
        tb tbVar = this.A;
        if (tbVar != null) {
            tbVar.dismiss();
            this.A = null;
        }
    }

    @Override // defpackage.rr
    public final void e(CharSequence charSequence) {
        this.L = charSequence;
    }

    @Override // defpackage.rr
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rr
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rr
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rr
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.rr
    public final void k(int i, int i2) {
        if (this.B == null) {
            return;
        }
        sr srVar = this.R;
        sb sbVar = new sb(srVar.getPopupContext());
        pb pbVar = (pb) sbVar.L;
        CharSequence charSequence = this.L;
        if (charSequence != null) {
            pbVar.d = charSequence;
        }
        mr mrVar = this.B;
        int selectedItemPosition = srVar.getSelectedItemPosition();
        pbVar.r = mrVar;
        pbVar.s = this;
        pbVar.y = selectedItemPosition;
        pbVar.x = true;
        tb l = sbVar.l();
        this.A = l;
        AlertController$RecycleListView alertController$RecycleListView = l.Z.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.A.show();
    }

    @Override // defpackage.rr
    public final int l() {
        return 0;
    }

    @Override // defpackage.rr
    public final CharSequence m() {
        return this.L;
    }

    @Override // defpackage.rr
    public final void n(ListAdapter listAdapter) {
        this.B = (mr) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        sr srVar = this.R;
        srVar.setSelection(i);
        if (srVar.getOnItemClickListener() != null) {
            srVar.performItemClick(null, i, this.B.getItemId(i));
        }
        dismiss();
    }
}
