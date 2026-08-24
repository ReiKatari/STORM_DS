package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg3  reason: default package */
/* loaded from: classes.dex */
public final class yg3 {
    public static final java.util.HashMap b = null;
    public java.util.HashMap a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.yg3.b = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<mg3> r2 = defpackage.mg3.class
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L40
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<gh3> r2 = defpackage.gh3.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L40
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<qg3> r2 = defpackage.qg3.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L40
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<ph3> r2 = defpackage.ph3.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L40
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<rh3> r2 = defpackage.rh3.class
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L40
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L40
            return
        L40:
            r0 = move-exception
            java.lang.String r1 = "KeyFrames"
            java.lang.String r2 = "unable to load"
            android.util.Log.e(r1, r2, r0)
            return
    }

    public yg3(android.content.Context r6, android.content.res.XmlResourceParser r7) {
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "KeyFrames"
            r5.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5.a = r2
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r3 = 0
        L13:
            r4 = 1
            if (r2 == r4) goto Le3
            r4 = 2
            if (r2 == r4) goto L32
            r4 = 3
            if (r2 == r4) goto L1e
            goto Ld6
        L1e:
            java.lang.String r2 = "KeyFrameSet"
            java.lang.String r4 = r7.getName()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto Ld6
            goto Le3
        L2c:
            r5 = move-exception
            goto Ldc
        L2f:
            r5 = move-exception
            goto Le0
        L32:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            java.util.HashMap r4 = defpackage.yg3.b     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            boolean r4 = r4.containsKey(r2)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r4 == 0) goto Lb3
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            switch(r3) {
                case -300573030: goto L7e;
                case -298435811: goto L70;
                case 540053991: goto L62;
                case 1153397896: goto L54;
                case 1308496505: goto L46;
                default: goto L45;
            }     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
        L45:
            goto L97
        L46:
            java.lang.String r3 = "KeyTrigger"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r3 == 0) goto L97
            rh3 r2 = new rh3     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto L8b
        L54:
            java.lang.String r3 = "KeyPosition"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r3 == 0) goto L97
            gh3 r2 = new gh3     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto L8b
        L62:
            java.lang.String r3 = "KeyCycle"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r3 == 0) goto L97
            qg3 r2 = new qg3     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto L8b
        L70:
            java.lang.String r3 = "KeyAttribute"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r3 == 0) goto L97
            mg3 r2 = new mg3     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto L8b
        L7e:
            java.lang.String r3 = "KeyTimeCycle"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r3 == 0) goto L97
            ph3 r2 = new ph3     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
        L8b:
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r7)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r2.e(r6, r3)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r5.b(r2)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r3 = r2
            goto Ld6
        L97:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r6.<init>()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            java.lang.String r7 = "Key "
            r6.append(r7)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r6.append(r2)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            java.lang.String r7 = " not found"
            r6.append(r7)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            r5.<init>(r6)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            throw r5     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
        Lb3:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equalsIgnoreCase(r4)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r4 == 0) goto Lc5
            if (r3 == 0) goto Ld6
            java.util.HashMap r2 = r3.d     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto Ld6
            defpackage.j11.d(r6, r7, r2)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto Ld6
        Lc5:
            java.lang.String r4 = "CustomMethod"
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto Ld6
            if (r3 == 0) goto Ld6
            java.util.HashMap r2 = r3.d     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto Ld6
            defpackage.j11.d(r6, r7, r2)     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
        Ld6:
            int r2 = r7.next()     // Catch: java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2f
            goto L13
        Ldc:
            android.util.Log.e(r1, r0, r5)
            goto Le3
        Le0:
            android.util.Log.e(r1, r0, r5)
        Le3:
            return
    }

    public final void a(defpackage.m74 r8) {
            r7 = this;
            java.util.ArrayList r0 = r8.w
            java.util.HashMap r7 = r7.a
            int r1 = r8.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r7.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L15
            r0.addAll(r1)
        L15:
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.get(r1)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L4f
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        L28:
            if (r3 >= r1) goto L4f
            java.lang.Object r4 = r7.get(r3)
            int r3 = r3 + 1
            jg3 r4 = (defpackage.jg3) r4
            android.view.View r5 = r8.b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            o11 r5 = (defpackage.o11) r5
            java.lang.String r5 = r5.Y
            java.lang.String r6 = r4.c
            if (r6 == 0) goto L48
            if (r5 != 0) goto L43
            goto L48
        L43:
            boolean r5 = r5.matches(r6)
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 == 0) goto L28
            r0.add(r4)
            goto L28
        L4f:
            return
    }

    public final void b(defpackage.jg3 r3) {
            r2 = this;
            java.util.HashMap r2 = r2.a
            int r0 = r3.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L1c
            int r0 = r3.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.put(r0, r1)
        L1c:
            int r0 = r3.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r2.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L2d
            r2.add(r3)
        L2d:
            return
    }
}
