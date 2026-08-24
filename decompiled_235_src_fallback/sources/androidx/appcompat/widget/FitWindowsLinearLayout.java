package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends android.widget.LinearLayout {
    public FitWindowsLinearLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r0 = super.fitSystemWindows(r1)
            return r0
    }

    public void setOnFitSystemWindowsListener(defpackage.fd2 r1) {
            r0 = this;
            return
    }
}
