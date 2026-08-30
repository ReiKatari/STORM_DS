package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: le6  reason: default package */
/* loaded from: classes.dex */
public final class le6 {
    public int a;
    public dz4 b;
    public int[][] c;
    public dz4[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, dz4] */
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
            if (r2 == r1) goto Lce
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto Lce
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
            int[] r3 = defpackage.ay4.B
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
            je6 r5 = new je6
            ke6 r6 = defpackage.ke6.PIXELS
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
            je6 r5 = new je6
            ke6 r6 = defpackage.ke6.PERCENT
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
            dz4 r3 = new dz4
            r3.<init>()
            r3.A = r5
            int r5 = r11.a
            if (r5 == 0) goto La6
            int r6 = r2.length
            if (r6 != 0) goto La8
        La6:
            r11.b = r3
        La8:
            int[][] r6 = r11.c
            int r7 = r6.length
            if (r5 < r7) goto Lbf
            int r7 = r5 + 10
            int[][] r8 = new int[r7]
            java.lang.System.arraycopy(r6, r4, r8, r4, r5)
            r11.c = r8
            dz4[] r6 = new defpackage.dz4[r7]
            dz4[] r7 = r11.d
            java.lang.System.arraycopy(r7, r4, r6, r4, r5)
            r11.d = r6
        Lbf:
            int[][] r4 = r11.c
            int r5 = r11.a
            r4[r5] = r2
            dz4[] r2 = r11.d
            r2[r5] = r3
            int r5 = r5 + r1
            r11.a = r5
            goto L6
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.a(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
