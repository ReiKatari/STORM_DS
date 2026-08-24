package androidx.appcompat.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {
    public final int A;
    public final int B;

    public AlertController$RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = defpackage.m75.t
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            r0 = -1
            int r3 = r2.getDimensionPixelOffset(r3, r0)
            r1.B = r3
            r3 = 1
            int r2 = r2.getDimensionPixelOffset(r3, r0)
            r1.A = r2
            return
    }
}
