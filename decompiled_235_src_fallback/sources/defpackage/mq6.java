package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq6  reason: default package */
/* loaded from: classes.dex */
public final class mq6 {
    public java.lang.CharSequence a;
    public final android.text.TextPaint b;
    public final int c;
    public int d;
    public android.text.Layout.Alignment e;
    public int f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public android.text.TextUtils.TruncateAt l;
    public defpackage.h61 m;

    public mq6(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r1 = r1.length()
            r0.d = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.e = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f = r1
            r1 = 0
            r0.g = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.h = r1
            r1 = 1
            r0.i = r1
            r0.j = r1
            r1 = 0
            r0.l = r1
            return
    }

    public final android.text.StaticLayout a() {
            r7 = this;
            java.lang.CharSequence r0 = r7.a
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
            r7.a = r0
        L8:
            int r0 = r7.c
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.CharSequence r2 = r7.a
            int r3 = r7.f
            android.text.TextPaint r4 = r7.b
            r5 = 1
            if (r3 != r5) goto L1f
            float r3 = (float) r0
            android.text.TextUtils$TruncateAt r6 = r7.l
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r4, r3, r6)
        L1f:
            int r3 = r2.length()
            int r6 = r7.d
            int r3 = java.lang.Math.min(r3, r6)
            r7.d = r3
            boolean r6 = r7.k
            if (r6 == 0) goto L37
            int r6 = r7.f
            if (r6 != r5) goto L37
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r7.e = r6
        L37:
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r2, r1, r3, r4, r0)
            android.text.Layout$Alignment r1 = r7.e
            r0.setAlignment(r1)
            boolean r1 = r7.j
            r0.setIncludePad(r1)
            boolean r1 = r7.k
            if (r1 == 0) goto L4c
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            goto L4e
        L4c:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
        L4e:
            r0.setTextDirection(r1)
            android.text.TextUtils$TruncateAt r1 = r7.l
            if (r1 == 0) goto L58
            r0.setEllipsize(r1)
        L58:
            int r1 = r7.f
            r0.setMaxLines(r1)
            float r1 = r7.g
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L6c
            float r2 = r7.h
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L71
        L6c:
            float r2 = r7.h
            r0.setLineSpacing(r1, r2)
        L71:
            int r1 = r7.f
            if (r1 <= r5) goto L7a
            int r1 = r7.i
            r0.setHyphenationFrequency(r1)
        L7a:
            h61 r7 = r7.m
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r7.B
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            qs r7 = r7.t0
            int r7 = r7.getBreakStrategy()
            r0.setBreakStrategy(r7)
        L8b:
            android.text.StaticLayout r7 = r0.build()
            return r7
    }
}
