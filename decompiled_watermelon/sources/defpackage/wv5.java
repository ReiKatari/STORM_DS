package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv5  reason: default package */
/* loaded from: classes.dex */
public final class wv5 implements xv5 {
    public final ScrollFeedbackProvider A;

    public wv5(NestedScrollView nestedScrollView) {
        this.A = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.xv5
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.A.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.xv5
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.A.onScrollProgress(i, i2, i3, i4);
    }
}
