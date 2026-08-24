package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j76  reason: default package */
/* loaded from: classes.dex */
public final class j76 implements k76 {
    public final ScrollFeedbackProvider A;

    public j76(NestedScrollView nestedScrollView) {
        this.A = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.k76
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.A.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.k76
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.A.onScrollProgress(i, i2, i3, i4);
    }
}
