package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un3  reason: default package */
/* loaded from: classes.dex */
public abstract class un3 extends android.widget.FrameLayout {
    public static final /* synthetic */ int L = 0;
    public defpackage.bk3 A;
    public final java.util.LinkedHashMap B;

    public un3(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.B = r1
            r1 = 0
            r0.setLayoutDirection(r1)
            return
    }

    public final defpackage.zj3 a(defpackage.j05 r8) {
            r7 = this;
            bk3 r0 = r7.getViewBuilderFactory()
            nj3 r1 = r8.b
            ak3 r0 = r0.a(r1)
            android.content.Context r2 = r7.getContext()
            r2.getClass()
            android.view.View r2 = r0.a(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            me.magnum.melonds.domain.model.Rect r4 = r8.a
            int r5 = r4.getWidth()
            int r6 = r4.getHeight()
            r3.<init>(r5, r6)
            int r5 = r4.getX()
            r3.leftMargin = r5
            int r4 = r4.getY()
            r3.topMargin = r4
            zj3 r4 = new zj3
            r0.b()
            r4.<init>(r2, r1)
            float r0 = r8.c
            r4.c = r0
            r2.setAlpha(r0)
            r0 = 0
            r4.c(r0)
            boolean r8 = r8.d
            r4.d = r8
            boolean r8 = r1.isScreen()
            if (r8 == 0) goto L51
            r7.addView(r2, r0, r3)
            goto L54
        L51:
            r7.addView(r2, r3)
        L54:
            r7.f(r4)
            return r4
    }

    public final void b() {
            r1 = this;
            java.util.LinkedHashMap r0 = r1.B
            r0.clear()
            r1.removeAllViews()
            return
    }

    public final defpackage.zj3 d(defpackage.nj3 r1) {
            r0 = this;
            r1.getClass()
            java.util.LinkedHashMap r0 = r0.B
            java.lang.Object r0 = r0.get(r1)
            zj3 r0 = (defpackage.zj3) r0
            return r0
    }

    public void e(defpackage.ff7 r5, defpackage.sn3 r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            r4.b()
            int[] r0 = defpackage.tn3.a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 1
            if (r6 == r0) goto L20
            r0 = 2
            if (r6 != r0) goto L1c
            z66 r5 = r5.b
            java.util.List r5 = r5.c
            goto L24
        L1c:
            defpackage.i.d()
            return
        L20:
            z66 r5 = r5.a
            java.util.List r5 = r5.c
        L24:
            if (r5 != 0) goto L27
            goto L95
        L27:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r5.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            r2 = r1
            j05 r2 = (defpackage.j05) r2
            nj3 r2 = r2.b
            boolean r2 = r2.isScreen()
            if (r2 == 0) goto L30
            r6.add(r1)
            goto L30
        L49:
            zh2 r0 = new zh2
            r1 = 19
            r0.<init>(r1)
            java.util.List r6 = defpackage.gt0.d1(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r5.next()
            r2 = r1
            j05 r2 = (defpackage.j05) r2
            nj3 r2 = r2.b
            boolean r2 = r2.isScreen()
            if (r2 != 0) goto L5d
            r0.add(r1)
            goto L5d
        L76:
            java.util.ArrayList r5 = defpackage.gt0.V0(r6, r0)
            int r6 = r5.size()
            r0 = 0
        L7f:
            if (r0 >= r6) goto L95
            java.lang.Object r1 = r5.get(r0)
            int r0 = r0 + 1
            j05 r1 = (defpackage.j05) r1
            nj3 r2 = r1.b
            zj3 r1 = r4.a(r1)
            java.util.LinkedHashMap r3 = r4.B
            r3.put(r2, r1)
            goto L7f
        L95:
            return
    }

    public void f(defpackage.zj3 r1) {
            r0 = this;
            return
    }

    public final java.util.List<defpackage.nj3> getInstantiatedComponents() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.B
            java.util.Set r0 = r0.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = defpackage.gt0.k1(r0)
            return r0
    }

    public final java.util.List<defpackage.zj3> getLayoutComponentViews() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.B
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = defpackage.gt0.k1(r0)
            return r0
    }

    public final defpackage.bk3 getViewBuilderFactory() {
            r0 = this;
            bk3 r0 = r0.A
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "viewBuilderFactory"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final java.util.Map<defpackage.nj3, defpackage.zj3> getViews() {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.B
            return r0
    }

    public final void setLayoutComponentViewBuilderFactory(defpackage.bk3 r1) {
            r0 = this;
            r1.getClass()
            r0.setViewBuilderFactory(r1)
            return
    }

    public final void setViewBuilderFactory(defpackage.bk3 r1) {
            r0 = this;
            r1.getClass()
            r0.A = r1
            return
    }
}
