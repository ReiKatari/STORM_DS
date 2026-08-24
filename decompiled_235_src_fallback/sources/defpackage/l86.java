package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l86  reason: default package */
/* loaded from: classes.dex */
public final class l86 extends defpackage.hw6 implements defpackage.eo2 {
    public long X;
    public int Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ defpackage.m86 d0;

    public l86(defpackage.m86 r1, defpackage.r41 r2) {
            r0 = this;
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            ol7 r3 = (defpackage.ol7) r3
            long r0 = r3.a
            r41 r4 = (defpackage.r41) r4
            l86 r3 = new l86
            m86 r2 = r2.d0
            r3.<init>(r2, r4)
            r3.Z = r0
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r3.s(r2)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            l86 r0 = new l86
            m86 r1 = r1.d0
            r0.<init>(r1, r2)
            ol7 r3 = (defpackage.ol7) r3
            long r1 = r3.a
            r0.Z = r1
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            r2 = 3
            r3 = 2
            r4 = 1
            m86 r5 = r14.d0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            long r0 = r14.X
            long r2 = r14.Z
            defpackage.oi2.Y(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            r14 = 0
            return r14
        L20:
            long r3 = r14.X
            long r6 = r14.Z
            defpackage.oi2.Y(r15)
            goto L56
        L28:
            long r6 = r14.Z
            defpackage.oi2.Y(r15)
            goto L40
        L2e:
            defpackage.oi2.Y(r15)
            long r6 = r14.Z
            eb r15 = r5.f
            r14.Z = r6
            r14.Y = r4
            java.lang.Object r15 = r15.y(r6, r14)
            if (r15 != r0) goto L40
            goto L6d
        L40:
            ol7 r15 = (defpackage.ol7) r15
            long r8 = r15.a
            long r8 = defpackage.ol7.d(r6, r8)
            r14.Z = r6
            r14.X = r8
            r14.Y = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L55
            goto L6d
        L55:
            r3 = r8
        L56:
            ol7 r15 = (defpackage.ol7) r15
            long r11 = r15.a
            eb r8 = r5.f
            long r9 = defpackage.ol7.d(r3, r11)
            r14.Z = r6
            r14.X = r11
            r14.Y = r2
            r13 = r14
            java.lang.Object r15 = r8.x(r9, r11, r13)
            if (r15 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r2 = r6
            r0 = r11
        L70:
            ol7 r15 = (defpackage.ol7) r15
            long r14 = r15.a
            long r14 = defpackage.ol7.d(r0, r14)
            long r14 = defpackage.ol7.d(r2, r14)
            ol7 r0 = new ol7
            r0.<init>(r14)
            return r0
    }
}
