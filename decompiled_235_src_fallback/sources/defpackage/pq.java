package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq  reason: default package */
/* loaded from: classes.dex */
public final class pq {
    public java.lang.Object a;
    public java.lang.Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final java.lang.Object f;

    public /* synthetic */ pq(android.widget.TextView r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.b = r0
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.f = r2
            r1.<init>()
            return
    }

    public pq(defpackage.l55 r1, java.lang.Object r2, boolean r3, defpackage.im6 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            r0.c = r3
            r0.a = r4
            r0.d = r5
            r0.b = r2
            r1 = 1
            r0.e = r1
            return
    }

    public void a() {
            r3 = this;
            java.lang.Object r0 = r3.f
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.graphics.drawable.Drawable r1 = r0.getButtonDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.c
            if (r2 != 0) goto L12
            boolean r2 = r3.d
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.c
            if (r2 == 0) goto L21
            java.lang.Object r2 = r3.a
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.d
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.b
            android.graphics.PorterDuff$Mode r3 = (android.graphics.PorterDuff.Mode) r3
            r1.setTintMode(r3)
        L2c:
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L39
            int[] r3 = r0.getDrawableState()
            r1.setState(r3)
        L39:
            r0.setButtonDrawable(r1)
        L3c:
            return
    }

    public void b() {
            r3 = this;
            java.lang.Object r0 = r3.f
            oq r0 = (defpackage.oq) r0
            android.graphics.drawable.Drawable r1 = r0.getCheckMarkDrawable()
            if (r1 == 0) goto L3c
            boolean r2 = r3.c
            if (r2 != 0) goto L12
            boolean r2 = r3.d
            if (r2 == 0) goto L3c
        L12:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r3.c
            if (r2 == 0) goto L21
            java.lang.Object r2 = r3.a
            android.content.res.ColorStateList r2 = (android.content.res.ColorStateList) r2
            r1.setTintList(r2)
        L21:
            boolean r2 = r3.d
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r3.b
            android.graphics.PorterDuff$Mode r3 = (android.graphics.PorterDuff.Mode) r3
            r1.setTintMode(r3)
        L2c:
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L39
            int[] r3 = r0.getDrawableState()
            r1.setState(r3)
        L39:
            r0.setCheckMarkDrawable(r1)
        L3c:
            return
    }

    public java.lang.Object c() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Object r1 = r1.b
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "Unexpected form of a provided value"
            defpackage.tx0.b(r1)
            defpackage.e41.c()
            r1 = 0
            return r1
    }

    public void d(android.util.AttributeSet r8, int r9) {
            r7 = this;
            java.lang.Object r7 = r7.f
            r0 = r7
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r7 = r0.getContext()
            int[] r2 = defpackage.m75.m
            m44 r7 = defpackage.m44.A(r7, r8, r2, r9)
            java.lang.Object r1 = r7.L
            r6 = r1
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r7.L
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r8
            r5 = r9
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            r8 = 1
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r9 == 0) goto L3f
            int r8 = r6.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L3f
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r8 = defpackage.hf.S(r9, r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            goto L56
        L3c:
            r0 = move-exception
            r8 = r0
            goto L7c
        L3f:
            boolean r8 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            int r8 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r8 = defpackage.hf.S(r9, r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c
        L56:
            r8 = 2
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L64
            android.content.res.ColorStateList r8 = r7.g(r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintList(r8)     // Catch: java.lang.Throwable -> L3c
        L64:
            r8 = 3
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L78
            r9 = -1
            int r8 = r6.getInt(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r9 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.bp1.c(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintMode(r8)     // Catch: java.lang.Throwable -> L3c
        L78:
            r7.D()
            return
        L7c:
            r7.D()
            throw r8
    }
}
