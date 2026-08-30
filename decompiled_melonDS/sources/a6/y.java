package a6;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements z {
    public final ScrollFeedbackProvider A;

    public y(NestedScrollView nestedScrollView) {
        this.A = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // a6.z
    public final void onScrollLimit(int i2, int i10, int i11, boolean z10) {
        this.A.onScrollLimit(i2, i10, i11, z10);
    }

    @Override // a6.z
    public final void onScrollProgress(int i2, int i10, int i11, int i12) {
        this.A.onScrollProgress(i2, i10, i11, i12);
    }
}
