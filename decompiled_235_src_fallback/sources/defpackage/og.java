package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og  reason: default package */
/* loaded from: classes.dex */
public final class og implements android.view.View.OnDragListener, defpackage.wm1 {
    public final defpackage.ym1 a;
    public final defpackage.zu b;
    public final defpackage.ng c;

    public og() {
            r3 = this;
            r3.<init>()
            ym1 r0 = new ym1
            r0.<init>()
            r1 = 0
            r0.m0 = r1
            r3.a = r0
            zu r0 = new zu
            r1 = 0
            r0.<init>(r1)
            r3.b = r0
            ng r0 = new ng
            r0.<init>(r3)
            r3.c = r0
            return
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View r4, android.view.DragEvent r5) {
            r3 = this;
            d51 r4 = new d51
            r0 = 12
            r4.<init>(r5, r0)
            int r5 = r5.getAction()
            zu r0 = r3.b
            r1 = 0
            ym1 r3 = r3.a
            switch(r5) {
                case 1: goto L3c;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L1c;
                case 5: goto L18;
                case 6: goto L14;
                default: goto L13;
            }
        L13:
            return r1
        L14:
            r3.T0()
            return r1
        L18:
            r3.S0()
            return r1
        L1c:
            mc r5 = new mc
            r2 = 13
            r5.<init>(r4, r2)
            java.lang.Object r4 = r5.g(r3)
            tb7 r2 = defpackage.tb7.ContinueTraversal
            if (r4 == r2) goto L2c
            goto L2f
        L2c:
            defpackage.ii2.Y(r3, r5)
        L2f:
            r0.clear()
            return r1
        L33:
            boolean r3 = r3.R0()
            return r3
        L38:
            r3.U0(r4)
            return r1
        L3c:
            zg5 r5 = new zg5
            r5.<init>()
            xm1 r1 = new xm1
            r1.<init>(r4, r3, r5)
            java.lang.Object r4 = r1.g(r3)
            tb7 r2 = defpackage.tb7.ContinueTraversal
            if (r4 == r2) goto L4f
            goto L52
        L4f:
            defpackage.ii2.Y(r3, r1)
        L52:
            boolean r3 = r5.A
            r0.getClass()
            su r4 = new su
            r4.<init>(r0)
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r4.next()
            ym1 r5 = (defpackage.ym1) r5
            r5.V0()
            goto L5c
        L6c:
            return r3
    }
}
