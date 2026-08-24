package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no5  reason: default package */
/* loaded from: classes.dex */
public abstract class no5 extends defpackage.qo7 {
    public final defpackage.pn5 b;
    public final defpackage.kd6 c;
    public final defpackage.tp6 d;
    public final defpackage.ex6 e;
    public final defpackage.of6 f;
    public final defpackage.be5 g;
    public defpackage.ap6 h;

    public no5(defpackage.pn5 r2, defpackage.kd6 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r1.<init>()
            r1.b = r2
            r1.c = r3
            f06 r2 = defpackage.f06.a
            tp6 r2 = defpackage.up6.a(r2)
            r1.d = r2
            er2 r2 = new er2
            r3 = 20
            r2.<init>(r1, r3)
            ex6 r3 = new ex6
            r3.<init>(r2)
            r1.e = r3
            r2 = 1
            m80 r3 = defpackage.m80.DROP_OLDEST
            r0 = 0
            of6 r2 = defpackage.pf6.b(r0, r2, r3, r2)
            r1.f = r2
            be5 r3 = new be5
            r3.<init>(r2)
            r1.g = r3
            return
    }

    public static java.lang.Object l(defpackage.no5 r4, defpackage.pq5 r5, boolean r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.io5
            if (r0 == 0) goto L13
            r0 = r7
            io5 r0 = (defpackage.io5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            io5 r0 = new io5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.oi2.Y(r7)
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r4 = r7.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.oi2.Y(r7)
            pn5 r4 = r4.b
            java.lang.String r5 = r5.i
            r0.Y = r3
            pl r4 = (defpackage.pl) r4
            java.lang.Object r4 = r4.p(r5, r6, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
    }

    public abstract java.lang.Object e(java.util.ArrayList r1, java.util.Map r2, defpackage.s41 r3);

    public final java.lang.Object f(defpackage.ta5 r8, defpackage.r41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ho5
            if (r0 == 0) goto L14
            r0 = r9
            ho5 r0 = (defpackage.ho5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ho5 r0 = new ho5
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r7 = r9.A
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L34:
            defpackage.oi2.Y(r9)
            long r8 = r8.a
            r6.Y = r2
            r5 = 25
            pn5 r7 = r7.b
            r1 = r7
            pl r1 = (defpackage.pl) r1
            r4 = 1
            r2 = r8
            java.lang.Object r7 = r1.o(r2, r4, r5, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            return r7
    }

    public abstract java.lang.Object g(defpackage.pq5 r1, defpackage.s41 r2);

    public abstract defpackage.pq5 h();

    public abstract java.io.Serializable i(defpackage.s41 r1);

    public abstract java.io.Serializable j(defpackage.s41 r1);

    public java.lang.Object k(defpackage.pq5 r1, boolean r2, defpackage.r41 r3) {
            r0 = this;
            s41 r3 = (defpackage.s41) r3
            java.lang.Object r0 = l(r0, r1, r2, r3)
            return r0
    }

    public final void m() {
            r4 = this;
            ap6 r0 = r4.h
            r1 = 0
            if (r0 == 0) goto L8
            r0.h(r1)
        L8:
            as0 r0 = defpackage.to7.a(r4)
            lo5 r2 = new lo5
            r2.<init>(r4, r1)
            r3 = 3
            ap6 r0 = defpackage.hv.L(r0, r1, r1, r2, r3)
            r4.h = r0
            return
    }
}
