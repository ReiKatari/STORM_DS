package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u15  reason: default package */
/* loaded from: classes.dex */
public final class u15 {
    public static final java.lang.Class[] e = null;
    public static final java.util.HashMap f = null;
    public final android.content.Context a;
    public final java.lang.Object[] b;
    public final defpackage.v15 c;
    public final java.lang.String[] d;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            defpackage.u15.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.u15.f = r0
            return
    }

    public u15(android.content.Context r3, defpackage.v15 r4) {
            r2 = this;
            r2.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.b = r0
            r2.a = r3
            r2.c = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.preference.Preference> r4 = androidx.preference.Preference.class
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<androidx.preference.SwitchPreference> r1 = androidx.preference.SwitchPreference.class
            java.lang.Package r1 = r1.getPackage()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r2.d = r3
            return
    }

    public final androidx.preference.Preference a(java.lang.String r12, java.lang.String[] r13, android.util.AttributeSet r14) {
            r11 = this;
            java.util.HashMap r0 = defpackage.u15.f
            java.lang.Object r1 = r0.get(r12)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r2 = ": Error inflating class "
            r3 = 1
            if (r1 != 0) goto L6d
            android.content.Context r1 = r11.a     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r4 = 0
            if (r13 == 0) goto L5d
            int r5 = r13.length     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            if (r5 != 0) goto L1a
            goto L5d
        L1a:
            int r5 = r13.length     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r6 = 0
            r7 = r4
            r8 = r6
        L1e:
            if (r7 >= r5) goto L3c
            r9 = r13[r7]     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            r10.<init>()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            r10.append(r9)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            r10.append(r12)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class r6 = java.lang.Class.forName(r9, r4, r1)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L38
            goto L3c
        L36:
            r11 = move-exception
            goto L78
        L38:
            r8 = move-exception
            int r7 = r7 + 1
            goto L1e
        L3c:
            if (r6 != 0) goto L61
            if (r8 != 0) goto L5c
            android.view.InflateException r11 = new android.view.InflateException     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r13.<init>()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.String r0 = r14.getPositionDescription()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r13.append(r0)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r13.append(r2)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r13.append(r12)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r11.<init>(r13)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            throw r11     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
        L5c:
            throw r8     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
        L5d:
            java.lang.Class r6 = java.lang.Class.forName(r12, r4, r1)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
        L61:
            java.lang.Class[] r13 = defpackage.u15.e     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.reflect.Constructor r1 = r6.getConstructor(r13)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r0.put(r12, r1)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
        L6d:
            java.lang.Object[] r11 = r11.b     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            r11[r3] = r14     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            java.lang.Object r11 = r1.newInstance(r11)     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            androidx.preference.Preference r11 = (androidx.preference.Preference) r11     // Catch: java.lang.Exception -> L36 java.lang.ClassNotFoundException -> L97
            return r11
        L78:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r0.append(r14)
            r0.append(r2)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            r13.initCause(r11)
            throw r13
        L97:
            r11 = move-exception
            throw r11
    }

    public final androidx.preference.Preference b(java.lang.String r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 46
            int r0 = r3.indexOf(r0)     // Catch: java.lang.Exception -> L16 java.lang.ClassNotFoundException -> L18 android.view.InflateException -> L5c
            r1 = -1
            if (r1 != r0) goto L10
            java.lang.String[] r0 = r2.d     // Catch: java.lang.Exception -> L16 java.lang.ClassNotFoundException -> L18 android.view.InflateException -> L5c
            androidx.preference.Preference r2 = r2.a(r3, r0, r4)     // Catch: java.lang.Exception -> L16 java.lang.ClassNotFoundException -> L18 android.view.InflateException -> L5c
            return r2
        L10:
            r0 = 0
            androidx.preference.Preference r2 = r2.a(r3, r0, r4)     // Catch: java.lang.Exception -> L16 java.lang.ClassNotFoundException -> L18 android.view.InflateException -> L5c
            return r2
        L16:
            r2 = move-exception
            goto L1a
        L18:
            r2 = move-exception
            goto L3b
        L1a:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.getPositionDescription()
            r1.append(r4)
            java.lang.String r4 = ": Error inflating class "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            r0.initCause(r2)
            throw r0
        L3b:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.getPositionDescription()
            r1.append(r4)
            java.lang.String r4 = ": Error inflating class (not found)"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            r0.initCause(r2)
            throw r0
        L5c:
            r2 = move-exception
            throw r2
    }

    public final androidx.preference.PreferenceGroup c(android.content.res.XmlResourceParser r6, androidx.preference.PreferenceScreen r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r2 = r5.b     // Catch: java.lang.Throwable -> L31
            android.content.Context r3 = r5.a     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L31
        Le:
            int r2 = r6.next()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r3 = 2
            if (r2 == r3) goto L18
            r4 = 1
            if (r2 != r4) goto Le
        L18:
            if (r2 != r3) goto L39
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            androidx.preference.Preference r2 = r5.b(r2, r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            if (r7 != 0) goto L2c
            v15 r7 = r5.c     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r2.onAttachedToHierarchy(r7)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r7 = r2
        L2c:
            r5.d(r6, r7, r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return r7
        L31:
            r5 = move-exception
            goto L87
        L33:
            r5 = move-exception
            goto L54
        L35:
            r5 = move-exception
            goto L79
        L37:
            r5 = move-exception
            goto L86
        L39:
            android.view.InflateException r5 = new android.view.InflateException     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r7.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            java.lang.String r1 = r6.getPositionDescription()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r7.append(r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            java.lang.String r1 = ": No start tag found!"
            r7.append(r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
            throw r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33 org.xmlpull.v1.XmlPullParserException -> L35 android.view.InflateException -> L37
        L54:
            android.view.InflateException r7 = new android.view.InflateException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.getPositionDescription()     // Catch: java.lang.Throwable -> L31
            r1.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = ": "
            r1.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r5.getMessage()     // Catch: java.lang.Throwable -> L31
            r1.append(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r7.initCause(r5)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L79:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r7 = r5.getMessage()     // Catch: java.lang.Throwable -> L31
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L31
            r6.initCause(r5)     // Catch: java.lang.Throwable -> L31
            throw r6     // Catch: java.lang.Throwable -> L31
        L86:
            throw r5     // Catch: java.lang.Throwable -> L31
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    public final void d(org.xmlpull.v1.XmlPullParser r9, androidx.preference.Preference r10, android.util.AttributeSet r11) {
            r8 = this;
            int r0 = r9.getDepth()
        L4:
            int r1 = r9.next()
            r2 = 3
            if (r1 != r2) goto L11
            int r3 = r9.getDepth()
            if (r3 <= r0) goto L7c
        L11:
            r3 = 1
            if (r1 == r3) goto L7c
            r4 = 2
            if (r1 == r4) goto L18
            goto L4
        L18:
            java.lang.String r1 = r9.getName()
            java.lang.String r4 = "intent"
            boolean r4 = r4.equals(r1)
            java.lang.String r5 = "Error parsing preference"
            android.content.Context r6 = r8.a
            if (r4 == 0) goto L3e
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.io.IOException -> L34
            android.content.Intent r1 = android.content.Intent.parseIntent(r1, r9, r11)     // Catch: java.io.IOException -> L34
            r10.setIntent(r1)
            goto L4
        L34:
            r8 = move-exception
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            r9.<init>(r5)
            r9.initCause(r8)
            throw r9
        L3e:
            java.lang.String r4 = "extra"
            boolean r7 = r4.equals(r1)
            if (r7 == 0) goto L6e
            android.content.res.Resources r1 = r6.getResources()
            android.os.Bundle r6 = r10.getExtras()
            r1.parseBundleExtra(r4, r11, r6)
            int r1 = r9.getDepth()     // Catch: java.io.IOException -> L64
        L55:
            int r4 = r9.next()     // Catch: java.io.IOException -> L64
            if (r4 == r3) goto L4
            if (r4 != r2) goto L55
            int r4 = r9.getDepth()     // Catch: java.io.IOException -> L64
            if (r4 > r1) goto L55
            goto L4
        L64:
            r8 = move-exception
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            r9.<init>(r5)
            r9.initCause(r8)
            throw r9
        L6e:
            androidx.preference.Preference r1 = r8.b(r1, r11)
            r2 = r10
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            r2.e(r1)
            r8.d(r9, r1, r11)
            goto L4
        L7c:
            return
    }
}
