package q;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s2 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f12020a;

    public s2(SearchView searchView) {
        this.f12020a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f12020a.q();
        return true;
    }
}
