package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public interface eg0 extends defpackage.pd0, defpackage.ci7 {
    @Override // defpackage.pd0
    default defpackage.zf0 a() {
            r0 = this;
            cg0 r0 = r0.q()
            return r0
    }

    default boolean c() {
            r0 = this;
            zf0 r0 = r0.a()
            int r0 = r0.m()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    defpackage.ve0 e();

    default defpackage.oe0 f() {
            r0 = this;
            qe0 r0 = defpackage.re0.a
            return r0
    }

    default void i(defpackage.oe0 r1) {
            r0 = this;
            return
    }

    default void j(boolean r1) {
            r0 = this;
            return
    }

    default boolean k() {
            r0 = this;
            r0 = 0
            return r0
    }

    void l(java.util.Collection r1);

    void m(java.util.ArrayList r1);

    default void n() {
            r0 = this;
            return
    }

    default boolean o() {
            r0 = this;
            r0 = 1
            return r0
    }

    default void p(boolean r1) {
            r0 = this;
            return
    }

    defpackage.cg0 q();

    defpackage.gx3 release();
}
