package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr  reason: default package */
/* loaded from: classes.dex */
public final class yr implements es, DialogInterface.OnClickListener {
    public ac A;
    public zr B;
    public CharSequence L;
    public final /* synthetic */ fs R;

    public yr(fs fsVar) {
        this.R = fsVar;
    }

    @Override // defpackage.es
    public final boolean a() {
        ac acVar = this.A;
        if (acVar != null) {
            return acVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.es
    public final int b() {
        return 0;
    }

    @Override // defpackage.es
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.es
    public final CharSequence d() {
        return this.L;
    }

    @Override // defpackage.es
    public final void dismiss() {
        ac acVar = this.A;
        if (acVar != null) {
            acVar.dismiss();
            this.A = null;
        }
    }

    @Override // defpackage.es
    public final Drawable f() {
        return null;
    }

    @Override // defpackage.es
    public final void g(CharSequence charSequence) {
        this.L = charSequence;
    }

    @Override // defpackage.es
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.es
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.es
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.es
    public final void l(int i, int i2) {
        if (this.B == null) {
            return;
        }
        fs fsVar = this.R;
        zb zbVar = new zb(fsVar.getPopupContext());
        wb wbVar = (wb) zbVar.L;
        CharSequence charSequence = this.L;
        if (charSequence != null) {
            wbVar.d = charSequence;
        }
        zr zrVar = this.B;
        int selectedItemPosition = fsVar.getSelectedItemPosition();
        wbVar.r = zrVar;
        wbVar.s = this;
        wbVar.y = selectedItemPosition;
        wbVar.x = true;
        ac l = zbVar.l();
        this.A = l;
        AlertController$RecycleListView alertController$RecycleListView = l.Z.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.A.show();
    }

    @Override // defpackage.es
    public final int m() {
        return 0;
    }

    @Override // defpackage.es
    public final void n(ListAdapter listAdapter) {
        this.B = (zr) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fs fsVar = this.R;
        fsVar.setSelection(i);
        if (fsVar.getOnItemClickListener() != null) {
            fsVar.performItemClick(null, i, this.B.getItemId(i));
        }
        dismiss();
    }
}
