package q;

import android.view.View;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q2 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f11993a;

    public q2(SearchView searchView) {
        this.f11993a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        SearchView searchView = this.f11993a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.I0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z10);
        }
    }
}
