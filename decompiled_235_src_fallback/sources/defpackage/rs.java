package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs  reason: default package */
/* loaded from: classes.dex */
public abstract class rs {
    public static android.text.StaticLayout a(java.lang.CharSequence r2, android.text.Layout.Alignment r3, int r4, int r5, android.widget.TextView r6, android.text.TextPaint r7, defpackage.us r8) {
            r0 = 0
            int r1 = r2.length()
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r2, r0, r1, r7, r4)
            android.text.StaticLayout$Builder r3 = r2.setAlignment(r3)
            float r4 = r6.getLineSpacingExtra()
            float r7 = r6.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r3 = r3.setLineSpacing(r4, r7)
            boolean r4 = r6.getIncludeFontPadding()
            android.text.StaticLayout$Builder r3 = r3.setIncludePad(r4)
            int r4 = r6.getBreakStrategy()
            android.text.StaticLayout$Builder r3 = r3.setBreakStrategy(r4)
            int r4 = r6.getHyphenationFrequency()
            android.text.StaticLayout$Builder r3 = r3.setHyphenationFrequency(r4)
            r4 = -1
            if (r5 != r4) goto L37
            r5 = 2147483647(0x7fffffff, float:NaN)
        L37:
            r3.setMaxLines(r5)
            r8.a(r2, r6)     // Catch: java.lang.ClassCastException -> L3e
            goto L45
        L3e:
            java.lang.String r3 = "ACTVAutoSizeHelper"
            java.lang.String r4 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r3, r4)
        L45:
            android.text.StaticLayout r2 = r2.build()
            return r2
    }
}
