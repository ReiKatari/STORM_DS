package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j86  reason: default package */
/* loaded from: classes.dex */
public final class j86 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.m86 X;
    public defpackage.ch5 Y;
    public long Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.m86 f0;
    public final /* synthetic */ defpackage.ch5 g0;
    public final /* synthetic */ long h0;

    public j86(defpackage.m86 r1, defpackage.ch5 r2, long r3, defpackage.r41 r5) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r0.h0 = r3
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            k86 r1 = (defpackage.k86) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            j86 r0 = (defpackage.j86) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            j86 r0 = new j86
            ch5 r2 = r6.g0
            long r3 = r6.h0
            m86 r1 = r6.f0
            r5 = r7
            r0.<init>(r1, r2, r3, r5)
            r0.e0 = r8
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r11.d0
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L17
            long r0 = r11.Z
            ch5 r3 = r11.Y
            m86 r4 = r11.X
            java.lang.Object r11 = r11.e0
            m86 r11 = (defpackage.m86) r11
            defpackage.oi2.Y(r12)
            goto L5a
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L1e:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.e0
            k86 r12 = (defpackage.k86) r12
            i86 r1 = new i86
            m86 r4 = r11.f0
            r1.<init>(r4, r12)
            sd2 r12 = r4.c
            ch5 r3 = r11.g0
            long r5 = r3.A
            lo4 r7 = r4.d
            lo4 r8 = defpackage.lo4.Horizontal
            long r9 = r11.h0
            if (r7 != r8) goto L3f
            float r7 = defpackage.ol7.b(r9)
            goto L43
        L3f:
            float r7 = defpackage.ol7.c(r9)
        L43:
            float r7 = r4.d(r7)
            r11.e0 = r4
            r11.X = r4
            r11.Y = r3
            r11.Z = r5
            r11.d0 = r2
            java.lang.Object r12 = r12.a(r1, r7, r11)
            if (r12 != r0) goto L58
            return r0
        L58:
            r11 = r4
            r0 = r5
        L5a:
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r11 = r11.d(r12)
            lo4 r12 = r4.d
            lo4 r4 = defpackage.lo4.Horizontal
            r5 = 0
            if (r12 != r4) goto L71
            r12 = 2
            long r11 = defpackage.ol7.a(r0, r11, r5, r12)
            goto L75
        L71:
            long r11 = defpackage.ol7.a(r0, r5, r11, r2)
        L75:
            r3.A = r11
            jg7 r11 = defpackage.jg7.a
            return r11
    }
}
