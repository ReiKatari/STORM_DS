package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek6  reason: default package */
/* loaded from: classes.dex */
public final class ek6 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.qj6 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ defpackage.on2 f0;

    public ek6(defpackage.qj6 r1, float r2, float r3, float r4, defpackage.on2 r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            ek6 r0 = (defpackage.ek6) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            ek6 r0 = new ek6
            float r4 = r7.e0
            on2 r5 = r7.f0
            qj6 r1 = r7.Y
            float r2 = r7.Z
            float r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 0
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 != r4) goto L10
            defpackage.oi2.Y(r7)
            goto L37
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L16:
            defpackage.oi2.Y(r7)
            r6.X = r4
            a74 r7 = defpackage.jk6.a
            fk6 r7 = new fk6
            float r1 = r6.Z
            float r4 = r6.d0
            float r5 = r6.e0
            r7.<init>(r1, r4, r5, r2)
            xa4 r1 = defpackage.xa4.Default
            qj6 r2 = r6.Y
            java.lang.Object r7 = r2.b(r1, r7, r6)
            if (r7 != r0) goto L33
            goto L34
        L33:
            r7 = r3
        L34:
            if (r7 != r0) goto L37
            return r0
        L37:
            on2 r6 = r6.f0
            if (r6 == 0) goto L3e
            r6.c()
        L3e:
            return r3
    }
}
