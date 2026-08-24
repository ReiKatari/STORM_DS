package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql3  reason: default package */
/* loaded from: classes.dex */
public final class ql3 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.yl3 B;

    public /* synthetic */ ql3(defpackage.yl3 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r5, defpackage.r41 r6) {
            r4 = this;
            int r6 = r4.A
            jg7 r0 = defpackage.jg7.a
            r1 = 0
            yl3 r4 = r4.B
            switch(r6) {
                case 0: goto L63;
                case 1: goto L36;
                case 2: goto L20;
                default: goto La;
            }
        La:
            w71 r5 = (defpackage.w71) r5
            if (r5 == 0) goto L1a
            ff7 r5 = r5.a
            z66 r5 = r5.b
            java.util.UUID r6 = r5.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = r5.b
            defpackage.yl3.f(r4, r6, r5)
            goto L1f
        L1a:
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_CENTER
            defpackage.yl3.f(r4, r1, r5)
        L1f:
            return r0
        L20:
            w71 r5 = (defpackage.w71) r5
            if (r5 == 0) goto L30
            ff7 r5 = r5.a
            z66 r5 = r5.a
            java.util.UUID r6 = r5.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = r5.b
            defpackage.yl3.e(r4, r6, r5)
            goto L35
        L30:
            me.magnum.melonds.domain.model.layout.BackgroundMode r5 = me.magnum.melonds.domain.model.layout.BackgroundMode.FIT_CENTER
            defpackage.yl3.e(r4, r1, r5)
        L35:
            return r0
        L36:
            vr4 r5 = (defpackage.vr4) r5
            tp6 r6 = r4.o
            if (r5 != 0) goto L40
            r6.l(r1)
            goto L62
        L40:
            java.lang.Object r2 = r5.A
            jf7 r2 = (defpackage.jf7) r2
            java.lang.Object r5 = r5.B
            ff7 r5 = (defpackage.ff7) r5
            tp6 r3 = r4.i
            java.lang.Object r3 = r3.getValue()
            fk3 r3 = (defpackage.fk3) r3
            if (r3 != 0) goto L53
            goto L62
        L53:
            r4.h = r2
            w71 r4 = new w71
            ck3 r2 = r3.d
            r4.<init>(r5, r2)
            r6.getClass()
            r6.m(r1, r4)
        L62:
            return r0
        L63:
            fk3 r5 = (defpackage.fk3) r5
            ci0 r4 = r4.d
            r4.getClass()
            r5.getClass()
            java.lang.Object r4 = r4.g
            tp6 r4 = (defpackage.tp6) r4
            r4.getClass()
            r4.m(r1, r5)
            return r0
    }
}
