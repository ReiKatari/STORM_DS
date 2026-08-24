package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts1  reason: default package */
/* loaded from: classes.dex */
public abstract class ts1 {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ts1(defpackage.gg5 r2) {
            r1 = this;
            r1.<init>()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.a = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public ts1(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            r0.c = r3
            return
    }

    public ts1(defpackage.vs1 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            ae1 r0 = new ae1
            r0.<init>()
            r1.c = r0
            r1.b = r2
            return
    }

    public static defpackage.ts1 b(defpackage.gg5 r1, int r2) {
            if (r2 == 0) goto L12
            r0 = 1
            if (r2 != r0) goto Lb
            mo4 r2 = new mo4
            r2.<init>(r1, r0)
            return r2
        Lb:
            java.lang.String r1 = "invalid orientation"
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L12:
            mo4 r2 = new mo4
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    public abstract void a(defpackage.e36 r1);

    public abstract void c(defpackage.e36 r1);

    public abstract int d(android.view.View r1);

    public abstract int e(android.view.View r1);

    public abstract int f(android.view.View r1);

    public abstract int g(android.view.View r1);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(android.view.View r1);

    public abstract int p(android.view.View r1);

    public abstract void q(int r1);

    public abstract void r(defpackage.e36 r1);

    public abstract void s(defpackage.e36 r1);

    public abstract void t(defpackage.e36 r1);

    public abstract void u(defpackage.e36 r1);

    public abstract defpackage.g60 v(defpackage.e36 r1);
}
