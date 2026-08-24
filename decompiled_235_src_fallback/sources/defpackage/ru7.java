package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru7  reason: default package */
/* loaded from: classes.dex */
public class ru7 {
    public static final defpackage.vu7 b = null;
    public final defpackage.vu7 a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto Lc
            hu7 r0 = new hu7
            r0.<init>()
            goto L43
        Lc:
            r1 = 35
            if (r0 < r1) goto L16
            gu7 r0 = new gu7
            r0.<init>()
            goto L43
        L16:
            r1 = 34
            if (r0 < r1) goto L20
            fu7 r0 = new fu7
            r0.<init>()
            goto L43
        L20:
            r1 = 31
            if (r0 < r1) goto L2a
            eu7 r0 = new eu7
            r0.<init>()
            goto L43
        L2a:
            r1 = 30
            if (r0 < r1) goto L34
            du7 r0 = new du7
            r0.<init>()
            goto L43
        L34:
            r1 = 29
            if (r0 < r1) goto L3e
            cu7 r0 = new cu7
            r0.<init>()
            goto L43
        L3e:
            bu7 r0 = new bu7
            r0.<init>()
        L43:
            vu7 r0 = r0.b()
            ru7 r0 = r0.a
            vu7 r0 = r0.a()
            ru7 r0 = r0.a
            vu7 r0 = r0.b()
            ru7 r0 = r0.a
            vu7 r0 = r0.c()
            defpackage.ru7.b = r0
            return
    }

    public ru7(defpackage.vu7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void A(android.graphics.Rect[][] r1) {
            r0 = this;
            return
    }

    public defpackage.vu7 a() {
            r0 = this;
            vu7 r0 = r0.a
            return r0
    }

    public defpackage.vu7 b() {
            r0 = this;
            vu7 r0 = r0.a
            return r0
    }

    public defpackage.vu7 c() {
            r0 = this;
            vu7 r0 = r0.a
            return r0
    }

    public void d(android.view.View r1) {
            r0 = this;
            return
    }

    public java.util.List<android.graphics.Rect> e(int r1) {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ru7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ru7 r5 = (defpackage.ru7) r5
            boolean r1 = r4.s()
            boolean r3 = r5.s()
            if (r1 != r3) goto L4b
            boolean r1 = r4.r()
            boolean r3 = r5.r()
            if (r1 != r3) goto L4b
            e83 r1 = r4.m()
            e83 r3 = r5.m()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            e83 r1 = r4.k()
            e83 r3 = r5.k()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L4b
            yk1 r4 = r4.g()
            yk1 r5 = r5.g()
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L4b
            return r0
        L4b:
            return r2
    }

    public java.util.List<android.graphics.Rect> f(int r1) {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public defpackage.yk1 g() {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.e83 h(int r1) {
            r0 = this;
            e83 r0 = defpackage.e83.e
            return r0
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.s()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.r()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            e83 r2 = r4.m()
            e83 r3 = r4.k()
            yk1 r4 = r4.g()
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r4 = java.util.Objects.hash(r4)
            return r4
    }

    public defpackage.e83 i(int r1) {
            r0 = this;
            r0 = r1 & 8
            if (r0 != 0) goto L7
            e83 r0 = defpackage.e83.e
            return r0
        L7:
            java.lang.String r0 = "Unable to query the maximum insets for IME"
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public defpackage.e83 j() {
            r0 = this;
            e83 r0 = r0.m()
            return r0
    }

    public defpackage.e83 k() {
            r0 = this;
            e83 r0 = defpackage.e83.e
            return r0
    }

    public defpackage.e83 l() {
            r0 = this;
            e83 r0 = r0.m()
            return r0
    }

    public defpackage.e83 m() {
            r0 = this;
            e83 r0 = defpackage.e83.e
            return r0
    }

    public defpackage.e83 n() {
            r0 = this;
            e83 r0 = r0.m()
            return r0
    }

    public void o(android.view.View r1) {
            r0 = this;
            return
    }

    public void p() {
            r0 = this;
            return
    }

    public defpackage.vu7 q(int r1, int r2, int r3, int r4) {
            r0 = this;
            vu7 r0 = defpackage.ru7.b
            return r0
    }

    public boolean r() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean s() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean t(int r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    public void u(defpackage.cl1 r1) {
            r0 = this;
            return
    }

    public void v(defpackage.e83[] r1) {
            r0 = this;
            return
    }

    public void w(defpackage.vu7 r1) {
            r0 = this;
            return
    }

    public void x(defpackage.e83 r1) {
            r0 = this;
            return
    }

    public void y(int r1) {
            r0 = this;
            return
    }

    public void z(android.graphics.Rect[][] r1) {
            r0 = this;
            return
    }
}
