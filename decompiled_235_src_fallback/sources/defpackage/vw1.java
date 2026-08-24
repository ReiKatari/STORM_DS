package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw1  reason: default package */
/* loaded from: classes.dex */
public final class vw1 extends defpackage.qo7 {
    public final defpackage.s9 b;
    public final defpackage.kd6 c;
    public final defpackage.of6 d;
    public final defpackage.be5 e;
    public defpackage.mb3 f;

    public vw1(defpackage.s9 r1, defpackage.kd6 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.b = r1
            r0.c = r2
            of6 r1 = defpackage.bl2.a()
            r0.d = r1
            be5 r2 = new be5
            r2.<init>(r1)
            r0.e = r2
            return
    }

    public final void e() {
            r6 = this;
            mb3 r0 = r6.f
            if (r0 == 0) goto L49
            boolean r1 = r0 instanceof defpackage.uw1
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L26
            uw1 r0 = (defpackage.uw1) r0
            pq5 r0 = r0.F
            r0.getClass()
            uw1 r1 = new uw1
            r1.<init>(r0)
            r6.f = r1
            as0 r1 = defpackage.to7.a(r6)
            xd1 r4 = new xd1
            r5 = 6
            r4.<init>(r6, r0, r3, r5)
            defpackage.hv.L(r1, r3, r3, r4, r2)
            return
        L26:
            boolean r1 = r0 instanceof defpackage.tw1
            if (r1 == 0) goto L46
            tw1 r0 = (defpackage.tw1) r0
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.F
            r0.getClass()
            tw1 r1 = new tw1
            r1.<init>(r0)
            r6.f = r1
            as0 r1 = defpackage.to7.a(r6)
            xd1 r4 = new xd1
            r5 = 5
            r4.<init>(r6, r0, r3, r5)
            defpackage.hv.L(r1, r3, r3, r4, r2)
            return
        L46:
            defpackage.i.d()
        L49:
            return
    }
}
