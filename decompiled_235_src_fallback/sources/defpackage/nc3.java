package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc3  reason: default package */
/* loaded from: classes.dex */
public final class nc3 extends defpackage.yc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.yc7 b;
    public final /* synthetic */ defpackage.yc7 c;

    public /* synthetic */ nc3(defpackage.yc7 r1, defpackage.yc7 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r8) {
            r7 = this;
            int r0 = r7.a
            yc7 r1 = r7.c
            yc7 r7 = r7.b
            r2 = 0
            java.lang.String r3 = "time"
            switch(r0) {
                case 0: goto L59;
                default: goto Lc;
            }
        Lc:
            r8.h()
            r0 = r2
        L10:
            jf3 r4 = r8.n0()
            jf3 r5 = defpackage.jf3.END_OBJECT
            java.lang.String r6 = "offset"
            if (r4 == r5) goto L43
            java.lang.String r4 = r8.c0()
            r4.getClass()
            boolean r5 = r4.equals(r6)
            if (r5 != 0) goto L3a
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L31
            r8.u0()
            goto L10
        L31:
            java.lang.Object r2 = r7.b(r8)
            java.time.LocalTime r2 = defpackage.mc3.A(r2)
            goto L10
        L3a:
            java.lang.Object r0 = r1.b(r8)
            java.time.ZoneOffset r0 = defpackage.jc3.m(r0)
            goto L10
        L43:
            r8.u()
            defpackage.kc3.a(r2, r3, r8)
            java.time.LocalTime r7 = defpackage.mc3.m(r2)
            defpackage.kc3.a(r0, r6, r8)
            java.time.ZoneOffset r8 = defpackage.jc3.v(r0)
            java.time.OffsetTime r7 = defpackage.mc3.u(r7, r8)
            return r7
        L59:
            r8.h()
            r0 = r2
        L5d:
            jf3 r4 = r8.n0()
            jf3 r5 = defpackage.jf3.END_OBJECT
            java.lang.String r6 = "date"
            if (r4 == r5) goto L90
            java.lang.String r4 = r8.c0()
            r4.getClass()
            boolean r5 = r4.equals(r6)
            if (r5 != 0) goto L87
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L7e
            r8.u0()
            goto L5d
        L7e:
            java.lang.Object r0 = r1.b(r8)
            java.time.LocalTime r0 = defpackage.mc3.A(r0)
            goto L5d
        L87:
            java.lang.Object r2 = r7.b(r8)
            java.time.LocalDate r2 = defpackage.mc3.z(r2)
            goto L5d
        L90:
            r8.u()
            defpackage.kc3.a(r2, r6, r8)
            java.time.LocalDate r7 = defpackage.mc3.h(r2)
            defpackage.kc3.a(r0, r3, r8)
            java.time.LocalTime r8 = defpackage.mc3.m(r0)
            java.time.LocalDateTime r7 = defpackage.mc3.j(r7, r8)
            return r7
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.a
            yc7 r1 = r3.c
            yc7 r3 = r3.b
            java.lang.String r2 = "time"
            switch(r0) {
                case 0: goto L2c;
                default: goto Lb;
            }
        Lb:
            java.time.OffsetTime r5 = defpackage.mc3.t(r5)
            r4.k()
            r4.v(r2)
            java.time.LocalTime r0 = defpackage.mc3.o(r5)
            r3.c(r4, r0)
            java.lang.String r3 = "offset"
            r4.v(r3)
            java.time.ZoneOffset r3 = defpackage.oc3.k(r5)
            r1.c(r4, r3)
            r4.u()
            return
        L2c:
            java.time.LocalDateTime r5 = defpackage.jc3.e(r5)
            r4.k()
            java.lang.String r0 = "date"
            r4.v(r0)
            java.time.LocalDate r0 = defpackage.mc3.i(r5)
            r3.c(r4, r0)
            r4.v(r2)
            java.time.LocalTime r3 = defpackage.mc3.n(r5)
            r1.c(r4, r3)
            r4.u()
            return
    }
}
