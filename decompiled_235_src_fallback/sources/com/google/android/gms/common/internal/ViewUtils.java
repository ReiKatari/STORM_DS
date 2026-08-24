package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ViewUtils {
    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getXmlAttributeString(java.lang.String r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5, boolean r6, boolean r7, java.lang.String r8) {
            if (r5 != 0) goto L4
            r2 = 0
            goto L8
        L4:
            java.lang.String r2 = r5.getAttributeValue(r2, r3)
        L8:
            if (r2 == 0) goto L5b
            java.lang.String r5 = "@string/"
            boolean r5 = r2.startsWith(r5)
            if (r5 == 0) goto L5b
            if (r6 == 0) goto L5b
            r5 = 8
            java.lang.String r5 = r2.substring(r5)
            java.lang.String r6 = r4.getPackageName()
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources r4 = r4.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L40
            r1.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L40
            r1.append(r6)     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String r6 = ":string/"
            r1.append(r6)     // Catch: android.content.res.Resources.NotFoundException -> L40
            r1.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String r5 = r1.toString()     // Catch: android.content.res.Resources.NotFoundException -> L40
            r6 = 1
            r4.getValue(r5, r0, r6)     // Catch: android.content.res.Resources.NotFoundException -> L40
            goto L47
        L40:
            java.lang.String r4 = "Could not find resource for "
            java.lang.String r5 = ": "
            defpackage.lb1.w(r4, r3, r5, r2, r8)
        L47:
            java.lang.CharSequence r4 = r0.string
            if (r4 == 0) goto L50
            java.lang.String r2 = r4.toString()
            goto L5b
        L50:
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "Resource "
            java.lang.String r6 = " was not a string: "
            defpackage.lb1.w(r5, r3, r6, r4, r8)
        L5b:
            if (r7 == 0) goto L75
            if (r2 != 0) goto L75
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Required XML attribute \""
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "\" missing"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
        L75:
            return r2
    }
}
