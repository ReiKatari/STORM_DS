package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView A;

    public b(SearchView searchView) {
        this.A = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.A;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f966m0;
        if (searchView.X0 != null) {
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.X0 != null && searchView.M0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i2 != 66 && i2 != 84 && i2 != 61) {
                        if (i2 != 21 && i2 != 22) {
                            if (i2 == 19) {
                                searchAutoComplete.getListSelection();
                                return false;
                            }
                        } else {
                            if (i2 == 21) {
                                length = 0;
                            } else {
                                length = searchAutoComplete.length();
                            }
                            searchAutoComplete.setSelection(length);
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            searchAutoComplete.a();
                            return true;
                        }
                    } else {
                        searchView.n(searchAutoComplete.getListSelection());
                        return true;
                    }
                }
            } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
        }
        return false;
    }
}
