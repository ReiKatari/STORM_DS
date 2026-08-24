package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq6  reason: default package */
/* loaded from: classes.dex */
public final class iq6 {
    public final int a;
    public final java.util.ArrayList b;
    public final int c;

    public iq6(android.content.Context r6, android.content.res.XmlResourceParser r7) {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.b = r0
            r0 = -1
            r5.c = r0
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
            int[] r0 = defpackage.e75.q
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
            int r0 = r7.getIndexCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L4f
            int r2 = r7.getIndex(r1)
            if (r2 != 0) goto L2d
            int r3 = r5.a
            int r2 = r7.getResourceId(r2, r3)
            r5.a = r2
            goto L4c
        L2d:
            r3 = 1
            if (r2 != r3) goto L4c
            int r3 = r5.c
            int r2 = r7.getResourceId(r2, r3)
            r5.c = r2
            android.content.res.Resources r3 = r6.getResources()
            java.lang.String r3 = r3.getResourceTypeName(r2)
            android.content.res.Resources r4 = r6.getResources()
            r4.getResourceName(r2)
            java.lang.String r2 = "layout"
            r2.equals(r3)
        L4c:
            int r1 = r1 + 1
            goto L1c
        L4f:
            r7.recycle()
            return
    }
}
