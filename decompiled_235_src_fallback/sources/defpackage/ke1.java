package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke1  reason: default package */
/* loaded from: classes.dex */
public final class ke1 extends defpackage.cg5 {
    public static android.animation.TimeInterpolator s;
    public boolean g;
    public java.util.ArrayList h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    public java.util.ArrayList m;
    public java.util.ArrayList n;
    public java.util.ArrayList o;
    public java.util.ArrayList p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;

    public static void h(java.util.ArrayList r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            wg5 r1 = (defpackage.wg5) r1
            android.view.View r1 = r1.a
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    @Override // defpackage.cg5
    public final boolean a(defpackage.wg5 r9, defpackage.wg5 r10, defpackage.dy7 r11, defpackage.dy7 r12) {
            r8 = this;
            int r2 = r11.a
            int r3 = r11.b
            boolean r0 = r10.o()
            if (r0 == 0) goto L11
            int r12 = r11.a
            int r11 = r11.b
            r5 = r11
            r4 = r12
            goto L17
        L11:
            int r11 = r12.a
            int r12 = r12.b
            r4 = r11
            r5 = r12
        L17:
            if (r9 != r10) goto L20
            r0 = r8
            r1 = r9
            boolean r8 = r0.g(r1, r2, r3, r4, r5)
            return r8
        L20:
            r0 = r8
            r1 = r9
            android.view.View r8 = r1.a
            float r9 = r8.getTranslationX()
            float r11 = r8.getTranslationY()
            float r12 = r8.getAlpha()
            r0.l(r1)
            int r6 = r4 - r2
            float r6 = (float) r6
            float r6 = r6 - r9
            int r6 = (int) r6
            int r7 = r5 - r3
            float r7 = (float) r7
            float r7 = r7 - r11
            int r7 = (int) r7
            r8.setTranslationX(r9)
            r8.setTranslationY(r11)
            r8.setAlpha(r12)
            android.view.View r8 = r10.a
            r0.l(r10)
            int r9 = -r6
            float r9 = (float) r9
            r8.setTranslationX(r9)
            int r9 = -r7
            float r9 = (float) r9
            r8.setTranslationY(r9)
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r0.k
            ie1 r9 = new ie1
            r9.<init>()
            r9.a = r1
            r9.b = r10
            r9.c = r2
            r9.d = r3
            r9.e = r4
            r9.f = r5
            r8.add(r9)
            r8 = 1
            return r8
    }

    @Override // defpackage.cg5
    public final void d(defpackage.wg5 r10) {
            r9 = this;
            java.util.ArrayList r0 = r9.l
            java.util.ArrayList r1 = r9.m
            java.util.ArrayList r2 = r9.n
            android.view.View r3 = r10.a
            android.view.ViewPropertyAnimator r4 = r3.animate()
            r4.cancel()
            java.util.ArrayList r4 = r9.j
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L17:
            r6 = 0
            if (r5 < 0) goto L33
            java.lang.Object r7 = r4.get(r5)
            je1 r7 = (defpackage.je1) r7
            wg5 r7 = r7.a
            if (r7 != r10) goto L30
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.c(r10)
            r4.remove(r5)
        L30:
            int r5 = r5 + (-1)
            goto L17
        L33:
            java.util.ArrayList r4 = r9.k
            r9.j(r4, r10)
            java.util.ArrayList r4 = r9.h
            boolean r4 = r4.remove(r10)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L48
            r3.setAlpha(r5)
            r9.c(r10)
        L48:
            java.util.ArrayList r4 = r9.i
            boolean r4 = r4.remove(r10)
            if (r4 == 0) goto L56
            r3.setAlpha(r5)
            r9.c(r10)
        L56:
            int r4 = r2.size()
            int r4 = r4 + (-1)
        L5c:
            if (r4 < 0) goto L73
            java.lang.Object r7 = r2.get(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r9.j(r7, r10)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L70
            r2.remove(r4)
        L70:
            int r4 = r4 + (-1)
            goto L5c
        L73:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L79:
            if (r2 < 0) goto Laf
            java.lang.Object r4 = r1.get(r2)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r7 = r4.size()
            int r7 = r7 + (-1)
        L87:
            if (r7 < 0) goto Lac
            java.lang.Object r8 = r4.get(r7)
            je1 r8 = (defpackage.je1) r8
            wg5 r8 = r8.a
            if (r8 != r10) goto La9
            r3.setTranslationY(r6)
            r3.setTranslationX(r6)
            r9.c(r10)
            r4.remove(r7)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lac
            r1.remove(r2)
            goto Lac
        La9:
            int r7 = r7 + (-1)
            goto L87
        Lac:
            int r2 = r2 + (-1)
            goto L79
        Laf:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        Lb5:
            if (r1 < 0) goto Ld5
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r10)
            if (r4 == 0) goto Ld2
            r3.setAlpha(r5)
            r9.c(r10)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ld2
            r0.remove(r1)
        Ld2:
            int r1 = r1 + (-1)
            goto Lb5
        Ld5:
            java.util.ArrayList r0 = r9.q
            r0.remove(r10)
            java.util.ArrayList r0 = r9.o
            r0.remove(r10)
            java.util.ArrayList r0 = r9.r
            r0.remove(r10)
            java.util.ArrayList r0 = r9.p
            r0.remove(r10)
            r9.i()
            return
    }

    @Override // defpackage.cg5
    public final void e() {
            r11 = this;
            java.util.ArrayList r0 = r11.k
            java.util.ArrayList r1 = r11.n
            java.util.ArrayList r2 = r11.l
            java.util.ArrayList r3 = r11.m
            java.util.ArrayList r4 = r11.i
            java.util.ArrayList r5 = r11.h
            java.util.ArrayList r6 = r11.j
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L14:
            r8 = 0
            if (r7 < 0) goto L32
            java.lang.Object r9 = r6.get(r7)
            je1 r9 = (defpackage.je1) r9
            wg5 r10 = r9.a
            android.view.View r10 = r10.a
            r10.setTranslationY(r8)
            r10.setTranslationX(r8)
            wg5 r8 = r9.a
            r11.c(r8)
            r6.remove(r7)
            int r7 = r7 + (-1)
            goto L14
        L32:
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L38:
            if (r6 < 0) goto L49
            java.lang.Object r7 = r5.get(r6)
            wg5 r7 = (defpackage.wg5) r7
            r11.c(r7)
            r5.remove(r6)
            int r6 = r6 + (-1)
            goto L38
        L49:
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L4f:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 < 0) goto L67
            java.lang.Object r7 = r4.get(r5)
            wg5 r7 = (defpackage.wg5) r7
            android.view.View r9 = r7.a
            r9.setAlpha(r6)
            r11.c(r7)
            r4.remove(r5)
            int r5 = r5 + (-1)
            goto L4f
        L67:
            int r4 = r0.size()
            int r4 = r4 + (-1)
        L6d:
            if (r4 < 0) goto L86
            java.lang.Object r5 = r0.get(r4)
            ie1 r5 = (defpackage.ie1) r5
            wg5 r7 = r5.a
            if (r7 == 0) goto L7c
            r11.k(r5, r7)
        L7c:
            wg5 r7 = r5.b
            if (r7 == 0) goto L83
            r11.k(r5, r7)
        L83:
            int r4 = r4 + (-1)
            goto L6d
        L86:
            r0.clear()
            boolean r0 = r11.f()
            if (r0 != 0) goto L90
            return
        L90:
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L96:
            if (r0 < 0) goto Lcd
            java.lang.Object r4 = r3.get(r0)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        La4:
            if (r5 < 0) goto Lca
            java.lang.Object r7 = r4.get(r5)
            je1 r7 = (defpackage.je1) r7
            wg5 r9 = r7.a
            android.view.View r9 = r9.a
            r9.setTranslationY(r8)
            r9.setTranslationX(r8)
            wg5 r7 = r7.a
            r11.c(r7)
            r4.remove(r5)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto Lc7
            r3.remove(r4)
        Lc7:
            int r5 = r5 + (-1)
            goto La4
        Lca:
            int r0 = r0 + (-1)
            goto L96
        Lcd:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        Ld3:
            if (r0 < 0) goto L103
            java.lang.Object r3 = r2.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Le1:
            if (r4 < 0) goto L100
            java.lang.Object r5 = r3.get(r4)
            wg5 r5 = (defpackage.wg5) r5
            android.view.View r7 = r5.a
            r7.setAlpha(r6)
            r11.c(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lfd
            r2.remove(r3)
        Lfd:
            int r4 = r4 + (-1)
            goto Le1
        L100:
            int r0 = r0 + (-1)
            goto Ld3
        L103:
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L109:
            if (r0 < 0) goto L13c
            java.lang.Object r2 = r1.get(r0)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L117:
            if (r3 < 0) goto L139
            java.lang.Object r4 = r2.get(r3)
            ie1 r4 = (defpackage.ie1) r4
            wg5 r5 = r4.a
            if (r5 == 0) goto L126
            r11.k(r4, r5)
        L126:
            wg5 r5 = r4.b
            if (r5 == 0) goto L12d
            r11.k(r4, r5)
        L12d:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L136
            r1.remove(r2)
        L136:
            int r3 = r3 + (-1)
            goto L117
        L139:
            int r0 = r0 + (-1)
            goto L109
        L13c:
            java.util.ArrayList r0 = r11.q
            h(r0)
            java.util.ArrayList r0 = r11.p
            h(r0)
            java.util.ArrayList r0 = r11.o
            h(r0)
            java.util.ArrayList r0 = r11.r
            h(r0)
            java.util.ArrayList r11 = r11.b
            int r0 = r11.size()
            if (r0 > 0) goto L15c
            r11.clear()
            return
        L15c:
            r0 = 0
            java.lang.Object r11 = r11.get(r0)
            r11.getClass()
            defpackage.u34.a()
            return
    }

    @Override // defpackage.cg5
    public final boolean f() {
            r1 = this;
            java.util.ArrayList r0 = r1.i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r1 = r1.n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L59
            goto L5b
        L59:
            r1 = 0
            return r1
        L5b:
            r1 = 1
            return r1
    }

    public final boolean g(defpackage.wg5 r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.View r0 = r4.a
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r5 = r5 + r1
            android.view.View r1 = r4.a
            float r1 = r1.getTranslationY()
            int r1 = (int) r1
            int r6 = r6 + r1
            r3.l(r4)
            int r1 = r7 - r5
            int r2 = r8 - r6
            if (r1 != 0) goto L20
            if (r2 != 0) goto L20
            r3.c(r4)
            r3 = 0
            return r3
        L20:
            if (r1 == 0) goto L27
            int r1 = -r1
            float r1 = (float) r1
            r0.setTranslationX(r1)
        L27:
            if (r2 == 0) goto L2e
            int r1 = -r2
            float r1 = (float) r1
            r0.setTranslationY(r1)
        L2e:
            java.util.ArrayList r3 = r3.j
            je1 r0 = new je1
            r0.<init>()
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.d = r7
            r0.e = r8
            r3.add(r0)
            r3 = 1
            return r3
    }

    public final void i() {
            r1 = this;
            boolean r0 = r1.f()
            if (r0 != 0) goto L1d
            java.util.ArrayList r1 = r1.b
            int r0 = r1.size()
            if (r0 > 0) goto L12
            r1.clear()
            return
        L12:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            r1.getClass()
            defpackage.u34.a()
        L1d:
            return
    }

    public final void j(java.util.ArrayList r4, defpackage.wg5 r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            ie1 r1 = (defpackage.ie1) r1
            boolean r2 = r3.k(r1, r5)
            if (r2 == 0) goto L1f
            wg5 r2 = r1.a
            if (r2 != 0) goto L1f
            wg5 r2 = r1.b
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    public final boolean k(defpackage.ie1 r3, defpackage.wg5 r4) {
            r2 = this;
            wg5 r0 = r3.b
            r1 = 0
            if (r0 != r4) goto L8
            r3.b = r1
            goto Le
        L8:
            wg5 r0 = r3.a
            if (r0 != r4) goto L23
            r3.a = r1
        Le:
            android.view.View r3 = r4.a
            android.view.View r0 = r4.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r1)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            r2.c(r4)
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    public final void l(defpackage.wg5 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = defpackage.ke1.s
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            defpackage.ke1.s = r0
        Lf:
            android.view.View r0 = r3.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = defpackage.ke1.s
            r0.setInterpolator(r1)
            r2.d(r3)
            return
    }
}
