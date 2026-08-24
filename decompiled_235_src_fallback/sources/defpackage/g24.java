package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g24  reason: default package */
/* loaded from: classes.dex */
public final class g24 {
    public defpackage.fn a;
    public final /* synthetic */ defpackage.i24 b;

    public g24(defpackage.i24 r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public final void a(android.graphics.drawable.Drawable r3) {
            r2 = this;
            i24 r2 = r2.b
            android.content.res.ColorStateList r0 = r2.n0
            if (r0 == 0) goto L13
            int[] r2 = r2.r0
            int r1 = r0.getDefaultColor()
            int r2 = r0.getColorForState(r2, r1)
            r3.setTint(r2)
        L13:
            return
    }
}
