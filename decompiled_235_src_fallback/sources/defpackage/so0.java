package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so0  reason: default package */
/* loaded from: classes.dex */
public final class so0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.uo0 Z;

    public /* synthetic */ so0(defpackage.uo0 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
            so0 r2 = (defpackage.so0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            so0 r2 = (defpackage.so0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            uo0 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            so0 r3 = new so0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            so0 r3 = new so0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            jg7 r1 = defpackage.jg7.a
            uo0 r2 = r7.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L33;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r8)
            goto L32
        L19:
            defpackage.i.m(r3)
            r1 = r5
            goto L32
        L1e:
            defpackage.oi2.Y(r8)
            tt3 r8 = defpackage.tt3.STARTED
            so0 r3 = new so0
            r6 = 0
            r3.<init>(r2, r5, r6)
            r7.Y = r4
            java.lang.Object r7 = defpackage.np2.d0(r2, r8, r3, r7)
            if (r7 != r0) goto L32
            r1 = r0
        L32:
            return r1
        L33:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L44
            if (r6 != r4) goto L3f
            defpackage.oi2.Y(r8)
            goto L7c
        L3f:
            defpackage.i.m(r3)
            r1 = r5
            goto L7c
        L44:
            defpackage.oi2.Y(r8)
            uo7 r8 = r2.Y
            java.lang.Object r8 = r8.getValue()
            gp0 r8 = (defpackage.gp0) r8
            hp0 r8 = r8.b
            h16 r8 = (defpackage.h16) r8
            android.content.Context r8 = r8.a
            lw7 r8 = defpackage.lw7.b(r8)
            r8.getClass()
            java.lang.String r3 = "cheat_import_worker"
            le2 r8 = r8.c(r3)
            y6 r3 = new y6
            r5 = 4
            r3.<init>(r2, r5)
            r7.Y = r4
            a7 r2 = new a7
            r4 = 27
            r2.<init>(r3, r4)
            java.lang.Object r7 = r8.b(r2, r7)
            if (r7 != r0) goto L78
            goto L79
        L78:
            r7 = r1
        L79:
            if (r7 != r0) goto L7c
            r1 = r0
        L7c:
            return r1
    }
}
