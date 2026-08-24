package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x11  reason: default package */
/* loaded from: classes.dex */
public final class x11 {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public final void a(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = defpackage.e75.p
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            r6 = 1
            r4.a = r6
            int r0 = r5.getIndexCount()
            r1 = 0
        Le:
            if (r1 >= r0) goto L4a
            int r2 = r5.getIndex(r1)
            if (r2 != r6) goto L1f
            float r3 = r4.d
            float r2 = r5.getFloat(r2, r3)
            r4.d = r2
            goto L47
        L1f:
            if (r2 != 0) goto L30
            int r3 = r4.b
            int r2 = r5.getInt(r2, r3)
            r4.b = r2
            int[] r3 = defpackage.z11.h
            r2 = r3[r2]
            r4.b = r2
            goto L47
        L30:
            r3 = 4
            if (r2 != r3) goto L3c
            int r3 = r4.c
            int r2 = r5.getInt(r2, r3)
            r4.c = r2
            goto L47
        L3c:
            r3 = 3
            if (r2 != r3) goto L47
            float r3 = r4.e
            float r2 = r5.getFloat(r2, r3)
            r4.e = r2
        L47:
            int r1 = r1 + 1
            goto Le
        L4a:
            r5.recycle()
            return
    }
}
