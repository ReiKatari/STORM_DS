package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cx5  reason: default package */
/* loaded from: classes.dex */
public final class cx5 implements TextWatcher {
    public final /* synthetic */ SearchView A;

    public cx5(SearchView searchView) {
        this.A = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.A;
        Editable text = searchView.n0.getText();
        searchView.V0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.v(!isEmpty);
        int i4 = 8;
        if (searchView.T0 && !searchView.M0 && isEmpty) {
            searchView.s0.setVisibility(8);
            i4 = 0;
        }
        searchView.u0.setVisibility(i4);
        searchView.r();
        searchView.u();
        if (searchView.I0 != null && !TextUtils.equals(charSequence, searchView.U0)) {
            hx5 hx5Var = searchView.I0;
            String charSequence2 = charSequence.toString();
            RomListActivity romListActivity = ((rn5) hx5Var).A;
            int i5 = RomListActivity.J0;
            ee6 ee6Var = romListActivity.C().i;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            ee6Var.getClass();
            ee6Var.l(null, charSequence2);
        }
        searchView.U0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
