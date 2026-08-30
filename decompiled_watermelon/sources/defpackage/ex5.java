package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex5  reason: default package */
/* loaded from: classes.dex */
public final class ex5 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public ex5(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.J0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
