package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x15  reason: default package */
/* loaded from: classes.dex */
public final class x15 extends defpackage.wg5 {
    public final android.graphics.drawable.Drawable u;
    public final android.content.res.ColorStateList v;
    public final android.util.SparseArray w;
    public boolean x;
    public boolean y;

    public x15(android.view.View r5) {
            r4 = this;
            r4.<init>(r5)
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 4
            r0.<init>(r1)
            r4.w = r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r2 = r5.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.put(r1, r2)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r3 = r5.findViewById(r1)
            r0.put(r1, r3)
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r3 = r5.findViewById(r1)
            r0.put(r1, r3)
            r1 = 2131427617(0x7f0b0121, float:1.8476855E38)
            android.view.View r3 = r5.findViewById(r1)
            r0.put(r1, r3)
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r3 = r5.findViewById(r1)
            r0.put(r1, r3)
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            r4.u = r5
            if (r2 == 0) goto L4d
            android.content.res.ColorStateList r5 = r2.getTextColors()
            r4.v = r5
        L4d:
            return
    }

    public final android.view.View q(int r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.w
            java.lang.Object r1 = r0.get(r3)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            android.view.View r2 = r2.a
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L16
            r0.put(r3, r2)
        L16:
            return r2
    }
}
