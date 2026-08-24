package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc1  reason: default package */
/* loaded from: classes.dex */
public final class yc1 implements defpackage.f13, defpackage.ib0, defpackage.mb0, defpackage.b51, defpackage.so2, defpackage.gt1, defpackage.c43, defpackage.x83 {
    public java.lang.Object A;
    public java.lang.Object B;

    public yc1(int r1) {
            r0 = this;
            switch(r1) {
                case 18: goto L39;
                case 22: goto L27;
                case 23: goto L15;
                default: goto L3;
            }
        L3:
            r0.<init>()
            rl7 r1 = new rl7
            r1.<init>()
            r0.A = r1
            rl7 r1 = new rl7
            r1.<init>()
            r0.B = r1
            return
        L15:
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.A = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.B = r1
            return
        L27:
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.A = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.B = r1
            return
        L39:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.B = r1
            return
    }

    public yc1(android.animation.Animator r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.A = r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1.B = r0
            r0.play(r2)
            return
    }

    public yc1(java.lang.CharSequence r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r2
            r0.B = r1
            return
    }

    public /* synthetic */ yc1(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.A = r2
            r1.<init>()
            return
    }

    public /* synthetic */ yc1(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public /* synthetic */ yc1(java.lang.Object r1, java.lang.Object r2, boolean r3) {
            r0 = this;
            r0.B = r1
            r0.A = r2
            r0.<init>()
            return
    }

    public static int E(int r5, int r6) {
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            r4 = 1
            if (r1 >= r5) goto L17
            int r2 = r2 + 1
            if (r2 != r6) goto Lf
            int r3 = r3 + 1
            r2 = r0
            goto L14
        Lf:
            if (r2 <= r6) goto L14
            int r3 = r3 + 1
            r2 = r4
        L14:
            int r1 = r1 + 1
            goto L4
        L17:
            int r2 = r2 + r4
            if (r2 <= r6) goto L1b
            int r3 = r3 + r4
        L1b:
            return r3
    }

    public void A(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.A(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void B(androidx.fragment.app.o r3, android.view.View r4, boolean r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L1b
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.B(r3, r4, r1)
        L1b:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L34
            r2 = 0
            if (r5 == 0) goto L33
            throw r2
        L33:
            throw r2
        L34:
            defpackage.u34.a()
        L37:
            return
    }

    public void C(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.C(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public defpackage.e34 D() {
            r0 = this;
            java.lang.Object r0 = r0.B
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Object r0 = r0.getValue()
            e34 r0 = (defpackage.e34) r0
            return r0
    }

    public void F() {
            r0 = this;
            java.lang.Object r0 = r0.A
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    public void G() {
            r4 = this;
            java.lang.Object r0 = r4.A
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.B
            java.nio.channels.FileChannel r1 = (java.nio.channels.FileChannel) r1
            if (r1 == 0) goto Lb
            goto L2c
        Lb:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            java.io.File r2 = r1.getParentFile()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1c
            r2.mkdirs()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L2d
        L1c:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L1a
            r4.B = r1     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2c
            r1.lock()     // Catch: java.lang.Throwable -> L1a
        L2c:
            return
        L2d:
            java.lang.Object r2 = r4.B
            java.nio.channels.FileChannel r2 = (java.nio.channels.FileChannel) r2
            if (r2 == 0) goto L36
            r2.close()
        L36:
            r2 = 0
            r4.B = r2
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to lock file: '"
            java.lang.String r3 = "'."
            java.lang.String r0 = defpackage.lb1.A(r2, r0, r3)
            r4.<init>(r0, r1)
            throw r4
    }

    public void H(java.lang.String r18, java.lang.Class r19, defpackage.qn2 r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.B
            su2 r2 = (defpackage.su2) r2
            java.io.File r3 = new java.io.File
            java.lang.Object r0 = r0.A
            r4 = r0
            android.content.Context r4 = (android.content.Context) r4
            java.io.File r0 = r4.getFilesDir()
            r3.<init>(r0, r1)
            boolean r0 = r3.isFile()
            yt1 r5 = defpackage.yt1.A
            if (r0 != 0) goto L20
            goto Lc9
        L20:
            r0 = 1
            java.lang.reflect.Type[] r6 = new java.lang.reflect.Type[r0]
            r7 = 0
            r6[r7] = r19
            java.lang.Class<java.util.List> r8 = java.util.List.class
            java.lang.reflect.TypeVariable[] r9 = r8.getTypeParameters()
            int r10 = r9.length
            if (r0 != r10) goto L10e
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L4c
            java.lang.Class r0 = r8.getDeclaringClass()
            if (r0 != 0) goto L40
            goto L4c
        L40:
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = " is not supported because it requires specifying an owner type"
            java.lang.String r2 = "Raw type "
            defpackage.u34.h(r0, r1, r2)
            return
        L4c:
            r0 = r7
        L4d:
            if (r0 >= r10) goto La0
            r11 = r6[r0]
            java.lang.String r12 = "Type argument must not be null"
            java.util.Objects.requireNonNull(r11, r12)
            java.lang.Class r12 = defpackage.q60.J(r11)
            r13 = r9[r0]
            java.lang.reflect.Type[] r14 = r13.getBounds()
            int r15 = r14.length
        L61:
            if (r7 >= r15) goto L9a
            r16 = r14[r7]
            r19 = r0
            java.lang.Class r0 = defpackage.q60.J(r16)
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L76
            int r7 = r7 + 1
            r0 = r19
            goto L61
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Type argument "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " does not satisfy bounds for type variable "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " declared by "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            r19 = r0
            int r0 = r19 + 1
            r7 = 0
            goto L4d
        La0:
            ie7 r0 = new ie7
            vu2 r7 = new vu2
            r9 = 0
            r7.<init>(r9, r8, r6)
            r0.<init>(r7)
            java.lang.reflect.Type r0 = r0.b
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lb9
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r0 = r2.b(r6, r0)     // Catch: java.lang.Throwable -> Lb9
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb9
            goto Lc0
        Lb9:
            r0 = move-exception
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        Lc0:
            java.lang.Throwable r3 = defpackage.hm5.a(r0)
            if (r3 != 0) goto Lc7
            r5 = r0
        Lc7:
            java.util.List r5 = (java.util.List) r5
        Lc9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r5.iterator()
        Ld2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Le8
            java.lang.Object r5 = r3.next()
            r6 = r20
            java.lang.Object r5 = r6.g(r5)
            if (r5 == 0) goto Ld2
            r0.add(r5)
            goto Ld2
        Le8:
            java.io.File r3 = new java.io.File
            java.io.File r4 = r4.getFilesDir()
            r3.<init>(r4, r1)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r3)
            r1.<init>(r4)
            java.lang.String r0 = r2.f(r0)     // Catch: java.lang.Throwable -> L106
            r1.write(r0)     // Catch: java.lang.Throwable -> L106
            r1.close()
            return
        L106:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L109
        L109:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        L10e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " requires "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " type arguments, but got 1"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public void I() {
            r6 = this;
            java.lang.Object r0 = r6.A
            me.magnum.melonds.ui.layouteditor.b r0 = (me.magnum.melonds.ui.layouteditor.b) r0
            nb1 r0 = r0.L
            java.lang.Object r0 = r0.e
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.Object r6 = r6.B
            t26 r6 = (defpackage.t26) r6
            me.magnum.melonds.domain.model.layout.BackgroundMode r6 = r6.b
            r6.getClass()
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            int r1 = r1.getIntrinsicWidth()
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            int r2 = r2.getIntrinsicHeight()
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r0.getHeight()
            int r5 = r0.getPaddingStart()
            int r4 = r4 - r5
            int r5 = r0.getPaddingLeft()
            int r4 = r4 - r5
            float r1 = (float) r1
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r3
            float r3 = (float) r4
            float r2 = r2 / r3
            int[] r3 = defpackage.io7.a
            int r6 = r6.ordinal()
            r6 = r3[r6]
            switch(r6) {
                case 1: goto Lcf;
                case 2: goto Lc9;
                case 3: goto Lb4;
                case 4: goto La4;
                case 5: goto L7c;
                case 6: goto L54;
                default: goto L50;
            }
        L50:
            defpackage.i.d()
            return
        L54:
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 <= 0) goto L76
            android.content.Context r6 = r0.getContext()
            r6.getClass()
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r6 != 0) goto L70
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_END
            goto L72
        L70:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_START
        L72:
            r0.setScaleType(r6)
            return
        L76:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            return
        L7c:
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 <= 0) goto L9e
            android.content.Context r6 = r0.getContext()
            r6.getClass()
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r6 != 0) goto L98
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_START
            goto L9a
        L98:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_END
        L9a:
            r0.setScaleType(r6)
            return
        L9e:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            return
        La4:
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 <= 0) goto Lae
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            return
        Lae:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_END
            r0.setScaleType(r6)
            return
        Lb4:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r6)
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 <= 0) goto Lc3
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            return
        Lc3:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_START
            r0.setScaleType(r6)
            return
        Lc9:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r6)
            return
        Lcf:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r6)
            return
    }

    public defpackage.f42 J() {
            r3 = this;
            java.lang.Object r0 = r3.A
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2b
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            java.lang.Object r3 = r3.B
            bs6 r3 = (defpackage.bs6) r3
            java.lang.String r0 = r0.getName()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r2)
            java.io.OutputStream r3 = r3.b(r1, r0)
            f42 r0 = new f42
            java.io.FileDescriptor r1 = r1.getFD()
            r0.<init>(r1, r3)
            return r0
        L2b:
            java.lang.String r3 = "output file already exists, please use a new file: "
            java.lang.String r0 = r0.getName()
            defpackage.e41.x(r0, r3)
            r3 = 0
            return r3
    }

    public java.lang.Object K(java.util.ArrayList r17, defpackage.s41 r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof defpackage.v12
            if (r3 == 0) goto L19
            r3 = r2
            v12 r3 = (defpackage.v12) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            v12 r3 = new v12
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.X
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L39
            if (r5 != r8) goto L33
            java.util.LinkedHashMap r1 = r3.R
            defpackage.oi2.Y(r2)
            goto Lab
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L39:
            defpackage.oi2.Y(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r10 = defpackage.ht0.v0(r1, r5)
            r2.<init>(r10)
            int r10 = r1.size()
            r11 = r7
        L4c:
            if (r11 >= r10) goto L61
            java.lang.Object r12 = r1.get(r11)
            int r11 = r11 + 1
            b82 r12 = (defpackage.b82) r12
            long r12 = r12.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            r2.add(r14)
            goto L4c
        L61:
            int r5 = defpackage.ht0.v0(r1, r5)
            int r5 = defpackage.c14.k0(r5)
            r10 = 16
            if (r5 >= r10) goto L6e
            r5 = r10
        L6e:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r5)
            int r5 = r1.size()
            r11 = r7
        L78:
            if (r11 >= r5) goto L8f
            java.lang.Object r12 = r1.get(r11)
            int r11 = r11 + 1
            b82 r12 = (defpackage.b82) r12
            long r13 = r12.a
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r13)
            bd5 r12 = r12.b
            r10.put(r15, r12)
            goto L78
        L8f:
            java.lang.Object r1 = r0.A
            sz1 r1 = (defpackage.sz1) r1
            jh r1 = r1.v
            r3.R = r10
            r3.Z = r8
            r1.getClass()
            xe1 r1 = defpackage.xk1.a
            y3 r5 = new y3
            r5.<init>(r2, r9, r6)
            java.lang.Object r2 = defpackage.hv.d0(r1, r5, r3)
            if (r2 != r4) goto Laa
            return r4
        Laa:
            r1 = r10
        Lab:
            ec5 r2 = (defpackage.ec5) r2
            java.lang.Object r0 = r0.B
            nv4 r0 = (defpackage.nv4) r0
            gd5 r0 = r0.a
            long r3 = r0.e
            r2.getClass()
            r1.getClass()
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            boolean r5 = r2.d
            r18 = r9
            if (r5 != 0) goto Le0
            long r9 = r2.a
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 == 0) goto Le1
        Le0:
            r7 = r8
        Le1:
            java.util.List r2 = r2.c
            java.util.Iterator r2 = r2.iterator()
        Le7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L16a
            java.lang.Object r3 = r2.next()
            dc5 r3 = (defpackage.dc5) r3
            long r4 = r3.a
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            boolean r9 = r0.add(r9)
            if (r9 != 0) goto L101
        Lff:
            r7 = r8
            goto Le7
        L101:
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Object r9 = r1.get(r9)
            bd5 r9 = (defpackage.bd5) r9
            r10 = -1
            if (r9 != 0) goto L110
            r9 = r10
            goto L118
        L110:
            int[] r15 = defpackage.jc5.a
            int r9 = r9.ordinal()
            r9 = r15[r9]
        L118:
            if (r9 == r10) goto L128
            if (r9 == r8) goto L125
            if (r9 != r6) goto L121
            ic5 r9 = defpackage.ic5.LEADERBOARD
            goto L12a
        L121:
            defpackage.i.d()
            return r18
        L125:
            ic5 r9 = defpackage.ic5.ACHIEVEMENT
            goto L12a
        L128:
            r9 = r18
        L12a:
            if (r9 == 0) goto Lff
            ic5 r10 = r3.b
            if (r9 == r10) goto L131
            goto Lff
        L131:
            gc5 r3 = r3.c
            int[] r9 = defpackage.jc5.b
            int r3 = r3.ordinal()
            r3 = r9[r3]
            if (r3 == r8) goto L161
            if (r3 == r6) goto L159
            r9 = 3
            if (r3 == r9) goto L151
            r9 = 4
            if (r3 != r9) goto L14d
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r13.add(r3)
            goto Le7
        L14d:
            defpackage.i.d()
            return r18
        L151:
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r14.add(r3)
            goto Le7
        L159:
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r12.add(r3)
            goto Le7
        L161:
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r11.add(r3)
            goto Le7
        L16a:
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r11, r12)
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r0, r13)
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r0, r14)
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L18a
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L18a
            goto L1a9
        L18a:
            java.util.Iterator r1 = r1.iterator()
        L18e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a9
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L18e
            goto L1aa
        L1a9:
            r8 = r7
        L1aa:
            if (r8 == 0) goto L1b2
            pb4 r0 = new pb4
            r0.<init>()
            return r0
        L1b2:
            pb4 r10 = new pb4
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
    }

    public void L(java.lang.annotation.Annotation r2) {
            r1 = this;
            java.lang.Object r0 = r1.B
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto Ld
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.B = r0
        Ld:
            java.lang.Object r1 = r1.B
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Class r0 = r2.annotationType()
            r1.put(r0, r2)
            return
    }

    @Override // defpackage.ib0
    public java.lang.reflect.Type a() {
            r0 = this;
            java.lang.Object r0 = r0.A
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
    }

    @Override // defpackage.ib0
    public java.lang.Object b(defpackage.vk4 r2) {
            r1 = this;
            java.lang.Object r1 = r1.B
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            if (r1 != 0) goto L7
            return r2
        L7:
            gd1 r0 = new gd1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.mb0
    public void c(defpackage.gb0 r4, defpackage.vl5 r5) {
            r3 = this;
            java.lang.Object r4 = r3.B
            gd1 r4 = (defpackage.gd1) r4
            java.util.concurrent.Executor r4 = r4.A
            java.lang.Object r0 = r3.A
            mb0 r0 = (defpackage.mb0) r0
            v r1 = new v
            r2 = 8
            r1.<init>(r3, r0, r5, r2)
            r4.execute(r1)
            return
    }

    @Override // defpackage.gt1
    public java.lang.Object d() {
            r0 = this;
            java.lang.Object r0 = r0.A
            tg7 r0 = (defpackage.tg7) r0
            return r0
    }

    @Override // defpackage.c43
    public void e() {
            r8 = this;
            java.lang.Object r0 = r8.A
            monitor-enter(r0)
            java.lang.Object r1 = r8.B     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L24
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L24
            r3 = 0
        Lc:
            if (r3 >= r2) goto L26
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + 1
            d43 r4 = (defpackage.d43) r4     // Catch: java.lang.Throwable -> L24
            sf0 r5 = r4.c     // Catch: java.lang.Throwable -> L24
            int r6 = r4.a     // Catch: java.lang.Throwable -> L24
            r7 = 0
            r5.k(r6, r7)     // Catch: java.lang.Throwable -> L24
            ig1 r4 = r4.b     // Catch: java.lang.Throwable -> L24
            r4.a()     // Catch: java.lang.Throwable -> L24
            goto Lc
        L24:
            r8 = move-exception
            goto L2f
        L26:
            java.lang.Object r8 = r8.B     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.lang.Throwable -> L24
            r8.clear()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return
        L2f:
            monitor-exit(r0)
            throw r8
    }

    @Override // defpackage.mb0
    public void f(defpackage.gb0 r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.Object r3 = r2.B
            gd1 r3 = (defpackage.gd1) r3
            java.util.concurrent.Executor r3 = r3.A
            java.lang.Object r0 = r2.A
            mb0 r0 = (defpackage.mb0) r0
            v r1 = new v
            r1.<init>(r2, r0, r4)
            r3.execute(r1)
            return
    }

    @Override // defpackage.c43
    public void g(int r3, defpackage.ig1 r4, defpackage.sf0 r5) {
            r2 = this;
            r4.getClass()
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            d43 r1 = new d43     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L14
            r2.add(r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.b51
    public java.lang.Object h(java.lang.Object r2) {
            r1 = this;
            yl5 r2 = (defpackage.yl5) r2
            r2.getClass()
            java.lang.Object r0 = r1.B
            s35 r0 = (defpackage.s35) r0
            java.lang.Object r1 = r1.A
            gg3 r1 = (defpackage.gg3) r1
            java.lang.String r2 = r2.r()
            java.lang.Object r0 = r0.A
            id3 r0 = (defpackage.id3) r0
            java.lang.Object r1 = r0.a(r1, r2)
            return r1
    }

    @Override // defpackage.so2
    public void i(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Object r2 = r2.A
            qv6 r2 = (defpackage.qv6) r2
            int r2 = r2.f
            r0 = 2
            java.lang.String r1 = "DualSurfaceProcessorNode"
            if (r2 != r0) goto L15
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L15
            java.lang.String r2 = "Downstream VideoCapture failed to provide Surface."
            defpackage.kj2.t(r1, r2)
            return
        L15:
            java.lang.String r2 = defpackage.mp2.H(r2)
            java.lang.String r0 = "Downstream node failed to provide Surface. Target: "
            java.lang.String r2 = r0.concat(r2)
            defpackage.kj2.g0(r1, r2, r3)
            return
    }

    @Override // defpackage.f13
    public java.lang.Object j(java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.s41 r12) {
            r8 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            la r1 = new la
            r6 = 0
            r7 = 2
            r2 = r8
            r3 = r9
            r5 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.hv.d0(r0, r1, r12)
            return r8
    }

    @Override // defpackage.c43
    public void k(defpackage.ig1 r5) {
            r4 = this;
            java.lang.Object r0 = r4.A
            monitor-enter(r0)
            java.lang.Object r4 = r4.B     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L25
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L25
            r2 = 0
        Lc:
            if (r2 >= r1) goto L27
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            d43 r3 = (defpackage.d43) r3     // Catch: java.lang.Throwable -> L25
            r3.getClass()     // Catch: java.lang.Throwable -> L25
            ig1 r3 = r3.b     // Catch: java.lang.Throwable -> L25
            boolean r3 = defpackage.nb3.k(r3, r5)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto Lc
            r5.a()     // Catch: java.lang.Throwable -> L25
            goto Lc
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r0)
            return
        L29:
            monitor-exit(r0)
            throw r4
    }

    public boolean l(long r7) {
            r6 = this;
            java.lang.Object r6 = r6.B
            ap3 r6 = (defpackage.ap3) r6
            java.lang.Object r6 = r6.B
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r0) goto L23
            java.lang.Object r3 = r6.get(r2)
            r4 = r3
            xy4 r4 = (defpackage.xy4) r4
            long r4 = r4.a
            boolean r4 = defpackage.nj2.o(r4, r7)
            if (r4 == 0) goto L20
            goto L24
        L20:
            int r2 = r2 + 1
            goto Le
        L23:
            r3 = 0
        L24:
            xy4 r3 = (defpackage.xy4) r3
            if (r3 == 0) goto L2b
            boolean r6 = r3.h
            return r6
        L2b:
            return r1
    }

    @Override // defpackage.gt1
    public boolean m(java.lang.CharSequence r4, int r5, int r6, defpackage.re7 r7) {
            r3 = this;
            int r0 = r7.c
            r0 = r0 & 4
            r1 = 1
            if (r0 <= 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r3.A
            tg7 r0 = (defpackage.tg7) r0
            if (r0 != 0) goto L22
            tg7 r0 = new tg7
            boolean r2 = r4 instanceof android.text.Spannable
            if (r2 == 0) goto L17
            android.text.Spannable r4 = (android.text.Spannable) r4
            goto L1d
        L17:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r4)
            r4 = r2
        L1d:
            r0.<init>(r4)
            r3.A = r0
        L22:
            java.lang.Object r4 = r3.B
            x31 r4 = (defpackage.x31) r4
            r4.getClass()
            se7 r4 = new se7
            r4.<init>(r7)
            java.lang.Object r3 = r3.A
            tg7 r3 = (defpackage.tg7) r3
            r7 = 33
            r3.setSpan(r4, r5, r6, r7)
            return r1
    }

    public defpackage.c37 n(java.util.List r8) {
            r7 = this;
            r0 = 0
            int r1 = r8.size()     // Catch: java.lang.Exception -> L72
            r2 = 0
            r3 = r0
        L7:
            if (r2 >= r1) goto L1f
            java.lang.Object r4 = r8.get(r2)     // Catch: java.lang.Exception -> L1d
            ds1 r4 = (defpackage.ds1) r4     // Catch: java.lang.Exception -> L1d
            java.lang.Object r3 = r7.B     // Catch: java.lang.Exception -> L1a
            gs1 r3 = (defpackage.gs1) r3     // Catch: java.lang.Exception -> L1a
            r4.a(r3)     // Catch: java.lang.Exception -> L1a
            int r2 = r2 + 1
            r3 = r4
            goto L7
        L1a:
            r0 = move-exception
            r3 = r4
            goto L75
        L1d:
            r0 = move-exception
            goto L75
        L1f:
            java.lang.Object r8 = r7.B
            gs1 r8 = (defpackage.gs1) r8
            r8.getClass()
            fp r1 = new fp
            java.lang.Object r8 = r8.Y
            m42 r8 = (defpackage.m42) r8
            java.lang.String r8 = r8.toString()
            r1.<init>(r8)
            java.lang.Object r8 = r7.B
            gs1 r8 = (defpackage.gs1) r8
            int r2 = r8.B
            int r8 = r8.L
            long r2 = defpackage.jx2.f(r2, r8)
            k47 r8 = new k47
            r8.<init>(r2)
            java.lang.Object r4 = r7.A
            c37 r4 = (defpackage.c37) r4
            long r4 = r4.b
            boolean r4 = defpackage.k47.g(r4)
            if (r4 != 0) goto L51
            r0 = r8
        L51:
            if (r0 == 0) goto L56
            long r2 = r0.a
            goto L62
        L56:
            int r8 = defpackage.k47.e(r2)
            int r0 = defpackage.k47.f(r2)
            long r2 = defpackage.jx2.f(r8, r0)
        L62:
            java.lang.Object r8 = r7.B
            gs1 r8 = (defpackage.gs1) r8
            k47 r8 = r8.c()
            c37 r0 = new c37
            r0.<init>(r1, r2, r8)
            r7.A = r0
            return r0
        L72:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L75:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while applying EditCommand batch to buffer (length="
            r4.<init>(r5)
            java.lang.Object r5 = r7.B
            gs1 r5 = (defpackage.gs1) r5
            java.lang.Object r5 = r5.Y
            m42 r5 = (defpackage.m42) r5
            int r5 = r5.b()
            r4.append(r5)
            java.lang.String r5 = ", composition="
            r4.append(r5)
            java.lang.Object r5 = r7.B
            gs1 r5 = (defpackage.gs1) r5
            k47 r5 = r5.c()
            r4.append(r5)
            java.lang.String r5 = ", selection="
            r4.append(r5)
            java.lang.Object r5 = r7.B
            gs1 r5 = (defpackage.gs1) r5
            int r6 = r5.B
            int r5 = r5.L
            long r5 = defpackage.jx2.f(r6, r5)
            java.lang.String r5 = defpackage.k47.h(r5)
            r4.append(r5)
            java.lang.String r5 = "):"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r4 = 10
            r2.append(r4)
            k0 r4 = new k0
            r4.<init>(r3, r7)
            r7 = 60
            java.lang.String r3 = "\n"
            defpackage.gt0.O0(r8, r2, r3, r4, r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7, r0)
            throw r1
    }

    public defpackage.na2 o() {
            r3 = this;
            na2 r0 = new na2
            java.lang.Object r1 = r3.A
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.B
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 != 0) goto Lf
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            goto L1c
        Lf:
            java.util.HashMap r2 = new java.util.HashMap
            java.lang.Object r3 = r3.B
            java.util.HashMap r3 = (java.util.HashMap) r3
            r2.<init>(r3)
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r2)
        L1c:
            r0.<init>(r1, r3)
            return r0
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(java.lang.Object r1) {
            r0 = this;
            wv6 r1 = (defpackage.wv6) r1
            r1.getClass()
            java.lang.Object r0 = r0.B
            s9 r0 = (defpackage.s9) r0
            java.lang.Object r0 = r0.a
            xv6 r0 = (defpackage.xv6) r0
            r0.b(r1)
            return
    }

    public void p(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.p(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void q(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            cl2 r1 = r0.w
            jq r1 = r1.B
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L1c
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.q(r3, r1)
        L1c:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L35
            r2 = 0
            if (r4 == 0) goto L34
            throw r2
        L34:
            throw r2
        L35:
            defpackage.u34.a()
        L38:
            return
    }

    public void r(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.r(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void s(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.s(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void t(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.t(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    @Override // defpackage.x83
    public defpackage.s83 toInstant() {
            r3 = this;
            t83 r0 = new t83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r3.A
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = " when parsing an Instant from \""
            r1.append(r2)
            java.lang.Object r3 = r3.B
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2 = 64
            java.lang.String r3 = defpackage.nb3.e0(r2, r3)
            r1.append(r3)
            r3 = 34
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void u(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.u(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void v(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            cl2 r1 = r0.w
            jq r1 = r1.B
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L1c
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.v(r3, r1)
        L1c:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L35
            r2 = 0
            if (r4 == 0) goto L34
            throw r2
        L34:
            throw r2
        L35:
            defpackage.u34.a()
        L38:
            return
    }

    public void w(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.w(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void x(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.x(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void y(androidx.fragment.app.o r3, android.os.Bundle r4, boolean r5) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.y(r3, r4, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r5 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }

    public void z(androidx.fragment.app.o r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.A
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            androidx.fragment.app.o r0 = r0.y
            if (r0 == 0) goto L18
            androidx.fragment.app.u r0 = r0.getParentFragmentManager()
            r0.getClass()
            yc1 r0 = r0.o
            r1 = 1
            r0.z(r3, r1)
        L18:
            java.lang.Object r2 = r2.B
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r2 = r2.next()
            if (r2 != 0) goto L31
            r2 = 0
            if (r4 == 0) goto L30
            throw r2
        L30:
            throw r2
        L31:
            defpackage.u34.a()
        L34:
            return
    }
}
