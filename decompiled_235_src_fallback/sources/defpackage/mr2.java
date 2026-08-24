package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr2  reason: default package */
/* loaded from: classes.dex */
public abstract class mr2 implements java.lang.Cloneable {
    public final defpackage.pr2 A;
    public defpackage.pr2 B;
    public boolean L;

    public mr2(defpackage.pr2 r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            or2 r0 = defpackage.or2.NEW_MUTABLE_INSTANCE
            java.lang.Object r2 = r2.f(r0)
            pr2 r2 = (defpackage.pr2) r2
            r1.B = r2
            r2 = 0
            r1.L = r2
            return
    }

    public final defpackage.pr2 a() {
            r1 = this;
            pr2 r1 = r1.b()
            boolean r0 = r1.i()
            if (r0 == 0) goto Lb
            return r1
        Lb:
            ug r1 = new ug
            r0 = 14
            r1.<init>(r0)
            throw r1
    }

    public final defpackage.pr2 b() {
            r3 = this;
            boolean r0 = r3.L
            pr2 r1 = r3.B
            if (r0 == 0) goto L7
            return r1
        L7:
            r1.getClass()
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r2 = r1.getClass()
            j66 r0 = r0.a(r2)
            r0.a(r1)
            r0 = 1
            r3.L = r0
            pr2 r3 = r3.B
            return r3
    }

    public final void c() {
            r4 = this;
            boolean r0 = r4.L
            if (r0 == 0) goto L25
            pr2 r0 = r4.B
            or2 r1 = defpackage.or2.NEW_MUTABLE_INSTANCE
            java.lang.Object r0 = r0.f(r1)
            pr2 r0 = (defpackage.pr2) r0
            pr2 r1 = r4.B
            y45 r2 = defpackage.y45.c
            r2.getClass()
            java.lang.Class r3 = r0.getClass()
            j66 r2 = r2.a(r3)
            r2.g(r0, r1)
            r4.B = r0
            r0 = 0
            r4.L = r0
        L25:
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            pr2 r0 = r2.A
            r0.getClass()
            or2 r1 = defpackage.or2.NEW_BUILDER
            java.lang.Object r0 = r0.f(r1)
            mr2 r0 = (defpackage.mr2) r0
            pr2 r2 = r2.b()
            r0.d(r2)
            return r0
    }

    public final void d(defpackage.pr2 r3) {
            r2 = this;
            r2.c()
            pr2 r2 = r2.B
            y45 r0 = defpackage.y45.c
            r0.getClass()
            java.lang.Class r1 = r2.getClass()
            j66 r0 = r0.a(r1)
            r0.g(r2, r3)
            return
    }
}
