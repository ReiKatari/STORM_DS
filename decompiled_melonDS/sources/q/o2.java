package q;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import java.text.Normalizer;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o2 implements TextWatcher {
    public final /* synthetic */ SearchView A;

    public o2(SearchView searchView) {
        this.A = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
        SearchView searchView = this.A;
        Editable text = searchView.f966m0.getText();
        searchView.U0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.v(!isEmpty);
        int i12 = 8;
        if (searchView.S0 && !searchView.L0 && isEmpty) {
            searchView.f970r0.setVisibility(8);
            i12 = 0;
        }
        searchView.f972t0.setVisibility(i12);
        searchView.r();
        searchView.u();
        if (searchView.H0 != null && !TextUtils.equals(charSequence, searchView.T0)) {
            u2 u2Var = searchView.H0;
            String charSequence2 = charSequence.toString();
            RomListActivity romListActivity = ((bi.l) u2Var).A;
            int i13 = RomListActivity.D0;
            cd.q1 q1Var = romListActivity.B().f2290g;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            String normalize = Normalizer.normalize(charSequence2, Normalizer.Form.NFD);
            normalize.getClass();
            String T = vc.o.T(normalize, "[^\\p{ASCII}]", "");
            q1Var.getClass();
            q1Var.k(null, T);
        }
        searchView.T0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i10, int i11) {
    }
}
