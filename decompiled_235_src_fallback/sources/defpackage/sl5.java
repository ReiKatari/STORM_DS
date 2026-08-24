package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl5  reason: default package */
/* loaded from: classes.dex */
public abstract class sl5 {
    public static final java.lang.ThreadLocal a = null;
    public static final java.util.WeakHashMap b = null;
    public static final java.lang.Object c = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.sl5.a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            defpackage.sl5.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.sl5.c = r0
            return
    }

    public static android.graphics.Typeface a(android.content.Context r7, int r8) {
            boolean r0 = r7.isRestricted()
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            android.graphics.Typeface r7 = b(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static android.graphics.Typeface b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, defpackage.gi2 r16, boolean r17, boolean r18) {
            r7 = r16
            android.content.res.Resources r2 = r12.getResources()
            r0 = 1
            r2.getValue(r13, r14, r0)
            java.lang.String r9 = "ResourcesCompat"
            java.lang.CharSequence r0 = r14.string
            if (r0 == 0) goto Lef
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r10 = 0
            r11 = -3
            if (r0 != 0) goto L25
            if (r7 == 0) goto Lca
            r7.n(r11)
            goto Lca
        L25:
            int r0 = r14.assetCookie
            yz3 r6 = defpackage.je7.b
            java.lang.String r0 = defpackage.je7.b(r2, r13, r4, r0, r15)
            java.lang.Object r0 = r6.h(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r8 = 5
            if (r0 == 0) goto L4c
            if (r7 == 0) goto L49
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r12.<init>(r14)
            q64 r14 = new q64
            r14.<init>(r8, r7, r0)
            r12.post(r14)
        L49:
            r10 = r0
            goto Lca
        L4c:
            if (r18 == 0) goto L50
            goto Lca
        L50:
            java.lang.String r0 = r4.toLowerCase()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r0 == 0) goto L83
            android.content.res.XmlResourceParser r0 = r2.getXml(r13)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            aj2 r1 = defpackage.ej2.O(r0, r2)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r1 != 0) goto L77
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r9, r12)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r7 == 0) goto Lca
            r7.n(r11)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto Lca
        L71:
            r0 = move-exception
            r12 = r0
            goto Lb2
        L74:
            r0 = move-exception
            r12 = r0
            goto Lbc
        L77:
            int r5 = r14.assetCookie     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r0 = r12
            r3 = r13
            r6 = r15
            r8 = r17
            android.graphics.Typeface r10 = defpackage.je7.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto Lca
        L83:
            int r14 = r14.assetCookie     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            bl2 r0 = defpackage.je7.a     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r1 = r12
            r3 = r13
            r5 = r15
            android.graphics.Typeface r12 = r0.r(r1, r2, r3, r4, r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r12 == 0) goto L97
            java.lang.String r14 = defpackage.je7.b(r2, r13, r4, r14, r15)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r6.l(r14, r12)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        L97:
            if (r7 == 0) goto Lac
            if (r12 == 0) goto Lae
            android.os.Handler r14 = new android.os.Handler     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r14.<init>(r0)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            q64 r0 = new q64     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r0.<init>(r8, r7, r12)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r14.post(r0)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        Lac:
            r10 = r12
            goto Lca
        Lae:
            r7.n(r11)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto Lac
        Lb2:
            java.lang.String r14 = "Failed to read xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
            goto Lc5
        Lbc:
            java.lang.String r14 = "Failed to parse xml resource "
            java.lang.String r14 = r14.concat(r4)
            android.util.Log.e(r9, r14, r12)
        Lc5:
            if (r7 == 0) goto Lca
            r7.n(r11)
        Lca:
            if (r10 != 0) goto Lee
            if (r7 != 0) goto Lee
            if (r18 == 0) goto Ld1
            goto Lee
        Ld1:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Font resource ID #0x"
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r13 = " could not be retrieved."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        Lee:
            return r10
        Lef:
            android.content.res.Resources$NotFoundException r12 = new android.content.res.Resources$NotFoundException
            java.lang.String r0 = r2.getResourceName(r13)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Resource \""
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "\" ("
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = ") is not a Font: "
            r1.append(r13)
            r1.append(r14)
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
    }
}
