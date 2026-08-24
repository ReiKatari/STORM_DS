package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a57  reason: default package */
/* loaded from: classes.dex */
public final class a57 {
    public static defpackage.t31 a(android.view.View r9, defpackage.t31 r10) {
            r0 = 3
            java.lang.String r1 = "ReceiveContent"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onReceive: "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1a:
            s31 r0 = r10.a
            int r1 = r0.k()
            r2 = 2
            if (r1 != r2) goto L24
            return r10
        L24:
            android.content.ClipData r10 = r0.l()
            int r0 = r0.F()
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.CharSequence r1 = r9.getText()
            android.text.Editable r1 = (android.text.Editable) r1
            android.content.Context r9 = r9.getContext()
            r2 = 0
            r3 = r2
            r4 = r3
        L3b:
            int r5 = r10.getItemCount()
            if (r3 >= r5) goto L92
            android.content.ClipData$Item r5 = r10.getItemAt(r3)
            r6 = 1
            r7 = r0 & 1
            if (r7 == 0) goto L57
            java.lang.CharSequence r5 = r5.coerceToText(r9)
            boolean r7 = r5 instanceof android.text.Spanned
            if (r7 == 0) goto L5b
            java.lang.String r5 = r5.toString()
            goto L5b
        L57:
            java.lang.CharSequence r5 = r5.coerceToStyledText(r9)
        L5b:
            if (r5 == 0) goto L8f
            if (r4 != 0) goto L7f
            int r4 = android.text.Selection.getSelectionStart(r1)
            int r7 = android.text.Selection.getSelectionEnd(r1)
            int r8 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r2, r8)
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.max(r2, r4)
            android.text.Selection.setSelection(r1, r4)
            r1.replace(r8, r4, r5)
            r4 = r6
            goto L8f
        L7f:
            int r6 = android.text.Selection.getSelectionEnd(r1)
            java.lang.String r7 = "\n"
            r1.insert(r6, r7)
            int r6 = android.text.Selection.getSelectionEnd(r1)
            r1.insert(r6, r5)
        L8f:
            int r3 = r3 + 1
            goto L3b
        L92:
            r9 = 0
            return r9
    }
}
