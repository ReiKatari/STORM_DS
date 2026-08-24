package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms  reason: default package */
/* loaded from: classes.dex */
public final class ms {
    public final android.widget.TextView a;
    public defpackage.wz0 b;
    public defpackage.wz0 c;
    public defpackage.wz0 d;
    public defpackage.wz0 e;
    public defpackage.wz0 f;
    public defpackage.wz0 g;
    public defpackage.wz0 h;
    public final defpackage.vs i;
    public int j;
    public int k;
    public android.graphics.Typeface l;
    public boolean m;

    public ms(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j = r0
            r0 = -1
            r1.k = r0
            r1.a = r2
            vs r0 = new vs
            r0.<init>(r2)
            r1.i = r0
            return
    }

    public static defpackage.wz0 c(android.content.Context r1, defpackage.ir r2, int r3) {
            monitor-enter(r2)
            ol5 r0 = r2.a     // Catch: java.lang.Throwable -> L17
            android.content.res.ColorStateList r1 = r0.f(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            if (r1 == 0) goto L15
            wz0 r2 = new wz0
            r2.<init>()
            r3 = 1
            r2.b = r3
            r2.c = r1
            return r2
        L15:
            r1 = 0
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public final void a(android.graphics.drawable.Drawable r1, defpackage.wz0 r2) {
            r0 = this;
            if (r1 == 0) goto Ld
            if (r2 == 0) goto Ld
            android.widget.TextView r0 = r0.a
            int[] r0 = r0.getDrawableState()
            defpackage.ir.e(r1, r2, r0)
        Ld:
            return
    }

    public final void b() {
            r6 = this;
            wz0 r0 = r6.b
            r1 = 2
            r2 = 0
            android.widget.TextView r3 = r6.a
            if (r0 != 0) goto L14
            wz0 r0 = r6.c
            if (r0 != 0) goto L14
            wz0 r0 = r6.d
            if (r0 != 0) goto L14
            wz0 r0 = r6.e
            if (r0 == 0) goto L36
        L14:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r4 = r0[r2]
            wz0 r5 = r6.b
            r6.a(r4, r5)
            r4 = 1
            r4 = r0[r4]
            wz0 r5 = r6.c
            r6.a(r4, r5)
            r4 = r0[r1]
            wz0 r5 = r6.d
            r6.a(r4, r5)
            r4 = 3
            r0 = r0[r4]
            wz0 r4 = r6.e
            r6.a(r0, r4)
        L36:
            wz0 r0 = r6.f
            if (r0 != 0) goto L40
            wz0 r0 = r6.g
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawablesRelative()
            r2 = r0[r2]
            wz0 r3 = r6.f
            r6.a(r2, r3)
            r0 = r0[r1]
            wz0 r1 = r6.g
            r6.a(r0, r1)
            return
    }

    public final android.content.res.ColorStateList d() {
            r0 = this;
            wz0 r0 = r0.h
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.c
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final android.graphics.PorterDuff.Mode e() {
            r0 = this;
            wz0 r0 = r0.h
            if (r0 == 0) goto L9
            java.io.Serializable r0 = r0.d
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void f(android.util.AttributeSet r24, int r25) {
            r23 = this;
            r0 = r23
            r3 = r24
            r5 = r25
            android.widget.TextView r1 = r0.a
            android.content.Context r7 = r1.getContext()
            ir r8 = defpackage.ir.a()
            int[] r2 = defpackage.m75.h
            m44 r9 = defpackage.m44.A(r7, r3, r2, r5)
            r3 = r2
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r9.L
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r6 = r5
            r5 = r4
            r4 = r24
            defpackage.ao7.m(r1, r2, r3, r4, r5, r6)
            r3 = r4
            r5 = r6
            r6 = r1
            java.lang.Object r1 = r9.L
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r10 = 0
            r11 = -1
            int r2 = r1.getResourceId(r10, r11)
            r12 = 3
            boolean r4 = r1.hasValue(r12)
            if (r4 == 0) goto L44
            int r4 = r1.getResourceId(r12, r10)
            wz0 r4 = c(r7, r8, r4)
            r0.b = r4
        L44:
            r13 = 1
            boolean r4 = r1.hasValue(r13)
            if (r4 == 0) goto L55
            int r4 = r1.getResourceId(r13, r10)
            wz0 r4 = c(r7, r8, r4)
            r0.c = r4
        L55:
            r14 = 4
            boolean r4 = r1.hasValue(r14)
            if (r4 == 0) goto L66
            int r4 = r1.getResourceId(r14, r10)
            wz0 r4 = c(r7, r8, r4)
            r0.d = r4
        L66:
            r15 = 2
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L77
            int r4 = r1.getResourceId(r15, r10)
            wz0 r4 = c(r7, r8, r4)
            r0.e = r4
        L77:
            r4 = 5
            boolean r16 = r1.hasValue(r4)
            if (r16 == 0) goto L88
            int r12 = r1.getResourceId(r4, r10)
            wz0 r12 = c(r7, r8, r12)
            r0.f = r12
        L88:
            r12 = 6
            boolean r17 = r1.hasValue(r12)
            if (r17 == 0) goto L99
            int r1 = r1.getResourceId(r12, r10)
            wz0 r1 = c(r7, r8, r1)
            r0.g = r1
        L99:
            r9.D()
            android.text.method.TransformationMethod r1 = r6.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            int[] r4 = defpackage.m75.x
            r12 = 14
            r13 = 13
            r15 = 15
            if (r2 == r11) goto Lf0
            m44 r14 = new m44
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r2, r4)
            r14.<init>(r7, r2)
            if (r1 != 0) goto Lc8
            boolean r20 = r2.hasValue(r12)
            if (r20 == 0) goto Lc8
            boolean r20 = r2.getBoolean(r12, r10)
            r21 = r20
            r20 = 1
            goto Lcc
        Lc8:
            r20 = r10
            r21 = r20
        Lcc:
            r0.m(r7, r14)
            boolean r22 = r2.hasValue(r15)
            if (r22 == 0) goto Lda
            java.lang.String r22 = r2.getString(r15)
            goto Ldc
        Lda:
            r22 = 0
        Ldc:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto Leb
            boolean r11 = r2.hasValue(r13)
            if (r11 == 0) goto Leb
            java.lang.String r2 = r2.getString(r13)
            goto Lec
        Leb:
            r2 = 0
        Lec:
            r14.D()
            goto Lf7
        Lf0:
            r20 = r10
            r21 = r20
            r2 = 0
            r22 = 0
        Lf7:
            m44 r11 = new m44
            android.content.res.TypedArray r4 = r7.obtainStyledAttributes(r3, r4, r5, r10)
            r11.<init>(r7, r4)
            if (r1 != 0) goto L10e
            boolean r14 = r4.hasValue(r12)
            if (r14 == 0) goto L10e
            boolean r21 = r4.getBoolean(r12, r10)
            r20 = 1
        L10e:
            r12 = r21
            boolean r14 = r4.hasValue(r15)
            if (r14 == 0) goto L11a
            java.lang.String r22 = r4.getString(r15)
        L11a:
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r9) goto L128
            boolean r9 = r4.hasValue(r13)
            if (r9 == 0) goto L128
            java.lang.String r2 = r4.getString(r13)
        L128:
            r9 = 28
            if (r14 < r9) goto L13d
            boolean r9 = r4.hasValue(r10)
            if (r9 == 0) goto L13d
            r9 = -1
            int r4 = r4.getDimensionPixelSize(r10, r9)
            if (r4 != 0) goto L13d
            r4 = 0
            r6.setTextSize(r10, r4)
        L13d:
            r0.m(r7, r11)
            r11.D()
            if (r1 != 0) goto L14a
            if (r20 == 0) goto L14a
            r6.setAllCaps(r12)
        L14a:
            android.graphics.Typeface r1 = r0.l
            if (r1 == 0) goto L15c
            int r4 = r0.k
            r9 = -1
            if (r4 != r9) goto L159
            int r4 = r0.j
            r6.setTypeface(r1, r4)
            goto L15c
        L159:
            r6.setTypeface(r1)
        L15c:
            if (r2 == 0) goto L161
            defpackage.ks.d(r6, r2)
        L161:
            if (r22 == 0) goto L16a
            android.os.LocaleList r1 = defpackage.js.a(r22)
            defpackage.js.b(r6, r1)
        L16a:
            vs r9 = r0.i
            android.content.Context r11 = r9.j
            int[] r2 = defpackage.m75.i
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r3, r2, r5, r10)
            android.widget.TextView r0 = r9.i
            android.content.Context r1 = r0.getContext()
            r12 = 5
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            boolean r0 = r4.hasValue(r12)
            if (r0 == 0) goto L18a
            int r0 = r4.getInt(r12, r10)
            r9.a = r0
        L18a:
            r0 = 4
            boolean r1 = r4.hasValue(r0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L199
            float r0 = r4.getDimension(r0, r5)
        L197:
            r1 = 2
            goto L19b
        L199:
            r0 = r5
            goto L197
        L19b:
            boolean r14 = r4.hasValue(r1)
            if (r14 == 0) goto L1a7
            float r14 = r4.getDimension(r1, r5)
        L1a5:
            r1 = 1
            goto L1a9
        L1a7:
            r14 = r5
            goto L1a5
        L1a9:
            boolean r17 = r4.hasValue(r1)
            if (r17 == 0) goto L1b5
            float r17 = r4.getDimension(r1, r5)
        L1b3:
            r1 = 3
            goto L1b8
        L1b5:
            r17 = r5
            goto L1b3
        L1b8:
            boolean r16 = r4.hasValue(r1)
            r23 = r5
            if (r16 == 0) goto L1f1
            int r5 = r4.getResourceId(r1, r10)
            if (r5 <= 0) goto L1f1
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.TypedArray r1 = r1.obtainTypedArray(r5)
            int r5 = r1.length()
            int[] r12 = new int[r5]
            if (r5 <= 0) goto L1ee
            r15 = r10
        L1d7:
            if (r15 >= r5) goto L1e5
            r13 = -1
            int r22 = r1.getDimensionPixelSize(r15, r13)
            r12[r15] = r22
            int r15 = r15 + 1
            r13 = 13
            goto L1d7
        L1e5:
            int[] r5 = defpackage.vs.b(r12)
            r9.f = r5
            r9.i()
        L1ee:
            r1.recycle()
        L1f1:
            r4.recycle()
            boolean r1 = r9.j()
            if (r1 == 0) goto L231
            int r1 = r9.a
            r4 = 1
            if (r1 != r4) goto L233
            boolean r1 = r9.g
            if (r1 != 0) goto L22d
            android.content.res.Resources r1 = r11.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r4 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r4 != 0) goto L217
            r4 = 1094713344(0x41400000, float:12.0)
            r5 = 2
            float r14 = android.util.TypedValue.applyDimension(r5, r4, r1)
            goto L218
        L217:
            r5 = 2
        L218:
            int r4 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r4 != 0) goto L222
            r4 = 1121976320(0x42e00000, float:112.0)
            float r17 = android.util.TypedValue.applyDimension(r5, r4, r1)
        L222:
            r1 = r17
            int r4 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r4 != 0) goto L22a
            r0 = 1065353216(0x3f800000, float:1.0)
        L22a:
            r9.k(r14, r1, r0)
        L22d:
            r9.h()
            goto L233
        L231:
            r9.a = r10
        L233:
            boolean r0 = defpackage.eq7.c
            if (r0 == 0) goto L262
            int r0 = r9.a
            if (r0 == 0) goto L262
            int[] r0 = r9.f
            int r1 = r0.length
            if (r1 <= 0) goto L262
            int r1 = defpackage.ks.a(r6)
            float r1 = (float) r1
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 == 0) goto L25f
            float r0 = r9.d
            int r0 = java.lang.Math.round(r0)
            float r1 = r9.e
            int r1 = java.lang.Math.round(r1)
            float r4 = r9.c
            int r4 = java.lang.Math.round(r4)
            defpackage.ks.b(r6, r0, r1, r4, r10)
            goto L262
        L25f:
            defpackage.ks.c(r6, r0, r10)
        L262:
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r3, r2)
            r1 = 8
            r9 = -1
            int r1 = r0.getResourceId(r1, r9)
            if (r1 == r9) goto L276
            android.graphics.drawable.Drawable r1 = r8.b(r7, r1)
        L273:
            r2 = 13
            goto L278
        L276:
            r1 = 0
            goto L273
        L278:
            int r2 = r0.getResourceId(r2, r9)
            if (r2 == r9) goto L283
            android.graphics.drawable.Drawable r2 = r8.b(r7, r2)
            goto L284
        L283:
            r2 = 0
        L284:
            r3 = 9
            int r3 = r0.getResourceId(r3, r9)
            if (r3 == r9) goto L292
            android.graphics.drawable.Drawable r3 = r8.b(r7, r3)
        L290:
            r4 = 6
            goto L294
        L292:
            r3 = 0
            goto L290
        L294:
            int r4 = r0.getResourceId(r4, r9)
            if (r4 == r9) goto L29f
            android.graphics.drawable.Drawable r4 = r8.b(r7, r4)
            goto L2a0
        L29f:
            r4 = 0
        L2a0:
            r5 = 10
            int r5 = r0.getResourceId(r5, r9)
            if (r5 == r9) goto L2ad
            android.graphics.drawable.Drawable r5 = r8.b(r7, r5)
            goto L2ae
        L2ad:
            r5 = 0
        L2ae:
            r11 = 7
            int r11 = r0.getResourceId(r11, r9)
            if (r11 == r9) goto L2ba
            android.graphics.drawable.Drawable r8 = r8.b(r7, r11)
            goto L2bb
        L2ba:
            r8 = 0
        L2bb:
            if (r5 != 0) goto L310
            if (r8 == 0) goto L2c0
            goto L310
        L2c0:
            if (r1 != 0) goto L2c8
            if (r2 != 0) goto L2c8
            if (r3 != 0) goto L2c8
            if (r4 == 0) goto L331
        L2c8:
            android.graphics.drawable.Drawable[] r5 = r6.getCompoundDrawablesRelative()
            r8 = r5[r10]
            if (r8 != 0) goto L2d6
            r19 = 2
            r9 = r5[r19]
            if (r9 == 0) goto L2d9
        L2d6:
            r16 = 3
            goto L2fb
        L2d9:
            android.graphics.drawable.Drawable[] r5 = r6.getCompoundDrawables()
            if (r1 == 0) goto L2e0
            goto L2e2
        L2e0:
            r1 = r5[r10]
        L2e2:
            if (r2 == 0) goto L2e5
            goto L2e9
        L2e5:
            r18 = 1
            r2 = r5[r18]
        L2e9:
            if (r3 == 0) goto L2ec
            goto L2f0
        L2ec:
            r19 = 2
            r3 = r5[r19]
        L2f0:
            if (r4 == 0) goto L2f3
            goto L2f7
        L2f3:
            r16 = 3
            r4 = r5[r16]
        L2f7:
            r6.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4)
            goto L331
        L2fb:
            if (r2 == 0) goto L2fe
            goto L302
        L2fe:
            r18 = 1
            r2 = r5[r18]
        L302:
            if (r4 == 0) goto L307
        L304:
            r19 = 2
            goto L30a
        L307:
            r4 = r5[r16]
            goto L304
        L30a:
            r1 = r5[r19]
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r1, r4)
            goto L331
        L310:
            android.graphics.drawable.Drawable[] r1 = r6.getCompoundDrawablesRelative()
            if (r5 == 0) goto L317
            goto L319
        L317:
            r5 = r1[r10]
        L319:
            if (r2 == 0) goto L31c
            goto L320
        L31c:
            r18 = 1
            r2 = r1[r18]
        L320:
            if (r8 == 0) goto L323
            goto L327
        L323:
            r19 = 2
            r8 = r1[r19]
        L327:
            if (r4 == 0) goto L32a
            goto L32e
        L32a:
            r16 = 3
            r4 = r1[r16]
        L32e:
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r2, r8, r4)
        L331:
            r1 = 11
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L353
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L34c
            int r2 = r0.getResourceId(r1, r10)
            if (r2 == 0) goto L34c
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r7, r2)
            if (r2 == 0) goto L34c
            goto L350
        L34c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r1)
        L350:
            r6.setCompoundDrawableTintList(r2)
        L353:
            r1 = 12
            boolean r2 = r0.hasValue(r1)
            r9 = -1
            if (r2 == 0) goto L368
            int r1 = r0.getInt(r1, r9)
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = defpackage.bp1.c(r1, r2)
            r6.setCompoundDrawableTintMode(r1)
        L368:
            r1 = 15
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r2 = 18
            int r2 = r0.getDimensionPixelSize(r2, r9)
            r3 = 19
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L39a
            android.util.TypedValue r4 = r0.peekValue(r3)
            if (r4 == 0) goto L392
            int r5 = r4.type
            r12 = 5
            if (r5 != r12) goto L392
            int r3 = r4.data
            r9 = r3 & 15
            float r3 = android.util.TypedValue.complexToFloat(r3)
            r4 = r9
            r9 = -1
            goto L39e
        L392:
            r9 = -1
            int r3 = r0.getDimensionPixelSize(r3, r9)
            float r3 = (float) r3
        L398:
            r4 = r9
            goto L39e
        L39a:
            r9 = -1
            r3 = r23
            goto L398
        L39e:
            r0.recycle()
            if (r1 == r9) goto L3a6
            defpackage.ii2.O(r6, r1)
        L3a6:
            if (r2 == r9) goto L3ab
            defpackage.ii2.P(r6, r2)
        L3ab:
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 == 0) goto L3d3
            if (r4 != r9) goto L3b6
            int r0 = (int) r3
            defpackage.ii2.Q(r6, r0)
            return
        L3b6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L3c0
            defpackage.c2.m(r6, r4, r3)
            return
        L3c0:
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r4, r3, r0)
            int r0 = java.lang.Math.round(r0)
            defpackage.ii2.Q(r6, r0)
        L3d3:
            return
    }

    public final void g(android.content.Context r6, int r7) {
            r5 = this;
            m44 r0 = new m44
            int[] r1 = defpackage.m75.x
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
            r0.<init>(r6, r7)
            r1 = 14
            boolean r2 = r7.hasValue(r1)
            android.widget.TextView r3 = r5.a
            r4 = 0
            if (r2 == 0) goto L1d
            boolean r1 = r7.getBoolean(r1, r4)
            r3.setAllCaps(r1)
        L1d:
            boolean r1 = r7.hasValue(r4)
            if (r1 == 0) goto L2e
            r1 = -1
            int r1 = r7.getDimensionPixelSize(r4, r1)
            if (r1 != 0) goto L2e
            r1 = 0
            r3.setTextSize(r4, r1)
        L2e:
            r5.m(r6, r0)
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r6 < r1) goto L48
            r6 = 13
            boolean r1 = r7.hasValue(r6)
            if (r1 == 0) goto L48
            java.lang.String r6 = r7.getString(r6)
            if (r6 == 0) goto L48
            defpackage.ks.d(r3, r6)
        L48:
            r0.D()
            android.graphics.Typeface r6 = r5.l
            if (r6 == 0) goto L54
            int r5 = r5.j
            r3.setTypeface(r6, r5)
        L54:
            return
    }

    public final void h(int r2, int r3, int r4, int r5) {
            r1 = this;
            vs r1 = r1.i
            boolean r0 = r1.j()
            if (r0 == 0) goto L2d
            android.content.Context r0 = r1.j
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.k(r2, r3, r4)
            boolean r2 = r1.h()
            if (r2 == 0) goto L2d
            r1.a()
        L2d:
            return
    }

    public final void i(int[] r6, int r7) {
            r5 = this;
            vs r5 = r5.i
            boolean r0 = r5.j()
            if (r0 == 0) goto L53
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L48
            int[] r2 = new int[r0]
            if (r7 != 0) goto L15
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L31
        L15:
            android.content.Context r3 = r5.j
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L1f:
            if (r1 >= r0) goto L31
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1f
        L31:
            int[] r7 = defpackage.vs.b(r2)
            r5.f = r7
            boolean r7 = r5.i()
            if (r7 == 0) goto L3e
            goto L4a
        L3e:
            java.lang.String r5 = "None of the preset sizes is valid: "
            java.lang.String r6 = java.util.Arrays.toString(r6)
            defpackage.e41.A(r6, r5)
            return
        L48:
            r5.g = r1
        L4a:
            boolean r6 = r5.h()
            if (r6 == 0) goto L53
            r5.a()
        L53:
            return
    }

    public final void j(int r4) {
            r3 = this;
            vs r3 = r3.i
            boolean r0 = r3.j()
            if (r0 == 0) goto L4e
            if (r4 == 0) goto L3d
            r0 = 1
            if (r4 != r0) goto L33
            android.content.Context r4 = r3.j
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.k(r0, r4, r1)
            boolean r4 = r3.h()
            if (r4 == 0) goto L4e
            r3.a()
            return
        L33:
            java.lang.String r3 = "Unknown auto-size text type: "
            java.lang.String r3 = defpackage.lb1.g(r4, r3)
            defpackage.i.h(r3)
            return
        L3d:
            r4 = 0
            r3.a = r4
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.d = r0
            r3.e = r0
            r3.c = r0
            int[] r0 = new int[r4]
            r3.f = r0
            r3.b = r4
        L4e:
            return
    }

    public final void k(android.content.res.ColorStateList r2) {
            r1 = this;
            wz0 r0 = r1.h
            if (r0 != 0) goto Lb
            wz0 r0 = new wz0
            r0.<init>()
            r1.h = r0
        Lb:
            wz0 r0 = r1.h
            r0.c = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.b = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void l(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            wz0 r0 = r1.h
            if (r0 != 0) goto Lb
            wz0 r0 = new wz0
            r0.<init>()
            r1.h = r0
        Lb:
            wz0 r0 = r1.h
            r0.d = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.a = r2
            r1.b = r0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public final void m(android.content.Context r12, defpackage.m44 r13) {
            r11 = this;
            int r0 = r11.j
            java.lang.Object r1 = r13.L
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r2 = 2
            int r0 = r1.getInt(r2, r0)
            r11.j = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r4 = 28
            if (r0 < r4) goto L23
            r5 = 11
            int r5 = r1.getInt(r5, r3)
            r11.k = r5
            if (r5 == r3) goto L23
            int r5 = r11.j
            r5 = r5 & r2
            r11.j = r5
        L23:
            r5 = 10
            boolean r6 = r1.hasValue(r5)
            r7 = 12
            r8 = 0
            r9 = 1
            if (r6 != 0) goto L5a
            boolean r6 = r1.hasValue(r7)
            if (r6 == 0) goto L36
            goto L5a
        L36:
            boolean r12 = r1.hasValue(r9)
            if (r12 == 0) goto Ld5
            r11.m = r8
            int r12 = r1.getInt(r9, r9)
            if (r12 == r9) goto L55
            if (r12 == r2) goto L50
            r13 = 3
            if (r12 == r13) goto L4b
            goto Ld5
        L4b:
            android.graphics.Typeface r12 = android.graphics.Typeface.MONOSPACE
            r11.l = r12
            return
        L50:
            android.graphics.Typeface r12 = android.graphics.Typeface.SERIF
            r11.l = r12
            return
        L55:
            android.graphics.Typeface r12 = android.graphics.Typeface.SANS_SERIF
            r11.l = r12
            return
        L5a:
            r6 = 0
            r11.l = r6
            boolean r6 = r1.hasValue(r7)
            if (r6 == 0) goto L64
            r5 = r7
        L64:
            int r6 = r11.k
            int r7 = r11.j
            boolean r12 = r12.isRestricted()
            if (r12 != 0) goto La8
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            android.widget.TextView r10 = r11.a
            r12.<init>(r10)
            hs r10 = new hs
            r10.<init>(r11, r6, r7, r12)
            int r12 = r11.j     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r12 = r13.n(r5, r12, r10)     // Catch: java.lang.Throwable -> La8
            if (r12 == 0) goto L9f
            if (r0 < r4) goto L9d
            int r13 = r11.k     // Catch: java.lang.Throwable -> La8
            if (r13 == r3) goto L9d
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r8)     // Catch: java.lang.Throwable -> La8
            int r13 = r11.k     // Catch: java.lang.Throwable -> La8
            int r0 = r11.j     // Catch: java.lang.Throwable -> La8
            r0 = r0 & r2
            if (r0 == 0) goto L95
            r0 = r9
            goto L96
        L95:
            r0 = r8
        L96:
            android.graphics.Typeface r12 = defpackage.ls.a(r12, r13, r0)     // Catch: java.lang.Throwable -> La8
            r11.l = r12     // Catch: java.lang.Throwable -> La8
            goto L9f
        L9d:
            r11.l = r12     // Catch: java.lang.Throwable -> La8
        L9f:
            android.graphics.Typeface r12 = r11.l     // Catch: java.lang.Throwable -> La8
            if (r12 != 0) goto La5
            r12 = r9
            goto La6
        La5:
            r12 = r8
        La6:
            r11.m = r12     // Catch: java.lang.Throwable -> La8
        La8:
            android.graphics.Typeface r12 = r11.l
            if (r12 != 0) goto Ld5
            java.lang.String r12 = r1.getString(r5)
            if (r12 == 0) goto Ld5
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r4) goto Lcd
            int r13 = r11.k
            if (r13 == r3) goto Lcd
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r8)
            int r13 = r11.k
            int r0 = r11.j
            r0 = r0 & r2
            if (r0 == 0) goto Lc6
            r8 = r9
        Lc6:
            android.graphics.Typeface r12 = defpackage.ls.a(r12, r13, r8)
            r11.l = r12
            goto Ld5
        Lcd:
            int r13 = r11.j
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r13)
            r11.l = r12
        Ld5:
            return
    }
}
