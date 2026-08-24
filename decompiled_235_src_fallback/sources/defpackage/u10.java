package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u10  reason: default package */
/* loaded from: classes.dex */
public final class u10 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.v10 Z;
    public final /* synthetic */ defpackage.n00 d0;

    public /* synthetic */ u10(defpackage.v10 r1, defpackage.n00 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            u10 r2 = (defpackage.u10) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            u10 r2 = (defpackage.u10) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            n00 r0 = r2.d0
            v10 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            u10 r4 = new u10
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            u10 r4 = new u10
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            v10 r3 = r10.Z
            r4 = 1
            n00 r5 = r10.d0
            r6 = 0
            switch(r0) {
                case 0: goto L41;
                default: goto Lf;
            }
        Lf:
            tp6 r0 = r3.f
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r10.Y
            if (r8 == 0) goto L22
            if (r8 != r4) goto L1d
            defpackage.oi2.Y(r11)
            goto L31
        L1d:
            defpackage.i.m(r2)
            r1 = r6
            goto L40
        L22:
            defpackage.oi2.Y(r11)
            ha3 r11 = r3.b
            r10.Y = r4
            java.lang.Object r10 = r11.a(r5, r10)
            if (r10 != r7) goto L31
            r1 = r7
            goto L40
        L31:
            java.util.UUID r10 = r5.a
            java.lang.Object r11 = r0.getValue()
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto L40
            r0.l(r6)
        L40:
            return r1
        L41:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L54
            if (r7 != r4) goto L4e
            defpackage.oi2.Y(r11)
            goto Lfd
        L4e:
            defpackage.i.m(r2)
            r1 = r6
            goto Lfd
        L54:
            defpackage.oi2.Y(r11)
            ha3 r11 = r3.b
            r10.Y = r4
            tp6 r2 = r11.f
            java.util.UUID r3 = r5.a
            r4 = 0
            if (r3 != 0) goto L8f
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r7 = r5.b
            android.net.Uri r5 = r5.c
            r7.getClass()
            r5.getClass()
            n00 r8 = new n00
            r8.<init>(r3, r7, r5)
        L75:
            java.lang.Object r3 = r2.getValue()
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r5 = defpackage.gt0.m1(r5)
            fh1 r7 = new fh1
            r7.<init>(r4, r8)
            r5.add(r7)
            boolean r3 = r2.j(r3, r5)
            if (r3 == 0) goto L75
            goto Le1
        L8f:
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
            r7 = r4
        L9a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto Lb8
            java.lang.Object r8 = r3.next()
            fh1 r8 = (defpackage.fh1) r8
            java.lang.Object r8 = r8.a
            n00 r8 = (defpackage.n00) r8
            java.util.UUID r8 = r8.a
            java.util.UUID r9 = r5.a
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto Lb5
            goto Lb9
        Lb5:
            int r7 = r7 + 1
            goto L9a
        Lb8:
            r7 = -1
        Lb9:
            java.lang.Object r3 = r2.getValue()
            r8 = r3
            java.util.List r8 = (java.util.List) r8
            if (r7 < 0) goto Lcf
            java.util.ArrayList r8 = defpackage.gt0.m1(r8)
            fh1 r9 = new fh1
            r9.<init>(r4, r5)
            r8.set(r7, r9)
            goto Ldb
        Lcf:
            java.util.ArrayList r8 = defpackage.gt0.m1(r8)
            fh1 r9 = new fh1
            r9.<init>(r4, r5)
            r8.add(r9)
        Ldb:
            boolean r3 = r2.j(r3, r8)
            if (r3 == 0) goto Lb9
        Le1:
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            y3 r3 = new y3
            r4 = 11
            r3.<init>(r11, r6, r4)
            java.lang.Object r10 = defpackage.hv.d0(r2, r3, r10)
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lf5
            goto Lf6
        Lf5:
            r10 = r1
        Lf6:
            if (r10 != r11) goto Lf9
            goto Lfa
        Lf9:
            r10 = r1
        Lfa:
            if (r10 != r0) goto Lfd
            r1 = r0
        Lfd:
            return r1
    }
}
