package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q11  reason: default package */
/* loaded from: classes.dex */
public final class q11 {
    public final int a;
    public final java.util.ArrayList b;
    public final int c;
    public final defpackage.z11 d;

    public q11(android.content.Context r7, android.content.res.XmlResourceParser r8) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b = r0
            r0 = -1
            r6.c = r0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
            int[] r0 = defpackage.e75.q
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
            int r0 = r8.getIndexCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L67
            int r2 = r8.getIndex(r1)
            if (r2 != 0) goto L2d
            int r3 = r6.a
            int r2 = r8.getResourceId(r2, r3)
            r6.a = r2
            goto L64
        L2d:
            r3 = 1
            if (r2 != r3) goto L64
            int r3 = r6.c
            int r2 = r8.getResourceId(r2, r3)
            r6.c = r2
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r7.getResources()
            r4.getResourceName(r2)
            java.lang.String r4 = "layout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L64
            z11 r3 = new z11
            r3.<init>()
            r6.d = r3
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
            r5 = 0
            android.view.View r2 = r4.inflate(r2, r5)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3.e(r2)
        L64:
            int r1 = r1 + 1
            goto L1c
        L67:
            r8.recycle()
            return
    }
}
