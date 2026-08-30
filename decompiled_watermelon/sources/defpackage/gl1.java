package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl1  reason: default package */
/* loaded from: classes.dex */
public final class gl1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ gl1(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        vc3 vc3Var;
        fl1 fl1Var;
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String charSequence = dropDownPreference.c0[i].toString();
                    if (!charSequence.equals(dropDownPreference.d0) && dropDownPreference.callChangeListener(charSequence)) {
                        dropDownPreference.h(charSequence);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                adapterView.getClass();
                b bVar = (b) obj;
                qa7 qa7Var = bVar.L;
                if (bVar.j0 && !bVar.o0 && (vc3Var = bVar.k0) != null) {
                    bVar.l0 = (pe3) ((f12) pe3.getEntries()).get(i);
                    int i3 = me3.a[vc3Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            bVar.n0 = bVar.l0;
                        }
                    } else {
                        bVar.m0 = bVar.l0;
                    }
                    bVar.q(bVar.l0, ne3.WIDTH);
                    qa7Var.v.t(bVar.g0, bVar.h0);
                    qa7Var.r.post(new we(26, bVar, vc3Var));
                    return;
                }
                return;
            case 2:
                if (i != -1 && (fl1Var = ((yp3) obj).L) != null) {
                    fl1Var.setListSelectionHidden(false);
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
