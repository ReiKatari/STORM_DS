package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp6  reason: default package */
/* loaded from: classes.dex */
public final class xp6 {
    public final int a;
    public final defpackage.me6 b;
    public final int[][] c;
    public final defpackage.me6[] d;
    public final defpackage.wp6 e;
    public final defpackage.wp6 f;
    public final defpackage.wp6 g;
    public final defpackage.wp6 h;

    public xp6(defpackage.h03 r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.b
            r1.a = r0
            java.lang.Object r0 = r2.c
            me6 r0 = (defpackage.me6) r0
            r1.b = r0
            java.io.Serializable r0 = r2.d
            int[][] r0 = (int[][]) r0
            r1.c = r0
            java.io.Serializable r0 = r2.e
            me6[] r0 = (defpackage.me6[]) r0
            r1.d = r0
            java.lang.Object r0 = r2.f
            wp6 r0 = (defpackage.wp6) r0
            r1.e = r0
            java.lang.Object r0 = r2.g
            wp6 r0 = (defpackage.wp6) r0
            r1.f = r0
            java.lang.Object r0 = r2.h
            wp6 r0 = (defpackage.wp6) r0
            r1.g = r0
            java.lang.Object r2 = r2.i
            wp6 r2 = (defpackage.wp6) r2
            r1.h = r2
            return
    }

    public static void a(defpackage.h03 r11, android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto L82
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto L82
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
            int[] r3 = defpackage.a75.r
            r4 = 0
            if (r15 != 0) goto L35
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r3)
            goto L39
        L35:
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r3, r4, r4)
        L39:
            int r3 = r2.getResourceId(r4, r4)
            int r5 = r2.getResourceId(r1, r4)
            t r6 = new t
            r7 = 0
            r6.<init>(r7)
            le6 r3 = defpackage.me6.a(r12, r3, r5, r6)
            me6 r3 = r3.a()
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r5 = new int[r2]
            r6 = r4
            r7 = r6
        L5a:
            if (r6 >= r2) goto L7a
            int r8 = r14.getAttributeNameResource(r6)
            r9 = 2130969725(0x7f04047d, float:1.754814E38)
            if (r8 == r9) goto L77
            r9 = 2130969736(0x7f040488, float:1.7548162E38)
            if (r8 == r9) goto L77
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r6, r4)
            if (r10 == 0) goto L73
            goto L74
        L73:
            int r8 = -r8
        L74:
            r5[r7] = r8
            r7 = r9
        L77:
            int r6 = r6 + 1
            goto L5a
        L7a:
            int[] r2 = android.util.StateSet.trimStateSet(r5, r7)
            r11.a(r2, r3)
            goto L6
        L82:
            return
    }

    public static defpackage.xp6 b(android.content.Context r5, android.content.res.TypedArray r6, int r7) {
            r0 = 0
            int r6 = r6.getResourceId(r7, r0)
            r7 = 0
            if (r6 != 0) goto L9
            goto L19
        L9:
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r6)
            java.lang.String r1 = "xml"
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 != 0) goto L1a
        L19:
            return r7
        L1a:
            h03 r0 = new h03
            r1 = 1
            r0.<init>(r1)
            r0.d()
            android.content.res.Resources r2 = r5.getResources()     // Catch: java.lang.Throwable -> L68
            android.content.res.XmlResourceParser r6 = r2.getXml(r6)     // Catch: java.lang.Throwable -> L68
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r6)     // Catch: java.lang.Throwable -> L4f
        L2f:
            int r3 = r6.next()     // Catch: java.lang.Throwable -> L4f
            r4 = 2
            if (r3 == r4) goto L39
            if (r3 == r1) goto L39
            goto L2f
        L39:
            if (r3 != r4) goto L55
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "selector"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            android.content.res.Resources$Theme r1 = r5.getTheme()     // Catch: java.lang.Throwable -> L4f
            a(r0, r5, r6, r2, r1)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r5 = move-exception
            goto L5d
        L51:
            r6.close()     // Catch: java.lang.Throwable -> L68
            goto L6b
        L55:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "No start tag found"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L4f
        L5d:
            if (r6 == 0) goto L67
            r6.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L68
        L67:
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r0.d()
        L6b:
            int r5 = r0.b
            if (r5 != 0) goto L70
            goto L75
        L70:
            xp6 r7 = new xp6
            r7.<init>(r0)
        L75:
            return r7
    }

    public final defpackage.me6 c() {
            r4 = this;
            me6 r0 = r4.b
            wp6 r1 = r4.h
            wp6 r2 = r4.g
            wp6 r3 = r4.f
            wp6 r4 = r4.e
            if (r4 != 0) goto L13
            if (r3 != 0) goto L13
            if (r2 != 0) goto L13
            if (r1 != 0) goto L13
            return r0
        L13:
            le6 r0 = r0.f()
            if (r4 == 0) goto L1d
            f61 r4 = r4.b
            r0.e = r4
        L1d:
            if (r3 == 0) goto L23
            f61 r4 = r3.b
            r0.f = r4
        L23:
            if (r2 == 0) goto L29
            f61 r4 = r2.b
            r0.h = r4
        L29:
            if (r1 == 0) goto L2f
            f61 r4 = r1.b
            r0.g = r4
        L2f:
            me6 r4 = r0.a()
            return r4
    }

    public final boolean d() {
            r2 = this;
            int r0 = r2.a
            r1 = 1
            if (r0 > r1) goto L2b
            wp6 r0 = r2.e
            if (r0 == 0) goto Le
            int r0 = r0.a
            if (r0 <= r1) goto Le
            goto L2b
        Le:
            wp6 r0 = r2.f
            if (r0 == 0) goto L17
            int r0 = r0.a
            if (r0 <= r1) goto L17
            goto L2b
        L17:
            wp6 r0 = r2.g
            if (r0 == 0) goto L20
            int r0 = r0.a
            if (r0 <= r1) goto L20
            goto L2b
        L20:
            wp6 r2 = r2.h
            if (r2 == 0) goto L29
            int r2 = r2.a
            if (r2 <= r1) goto L29
            goto L2b
        L29:
            r2 = 0
            return r2
        L2b:
            return r1
    }
}
