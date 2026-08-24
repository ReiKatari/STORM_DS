package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx6  reason: default package */
/* loaded from: classes.dex */
public final class hx6 {
    public final defpackage.fx6 a;
    public final java.util.ArrayList b;
    public defpackage.e83 c;
    public defpackage.e83 d;
    public int e;

    public hx6(android.view.ViewGroup r7) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b = r0
            e83 r0 = defpackage.e83.e
            r6.c = r0
            r6.d = r0
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            r2 = 0
            if (r1 == 0) goto L20
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            int r0 = r0.getColor()
            goto L21
        L20:
            r0 = r2
        L21:
            r6.e = r0
            fx6 r0 = new fx6
            android.content.Context r1 = r7.getContext()
            r0.<init>(r6, r1, r7)
            r6.a = r0
            r1 = 8
            r0.setVisibility(r1)
            r1 = 1
            r0.setWillNotDraw(r1)
            h61 r3 = new h61
            r4 = 21
            r3.<init>(r6, r4)
            java.util.WeakHashMap r4 = defpackage.ao7.a
            defpackage.sn7.c(r0, r3)
            gx6 r3 = new gx6
            r3.<init>(r6)
            defpackage.ao7.p(r0, r3)
            int r6 = r7.getChildCount()
            int r6 = r6 - r1
        L50:
            if (r6 < 0) goto L64
            android.view.View r3 = r7.getChildAt(r6)
            boolean r4 = r3.isAttachedToWindow()
            boolean r5 = r7.isAttachedToWindow()
            if (r4 == r5) goto L61
            goto L65
        L61:
            int r6 = r6 + (-1)
            goto L50
        L64:
            r3 = 0
        L65:
            if (r3 != 0) goto L6b
            r7.addView(r0, r2)
            return
        L6b:
            wh6 r6 = new wh6
            r6.<init>(r7, r0, r1)
            r3.addOnAttachStateChangeListener(r6)
            return
    }
}
