package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt0  reason: default package */
/* loaded from: classes.dex */
public abstract class rt0 {
    public static final java.lang.ThreadLocal a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.rt0.a = r0
            return
    }

    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    public static android.content.res.ColorStateList b(android.content.res.Resources r36, org.xmlpull.v1.XmlPullParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L348
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L20:
            int r9 = r37.next()
            if (r9 == r4) goto L337
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L2f
            if (r9 == r11) goto L337
        L2f:
            r12 = 2
            if (r9 != r12) goto L40
            if (r10 > r3) goto L40
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L46
        L40:
            r34 = r3
            r16 = r4
            goto L32a
        L46:
            int[] r9 = defpackage.g75.a
            if (r2 != 0) goto L4f
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L53
        L4f:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L53:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            r15 = 31
            if (r13 == r10) goto L92
            java.lang.ThreadLocal r10 = defpackage.rt0.a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L72
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L74
        L72:
            r12 = r16
        L74:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L80
            if (r10 > r15) goto L80
            goto L92
        L80:
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch: java.lang.Exception -> L8d
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch: java.lang.Exception -> L8d
            int r10 = r10.getDefaultColor()     // Catch: java.lang.Exception -> L8d
            goto L96
        L8d:
            int r10 = r9.getColor(r7, r14)
            goto L96
        L92:
            int r10 = r9.getColor(r7, r14)
        L96:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto La3
            float r11 = r9.getFloat(r4, r13)
            goto Laf
        La3:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto Lae
            float r11 = r9.getFloat(r11, r13)
            goto Laf
        Lae:
            r11 = r13
        Laf:
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 4
            r16 = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r15) goto Lc4
            r12 = 2
            boolean r15 = r9.hasValue(r12)
            if (r15 == 0) goto Lc4
            float r4 = r9.getFloat(r12, r4)
            goto Lc8
        Lc4:
            float r4 = r9.getFloat(r14, r4)
        Lc8:
            r9.recycle()
            int r9 = r1.getAttributeCount()
            int[] r12 = new int[r9]
            r15 = r7
            r18 = r13
            r13 = r15
        Ld5:
            if (r15 >= r9) goto L104
            int r14 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto Lfd
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto Lfd
            r7 = 2130968629(0x7f040035, float:1.7545917E38)
            if (r14 == r7) goto Lfd
            r7 = 2130969316(0x7f0402e4, float:1.754731E38)
            if (r14 == r7) goto Lfd
            int r7 = r13 + 1
            r0 = 0
            boolean r20 = r1.getAttributeBooleanValue(r15, r0)
            if (r20 == 0) goto Lf9
            goto Lfa
        Lf9:
            int r14 = -r14
        Lfa:
            r12[r13] = r14
            r13 = r7
        Lfd:
            int r15 = r15 + 1
            r0 = r36
            r7 = 0
            r14 = 4
            goto Ld5
        L104:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r13)
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r9 < 0) goto L116
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 > 0) goto L116
            r9 = r16
            goto L117
        L116:
            r9 = 0
        L117:
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 != 0) goto L123
            if (r9 != 0) goto L123
            r31 = r0
            r34 = r3
            goto L2e5
        L123:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = defpackage.ej2.q(r11, r14, r13)
            if (r9 == 0) goto L2d9
            vb0 r9 = defpackage.vb0.a(r10)
            float r10 = r9.a
            float r9 = r9.b
            iq7 r13 = defpackage.iq7.k
            double r14 = (double) r9
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L15d
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 0
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 <= 0) goto L15d
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L163
        L15d:
            r31 = r0
            r34 = r3
            goto L2d4
        L163:
            int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r14 >= 0) goto L169
            r10 = r7
            goto L16f
        L169:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L16f:
            r21 = r7
            r22 = r21
            r15 = r9
            r20 = r16
            r7 = 0
        L177:
            float r23 = r21 - r9
            float r23 = java.lang.Math.abs(r23)
            r24 = 1053609165(0x3ecccccd, float:0.4)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 < 0) goto L2c4
            r23 = 1148846080(0x447a0000, float:1000.0)
            r26 = r12
            r25 = r22
            r24 = r23
            r27 = 0
        L18e:
            float r28 = r25 - r26
            float r28 = java.lang.Math.abs(r28)
            r29 = 1008981770(0x3c23d70a, float:0.01)
            int r28 = (r28 > r29 ? 1 : (r28 == r29 ? 0 : -1))
            r29 = 1073741824(0x40000000, float:2.0)
            if (r28 <= 0) goto L284
            float r28 = r26 - r25
            float r28 = r28 / r29
            r30 = r12
            float r12 = r28 + r25
            vb0 r14 = defpackage.vb0.b(r12, r15, r10)
            r31 = r0
            iq7 r0 = defpackage.iq7.k
            int r0 = r14.c(r0)
            int r14 = android.graphics.Color.red(r0)
            float r14 = defpackage.nc1.W(r14)
            int r32 = android.graphics.Color.green(r0)
            float r32 = defpackage.nc1.W(r32)
            int r33 = android.graphics.Color.blue(r0)
            float r33 = defpackage.nc1.W(r33)
            float[][] r34 = defpackage.nc1.d
            r34 = r34[r16]
            r19 = 0
            r35 = r34[r19]
            float r14 = r14 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r14
            r17 = 2
            r14 = r34[r17]
            float r33 = r33 * r14
            float r33 = r33 + r32
            float r14 = r33 / r30
            r32 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
            if (r32 > 0) goto L1f2
            r32 = 1147261687(0x4461d2f7, float:903.2963)
            float r14 = r14 * r32
            r32 = r0
            goto L201
        L1f2:
            r32 = r0
            double r0 = (double) r14
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r14 = r0 - r1
        L201:
            float r0 = r4 - r14
            float r0 = java.lang.Math.abs(r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L262
            vb0 r1 = defpackage.vb0.a(r32)
            r32 = r0
            float r0 = r1.c
            float r2 = r1.b
            vb0 r0 = defpackage.vb0.b(r0, r2, r10)
            float r2 = r1.d
            r33 = r2
            float r2 = r0.d
            float r2 = r33 - r2
            r33 = r2
            float r2 = r1.e
            r34 = r2
            float r2 = r0.e
            float r2 = r34 - r2
            r34 = r2
            float r2 = r1.f
            float r0 = r0.f
            float r2 = r2 - r0
            float r0 = r33 * r33
            float r33 = r34 * r34
            float r33 = r33 + r0
            float r2 = r2 * r2
            float r2 = r2 + r33
            r33 = r1
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            r34 = r3
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 > 0) goto L264
            r24 = r0
            r23 = r32
            r27 = r33
            goto L264
        L262:
            r34 = r3
        L264:
            int r0 = (r23 > r22 ? 1 : (r23 == r22 ? 0 : -1))
            if (r0 != 0) goto L26f
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 != 0) goto L26f
        L26c:
            r0 = r27
            goto L28d
        L26f:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L276
            r25 = r12
            goto L278
        L276:
            r26 = r12
        L278:
            r1 = r38
            r2 = r39
            r12 = r30
            r0 = r31
            r3 = r34
            goto L18e
        L284:
            r31 = r0
            r34 = r3
            r30 = r12
            r17 = 2
            goto L26c
        L28d:
            if (r20 == 0) goto L2ab
            if (r0 == 0) goto L297
            int r0 = r0.c(r13)
        L295:
            r10 = r0
            goto L2dd
        L297:
            float r0 = r9 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r12 = r30
            r0 = r31
            r3 = r34
            r20 = 0
            goto L177
        L2ab:
            if (r0 != 0) goto L2af
            r9 = r15
            goto L2b2
        L2af:
            r7 = r0
            r21 = r15
        L2b2:
            float r0 = r9 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r12 = r30
            r0 = r31
            r3 = r34
            goto L177
        L2c4:
            r31 = r0
            r34 = r3
            if (r7 != 0) goto L2cf
            int r0 = defpackage.nc1.T(r4)
            goto L295
        L2cf:
            int r0 = r7.c(r13)
            goto L295
        L2d4:
            int r0 = defpackage.nc1.T(r4)
            goto L295
        L2d9:
            r31 = r0
            r34 = r3
        L2dd:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L2e5:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            if (r0 <= r1) goto L2fa
            r1 = 4
            if (r8 > r1) goto L2f1
            r1 = r2
            goto L2f3
        L2f1:
            int r1 = r8 * 2
        L2f3:
            int[] r1 = new int[r1]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r1, r14, r8)
            r5 = r1
        L2fa:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L318
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L30b
            goto L30d
        L30b:
            int r2 = r8 * 2
        L30d:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r14 = 0
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            r6 = r1
        L318:
            r6[r8] = r31
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r4 = r16
            r3 = r34
            r7 = 0
            r0 = r36
            goto L20
        L32a:
            r0 = r36
            r1 = r38
            r2 = r39
            r4 = r16
            r3 = r34
            r7 = 0
            goto L20
        L337:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r0, r14, r8)
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L348:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r37.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": invalid color state list tag "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }
}
