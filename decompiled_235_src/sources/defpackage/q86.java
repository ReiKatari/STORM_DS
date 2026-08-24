package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q86  reason: default package */
/* loaded from: classes.dex */
public final class q86 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public q86(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.K0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
