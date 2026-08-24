package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb  reason: default package */
/* loaded from: classes.dex */
public final class zb implements defpackage.f3, defpackage.ja3, defpackage.rs7 {
    public final /* synthetic */ int A;
    public int B;
    public java.lang.Object L;

    public /* synthetic */ zb(char r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.<init>()
            return
    }

    public zb(int r3, byte r4) {
            r2 = this;
            r2.A = r3
            switch(r3) {
                case 3: goto L1e;
                case 12: goto L13;
                default: goto L5;
            }
        L5:
            r2.<init>()
            r3 = 0
            r2.B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2.L = r3
            return
        L13:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.L = r3
            return
        L1e:
            r2.<init>()
            r3 = 2
            byte[][] r4 = new byte[r3]
            r0 = 0
        L25:
            if (r0 >= r3) goto L31
            r1 = 614400(0x96000, float:8.60958E-40)
            byte[] r1 = new byte[r1]
            r4[r0] = r1
            int r0 = r0 + 1
            goto L25
        L31:
            r2.L = r4
            return
    }

    public zb(int r1, int r2) {
            r0 = this;
            r0.A = r2
            switch(r2) {
                case 13: goto L21;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r2 = 1
            if (r1 < r2) goto L16
            r2 = 256(0x100, float:3.59E-43)
            if (r1 > r2) goto L16
            r0.B = r1
            byte[] r1 = new byte[r1]
            r0.L = r1
            return
        L16:
            java.lang.String r0 = "Invalid distance: "
            java.lang.String r0 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r0)
            r0 = 0
            throw r0
        L21:
            r0.<init>()
            r0.B = r1
            return
    }

    public zb(int r2, defpackage.nf0 r3) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r3.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public zb(defpackage.ai1 r2, int r3) {
            r1 = this;
            r0 = 13
            r1.A = r0
            r1.L = r2
            r1.<init>(r3, r0)
            return
    }

    public zb(android.content.Context r5) {
            r4 = this;
            r0 = 0
            r4.A = r0
            int r0 = defpackage.ac.i(r5, r0)
            r4.<init>()
            wb r1 = new wb
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            int r3 = defpackage.ac.i(r5, r0)
            r2.<init>(r5, r3)
            r1.<init>(r2)
            r4.L = r1
            r4.B = r0
            return
    }

