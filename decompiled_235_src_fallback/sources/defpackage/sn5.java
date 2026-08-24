package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn5  reason: default package */
/* loaded from: classes.dex */
public final class sn5 extends defpackage.qo7 {
    public final defpackage.pn5 b;
    public final defpackage.tp6 c;
    public final defpackage.ex6 d;
    public final defpackage.de5 e;
    public final defpackage.tp6 f;
    public final defpackage.de5 g;
    public final defpackage.of6 h;
    public final defpackage.be5 i;

    public sn5(defpackage.pn5 r7) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            r6.b = r7
            om5 r0 = defpackage.om5.b
            tp6 r0 = defpackage.up6.a(r0)
            r6.c = r0
            er2 r0 = new er2
            r1 = 19
            r0.<init>(r6, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r6.d = r1
            pl r7 = (defpackage.pl) r7
            jk r7 = r7.d
            tp6 r7 = r7.c
            de5 r0 = new de5
            r0.<init>(r7)
            as0 r7 = defpackage.to7.a(r6)
            mp6 r1 = new mp6
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.<init>(r2, r4)
            r2 = 0
            de5 r7 = defpackage.f04.R(r0, r7, r1, r2)
            r6.e = r7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            tp6 r7 = defpackage.up6.a(r7)
            r6.f = r7
            de5 r0 = new de5
            r0.<init>(r7)
            r6.g = r0
            r7 = 0
            m80 r0 = defpackage.m80.DROP_OLDEST
            r1 = 1
            of6 r7 = defpackage.pf6.b(r7, r1, r0, r1)
            r6.h = r7
            be5 r0 = new be5
            r0.<init>(r7)
            r6.i = r0
            return
    }

    public static final java.lang.Object e(defpackage.sn5 r5, defpackage.s41 r6) {
            boolean r0 = r6 instanceof defpackage.rn5
            if (r0 == 0) goto L13
            r0 = r6
            rn5 r0 = (defpackage.rn5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rn5 r0 = new rn5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r6)
            goto L40
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r6)
            pn5 r6 = r5.b
            r0.Y = r4
            pl r6 = (defpackage.pl) r6
            hk r6 = r6.c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            jb5 r6 = (defpackage.jb5) r6
            tp6 r0 = r5.c
            boolean r1 = r6 instanceof defpackage.hb5
            if (r1 == 0) goto L60
            as0 r1 = defpackage.to7.a(r5)
            qn5 r2 = new qn5
            r4 = 2
            r2.<init>(r5, r3, r4)
            r5 = 3
            defpackage.hv.L(r1, r3, r3, r2, r5)
            nm5 r5 = new nm5
            hb5 r6 = (defpackage.hb5) r6
            java.lang.String r6 = r6.a
            r5.<init>(r6)
            goto L72
        L60:
            boolean r5 = r6 instanceof defpackage.ib5
            if (r5 == 0) goto L6e
            pm5 r5 = new pm5
            ib5 r6 = (defpackage.ib5) r6
            java.lang.String r6 = r6.a
            r5.<init>(r6)
            goto L72
        L6e:
            if (r6 != 0) goto L7b
            om5 r5 = defpackage.om5.a
        L72:
            r0.getClass()
            r0.m(r3, r5)
            jg7 r5 = defpackage.jg7.a
            return r5
        L7b:
            defpackage.i.d()
            return r3
    }
}
