package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p70  reason: default package */
/* loaded from: classes.dex */
public final class p70 {
    public final defpackage.ua4 a;

    public p70(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L12;
                default: goto L3;
            }
        L3:
            r1.<init>()
            ua4 r2 = new ua4
            r0 = 16
            l31[] r0 = new defpackage.l31[r0]
            r2.<init>(r0)
            r1.a = r2
            return
        L12:
            r1.<init>()
            ua4 r2 = new ua4
            r0 = 16
            np3[] r0 = new defpackage.np3[r0]
            r2.<init>(r0)
            r1.a = r2
            return
    }

    public void a(java.util.concurrent.CancellationException r6) {
            r5 = this;
            ua4 r5 = r5.a
            int r0 = r5.L
            qj0[] r1 = new defpackage.qj0[r0]
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L17
            java.lang.Object[] r4 = r5.A
            r4 = r4[r3]
            l31 r4 = (defpackage.l31) r4
            rj0 r4 = r4.b
            r1[r3] = r4
            int r3 = r3 + 1
            goto L8
        L17:
            if (r2 >= r0) goto L21
            r3 = r1[r2]
            r3.w(r6)
            int r2 = r2 + 1
            goto L17
        L21:
            int r5 = r5.L
            if (r5 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "uncancelled requests present"
            defpackage.s53.c(r5)
            return
    }

    public void b() {
            r4 = this;
            r0 = 0
            ua4 r4 = r4.a
            int r1 = r4.L
            l93 r0 = defpackage.gi2.R(r0, r1)
            int r1 = r0.A
            int r0 = r0.B
            if (r1 > r0) goto L21
        Lf:
            java.lang.Object[] r2 = r4.A
            r2 = r2[r1]
            l31 r2 = (defpackage.l31) r2
            rj0 r2 = r2.b
            jg7 r3 = defpackage.jg7.a
            r2.i(r3)
            if (r1 == r0) goto L21
            int r1 = r1 + 1
            goto Lf
        L21:
            r4.g()
            return
    }
}
