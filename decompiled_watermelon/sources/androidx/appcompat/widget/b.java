package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView A;

    public b(SearchView searchView) {
        this.A = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.A;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.n0;
        if (searchView.Y0 != null) {
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.Y0 != null && searchView.N0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i != 66 && i != 84 && i != 61) {
                        if (i != 21 && i != 22) {
                            if (i == 19) {
                                searchAutoComplete.getListSelection();
                                return false;
                            }
                        } else {
                            if (i == 21) {
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
            } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                return true;
            }
        }
        return false;
    }
}
