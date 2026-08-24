package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np1  reason: default package */
/* loaded from: classes.dex */
public final class np1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ np1(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        nj3 nj3Var;
        mp1 mp1Var;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String charSequence = dropDownPreference.d0[i].toString();
                    if (!charSequence.equals(dropDownPreference.e0) && dropDownPreference.callChangeListener(charSequence)) {
                        dropDownPreference.h(charSequence);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                adapterView.getClass();
                b bVar = (b) obj;
                nb1 nb1Var = bVar.L;
                if (bVar.k0 && !bVar.p0 && (nj3Var = bVar.l0) != null) {
                    bVar.m0 = (kl3) ((u52) kl3.getEntries()).get(i);
                    int i3 = hl3.a[nj3Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            bVar.o0 = bVar.m0;
                        }
                    } else {
                        bVar.n0 = bVar.m0;
                    }
                    bVar.q(bVar.m0, il3.WIDTH);
                    ((LayoutEditorView) nb1Var.A).u(bVar.h0, bVar.i0);
                    ((Spinner) nb1Var.u).post(new mf(26, bVar, nj3Var));
                    return;
                }
                return;
            case 2:
                if (i != -1 && (mp1Var = ((ax3) obj).L) != null) {
                    mp1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) obj).o(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.A;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }
}
