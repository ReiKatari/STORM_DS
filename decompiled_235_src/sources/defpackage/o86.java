package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o86  reason: default package */
/* loaded from: classes.dex */
public final class o86 implements TextWatcher {
    public final /* synthetic */ SearchView A;

    public o86(SearchView searchView) {
        this.A = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.A;
        Editable text = searchView.o0.getText();
        searchView.W0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.v(!isEmpty);
        int i4 = 8;
        if (searchView.U0 && !searchView.N0 && isEmpty) {
            searchView.t0.setVisibility(8);
            i4 = 0;
        }
        searchView.v0.setVisibility(i4);
        searchView.r();
        searchView.u();
        if (searchView.J0 != null && !TextUtils.equals(charSequence, searchView.V0)) {
            t86 t86Var = searchView.J0;
            String charSequence2 = charSequence.toString();
            RomListActivity romListActivity = ((hy5) t86Var).A;
            int i5 = RomListActivity.K0;
            tp6 tp6Var = romListActivity.C().k;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            tp6Var.getClass();
            tp6Var.m(null, charSequence2);
        }
        searchView.V0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
