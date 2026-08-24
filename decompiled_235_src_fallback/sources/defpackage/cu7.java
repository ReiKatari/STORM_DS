package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu7  reason: default package */
/* loaded from: classes.dex */
public class cu7 extends defpackage.iu7 {
    public final android.view.WindowInsets.Builder e;

    public cu7() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets$Builder r0 = defpackage.r74.m()
            r1.e = r0
            return
    }

    public cu7(defpackage.vu7 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.f()
            if (r1 == 0) goto Le
            android.view.WindowInsets$Builder r1 = defpackage.fq7.c(r1)
            goto L12
        Le:
            android.view.WindowInsets$Builder r1 = defpackage.r74.m()
        L12:
            r0.e = r1
            return
    }

    @Override // defpackage.iu7
    public defpackage.vu7 b() {
            r4 = this;
            r4.a()
            android.view.WindowInsets$Builder r0 = r4.e
            android.view.WindowInsets r0 = defpackage.fq7.d(r0)
            r1 = 0
            vu7 r0 = defpackage.vu7.g(r1, r0)
            e83[] r2 = r4.b
            ru7 r3 = r0.a
            r3.v(r2)
            r3.u(r1)
            android.graphics.Rect[][] r1 = r4.c
            r3.z(r1)
            android.graphics.Rect[][] r4 = r4.d
            r3.A(r4)
            return r0
    }

    @Override // defpackage.iu7
    public void e(defpackage.e83 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.e
            android.graphics.Insets r1 = r1.e()
            defpackage.fq7.m(r0, r1)
            return
    }

    @Override // defpackage.iu7
    public void f(defpackage.e83 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.e
            android.graphics.Insets r1 = r1.e()
            defpackage.fq7.j(r0, r1)
            return
    }

    @Override // defpackage.iu7
    public void g(defpackage.e83 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.e
            android.graphics.Insets r1 = r1.e()
            defpackage.fq7.l(r0, r1)
            return
    }

    @Override // defpackage.iu7
    public void h(defpackage.e83 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.e
            android.graphics.Insets r1 = r1.e()
            defpackage.fq7.h(r0, r1)
            return
    }

    @Override // defpackage.iu7
    public void i(defpackage.e83 r1) {
            r0 = this;
            android.view.WindowInsets$Builder r0 = r0.e
            android.graphics.Insets r1 = r1.e()
            defpackage.fq7.n(r0, r1)
            return
    }
}
