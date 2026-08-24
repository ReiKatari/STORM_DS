package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx6  reason: default package */
/* loaded from: classes.dex */
public final class fx6 extends android.view.View {
    public final /* synthetic */ android.view.ViewGroup A;
    public final /* synthetic */ defpackage.hx6 B;

    public fx6(defpackage.hx6 r1, android.content.Context r2, android.view.ViewGroup r3) {
            r0 = this;
            r0.B = r1
            r0.A = r3
            r0.<init>(r2)
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            hx6 r3 = r2.B
            java.util.ArrayList r0 = r3.b
            android.view.ViewGroup r2 = r2.A
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            boolean r1 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L15
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            goto L16
        L15:
            r2 = 0
        L16:
            int r1 = r3.e
            if (r1 == r2) goto L30
            r3.e = r2
            int r3 = r0.size()
            int r3 = r3 + (-1)
        L22:
            if (r3 < 0) goto L30
            java.lang.Object r1 = r0.get(r3)
            l45 r1 = (defpackage.l45) r1
            r1.b(r2)
            int r3 = r3 + (-1)
            goto L22
        L30:
            return
    }
}
