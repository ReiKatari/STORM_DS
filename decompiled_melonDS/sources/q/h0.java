package q;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements o0, DialogInterface.OnClickListener {
    public l.g A;
    public i0 B;
    public CharSequence L;
    public final /* synthetic */ p0 R;

    public h0(p0 p0Var) {
        this.R = p0Var;
    }

    @Override // q.o0
    public final int a() {
        return 0;
    }

    @Override // q.o0
    public final boolean b() {
        l.g gVar = this.A;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // q.o0
    public final Drawable d() {
        return null;
    }

    @Override // q.o0
    public final void dismiss() {
        l.g gVar = this.A;
        if (gVar != null) {
            gVar.dismiss();
            this.A = null;
        }
    }

    @Override // q.o0
    public final void f(CharSequence charSequence) {
        this.L = charSequence;
    }

    @Override // q.o0
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // q.o0
    public final void h(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // q.o0
    public final void i(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // q.o0
    public final void j(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // q.o0
    public final void k(int i2, int i10) {
        if (this.B == null) {
            return;
        }
        p0 p0Var = this.R;
        bk.a aVar = new bk.a(p0Var.getPopupContext());
        l.d dVar = (l.d) aVar.L;
        CharSequence charSequence = this.L;
        if (charSequence != null) {
            dVar.f8359d = charSequence;
        }
        i0 i0Var = this.B;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        dVar.f8372r = i0Var;
        dVar.f8373s = this;
        dVar.f8379y = selectedItemPosition;
        dVar.f8378x = true;
        l.g i11 = aVar.i();
        this.A = i11;
        AlertController$RecycleListView alertController$RecycleListView = i11.Z.f8393f;
        alertController$RecycleListView.setTextDirection(i2);
        alertController$RecycleListView.setTextAlignment(i10);
        this.A.show();
    }

    @Override // q.o0
    public final int l() {
        return 0;
    }

    @Override // q.o0
    public final CharSequence m() {
        return this.L;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        p0 p0Var = this.R;
        p0Var.setSelection(i2);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i2, this.B.getItemId(i2));
        }
        dismiss();
    }

    @Override // q.o0
    public final void p(ListAdapter listAdapter) {
        this.B = (i0) listAdapter;
    }
}
