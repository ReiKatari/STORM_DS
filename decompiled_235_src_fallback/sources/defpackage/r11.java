package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r11  reason: default package */
/* loaded from: classes.dex */
public final class r11 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final defpackage.z11 f;

    public r11(android.content.Context r7, android.content.res.XmlResourceParser r8) {
            r6 = this;
            r6.<init>()
            r0 = 2143289344(0x7fc00000, float:NaN)
            r6.a = r0
            r6.b = r0
            r6.c = r0
            r6.d = r0
            r0 = -1
            r6.e = r0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
            int[] r0 = defpackage.e75.u
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
            int r0 = r8.getIndexCount()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L96
            int r2 = r8.getIndex(r1)
            if (r2 != 0) goto L5c
            int r3 = r6.e
            int r2 = r8.getResourceId(r2, r3)
            r6.e = r2
            android.content.res.Resources r3 = r7.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r7.getResources()
            r4.getResourceName(r2)
            java.lang.String r4 = "layout"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L93
            z11 r3 = new z11
            r3.<init>()
            r6.f = r3
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
            r5 = 0
            android.view.View r2 = r4.inflate(r2, r5)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3.e(r2)
            goto L93
        L5c:
            r3 = 1
            if (r2 != r3) goto L68
            float r3 = r6.d
            float r2 = r8.getDimension(r2, r3)
            r6.d = r2
            goto L93
        L68:
            r3 = 2
            if (r2 != r3) goto L74
            float r3 = r6.b
            float r2 = r8.getDimension(r2, r3)
            r6.b = r2
            goto L93
        L74:
            r3 = 3
            if (r2 != r3) goto L80
            float r3 = r6.c
            float r2 = r8.getDimension(r2, r3)
            r6.c = r2
            goto L93
        L80:
            r3 = 4
            if (r2 != r3) goto L8c
            float r3 = r6.a
            float r2 = r8.getDimension(r2, r3)
            r6.a = r2
            goto L93
        L8c:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.String r3 = "Unknown tag"
            android.util.Log.v(r2, r3)
        L93:
            int r1 = r1 + 1
            goto L1f
        L96:
            r8.recycle()
            return
    }

    public final boolean a(float r4, float r5) {
            r3 = this;
            float r0 = r3.a
            boolean r1 = java.lang.Float.isNaN(r0)
            r2 = 0
            if (r1 != 0) goto Le
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le
            return r2
        Le:
            float r0 = r3.b
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L1b
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1b
            return r2
        L1b:
            float r0 = r3.c
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L28
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L28
            return r2
        L28:
            float r3 = r3.d
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L35
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L35
            return r2
        L35:
            r3 = 1
            return r3
    }
}
