package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r52  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r52 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ r52(int r2, java.lang.String r3, defpackage.s52 r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ r52(defpackage.qz2 r2, int r3, defpackage.a62 r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r8 = this;
            int r0 = r8.A
            java.lang.Object r1 = r8.R
            int r2 = r8.B
            java.lang.Object r8 = r8.L
            switch(r0) {
                case 0: goto L21;
                default: goto Lb;
            }
        Lb:
            qz2 r8 = (defpackage.qz2) r8
            a62 r1 = (defpackage.a62) r1
            r1.getClass()     // Catch: java.io.IOException -> L18
            yz2 r0 = r8.s0     // Catch: java.io.IOException -> L18
            r0.v(r2, r1)     // Catch: java.io.IOException -> L18
            goto L1e
        L18:
            r0 = move-exception
            a62 r1 = defpackage.a62.PROTOCOL_ERROR
            r8.e(r1, r1, r0)
        L1e:
            jg7 r8 = defpackage.jg7.a
            return r8
        L21:
            java.lang.String r8 = (java.lang.String) r8
            s52 r1 = (defpackage.s52) r1
            wb6[] r0 = new defpackage.wb6[r2]
            r3 = 0
            r4 = r3
        L29:
            if (r4 >= r2) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r6 = 46
            r5.append(r6)
            java.lang.String[] r6 = r1.e
            r6 = r6[r4]
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            bt6 r6 = defpackage.bt6.h
            wb6[] r7 = new defpackage.wb6[r3]
            yb6 r5 = defpackage.mp2.m(r5, r6, r7)
            r0[r4] = r5
            int r4 = r4 + 1
            goto L29
        L50:
            return r0
    }
}
