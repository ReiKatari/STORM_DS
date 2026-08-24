package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq6  reason: default package */
/* loaded from: classes.dex */
public final class jq6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public jq6(android.content.Context r6, android.content.res.XmlResourceParser r7) {
            r5 = this;
            r5.<init>()
            r0 = 2143289344(0x7fc00000, float:NaN)
            r5.a = r0
            r5.b = r0
            r5.c = r0
            r5.d = r0
            r0 = -1
            r5.e = r0
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
            int[] r0 = defpackage.e75.u
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
            int r0 = r7.getIndexCount()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L7e
            int r2 = r7.getIndex(r1)
            if (r2 != 0) goto L44
            int r3 = r5.e
            int r2 = r7.getResourceId(r2, r3)
            r5.e = r2
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r6.getResources()
            r4.getResourceName(r2)
            java.lang.String r2 = "layout"
            r2.equals(r3)
            goto L7b
        L44:
            r3 = 1
            if (r2 != r3) goto L50
            float r3 = r5.d
            float r2 = r7.getDimension(r2, r3)
            r5.d = r2
            goto L7b
        L50:
            r3 = 2
            if (r2 != r3) goto L5c
            float r3 = r5.b
            float r2 = r7.getDimension(r2, r3)
            r5.b = r2
            goto L7b
        L5c:
            r3 = 3
            if (r2 != r3) goto L68
            float r3 = r5.c
            float r2 = r7.getDimension(r2, r3)
            r5.c = r2
            goto L7b
        L68:
            r3 = 4
            if (r2 != r3) goto L74
            float r3 = r5.a
            float r2 = r7.getDimension(r2, r3)
            r5.a = r2
            goto L7b
        L74:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.String r3 = "Unknown tag"
            android.util.Log.v(r2, r3)
        L7b:
            int r1 = r1 + 1
            goto L1f
        L7e:
            r7.recycle()
            return
    }
}
