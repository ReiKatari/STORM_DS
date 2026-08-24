package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl7  reason: default package */
/* loaded from: classes.dex */
public final class bl7 extends defpackage.sk7 {
    public static final android.graphics.PorterDuff.Mode f0 = null;
    public defpackage.zk7 B;
    public android.graphics.PorterDuffColorFilter L;
    public android.graphics.ColorFilter R;
    public boolean X;
    public boolean Y;
    public final float[] Z;
    public final android.graphics.Matrix d0;
    public final android.graphics.Rect e0;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.bl7.f0 = r0
            return
    }

    public bl7() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.Y = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.Z = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.d0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.e0 = r0
            zk7 r0 = new zk7
            r0.<init>()
            r1 = 0
            r0.c = r1
            android.graphics.PorterDuff$Mode r1 = defpackage.bl7.f0
            r0.d = r1
            yk7 r1 = new yk7
            r1.<init>()
            r0.b = r1
            r2.B = r0
            return
    }

    public bl7(defpackage.zk7 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.Y = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.Z = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.d0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.e0 = r0
            r1.B = r2
            android.content.res.ColorStateList r0 = r2.c
            android.graphics.PorterDuff$Mode r2 = r2.d
            android.graphics.PorterDuffColorFilter r2 = r1.a(r0, r2)
            r1.L = r2
            return
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.canApplyTheme()
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.drawable.Drawable r2 = r0.A
            if (r2 == 0) goto Lc
            r2.draw(r1)
            return
        Lc:
            android.graphics.Rect r2 = r0.e0
            r0.copyBounds(r2)
            int r3 = r2.width()
            if (r3 <= 0) goto L16c
            int r3 = r2.height()
            if (r3 > 0) goto L1f
            goto L16c
        L1f:
            android.graphics.ColorFilter r3 = r0.R
            if (r3 != 0) goto L25
            android.graphics.PorterDuffColorFilter r3 = r0.L
        L25:
            android.graphics.Matrix r4 = r0.d0
            r1.getMatrix(r4)
            float[] r5 = r0.Z
            r4.getValues(r5)
            r4 = 0
            r6 = r5[r4]
            float r6 = java.lang.Math.abs(r6)
            r7 = 4
            r7 = r5[r7]
            float r7 = java.lang.Math.abs(r7)
            r8 = 1
            r9 = r5[r8]
            float r9 = java.lang.Math.abs(r9)
            r10 = 3
            r5 = r5[r10]
            float r5 = java.lang.Math.abs(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto L56
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L58
        L56:
            r6 = r11
            r7 = r6
        L58:
            int r5 = r2.width()
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
            int r6 = r2.height()
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            r7 = 2048(0x800, float:2.87E-42)
            int r5 = java.lang.Math.min(r7, r5)
            int r6 = java.lang.Math.min(r7, r6)
            if (r5 <= 0) goto L16c
            if (r6 > 0) goto L76
            goto L16c
        L76:
            int r7 = r1.save()
            int r9 = r2.left
            float r9 = (float) r9
            int r12 = r2.top
            float r12 = (float) r12
            r1.translate(r9, r12)
            boolean r9 = r0.isAutoMirrored()
            if (r9 == 0) goto L9c
            int r9 = r0.getLayoutDirection()
            if (r9 != r8) goto L9c
            int r9 = r2.width()
            float r9 = (float) r9
            r1.translate(r9, r10)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r9, r11)
        L9c:
            r2.offsetTo(r4, r4)
            zk7 r9 = r0.B
            android.graphics.Bitmap r10 = r9.f
            if (r10 == 0) goto Lb4
            int r10 = r10.getWidth()
            if (r5 != r10) goto Lb4
            android.graphics.Bitmap r10 = r9.f
            int r10 = r10.getHeight()
            if (r6 != r10) goto Lb4
            goto Lbe
        Lb4:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r5, r6, r10)
            r9.f = r10
            r9.k = r8
        Lbe:
            boolean r9 = r0.Y
            zk7 r10 = r0.B
            if (r9 != 0) goto Lde
            android.graphics.Bitmap r9 = r10.f
            r9.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r4 = r10.f
            r15.<init>(r4)
            yk7 r12 = r10.b
            vk7 r13 = r12.g
            android.graphics.Matrix r14 = defpackage.yk7.p
            r16 = r5
            r17 = r6
            r12.a(r13, r14, r15, r16, r17)
            goto L132
        Lde:
            r16 = r5
            r17 = r6
            boolean r5 = r10.k
            if (r5 != 0) goto L103
            android.content.res.ColorStateList r5 = r10.g
            android.content.res.ColorStateList r6 = r10.c
            if (r5 != r6) goto L103
            android.graphics.PorterDuff$Mode r5 = r10.h
            android.graphics.PorterDuff$Mode r6 = r10.d
            if (r5 != r6) goto L103
            boolean r5 = r10.j
            boolean r6 = r10.e
            if (r5 != r6) goto L103
            int r5 = r10.i
            yk7 r6 = r10.b
            int r6 = r6.getRootAlpha()
            if (r5 != r6) goto L103
            goto L132
        L103:
            zk7 r5 = r0.B
            android.graphics.Bitmap r6 = r5.f
            r6.eraseColor(r4)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            android.graphics.Bitmap r6 = r5.f
            r15.<init>(r6)
            yk7 r12 = r5.b
            vk7 r13 = r12.g
            android.graphics.Matrix r14 = defpackage.yk7.p
            r12.a(r13, r14, r15, r16, r17)
            zk7 r5 = r0.B
            android.content.res.ColorStateList r6 = r5.c
            r5.g = r6
            android.graphics.PorterDuff$Mode r6 = r5.d
            r5.h = r6
            yk7 r6 = r5.b
            int r6 = r6.getRootAlpha()
            r5.i = r6
            boolean r6 = r5.e
            r5.j = r6
            r5.k = r4
        L132:
            zk7 r0 = r0.B
            yk7 r4 = r0.b
            int r4 = r4.getRootAlpha()
            r5 = 255(0xff, float:3.57E-43)
            r6 = 0
            if (r4 >= r5) goto L140
            goto L144
        L140:
            if (r3 != 0) goto L144
            r3 = r6
            goto L164
        L144:
            android.graphics.Paint r4 = r0.l
            if (r4 != 0) goto L152
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.l = r4
            r4.setFilterBitmap(r8)
        L152:
            android.graphics.Paint r4 = r0.l
            yk7 r5 = r0.b
            int r5 = r5.getRootAlpha()
            r4.setAlpha(r5)
            android.graphics.Paint r4 = r0.l
            r4.setColorFilter(r3)
            android.graphics.Paint r3 = r0.l
        L164:
            android.graphics.Bitmap r0 = r0.f
            r1.drawBitmap(r0, r6, r2, r3)
            r1.restoreToCount(r7)
        L16c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getAlpha()
            return r1
        L9:
            zk7 r1 = r1.B
            yk7 r1 = r1.b
            int r1 = r1.getRootAlpha()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getChangingConfigurations()
            return r1
        L9:
            int r0 = super.getChangingConfigurations()
            zk7 r1 = r1.B
            int r1 = r1.getChangingConfigurations()
            r1 = r1 | r0
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            return r1
        L9:
            android.graphics.ColorFilter r1 = r1.R
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L10
            al7 r0 = new al7
            android.graphics.drawable.Drawable r2 = r2.A
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r0.<init>(r2)
            return r0
        L10:
            zk7 r0 = r2.B
            int r1 = r2.getChangingConfigurations()
            r0.a = r1
            zk7 r2 = r2.B
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicHeight()
            return r1
        L9:
            zk7 r1 = r1.B
            yk7 r1 = r1.b
            float r1 = r1.i
            int r1 = (int) r1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            int r1 = r0.getIntrinsicWidth()
            return r1
        L9:
            zk7 r1 = r1.B
            yk7 r1 = r1.b
            float r1 = r1.h
            int r1 = (int) r1
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources r26, org.xmlpull.v1.XmlPullParser r27, android.util.AttributeSet r28, android.content.res.Resources.Theme r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            android.graphics.drawable.Drawable r5 = r0.A
            if (r5 == 0) goto L12
            r5.inflate(r1, r2, r3, r4)
            return
        L12:
            zk7 r5 = r0.B
            yk7 r6 = new yk7
            r6.<init>()
            r5.b = r6
            int[] r6 = defpackage.jw2.a
            android.content.res.TypedArray r6 = defpackage.xk2.D(r1, r4, r3, r6)
            zk7 r7 = r0.B
            yk7 r8 = r7.b
            java.lang.String r9 = "tintMode"
            boolean r9 = defpackage.xk2.v(r2, r9)
            r10 = -1
            r11 = 6
            if (r9 != 0) goto L31
            r9 = r10
            goto L35
        L31:
            int r9 = r6.getInt(r11, r10)
        L35:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 3
            r15 = 5
            if (r9 == r14) goto L51
            if (r9 == r15) goto L53
            if (r9 == r13) goto L4e
            switch(r9) {
                case 14: goto L4b;
                case 15: goto L48;
                case 16: goto L45;
                default: goto L44;
            }
        L44:
            goto L53
        L45:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L53
        L48:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L53
        L4b:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L53
        L4e:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L53
        L51:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L53:
            r7.d = r12
            android.content.res.ColorStateList r9 = defpackage.xk2.p(r6, r2, r4)
            if (r9 == 0) goto L5d
            r7.c = r9
        L5d:
            boolean r9 = r7.e
            java.lang.String r12 = "http://schemas.android.com/apk/res/android"
            java.lang.String r11 = "autoMirrored"
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L6d
            boolean r9 = r6.getBoolean(r15, r9)
        L6d:
            r7.e = r9
            float r7 = r8.j
            java.lang.String r9 = "viewportWidth"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            r11 = 7
            if (r9 == 0) goto L7e
            float r7 = r6.getFloat(r11, r7)
        L7e:
            r8.j = r7
            float r7 = r8.k
            java.lang.String r9 = "viewportHeight"
            java.lang.String r9 = r2.getAttributeValue(r12, r9)
            r15 = 8
            if (r9 == 0) goto L90
            float r7 = r6.getFloat(r15, r7)
        L90:
            r8.k = r7
            float r9 = r8.j
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L425
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L40a
            float r7 = r8.h
            float r7 = r6.getDimension(r14, r7)
            r8.h = r7
            float r7 = r8.i
            r9 = 2
            float r7 = r6.getDimension(r9, r7)
            r8.i = r7
            float r13 = r8.h
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 <= 0) goto L3ef
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L3d4
            float r7 = r8.getAlpha()
            java.lang.String r13 = "alpha"
            java.lang.String r13 = r2.getAttributeValue(r12, r13)
            r10 = 4
            if (r13 == 0) goto Lc9
            float r7 = r6.getFloat(r10, r7)
        Lc9:
            r8.setAlpha(r7)
            r7 = 0
            java.lang.String r13 = r6.getString(r7)
            if (r13 == 0) goto Lda
            r8.m = r13
            wu r10 = r8.o
            r10.put(r13, r8)
        Lda:
            r6.recycle()
            int r6 = r0.getChangingConfigurations()
            r5.a = r6
            r6 = 1
            r5.k = r6
            zk7 r8 = r0.B
            yk7 r10 = r8.b
            java.util.ArrayDeque r13 = new java.util.ArrayDeque
            r13.<init>()
            vk7 r15 = r10.g
            wu r10 = r10.o
            r13.push(r15)
            int r15 = r2.getEventType()
            int r19 = r2.getDepth()
            int r7 = r19 + 1
            r19 = r6
        L102:
            if (r15 == r6) goto L3bf
            int r6 = r2.getDepth()
            if (r6 >= r7) goto L10c
            if (r15 == r14) goto L3bf
        L10c:
            java.lang.String r6 = "group"
            if (r15 != r9) goto L397
            java.lang.String r15 = r2.getName()
            java.lang.Object r21 = r13.peek()
            r14 = r21
            vk7 r14 = (defpackage.vk7) r14
            java.lang.String r9 = "path"
            boolean r9 = r9.equals(r15)
            java.lang.String r11 = "fillType"
            r22 = r7
            java.lang.String r7 = "pathData"
            if (r9 == 0) goto L289
            uk7 r6 = new uk7
            r6.<init>()
            r9 = 0
            r6.e = r9
            r15 = 1065353216(0x3f800000, float:1.0)
            r6.g = r15
            r6.h = r15
            r6.i = r9
            r6.j = r15
            r6.k = r9
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.BUTT
            r6.l = r15
            android.graphics.Paint$Join r9 = android.graphics.Paint.Join.MITER
            r6.m = r9
            r19 = r9
            r9 = 1082130432(0x40800000, float:4.0)
            r6.n = r9
            int[] r9 = defpackage.jw2.c
            android.content.res.TypedArray r9 = defpackage.xk2.D(r1, r4, r3, r9)
            java.lang.String r7 = r2.getAttributeValue(r12, r7)
            if (r7 == 0) goto L264
            r23 = r15
            r7 = 0
            java.lang.String r15 = r9.getString(r7)
            if (r15 == 0) goto L163
            r6.b = r15
        L163:
            r7 = 2
            java.lang.String r15 = r9.getString(r7)
            if (r15 == 0) goto L170
            iu4[] r7 = defpackage.kn2.B(r15)
            r6.a = r7
        L170:
            java.lang.String r7 = "fillColor"
            r15 = 1
            ei r7 = defpackage.xk2.q(r9, r2, r4, r7, r15)
            r6.f = r7
            float r7 = r6.h
            java.lang.String r15 = "fillAlpha"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L189
            r15 = 12
            float r7 = r9.getFloat(r15, r7)
        L189:
            r6.h = r7
            java.lang.String r7 = "strokeLineCap"
            java.lang.String r7 = r2.getAttributeValue(r12, r7)
            if (r7 == 0) goto L19d
            r7 = 8
            r15 = -1
            int r18 = r9.getInt(r7, r15)
            r15 = r18
            goto L19e
        L19d:
            r15 = -1
        L19e:
            android.graphics.Paint$Cap r7 = r6.l
            if (r15 == 0) goto L1b3
            r24 = r7
            r7 = 1
            if (r15 == r7) goto L1b0
            r7 = 2
            if (r15 == r7) goto L1ad
            r15 = r24
            goto L1b5
        L1ad:
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.SQUARE
            goto L1b5
        L1b0:
            android.graphics.Paint$Cap r15 = android.graphics.Paint.Cap.ROUND
            goto L1b5
        L1b3:
            r15 = r23
        L1b5:
            r6.l = r15
            java.lang.String r7 = "strokeLineJoin"
            java.lang.String r7 = r2.getAttributeValue(r12, r7)
            if (r7 == 0) goto L1c9
            r7 = -1
            r15 = 9
            int r16 = r9.getInt(r15, r7)
            r7 = r16
            goto L1ca
        L1c9:
            r7 = -1
        L1ca:
            android.graphics.Paint$Join r15 = r6.m
            if (r7 == 0) goto L1df
            r23 = r15
            r15 = 1
            if (r7 == r15) goto L1dc
            r15 = 2
            if (r7 == r15) goto L1d9
            r7 = r23
            goto L1e1
        L1d9:
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.BEVEL
            goto L1e1
        L1dc:
            android.graphics.Paint$Join r7 = android.graphics.Paint.Join.ROUND
            goto L1e1
        L1df:
            r7 = r19
        L1e1:
            r6.m = r7
            float r7 = r6.n
            java.lang.String r15 = "strokeMiterLimit"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L1f3
            r15 = 10
            float r7 = r9.getFloat(r15, r7)
        L1f3:
            r6.n = r7
            java.lang.String r7 = "strokeColor"
            r15 = 3
            ei r7 = defpackage.xk2.q(r9, r2, r4, r7, r15)
            r6.d = r7
            float r7 = r6.g
            java.lang.String r15 = "strokeAlpha"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L20e
            r15 = 11
            float r7 = r9.getFloat(r15, r7)
        L20e:
            r6.g = r7
            float r7 = r6.e
            java.lang.String r15 = "strokeWidth"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L21f
            r15 = 4
            float r7 = r9.getFloat(r15, r7)
        L21f:
            r6.e = r7
            float r7 = r6.j
            java.lang.String r15 = "trimPathEnd"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L230
            r15 = 6
            float r7 = r9.getFloat(r15, r7)
        L230:
            r6.j = r7
            float r7 = r6.k
            java.lang.String r15 = "trimPathOffset"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L241
            r15 = 7
            float r7 = r9.getFloat(r15, r7)
        L241:
            r6.k = r7
            float r7 = r6.i
            java.lang.String r15 = "trimPathStart"
            java.lang.String r15 = r2.getAttributeValue(r12, r15)
            if (r15 == 0) goto L252
            r15 = 5
            float r7 = r9.getFloat(r15, r7)
        L252:
            r6.i = r7
            int r7 = r6.c
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L262
            r11 = 13
            int r7 = r9.getInt(r11, r7)
        L262:
            r6.c = r7
        L264:
            r9.recycle()
            java.util.ArrayList r7 = r14.b
            r7.add(r6)
            java.lang.String r7 = r6.getPathName()
            if (r7 == 0) goto L279
            java.lang.String r7 = r6.getPathName()
            r10.put(r7, r6)
        L279:
            int r6 = r8.a
            r8.a = r6
            r9 = 0
            r15 = 1
            r16 = 9
            r17 = -1
            r18 = 8
            r19 = 0
            goto L393
        L289:
            r16 = 9
            r17 = -1
            r18 = 8
            java.lang.String r9 = "clip-path"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L2eb
            tk7 r6 = new tk7
            r6.<init>()
            java.lang.String r7 = r2.getAttributeValue(r12, r7)
            if (r7 == 0) goto L2d1
            int[] r7 = defpackage.jw2.d
            android.content.res.TypedArray r7 = defpackage.xk2.D(r1, r4, r3, r7)
            r9 = 0
            java.lang.String r15 = r7.getString(r9)
            if (r15 == 0) goto L2b1
            r6.b = r15
        L2b1:
            r15 = 1
            java.lang.String r9 = r7.getString(r15)
            if (r9 == 0) goto L2be
            iu4[] r9 = defpackage.kn2.B(r9)
            r6.a = r9
        L2be:
            boolean r9 = defpackage.xk2.v(r2, r11)
            if (r9 != 0) goto L2c6
            r11 = 0
            goto L2cc
        L2c6:
            r9 = 0
            r15 = 2
            int r11 = r7.getInt(r15, r9)
        L2cc:
            r6.c = r11
            r7.recycle()
        L2d1:
            java.util.ArrayList r7 = r14.b
            r7.add(r6)
            java.lang.String r7 = r6.getPathName()
            if (r7 == 0) goto L2e3
            java.lang.String r7 = r6.getPathName()
            r10.put(r7, r6)
        L2e3:
            int r6 = r8.a
            r8.a = r6
        L2e7:
            r9 = 0
            r15 = 1
            goto L393
        L2eb:
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L2e7
            vk7 r6 = new vk7
            r6.<init>()
            int[] r7 = defpackage.jw2.b
            android.content.res.TypedArray r7 = defpackage.xk2.D(r1, r4, r3, r7)
            float r9 = r6.c
            java.lang.String r11 = "rotation"
            boolean r11 = defpackage.xk2.v(r2, r11)
            if (r11 != 0) goto L308
            r11 = 5
            goto L30d
        L308:
            r11 = 5
            float r9 = r7.getFloat(r11, r9)
        L30d:
            r6.c = r9
            float r9 = r6.d
            r15 = 1
            float r9 = r7.getFloat(r15, r9)
            r6.d = r9
            float r9 = r6.e
            r11 = 2
            float r9 = r7.getFloat(r11, r9)
            r6.e = r9
            float r9 = r6.f
            java.lang.String r11 = "scaleX"
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L330
            r11 = 3
            float r9 = r7.getFloat(r11, r9)
        L330:
            r6.f = r9
            float r9 = r6.g
            java.lang.String r11 = "scaleY"
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L342
            r11 = 4
            float r9 = r7.getFloat(r11, r9)
            goto L343
        L342:
            r11 = 4
        L343:
            r6.g = r9
            float r9 = r6.h
            java.lang.String r11 = "translateX"
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L355
            r11 = 6
            float r9 = r7.getFloat(r11, r9)
            goto L356
        L355:
            r11 = 6
        L356:
            r6.h = r9
            float r9 = r6.i
            java.lang.String r11 = "translateY"
            java.lang.String r11 = r2.getAttributeValue(r12, r11)
            if (r11 == 0) goto L368
            r11 = 7
            float r9 = r7.getFloat(r11, r9)
            goto L369
        L368:
            r11 = 7
        L369:
            r6.i = r9
            r9 = 0
            java.lang.String r11 = r7.getString(r9)
            if (r11 == 0) goto L374
            r6.k = r11
        L374:
            r6.c()
            r7.recycle()
            java.util.ArrayList r7 = r14.b
            r7.add(r6)
            r13.push(r6)
            java.lang.String r7 = r6.getGroupName()
            if (r7 == 0) goto L38f
            java.lang.String r7 = r6.getGroupName()
            r10.put(r7, r6)
        L38f:
            int r6 = r8.a
            r8.a = r6
        L393:
            r20 = r15
            r11 = 3
            goto L3b2
        L397:
            r22 = r7
            r11 = r14
            r9 = 0
            r16 = 9
            r17 = -1
            r18 = 8
            r20 = 1
            if (r15 != r11) goto L3b2
            java.lang.String r7 = r2.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3b2
            r13.pop()
        L3b2:
            int r15 = r2.next()
            r14 = r11
            r6 = r20
            r7 = r22
            r9 = 2
            r11 = 0
            goto L102
        L3bf:
            if (r19 != 0) goto L3cc
            android.content.res.ColorStateList r1 = r5.c
            android.graphics.PorterDuff$Mode r2 = r5.d
            android.graphics.PorterDuffColorFilter r1 = r0.a(r1, r2)
            r0.L = r1
            return
        L3cc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L3d4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r6.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<vector> tag requires height > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3ef:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r6.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<vector> tag requires width > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L40a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r6.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<vector> tag requires viewportHeight > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L425:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r6.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "<vector> tag requires viewportWidth > 0"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.isAutoMirrored()
            return r1
        L9:
            zk7 r1 = r1.B
            boolean r1 = r1.e
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L9
            boolean r2 = r0.isStateful()
            return r2
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L3c
            zk7 r0 = r2.B
            if (r0 == 0) goto L3a
            yk7 r0 = r0.b
            java.lang.Boolean r1 = r0.n
            if (r1 != 0) goto L25
            vk7 r1 = r0.g
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.n = r1
        L25:
            java.lang.Boolean r0 = r0.n
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            zk7 r2 = r2.B
            android.content.res.ColorStateList r2 = r2.c
            if (r2 == 0) goto L3a
            boolean r2 = r2.isStateful()
            if (r2 == 0) goto L3a
            goto L3c
        L3a:
            r2 = 0
            return r2
        L3c:
            r2 = 1
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.A
            if (r0 == 0) goto L8
            r0.mutate()
            return r5
        L8:
            boolean r0 = r5.X
            if (r0 != 0) goto L64
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r5) goto L64
            zk7 r0 = new zk7
            zk7 r1 = r5.B
            r0.<init>()
            r2 = 0
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = defpackage.bl7.f0
            r0.d = r2
            if (r1 == 0) goto L5f
            int r2 = r1.a
            r0.a = r2
            yk7 r2 = new yk7
            yk7 r3 = r1.b
            r2.<init>(r3)
            r0.b = r2
            yk7 r3 = r1.b
            android.graphics.Paint r3 = r3.e
            if (r3 == 0) goto L40
            android.graphics.Paint r3 = new android.graphics.Paint
            yk7 r4 = r1.b
            android.graphics.Paint r4 = r4.e
            r3.<init>(r4)
            r2.e = r3
        L40:
            yk7 r2 = r1.b
            android.graphics.Paint r2 = r2.d
            if (r2 == 0) goto L53
            yk7 r2 = r0.b
            android.graphics.Paint r3 = new android.graphics.Paint
            yk7 r4 = r1.b
            android.graphics.Paint r4 = r4.d
            r3.<init>(r4)
            r2.d = r3
        L53:
            android.content.res.ColorStateList r2 = r1.c
            r0.c = r2
            android.graphics.PorterDuff$Mode r2 = r1.d
            r0.d = r2
            boolean r1 = r1.e
            r0.e = r1
        L5f:
            r5.B = r0
            r0 = 1
            r5.X = r0
        L64:
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.A
            if (r0 == 0) goto L7
            r0.setBounds(r1)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.A
            if (r0 == 0) goto L9
            boolean r5 = r0.setState(r6)
            return r5
        L9:
            zk7 r0 = r5.B
            android.content.res.ColorStateList r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L1f
            android.graphics.PorterDuff$Mode r3 = r0.d
            if (r3 == 0) goto L1f
            android.graphics.PorterDuffColorFilter r1 = r5.a(r1, r3)
            r5.L = r1
            r5.invalidateSelf()
            r1 = r2
            goto L20
        L1f:
            r1 = 0
        L20:
            yk7 r3 = r0.b
            java.lang.Boolean r4 = r3.n
            if (r4 != 0) goto L32
            vk7 r4 = r3.g
            boolean r4 = r4.a()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.n = r4
        L32:
            java.lang.Boolean r3 = r3.n
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4d
            yk7 r3 = r0.b
            vk7 r3 = r3.g
            boolean r6 = r3.b(r6)
            boolean r3 = r0.k
            r3 = r3 | r6
            r0.k = r3
            if (r6 == 0) goto L4d
            r5.invalidateSelf()
            return r2
        L4d:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            zk7 r0 = r1.B
            yk7 r0 = r0.b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            zk7 r0 = r1.B
            yk7 r0 = r0.b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r2)
            return
        L8:
            zk7 r1 = r1.B
            r1.e = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.R = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.setTint(r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L8
            r0.setTintList(r3)
            return
        L8:
            zk7 r0 = r2.B
            android.content.res.ColorStateList r1 = r0.c
            if (r1 == r3) goto L1b
            r0.c = r3
            android.graphics.PorterDuff$Mode r0 = r0.d
            android.graphics.PorterDuffColorFilter r3 = r2.a(r3, r0)
            r2.L = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.A
            if (r0 == 0) goto L8
            r0.setTintMode(r3)
            return
        L8:
            zk7 r0 = r2.B
            android.graphics.PorterDuff$Mode r1 = r0.d
            if (r1 == r3) goto L1b
            r0.d = r3
            android.content.res.ColorStateList r0 = r0.c
            android.graphics.PorterDuffColorFilter r3 = r2.a(r0, r3)
            r2.L = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L9
            boolean r1 = r0.setVisible(r2, r3)
            return r1
        L9:
            boolean r1 = super.setVisible(r2, r3)
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.A
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }
}
