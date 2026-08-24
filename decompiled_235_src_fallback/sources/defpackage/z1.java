package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z1  reason: default package */
/* loaded from: classes.dex */
public final class z1 extends android.text.style.ClickableSpan {
    public final int A;
    public final defpackage.v2 B;
    public final int L;

    public z1(int r1, defpackage.v2 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r1 = r2.A
            r3.putInt(r0, r1)
            int r0 = r2.L
            v2 r2 = r2.B
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            r2.performAction(r0, r3)
            return
    }
}
