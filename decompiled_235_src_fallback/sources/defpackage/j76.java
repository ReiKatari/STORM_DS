package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j76  reason: default package */
/* loaded from: classes.dex */
public final class j76 implements defpackage.k76 {
    public final android.view.ScrollFeedbackProvider A;

    public j76(androidx.core.widget.NestedScrollView r1) {
            r0 = this;
            r0.<init>()
            android.view.ScrollFeedbackProvider r1 = android.view.ScrollFeedbackProvider.createProvider(r1)
            r0.A = r1
            return
    }

    @Override // defpackage.k76
    public final void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.A
            r0.onScrollLimit(r1, r2, r3, r4)
            return
    }

    @Override // defpackage.k76
    public final void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.A
            r0.onScrollProgress(r1, r2, r3, r4)
            return
    }
}
