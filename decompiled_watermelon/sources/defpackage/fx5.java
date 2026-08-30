package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fx5  reason: default package */
/* loaded from: classes.dex */
public final class fx5 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public fx5(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.q();
        return true;
    }
}
