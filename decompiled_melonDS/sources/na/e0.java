package na;

import l.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f10139a;

    /* renamed from: b  reason: collision with root package name */
    public i0 f10140b;

    /* renamed from: c  reason: collision with root package name */
    public int[][] f10141c;

    /* renamed from: d  reason: collision with root package name */
    public i0[] f10142d;

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
            r11 = this;
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto Ld1
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto Ld1
        L15:
            r4 = 2
            if (r2 != r4) goto L6
            if (r3 > r0) goto L6
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L6
        L27:
            android.content.res.Resources r2 = r12.getResources()
            int[] r3 = t9.a.B
            r4 = 0
            if (r15 != 0) goto L35
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r3)
            goto L39
        L35:
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r3, r4, r4)
        L39:
            android.util.TypedValue r3 = r2.peekValue(r4)
            if (r3 != 0) goto L40
            goto L6d
        L40:
            int r5 = r3.type
            r6 = 5
            if (r5 != r6) goto L5c
            na.c0 r5 = new na.c0
            na.d0 r6 = na.d0.PIXELS
            int r3 = r3.data
            android.content.res.Resources r7 = r2.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r7)
            float r3 = (float) r3
            r5.<init>(r6, r3)
            goto L6e
        L5c:
            r6 = 6
            if (r5 != r6) goto L6d
            na.c0 r5 = new na.c0
            na.d0 r6 = na.d0.PERCENT
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r7, r7)
            r5.<init>(r6, r3)
            goto L6e
        L6d:
            r5 = 0
        L6e:
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r3 = new int[r2]
            r6 = r4
            r7 = r6
        L79:
            if (r6 >= r2) goto L94
            int r8 = r14.getAttributeNameResource(r6)
            r9 = 2130970089(0x7f0405e9, float:1.7548878E38)
            if (r8 == r9) goto L91
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r6, r4)
            if (r10 == 0) goto L8d
            goto L8e
        L8d:
            int r8 = -r8
        L8e:
            r3[r7] = r8
            r7 = r9
        L91:
            int r6 = r6 + 1
            goto L79
        L94:
            int[] r2 = android.util.StateSet.trimStateSet(r3, r7)
            l.i0 r3 = new l.i0
            r6 = 10
            r7 = 0
            r3.<init>(r6, r7)
            r3.B = r5
            int r5 = r11.f10139a
            if (r5 == 0) goto La9
            int r6 = r2.length
            if (r6 != 0) goto Lab
        La9:
            r11.f10140b = r3
        Lab:
            int[][] r6 = r11.f10141c
            int r7 = r6.length
            if (r5 < r7) goto Lc2
            int r7 = r5 + 10
            int[][] r8 = new int[r7]
            java.lang.System.arraycopy(r6, r4, r8, r4, r5)
            r11.f10141c = r8
            l.i0[] r6 = new l.i0[r7]
            l.i0[] r7 = r11.f10142d
            java.lang.System.arraycopy(r7, r4, r6, r4, r5)
            r11.f10142d = r6
        Lc2:
            int[][] r4 = r11.f10141c
            int r5 = r11.f10139a
            r4[r5] = r2
            l.i0[] r2 = r11.f10142d
            r2[r5] = r3
            int r5 = r5 + r1
            r11.f10139a = r5
            goto L6
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: na.e0.a(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