    public zb(android.content.Context r8, android.content.res.XmlResourceParser r9) {
            r7 = this;
            r0 = 15
            r7.A = r0
            r7.<init>()
            r0 = -1
            r7.B = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r7.L = r0
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ConstraintLayoutStates"
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r9)
            int[] r3 = defpackage.e75.r
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r2, r3)
            int r3 = r2.getIndexCount()
            r4 = 0
        L24:
            if (r4 >= r3) goto L37
            int r5 = r2.getIndex(r4)
            if (r5 != 0) goto L34
            int r6 = r7.B
            int r5 = r2.getResourceId(r5, r6)
            r7.B = r5
        L34:
            int r4 = r4 + 1
            goto L24
        L37:
            r2.recycle()
            int r2 = r9.getEventType()     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            r3 = 0
        L3f:
            r4 = 1
            if (r2 == r4) goto La9
            r4 = 2
            java.lang.String r5 = "StateSet"
            if (r2 == r4) goto L5a
            r4 = 3
            if (r2 == r4) goto L4b
            goto L9d
        L4b:
            java.lang.String r2 = r9.getName()     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            boolean r2 = r5.equals(r2)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            if (r2 == 0) goto L9d
            goto La9
        L56:
            r7 = move-exception
            goto La2
        L58:
            r7 = move-exception
            goto La6
        L5a:
            java.lang.String r2 = r9.getName()     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            int r4 = r2.hashCode()     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            switch(r4) {
                case 80204913: goto L87;
                case 1301459538: goto L80;
                case 1382829617: goto L7b;
                case 1901439077: goto L66;
                default: goto L65;
            }     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
        L65:
            goto L9d
        L66:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            if (r2 == 0) goto L9d
            jq6 r2 = new jq6     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            r2.<init>(r8, r9)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            if (r3 == 0) goto L9d
            java.util.ArrayList r4 = r3.b     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            r4.add(r2)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            goto L9d
        L7b:
            boolean r2 = r2.equals(r5)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            goto L9d
        L80:
            java.lang.String r4 = "LayoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            goto L9d
        L87:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            if (r2 == 0) goto L9d
            iq6 r3 = new iq6     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            r3.<init>(r8, r9)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            java.lang.Object r2 = r7.L     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            int r4 = r3.a     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            r2.put(r4, r3)     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
        L9d:
            int r2 = r9.next()     // Catch: java.io.IOException -> L56 org.xmlpull.v1.XmlPullParserException -> L58
            goto L3f
        La2:
            android.util.Log.e(r1, r0, r7)
            goto La9
        La6:
            android.util.Log.e(r1, r0, r7)
        La9:
            return
    }

    public /* synthetic */ zb(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public zb(java.util.ArrayList r2) {
            r1 = this;
            r0 = 14
            r1.A = r0
            r1.<init>()
            r1.L = r2
            return
    }

    public zb(defpackage.td3 r1, defpackage.u0 r2) {
            r0 = this;
            r1 = 8
            r0.A = r1
            r0.<init>()
            r0.L = r2
            return
    }

    public static final java.lang.Object h(defpackage.zb r13, defpackage.ad1 r14, defpackage.d20 r15) {
            java.lang.Object r0 = r13.L
            u0 r0 = (defpackage.u0) r0
            boolean r1 = r15 instanceof defpackage.qf3
            if (r1 == 0) goto L17
            r1 = r15
            qf3 r1 = (defpackage.qf3) r1
            int r2 = r1.g0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.g0 = r2
            goto L1c
        L17:
            qf3 r1 = new qf3
            r1.<init>(r13, r15)
        L1c:
            java.lang.Object r15 = r1.e0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.g0
            r4 = 0
            r5 = 6
            r6 = 0
            r7 = 7
            r8 = 4
            r9 = 1
            if (r3 == 0) goto L47
            if (r3 != r9) goto L41
            int r13 = r1.d0
            java.lang.String r14 = r1.Z
            java.util.LinkedHashMap r0 = r1.Y
            zb r3 = r1.X
            ad1 r10 = r1.R
            defpackage.oi2.Y(r15)
            r12 = r15
            r15 = r13
            r13 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r12
            goto L8a
        L41:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r4
        L47:
            defpackage.oi2.Y(r15)
            byte r15 = r0.h(r5)
            byte r3 = r0.v()
            if (r3 == r8) goto Lc4
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3 = r1
            r1 = r0
            r0 = r15
            r15 = r14
            r14 = r6
        L5e:
            java.lang.Object r10 = r13.L
            u0 r10 = (defpackage.u0) r10
            boolean r11 = r10.d()
            if (r11 == 0) goto Lac
            java.lang.String r0 = r10.k()
            r11 = 5
            r10.h(r11)
            r3.R = r15
            r3.X = r13
            r3.Y = r1
            r3.Z = r0
            r3.d0 = r14
            r3.g0 = r9
            r15.getClass()
            r15.B = r3
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r2) goto L86
            return r2
        L86:
            r12 = r15
            r15 = r14
            r14 = r0
            r0 = r12
        L8a:
            de3 r10 = (defpackage.de3) r10
            r1.put(r14, r10)
            java.lang.Object r14 = r13.L
            u0 r14 = (defpackage.u0) r14
            byte r14 = r14.g()
            if (r14 == r8) goto La7
            if (r14 != r7) goto L9d
            r0 = r14
            goto Lac
        L9d:
            java.lang.Object r13 = r13.L
            u0 r13 = (defpackage.u0) r13
            java.lang.String r14 = "Expected end of the object or comma"
            defpackage.u0.q(r13, r14, r6, r4, r5)
            throw r4
        La7:
            r12 = r0
            r0 = r14
            r14 = r15
            r15 = r12
            goto L5e
        Lac:
            java.lang.Object r13 = r13.L
            u0 r13 = (defpackage.u0) r13
            if (r0 != r5) goto Lb6
            r13.h(r7)
            goto Lb8
        Lb6:
            if (r0 == r8) goto Lbe
        Lb8:
            ye3 r13 = new ye3
            r13.<init>(r1)
            return r13
        Lbe:
            java.lang.String r14 = "object"
            defpackage.hi2.F(r13, r14)
            throw r4
        Lc4:
            java.lang.String r13 = "Unexpected leading comma"
            defpackage.u0.q(r0, r13, r6, r4, r5)
            throw r4
    }

    public static void m(java.lang.String r7) {
            java.lang.String r0 = ":memory:"
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 != 0) goto L60
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L11:
            if (r3 > r0) goto L36
            if (r4 != 0) goto L17
            r5 = r3
            goto L18
        L17:
            r5 = r0
        L18:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = defpackage.nb3.p(r5, r6)
            if (r5 > 0) goto L26
            r5 = r1
            goto L27
        L26:
            r5 = r2
        L27:
            if (r4 != 0) goto L30
            if (r5 != 0) goto L2d
            r4 = r1
            goto L11
        L2d:
            int r3 = r3 + 1
            goto L11
        L30:
            if (r5 != 0) goto L33
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L11
        L36:
            int r0 = r0 + r1
            java.lang.CharSequence r0 = r7.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L46
            goto L60
        L46:
            java.lang.String r0 = "deleting the database file: "
            java.lang.String r0 = r0.concat(r7)
            java.lang.String r1 = "SupportSQLite"
            android.util.Log.w(r1, r0)
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L5a
            r0.<init>(r7)     // Catch: java.lang.Exception -> L5a
            android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L5a
            return
        L5a:
            r7 = move-exception
            java.lang.String r0 = "delete failed: "
            android.util.Log.w(r1, r0, r7)
        L60:
            return
    }

    public void A(android.view.View r1) {
            r0 = this;
            java.lang.Object r0 = r0.L
            wb r0 = (defpackage.wb) r0
            r0.u = r1
            r1 = 0
            r0.t = r1
            return
    }

    public defpackage.ac B() {
            r0 = this;
            ac r0 = r0.l()
            r0.show()
            return r0
    }

    public int C(int r9) {
            r8 = this;
            java.lang.Object r8 = r8.L
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            r0 = 0
            r1 = -1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != r9) goto L72
            if (r9 != r1) goto L13
            java.lang.Object r8 = r8.valueAt(r0)
            iq6 r8 = (defpackage.iq6) r8
            goto L19
        L13:
            java.lang.Object r8 = r8.get(r1)
            iq6 r8 = (defpackage.iq6) r8
        L19:
            if (r8 != 0) goto L1c
            goto L7a
        L1c:
            java.util.ArrayList r9 = r8.b
        L1e:
            int r3 = r9.size()
            if (r0 >= r3) goto L60
            java.lang.Object r3 = r9.get(r0)
            jq6 r3 = (defpackage.jq6) r3
            float r4 = r3.d
            float r5 = r3.c
            float r6 = r3.b
            float r3 = r3.a
            boolean r7 = java.lang.Float.isNaN(r3)
            if (r7 != 0) goto L3d
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L3d
            goto L5d
        L3d:
            boolean r3 = java.lang.Float.isNaN(r6)
            if (r3 != 0) goto L48
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto L48
            goto L5d
        L48:
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto L53
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 <= 0) goto L53
            goto L5d
        L53:
            boolean r3 = java.lang.Float.isNaN(r4)
            if (r3 != 0) goto L61
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto L61
        L5d:
            int r0 = r0 + 1
            goto L1e
        L60:
            r0 = r1
        L61:
            if (r1 != r0) goto L64
            goto L7a
        L64:
            if (r0 != r1) goto L69
            int r8 = r8.c
            return r8
        L69:
            java.lang.Object r8 = r9.get(r0)
            jq6 r8 = (defpackage.jq6) r8
            int r8 = r8.e
            return r8
        L72:
            java.lang.Object r8 = r8.get(r9)
            iq6 r8 = (defpackage.iq6) r8
            if (r8 != 0) goto L7b
        L7a:
            return r1
        L7b:
            java.util.ArrayList r9 = r8.b
        L7d:
            int r3 = r9.size()
            if (r0 >= r3) goto Lbf
            java.lang.Object r3 = r9.get(r0)
            jq6 r3 = (defpackage.jq6) r3
            float r4 = r3.d
            float r5 = r3.c
            float r6 = r3.b
            float r3 = r3.a
            boolean r7 = java.lang.Float.isNaN(r3)
            if (r7 != 0) goto L9c
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9c
            goto Lbc
        L9c:
            boolean r3 = java.lang.Float.isNaN(r6)
            if (r3 != 0) goto La7
            int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r3 >= 0) goto La7
            goto Lbc
        La7:
            boolean r3 = java.lang.Float.isNaN(r5)
            if (r3 != 0) goto Lb2
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lb2
            goto Lbc
        Lb2:
            boolean r3 = java.lang.Float.isNaN(r4)
            if (r3 != 0) goto Lc0
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto Lc0
        Lbc:
            int r0 = r0 + 1
            goto L7d
        Lbf:
            r0 = r1
        Lc0:
            if (r0 != r1) goto Lc5
            int r8 = r8.c
            return r8
        Lc5:
            java.lang.Object r8 = r9.get(r0)
            jq6 r8 = (defpackage.jq6) r8
            int r8 = r8.e
            return r8
    }

    @Override // defpackage.rs7
    public synchronized defpackage.d44 a(defpackage.c44 r7) {
            r6 = this;
            monitor-enter(r6)
            java.lang.Object r0 = r6.L     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            if (r7 != 0) goto L10
            monitor-exit(r6)
            return r0
        L10:
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
        L15:
            if (r2 >= r1) goto L39
            java.lang.Object r3 = r7.get(r2)     // Catch: java.lang.Throwable -> L2f
            xe5 r3 = (defpackage.xe5) r3     // Catch: java.lang.Throwable -> L2f
            java.lang.ref.WeakReference r4 = r3.b     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L2f
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            d44 r5 = new d44     // Catch: java.lang.Throwable -> L2f
            java.util.Map r3 = r3.c     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r7 = move-exception
            goto L48
        L31:
            r5 = r0
        L32:
            if (r5 == 0) goto L36
            r0 = r5
            goto L39
        L36:
            int r2 = r2 + 1
            goto L15
        L39:
            int r7 = r6.B     // Catch: java.lang.Throwable -> L2f
            int r1 = r7 + 1
            r6.B = r1     // Catch: java.lang.Throwable -> L2f
            r1 = 10
            if (r7 < r1) goto L46
            r6.j()     // Catch: java.lang.Throwable -> L2f
        L46:
            monitor-exit(r6)
            return r0
        L48:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7
    }

    @Override // defpackage.rs7
    public synchronized void b(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 10
            if (r2 < r0) goto L10
            r0 = 20
            if (r2 == r0) goto L10
            r1.j()     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        L10:
            monitor-exit(r1)
            return
    }

    @Override // defpackage.f3
    public boolean c(android.view.View r1) {
            r0 = this;
            java.lang.Object r1 = r0.L
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            int r0 = r0.B
            r1.I(r0)
            r0 = 1
            return r0
    }

    @Override // defpackage.ja3
    public void d(char r4) {
            r3 = this;
            r0 = 1
            int r1 = r3.B
            r3.n(r1, r0)
            java.lang.Object r0 = r3.L
            char[] r0 = (char[]) r0
            int r1 = r3.B
            int r2 = r1 + 1
            r3.B = r2
            r0[r1] = r4
            return
    }

    @Override // defpackage.ja3
    public void e(java.lang.String r11) {
            r10 = this;
            r11.getClass()
            int r0 = r11.length()
            r1 = 2
            int r0 = r0 + r1
            int r2 = r10.B
            r10.n(r2, r0)
            java.lang.Object r0 = r10.L
            char[] r0 = (char[]) r0
            int r2 = r10.B
            int r3 = r2 + 1
            r4 = 34
            r0[r2] = r4
            int r2 = r11.length()
            r5 = 0
            r11.getChars(r5, r2, r0, r3)
            int r2 = r2 + r3
            r6 = r3
        L24:
            if (r6 >= r2) goto Laa
            char r7 = r0[r6]
            byte[] r8 = defpackage.os6.b
            int r9 = r8.length
            if (r7 >= r9) goto La6
            r7 = r8[r7]
            if (r7 == 0) goto La6
            int r0 = r6 - r3
            int r2 = r11.length()
        L37:
            r3 = 1
            if (r0 >= r2) goto L98
            r10.n(r6, r1)
            char r7 = r11.charAt(r0)
            byte[] r8 = defpackage.os6.b
            int r9 = r8.length
            if (r7 >= r9) goto L8b
            r8 = r8[r7]
            if (r8 != 0) goto L55
            java.lang.Object r3 = r10.L
            char[] r3 = (char[]) r3
            int r8 = r6 + 1
            char r7 = (char) r7
            r3[r6] = r7
        L53:
            r6 = r8
            goto L95
        L55:
            if (r8 != r3) goto L79
            java.lang.String[] r3 = defpackage.os6.a
            r3 = r3[r7]
            r3.getClass()
            int r7 = r3.length()
            r10.n(r6, r7)
            java.lang.Object r7 = r10.L
            char[] r7 = (char[]) r7
            int r8 = r3.length()
            r3.getChars(r5, r8, r7, r6)
            int r3 = r3.length()
            int r3 = r3 + r6
            r10.B = r3
            r6 = r3
            goto L95
        L79:
            java.lang.Object r3 = r10.L
            char[] r3 = (char[]) r3
            r7 = 92
            r3[r6] = r7
            int r7 = r6 + 1
            char r8 = (char) r8
            r3[r7] = r8
            int r6 = r6 + 2
            r10.B = r6
            goto L95
        L8b:
            java.lang.Object r3 = r10.L
            char[] r3 = (char[]) r3
            int r8 = r6 + 1
            char r7 = (char) r7
            r3[r6] = r7
            goto L53
        L95:
            int r0 = r0 + 1
            goto L37
        L98:
            r10.n(r6, r3)
            java.lang.Object r11 = r10.L
            char[] r11 = (char[]) r11
            int r0 = r6 + 1
            r11[r6] = r4
            r10.B = r0
            return
        La6:
            int r6 = r6 + 1
            goto L24
        Laa:
            int r11 = r2 + 1
            r0[r2] = r4
            r10.B = r11
            return
    }

    @Override // defpackage.ja3
    public void f(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.length()
            if (r0 != 0) goto La
            return
        La:
            int r1 = r5.B
            r5.n(r1, r0)
            java.lang.Object r1 = r5.L
            char[] r1 = (char[]) r1
            int r2 = r5.B
            r3 = 0
            int r4 = r6.length()
            r6.getChars(r3, r4, r1, r2)
            int r6 = r5.B
            int r6 = r6 + r0
            r5.B = r6
            return
    }

    @Override // defpackage.rs7
    public synchronized void g(defpackage.c44 r6, android.graphics.Bitmap r7, java.util.Map r8, int r9) {
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.L     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r6 = move-exception
            goto L60
        L16:
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L14
            int r6 = java.lang.System.identityHashCode(r7)     // Catch: java.lang.Throwable -> L14
            xe5 r0 = new xe5     // Catch: java.lang.Throwable -> L14
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L14
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L14
            r0.<init>(r6, r2, r8, r9)     // Catch: java.lang.Throwable -> L14
            int r8 = r1.size()     // Catch: java.lang.Throwable -> L14
            r2 = 0
        L2b:
            if (r2 >= r8) goto L4e
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L14
            xe5 r3 = (defpackage.xe5) r3     // Catch: java.lang.Throwable -> L14
            int r4 = r3.d     // Catch: java.lang.Throwable -> L14
            if (r9 < r4) goto L4b
            int r8 = r3.a     // Catch: java.lang.Throwable -> L14
            if (r8 != r6) goto L47
            java.lang.ref.WeakReference r6 = r3.b     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L14
            if (r6 != r7) goto L47
            r1.set(r2, r0)     // Catch: java.lang.Throwable -> L14
            goto L51
        L47:
            r1.add(r2, r0)     // Catch: java.lang.Throwable -> L14
            goto L51
        L4b:
            int r2 = r2 + 1
            goto L2b
        L4e:
            r1.add(r0)     // Catch: java.lang.Throwable -> L14
        L51:
            int r6 = r5.B     // Catch: java.lang.Throwable -> L14
            int r7 = r6 + 1
            r5.B = r7     // Catch: java.lang.Throwable -> L14
            r7 = 10
            if (r6 < r7) goto L5e
            r5.j()     // Catch: java.lang.Throwable -> L14
        L5e:
            monitor-exit(r5)
            return
        L60:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L14
            throw r6
    }

    public void i(long r5) {
            r4 = this;
            boolean r0 = r4.k(r5)
            if (r0 != 0) goto L28
            int r0 = r4.B
            java.lang.Object r1 = r4.L
            long[] r1 = (long[]) r1
            int r2 = r1.length
            if (r0 < r2) goto L1e
            int r2 = r0 + 1
            int r3 = r1.length
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r2, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r4.L = r1
        L1e:
            r1[r0] = r5
            int r5 = r4.B
            if (r0 < r5) goto L28
            int r0 = r0 + 1
            r4.B = r0
        L28:
            return
    }

    public void j() {
            r7 = this;
            r0 = 0
            r7.B = r0
            java.lang.Object r7 = r7.L
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        Lf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r7.next()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 1
            if (r2 > r3) goto L3a
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            xe5 r1 = (defpackage.xe5) r1
            if (r1 == 0) goto L33
            java.lang.ref.WeakReference r1 = r1.b
            java.lang.Object r1 = r1.get()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L34
        L33:
            r1 = 0
        L34:
            if (r1 != 0) goto Lf
            r7.remove()
            goto Lf
        L3a:
            int r2 = r1.size()
            r3 = r0
            r4 = r3
        L40:
            if (r3 >= r2) goto L5a
            int r5 = r3 - r4
            java.lang.Object r6 = r1.get(r5)
            xe5 r6 = (defpackage.xe5) r6
            java.lang.ref.WeakReference r6 = r6.b
            java.lang.Object r6 = r6.get()
            if (r6 != 0) goto L57
            r1.remove(r5)
            int r4 = r4 + 1
        L57:
            int r3 = r3 + 1
            goto L40
        L5a:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lf
            r7.remove()
            goto Lf
        L64:
            return
    }

    public boolean k(long r7) {
            r6 = this;
            int r0 = r6.B
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L15
            java.lang.Object r3 = r6.L
            long[] r3 = (long[]) r3
            r4 = r3[r2]
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L12
            r6 = 1
            return r6
        L12:
            int r2 = r2 + 1
            goto L4
        L15:
            return r1
    }

    public defpackage.ac l() {
            r11 = this;
            ac r0 = new ac
            java.lang.Object r1 = r11.L
            r3 = r1
            wb r3 = (defpackage.wb) r3
            android.view.ContextThemeWrapper r1 = r3.a
            android.view.ContextThemeWrapper r4 = r3.a
            int r11 = r11.B
            r0.<init>(r1, r11)
            android.view.View r11 = r3.e
            yb r1 = r0.Z
            r8 = 0
            if (r11 == 0) goto L1a
            r1.x = r11
            goto L39
        L1a:
            java.lang.CharSequence r11 = r3.d
            if (r11 == 0) goto L27
            r1.d = r11
            android.widget.TextView r2 = r1.v
            if (r2 == 0) goto L27
            r2.setText(r11)
        L27:
            android.graphics.drawable.Drawable r11 = r3.c
            if (r11 == 0) goto L39
            r1.t = r11
            android.widget.ImageView r2 = r1.u
            if (r2 == 0) goto L39
            r2.setVisibility(r8)
            android.widget.ImageView r2 = r1.u
            r2.setImageDrawable(r11)
        L39:
            java.lang.CharSequence r11 = r3.f
            if (r11 == 0) goto L46
            r1.e = r11
            android.widget.TextView r2 = r1.w
            if (r2 == 0) goto L46
            r2.setText(r11)
        L46:
            java.lang.CharSequence r11 = r3.g
            if (r11 != 0) goto L4b
            goto L51
        L4b:
            r2 = -1
            android.content.DialogInterface$OnClickListener r5 = r3.h
            r1.c(r2, r11, r5)
        L51:
            java.lang.CharSequence r11 = r3.i
            if (r11 != 0) goto L56
            goto L5c
        L56:
            r2 = -2
            android.content.DialogInterface$OnClickListener r5 = r3.j
            r1.c(r2, r11, r5)
        L5c:
            java.lang.CharSequence r11 = r3.k
            if (r11 != 0) goto L61
            goto L67
        L61:
            r2 = -3
            android.content.DialogInterface$OnClickListener r5 = r3.l
            r1.c(r2, r11, r5)
        L67:
            java.lang.CharSequence[] r11 = r3.q
            r9 = 1
            r10 = 0
            if (r11 != 0) goto L71
            android.widget.ListAdapter r11 = r3.r
            if (r11 == 0) goto Ld3
        L71:
            android.view.LayoutInflater r11 = r3.b
            int r2 = r1.B
            android.view.View r11 = r11.inflate(r2, r10)
            r7 = r11
            androidx.appcompat.app.AlertController$RecycleListView r7 = (androidx.appcompat.app.AlertController$RecycleListView) r7
            boolean r11 = r3.w
            if (r11 == 0) goto L8a
            tb r2 = new tb
            int r5 = r1.C
            java.lang.CharSequence[] r6 = r3.q
            r2.<init>(r3, r4, r5, r6, r7)
            goto La2
        L8a:
            boolean r11 = r3.x
            if (r11 == 0) goto L91
            int r11 = r1.D
            goto L93
        L91:
            int r11 = r1.E
        L93:
            android.widget.ListAdapter r2 = r3.r
            if (r2 == 0) goto L98
            goto La2
        L98:
            xb r2 = new xb
            r5 = 16908308(0x1020014, float:2.3877285E-38)
            java.lang.CharSequence[] r6 = r3.q
            r2.<init>(r4, r11, r5, r6)
        La2:
            r1.y = r2
            int r11 = r3.y
            r1.z = r11
            android.content.DialogInterface$OnClickListener r11 = r3.s
            if (r11 == 0) goto Lb5
            ub r11 = new ub
            r11.<init>(r3, r1)
            r7.setOnItemClickListener(r11)
            goto Lc1
        Lb5:
            android.content.DialogInterface$OnMultiChoiceClickListener r11 = r3.z
            if (r11 == 0) goto Lc1
            vb r11 = new vb
            r11.<init>(r3, r7, r1)
            r7.setOnItemClickListener(r11)
        Lc1:
            boolean r11 = r3.x
            if (r11 == 0) goto Lc9
            r7.setChoiceMode(r9)
            goto Ld1
        Lc9:
            boolean r11 = r3.w
            if (r11 == 0) goto Ld1
            r11 = 2
            r7.setChoiceMode(r11)
        Ld1:
            r1.f = r7
        Ld3:
            android.view.View r11 = r3.u
            if (r11 == 0) goto Lde
            r1.g = r11
            r1.h = r8
            r1.i = r8
            goto Le8
        Lde:
            int r11 = r3.t
            if (r11 == 0) goto Le8
            r1.g = r10
            r1.h = r11
            r1.i = r8
        Le8:
            boolean r11 = r3.m
            r0.setCancelable(r11)
            boolean r11 = r3.m
            if (r11 == 0) goto Lf4
            r0.setCanceledOnTouchOutside(r9)
        Lf4:
            android.content.DialogInterface$OnCancelListener r11 = r3.n
            r0.setOnCancelListener(r11)
            android.content.DialogInterface$OnDismissListener r11 = r3.o
            r0.setOnDismissListener(r11)
            k44 r11 = r3.p
            if (r11 == 0) goto L105
            r0.setOnKeyListener(r11)
        L105:
            return r0
    }

    public void n(int r3, int r4) {
            r2 = this;
            int r4 = r4 + r3
            java.lang.Object r0 = r2.L
            char[] r0 = (char[]) r0
            int r1 = r0.length
            if (r1 > r4) goto L13
            int r3 = r3 * 2
            if (r4 >= r3) goto Ld
            r4 = r3
        Ld:
            char[] r3 = java.util.Arrays.copyOf(r0, r4)
            r2.L = r3
        L13:
            return
    }

    public void o(int r9, defpackage.pw r10) {
            r8 = this;
        L0:
            int r0 = r9 >> 1
            if (r0 == 0) goto L24
            java.lang.Object r1 = r8.L
            pw[] r1 = (defpackage.pw[]) r1
            r1 = r1[r0]
            r1.getClass()
            long r2 = r1.g
            long r4 = r10.g
            r6 = 0
            long r4 = r4 - r2
            int r2 = defpackage.nb3.q(r6, r4)
            if (r2 <= 0) goto L24
            r1.f = r9
            java.lang.Object r2 = r8.L
            pw[] r2 = (defpackage.pw[]) r2
            r2[r9] = r1
            r9 = r0
            goto L0
        L24:
            java.lang.Object r8 = r8.L
            pw[] r8 = (defpackage.pw[]) r8
            r8[r9] = r10
            r10.f = r9
            return
    }

    public void p(defpackage.vm2 r2, int r3, int r4) {
            r1 = this;
            java.lang.Object r1 = r1.L
            ai1 r1 = (defpackage.ai1) r1
            mu6 r0 = new mu6
            r0.<init>(r2)
            r1.k(r0, r3, r4)
            return
    }

    public defpackage.de3 q() {
            r9 = this;
            java.lang.Object r0 = r9.L
            u0 r0 = (defpackage.u0) r0
            byte r1 = r0.v()
            r2 = 1
            if (r1 != r2) goto L10
            df3 r9 = r9.s(r2)
            return r9
        L10:
            r3 = 0
            if (r1 != 0) goto L18
            df3 r9 = r9.s(r3)
            return r9
        L18:
            r4 = 6
            r5 = 0
            if (r1 != r4) goto Lce
            int r1 = r9.B
            int r1 = r1 + r2
            r9.B = r1
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L79
            pf3 r0 = new pf3
            r0.<init>(r9, r5)
            x61 r1 = defpackage.zc1.a
            ad1 r1 = new ad1
            r1.<init>()
            r1.A = r0
            r1.B = r1
            x61 r2 = defpackage.zc1.a
            r1.L = r2
        L39:
            java.lang.Object r0 = r1.L
            r41 r3 = r1.B
            if (r3 != 0) goto L46
            defpackage.oi2.Y(r0)
            de3 r0 = (defpackage.de3) r0
            goto Lbb
        L46:
            boolean r4 = defpackage.nb3.k(r2, r0)
            if (r4 == 0) goto L73
            pf3 r0 = r1.A     // Catch: java.lang.Throwable -> L69
            r4 = 3
            defpackage.ge7.p(r4, r0)     // Catch: java.lang.Throwable -> L69
            pf3 r4 = new pf3     // Catch: java.lang.Throwable -> L69
            zb r0 = r0.X     // Catch: java.lang.Throwable -> L69
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L69
            r4.R = r1     // Catch: java.lang.Throwable -> L69
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r4.s(r0)     // Catch: java.lang.Throwable -> L69
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 == r4) goto L39
            r3.i(r0)
            goto L39
        L69:
            r0 = move-exception
            em5 r4 = new em5
            r4.<init>(r0)
            r3.i(r4)
            goto L39
        L73:
            r1.L = r2
            r3.i(r0)
            goto L39
        L79:
            byte r1 = r0.h(r4)
            byte r2 = r0.v()
            r6 = 4
            if (r2 == r6) goto Lc8
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L89:
            boolean r7 = r0.d()
            r8 = 7
            if (r7 == 0) goto Lae
            java.lang.String r1 = r0.k()
            r7 = 5
            r0.h(r7)
            de3 r7 = r9.q()
            r2.put(r1, r7)
            byte r1 = r0.g()
            if (r1 == r6) goto L89
            if (r1 != r8) goto La8
            goto Lae
        La8:
            java.lang.String r9 = "Expected end of the object or comma"
            defpackage.u0.q(r0, r9, r3, r5, r4)
            throw r5
        Lae:
            if (r1 != r4) goto Lb4
            r0.h(r8)
            goto Lb6
        Lb4:
            if (r1 == r6) goto Lc2
        Lb6:
            ye3 r0 = new ye3
            r0.<init>(r2)
        Lbb:
            int r1 = r9.B
            int r1 = r1 + (-1)
            r9.B = r1
            return r0
        Lc2:
            java.lang.String r9 = "object"
            defpackage.hi2.F(r0, r9)
            throw r5
        Lc8:
            java.lang.String r9 = "Unexpected leading comma"
            defpackage.u0.q(r0, r9, r3, r5, r4)
            throw r5
        Lce:
            r2 = 8
            if (r1 != r2) goto Ld7
            nd3 r9 = r9.r()
            return r9
        Ld7:
            java.lang.String r9 = defpackage.l.S(r1)
            java.lang.String r1 = "Cannot read Json element because of unexpected "
            java.lang.String r9 = r1.concat(r9)
            defpackage.u0.q(r0, r9, r3, r5, r4)
            throw r5
    }

    public defpackage.nd3 r() {
            r8 = this;
            java.lang.Object r0 = r8.L
            u0 r0 = (defpackage.u0) r0
            byte r1 = r0.g()
            byte r2 = r0.v()
            r3 = 0
            r4 = 0
            r5 = 4
            if (r2 == r5) goto L51
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L16:
            boolean r6 = r0.d()
            r7 = 9
            if (r6 == 0) goto L3b
            de3 r1 = r8.q()
            r2.add(r1)
            byte r1 = r0.g()
            if (r1 == r5) goto L16
            if (r1 != r7) goto L2f
            r6 = 1
            goto L30
        L2f:
            r6 = r3
        L30:
            int r7 = r0.B
            if (r6 == 0) goto L35
            goto L16
        L35:
            java.lang.String r8 = "Expected end of the array or comma"
            defpackage.u0.q(r0, r8, r7, r4, r5)
            throw r4
        L3b:
            r8 = 8
            if (r1 != r8) goto L43
            r0.h(r7)
            goto L45
        L43:
            if (r1 == r5) goto L4b
        L45:
            nd3 r8 = new nd3
            r8.<init>(r2)
            return r8
        L4b:
            java.lang.String r8 = "array"
            defpackage.hi2.F(r0, r8)
            throw r4
        L51:
            java.lang.String r8 = "Unexpected leading comma"
            r1 = 6
            defpackage.u0.q(r0, r8, r3, r4, r1)
            throw r4
    }

    public defpackage.df3 s(boolean r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            u0 r1 = (defpackage.u0) r1
            if (r2 != 0) goto Lb
            java.lang.String r1 = r1.m()
            goto Lf
        Lb:
            java.lang.String r1 = r1.k()
        Lf:
            if (r2 != 0) goto L1c
            java.lang.String r0 = "null"
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L1c
            ue3 r1 = defpackage.ue3.INSTANCE
            return r1
        L1c:
            qe3 r0 = new qe3
            r0.<init>(r2, r1)
            return r0
    }

    public void t(long r6) {
            r5 = this;
            int r0 = r5.B
            r1 = 0
        L3:
            if (r1 >= r0) goto L2b
            java.lang.Object r2 = r5.L
            long[] r2 = (long[]) r2
            r3 = r2[r1]
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L28
            int r6 = r5.B
            int r6 = r6 + (-1)
        L13:
            if (r1 >= r6) goto L21
            java.lang.Object r7 = r5.L
            long[] r7 = (long[]) r7
            int r0 = r1 + 1
            r2 = r7[r0]
            r7[r1] = r2
            r1 = r0
            goto L13
        L21:
            int r6 = r5.B
            int r6 = r6 + (-1)
            r5.B = r6
            return
        L28:
            int r1 = r1 + 1
            goto L3
        L2b:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.String r0 = new java.lang.String
            java.lang.Object r1 = r3.L
            char[] r1 = (char[]) r1
            r2 = 0
            int r3 = r3.B
            r0.<init>(r1, r2, r3)
            return r0
    }

    public void u(defpackage.pw r10) {
            r9 = this;
            int r0 = r10.f
            r1 = -1
            if (r0 == r1) goto L8f
            int r2 = r9.B
            java.lang.Object r3 = r9.L
            pw[] r3 = (defpackage.pw[]) r3
            r3 = r3[r2]
            r3.getClass()
            r10.f = r1
            java.lang.Object r1 = r9.L
            pw[] r1 = (defpackage.pw[]) r1
            r4 = 0
            r1[r2] = r4
            int r2 = r2 + (-1)
            r9.B = r2
            if (r10 != r3) goto L20
            return
        L20:
            long r1 = r10.g
            long r4 = r3.g
            long r4 = r4 - r1
            r1 = 0
            int r10 = defpackage.nb3.q(r1, r4)
            if (r10 != 0) goto L36
            java.lang.Object r9 = r9.L
            pw[] r9 = (defpackage.pw[]) r9
            r9[r0] = r3
            r3.f = r0
            return
        L36:
            if (r10 >= 0) goto L8b
        L38:
            int r10 = r0 << 1
            int r4 = r10 + 1
            int r5 = r9.B
            if (r4 > r5) goto L60
            java.lang.Object r5 = r9.L
            pw[] r5 = (defpackage.pw[]) r5
            r10 = r5[r10]
            r10.getClass()
            java.lang.Object r5 = r9.L
            pw[] r5 = (defpackage.pw[]) r5
            r4 = r5[r4]
            r4.getClass()
            long r5 = r10.g
            long r7 = r4.g
            long r7 = r7 - r5
            int r5 = defpackage.nb3.q(r1, r7)
            if (r5 >= 0) goto L5e
            goto L6b
        L5e:
            r10 = r4
            goto L6b
        L60:
            if (r10 > r5) goto L82
            java.lang.Object r4 = r9.L
            pw[] r4 = (defpackage.pw[]) r4
            r10 = r4[r10]
            r10.getClass()
        L6b:
            long r4 = r3.g
            long r6 = r10.g
            long r6 = r6 - r4
            int r4 = defpackage.nb3.q(r1, r6)
            if (r4 <= 0) goto L82
            int r4 = r10.f
            r10.f = r0
            java.lang.Object r5 = r9.L
            pw[] r5 = (defpackage.pw[]) r5
            r5[r0] = r10
            r0 = r4
            goto L38
        L82:
            java.lang.Object r9 = r9.L
            pw[] r9 = (defpackage.pw[]) r9
            r9[r0] = r3
            r3.f = r0
            return
        L8b:
            r9.o(r0, r3)
            return
        L8f:
            java.lang.String r9 = "Failed requirement."
            defpackage.i.h(r9)
            return
    }

    public void v(java.lang.CharSequence[] r1, android.content.DialogInterface.OnClickListener r2) {
            r0 = this;
            java.lang.Object r0 = r0.L
            wb r0 = (defpackage.wb) r0
            r0.q = r1
            r0.s = r2
            return
    }

    public void w(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            wb r1 = (defpackage.wb) r1
            android.view.ContextThemeWrapper r0 = r1.a
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.f = r2
            return
    }

    @Override // defpackage.ja3
    public void writeLong(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f(r1)
            return
    }

    public void x(int r2, android.content.DialogInterface.OnClickListener r3) {
            r1 = this;
            java.lang.Object r1 = r1.L
            wb r1 = (defpackage.wb) r1
            android.view.ContextThemeWrapper r0 = r1.a
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.i = r2
            r1.j = r3
            return
    }

    public void y(int r2, android.content.DialogInterface.OnClickListener r3) {
            r1 = this;
            java.lang.Object r1 = r1.L
            wb r1 = (defpackage.wb) r1
            android.view.ContextThemeWrapper r0 = r1.a
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.g = r2
            r1.h = r3
            return
    }

    public void z(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.L
            wb r1 = (defpackage.wb) r1
            android.view.ContextThemeWrapper r0 = r1.a
            java.lang.CharSequence r2 = r0.getText(r2)
            r1.d = r2
            return
    }
}
