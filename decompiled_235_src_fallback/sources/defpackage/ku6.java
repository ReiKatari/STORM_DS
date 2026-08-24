package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku6  reason: default package */
/* loaded from: classes.dex */
public final class ku6 extends android.view.MenuInflater {
    public static final java.lang.Class[] e = null;
    public static final java.lang.Class[] f = null;
    public final java.lang.Object[] a;
    public final java.lang.Object[] b;
    public final android.content.Context c;
    public java.lang.Object d;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            defpackage.ku6.e = r0
            defpackage.ku6.f = r0
            return
    }

    public ku6(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.c = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.a = r1
            r0.b = r1
            return
    }

    public static java.lang.Object a(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = a(r1)
        L13:
            return r1
    }

    public final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            ju6 r2 = new ju6
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        Lf:
            java.lang.String r4 = "menu"
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L2e
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L24
            int r3 = r17.next()
            goto L34
        L24:
            java.lang.String r0 = "Expecting menu, got "
            java.lang.String r0 = r0.concat(r3)
            defpackage.u34.j(r0)
            return
        L2e:
            int r3 = r17.next()
            if (r3 != r6) goto L26f
        L34:
            r7 = 0
            r9 = r7
            r10 = r9
            r11 = 0
        L38:
            if (r9 != 0) goto L26e
            if (r3 == r6) goto L269
            java.lang.String r12 = "item"
            java.lang.String r13 = "group"
            r14 = 3
            android.view.Menu r15 = r2.a
            if (r3 == r5) goto Lbb
            if (r3 == r14) goto L4b
        L47:
            r8 = r17
            goto Lb8
        L4b:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L5e
            boolean r14 = r3.equals(r11)
            if (r14 == 0) goto L5e
            r8 = r17
            r10 = r7
            r5 = 0
            r11 = 0
            goto L262
        L5e:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L71
            r2.b = r7
            r2.c = r7
            r2.d = r7
            r2.e = r7
            r2.f = r6
            r2.g = r6
            goto L47
        L71:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto Laf
            boolean r3 = r2.h
            if (r3 != 0) goto L47
            p44 r3 = r2.z
            if (r3 == 0) goto L9d
            android.view.ActionProvider r3 = r3.b
            boolean r3 = r3.hasSubMenu()
            if (r3 == 0) goto L9d
            r2.h = r6
            int r3 = r2.b
            int r12 = r2.i
            int r13 = r2.j
            java.lang.CharSequence r14 = r2.k
            android.view.SubMenu r3 = r15.addSubMenu(r3, r12, r13, r14)
            android.view.MenuItem r3 = r3.getItem()
            r2.b(r3)
            goto L47
        L9d:
            r2.h = r6
            int r3 = r2.b
            int r12 = r2.i
            int r13 = r2.j
            java.lang.CharSequence r14 = r2.k
            android.view.MenuItem r3 = r15.add(r3, r12, r13, r14)
            r2.b(r3)
            goto L47
        Laf:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L47
            r8 = r17
            r9 = r6
        Lb8:
            r5 = 0
            goto L262
        Lbb:
            if (r10 == 0) goto Lbe
            goto L47
        Lbe:
            java.lang.String r3 = r17.getName()
            boolean r13 = r3.equals(r13)
            android.content.Context r8 = r0.c
            r5 = 4
            if (r13 == 0) goto Lfc
            int[] r3 = defpackage.m75.p
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r8 = r3.getResourceId(r6, r7)
            r2.b = r8
            int r8 = r3.getInt(r14, r7)
            r2.c = r8
            int r5 = r3.getInt(r5, r7)
            r2.d = r5
            r5 = 5
            int r5 = r3.getInt(r5, r7)
            r2.e = r5
            r13 = 2
            boolean r5 = r3.getBoolean(r13, r6)
            r2.f = r5
            boolean r5 = r3.getBoolean(r7, r6)
            r2.g = r5
            r3.recycle()
            goto L47
        Lfc:
            r13 = 2
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L23c
            int[] r3 = defpackage.m75.q
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r1, r3)
            int r12 = r3.getResourceId(r13, r7)
            r2.i = r12
            int r12 = r2.c
            r15 = 5
            int r12 = r3.getInt(r15, r12)
            r15 = 6
            int r13 = r2.d
            int r13 = r3.getInt(r15, r13)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r12 = r12 & r15
            r15 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r15
            r12 = r12 | r13
            r2.j = r12
            r12 = 7
            java.lang.CharSequence r12 = r3.getText(r12)
            r2.k = r12
            r12 = 8
            java.lang.CharSequence r12 = r3.getText(r12)
            r2.l = r12
            int r12 = r3.getResourceId(r7, r7)
            r2.m = r12
            r12 = 9
            java.lang.String r12 = r3.getString(r12)
            if (r12 != 0) goto L146
            r12 = r7
            goto L14a
        L146:
            char r12 = r12.charAt(r7)
        L14a:
            r2.n = r12
            r12 = 16
            r13 = 4096(0x1000, float:5.74E-42)
            int r12 = r3.getInt(r12, r13)
            r2.o = r12
            r12 = 10
            java.lang.String r12 = r3.getString(r12)
            if (r12 != 0) goto L160
            r12 = r7
            goto L164
        L160:
            char r12 = r12.charAt(r7)
        L164:
            r2.p = r12
            r12 = 20
            int r12 = r3.getInt(r12, r13)
            r2.q = r12
            r12 = 11
            boolean r13 = r3.hasValue(r12)
            if (r13 == 0) goto L17d
            boolean r12 = r3.getBoolean(r12, r7)
            r2.r = r12
            goto L181
        L17d:
            int r12 = r2.e
            r2.r = r12
        L181:
            boolean r12 = r3.getBoolean(r14, r7)
            r2.s = r12
            boolean r12 = r2.f
            boolean r5 = r3.getBoolean(r5, r12)
            r2.t = r5
            boolean r5 = r2.g
            boolean r5 = r3.getBoolean(r6, r5)
            r2.u = r5
            r5 = 21
            r12 = -1
            int r5 = r3.getInt(r5, r12)
            r2.v = r5
            r5 = 12
            java.lang.String r5 = r3.getString(r5)
            r2.y = r5
            r5 = 13
            int r5 = r3.getResourceId(r5, r7)
            r2.w = r5
            r5 = 15
            java.lang.String r5 = r3.getString(r5)
            r2.x = r5
            r5 = 14
            java.lang.String r5 = r3.getString(r5)
            if (r5 == 0) goto L1c2
            r13 = r6
            goto L1c3
        L1c2:
            r13 = r7
        L1c3:
            if (r13 == 0) goto L1da
            int r14 = r2.w
            if (r14 != 0) goto L1da
            java.lang.String r14 = r2.x
            if (r14 != 0) goto L1da
            java.lang.Class[] r13 = defpackage.ku6.f
            java.lang.Object[] r14 = r0.b
            java.lang.Object r5 = r2.a(r5, r13, r14)
            p44 r5 = (defpackage.p44) r5
            r2.z = r5
            goto L1e6
        L1da:
            if (r13 == 0) goto L1e3
            java.lang.String r5 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r5, r13)
        L1e3:
            r5 = 0
            r2.z = r5
        L1e6:
            r5 = 17
            java.lang.CharSequence r5 = r3.getText(r5)
            r2.A = r5
            r5 = 22
            java.lang.CharSequence r5 = r3.getText(r5)
            r2.B = r5
            r5 = 19
            boolean r13 = r3.hasValue(r5)
            if (r13 == 0) goto L20b
            int r5 = r3.getInt(r5, r12)
            android.graphics.PorterDuff$Mode r12 = r2.D
            android.graphics.PorterDuff$Mode r5 = defpackage.bp1.c(r5, r12)
            r2.D = r5
            goto L20e
        L20b:
            r5 = 0
            r2.D = r5
        L20e:
            r5 = 18
            boolean r12 = r3.hasValue(r5)
            if (r12 == 0) goto L231
            boolean r12 = r3.hasValue(r5)
            if (r12 == 0) goto L229
            int r12 = r3.getResourceId(r5, r7)
            if (r12 == 0) goto L229
            android.content.res.ColorStateList r8 = defpackage.ge7.A(r8, r12)
            if (r8 == 0) goto L229
            goto L22d
        L229:
            android.content.res.ColorStateList r8 = r3.getColorStateList(r5)
        L22d:
            r2.C = r8
            r5 = 0
            goto L234
        L231:
            r5 = 0
            r2.C = r5
        L234:
            r3.recycle()
            r2.h = r7
            r8 = r17
            goto L262
        L23c:
            r5 = 0
            boolean r8 = r3.equals(r4)
            if (r8 == 0) goto L25e
            r2.h = r6
            int r3 = r2.b
            int r8 = r2.i
            int r12 = r2.j
            java.lang.CharSequence r13 = r2.k
            android.view.SubMenu r3 = r15.addSubMenu(r3, r8, r12, r13)
            android.view.MenuItem r8 = r3.getItem()
            r2.b(r8)
            r8 = r17
            r0.b(r8, r1, r3)
            goto L262
        L25e:
            r8 = r17
            r11 = r3
            r10 = r6
        L262:
            int r3 = r8.next()
            r5 = 2
            goto L38
        L269:
            java.lang.String r0 = "Unexpected end of document"
            defpackage.u34.j(r0)
        L26e:
            return
        L26f:
            r8 = r17
            goto Lf
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r6, android.view.Menu r7) {
            r5 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r7 instanceof defpackage.i44
            if (r1 != 0) goto La
            super.inflate(r6, r7)
            return
        La:
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.c     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.XmlResourceParser r1 = r3.getLayout(r6)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r3 = r7 instanceof defpackage.i44     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r3 == 0) goto L30
            r3 = r7
            i44 r3 = (defpackage.i44) r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r4 = r3.p     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r4 != 0) goto L30
            r3.w()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            r2 = 1
            goto L30
        L2a:
            r5 = move-exception
            goto L4a
        L2c:
            r5 = move-exception
            goto L3e
        L2e:
            r5 = move-exception
            goto L44
        L30:
            r5.b(r1, r6, r7)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r2 == 0) goto L3a
            i44 r7 = (defpackage.i44) r7
            r7.v()
        L3a:
            r1.close()
            return
        L3e:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L44:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        L4a:
            if (r2 == 0) goto L51
            i44 r7 = (defpackage.i44) r7
            r7.v()
        L51:
            if (r1 == 0) goto L56
            r1.close()
        L56:
            throw r5
    }
}
