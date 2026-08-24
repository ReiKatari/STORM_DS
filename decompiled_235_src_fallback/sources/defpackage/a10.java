package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a10  reason: default package */
/* loaded from: classes.dex */
public final class a10 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ a10(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public a10(defpackage.wu1 r1, me.magnum.melonds.ui.emulator.EmulatorActivity r2) {
            r0 = this;
            r2 = 1
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r12 = this;
            int r0 = r12.A
            r1 = 0
            java.lang.Object r12 = r12.B
            switch(r0) {
                case 0: goto L89;
                case 1: goto L80;
                default: goto L8;
            }
        L8:
            ar2 r12 = (defpackage.ar2) r12
            java.util.ArrayList r12 = r12.a
            int r0 = r12.size()
            ja4 r2 = new ja4
            r2.<init>(r0)
            int r0 = r12.size()
            r3 = 0
            r4 = r3
        L1b:
            if (r4 >= r0) goto L7a
            java.lang.Object r5 = r12.get(r4)
            zg3 r5 = (defpackage.zg3) r5
            java.lang.Object r6 = r5.b
            int r7 = r5.a
            if (r6 == 0) goto L35
            gd3 r6 = new gd3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r5.b
            r6.<init>(r7, r8)
            goto L39
        L35:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
        L39:
            int r7 = r2.f(r6)
            if (r7 >= 0) goto L41
            r8 = 1
            goto L42
        L41:
            r8 = r3
        L42:
            if (r8 == 0) goto L46
            r9 = r1
            goto L4a
        L46:
            java.lang.Object[] r9 = r2.c
            r9 = r9[r7]
        L4a:
            if (r9 != 0) goto L4d
            goto L67
        L4d:
            boolean r10 = r9 instanceof defpackage.ca4
            if (r10 == 0) goto L58
            ca4 r9 = (defpackage.ca4) r9
            r9.a(r5)
            r5 = r9
            goto L67
        L58:
            java.lang.Object[] r10 = defpackage.uh4.a
            ca4 r10 = new ca4
            r11 = 2
            r10.<init>(r11)
            r10.a(r9)
            r10.a(r5)
            r5 = r10
        L67:
            if (r8 == 0) goto L73
            int r7 = ~r7
            java.lang.Object[] r8 = r2.b
            r8[r7] = r6
            java.lang.Object[] r6 = r2.c
            r6[r7] = r5
            goto L77
        L73:
            java.lang.Object[] r6 = r2.c
            r6[r7] = r5
        L77:
            int r4 = r4 + 1
            goto L1b
        L7a:
            g94 r12 = new g94
            r12.<init>(r2)
            return r12
        L80:
            wu1 r12 = (defpackage.wu1) r12
            java.lang.Object r12 = r12.c()
            j71 r12 = (defpackage.j71) r12
            return r12
        L89:
            qn2 r12 = (defpackage.qn2) r12
            r12.g(r1)
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
