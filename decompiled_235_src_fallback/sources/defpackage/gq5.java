package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq5  reason: default package */
/* loaded from: classes.dex */
public final class gq5 extends android.view.ViewGroup {
    public final int A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList L;
    public final defpackage.ap3 R;
    public int d0;

    public gq5(android.content.Context r5) {
            r4 = this;
            r4.<init>(r5)
            r0 = 5
            r4.A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.B = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.L = r1
            ap3 r2 = new ap3
            r3 = 25
            r2.<init>(r3)
            r4.R = r2
            r2 = 0
            r4.setClipChildren(r2)
            hq5 r2 = new hq5
            r2.<init>(r5)
            r4.addView(r2)
            r0.add(r2)
            r1.add(r2)
            r5 = 1
            r4.d0 = r5
            r5 = 2131427609(0x7f0b0119, float:1.847684E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.setTag(r5, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r0 = this;
            return
    }
}
