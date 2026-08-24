package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i5  reason: default package */
/* loaded from: classes.dex */
public final class i5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ i5(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public i5(defpackage.qz2 r2, defpackage.tz2 r3) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r6.L
            java.lang.Object r3 = r6.B
            switch(r0) {
                case 0: goto Lbc;
                case 1: goto Lb4;
                case 2: goto La6;
                case 3: goto L99;
                case 4: goto L91;
                case 5: goto L89;
                case 6: goto L81;
                case 7: goto L3b;
                case 8: goto L33;
                case 9: goto L2b;
                case 10: goto L23;
                case 11: goto L1b;
                case 12: goto L13;
                default: goto Lb;
            }
        Lb:
            qn2 r3 = (defpackage.qn2) r3
            hm4 r2 = (defpackage.hm4) r2
            r3.g(r2)
            return r1
        L13:
            qn2 r3 = (defpackage.qn2) r3
            lr5 r2 = (defpackage.lr5) r2
            r3.g(r2)
            return r1
        L1b:
            qn2 r3 = (defpackage.qn2) r3
            gn6 r2 = (defpackage.gn6) r2
            r3.g(r2)
            return r1
        L23:
            qn2 r3 = (defpackage.qn2) r3
            qw5 r2 = (defpackage.qw5) r2
            r3.g(r2)
            return r1
        L2b:
            qn2 r3 = (defpackage.qn2) r3
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r2 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r2
            r3.g(r2)
            return r1
        L33:
            qn2 r3 = (defpackage.qn2) r3
            qe4 r2 = (defpackage.qe4) r2
            r3.g(r2)
            return r1
        L3b:
            qz2 r2 = (defpackage.qz2) r2
            tz2 r3 = (defpackage.tz2) r3
            a62 r0 = defpackage.a62.INTERNAL_ERROR
            r4 = 1
            r5 = 0
            boolean r4 = r3.e(r4, r6)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L71
            if (r4 == 0) goto L67
        L49:
            r4 = 0
            boolean r4 = r3.e(r4, r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
            if (r4 != 0) goto L49
            a62 r6 = defpackage.a62.NO_ERROR     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
            a62 r0 = defpackage.a62.CANCEL     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r2.e(r6, r0, r5)
        L57:
            defpackage.yy7.b(r3)
            goto L79
        L5b:
            r1 = move-exception
            goto L7a
        L5d:
            r4 = move-exception
            r5 = r4
            goto L73
        L60:
            r1 = move-exception
        L61:
            r6 = r0
            goto L7a
        L63:
            r6 = move-exception
            r5 = r6
            r6 = r0
            goto L73
        L67:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L71
            java.lang.String r4 = "Required SETTINGS preface not received"
            r6.<init>(r4)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L71
            throw r6     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L71
        L6f:
            r1 = r6
            goto L61
        L71:
            r6 = move-exception
            goto L6f
        L73:
            a62 r6 = defpackage.a62.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L5b
            r2.e(r6, r6, r5)
            goto L57
        L79:
            return r1
        L7a:
            r2.e(r6, r0, r5)
            defpackage.yy7.b(r3)
            throw r1
        L81:
            qn2 r3 = (defpackage.qn2) r3
            cp2 r2 = (defpackage.cp2) r2
            r3.g(r2)
            return r1
        L89:
            qn2 r3 = (defpackage.qn2) r3
            an0 r2 = (defpackage.an0) r2
            r3.g(r2)
            return r1
        L91:
            qn2 r3 = (defpackage.qn2) r3
            co0 r2 = (defpackage.co0) r2
            r3.g(r2)
            return r1
        L99:
            qa4 r2 = (defpackage.qa4) r2
            gn0 r6 = new gn0
            me.magnum.melonds.domain.model.Cheat r3 = (me.magnum.melonds.domain.model.Cheat) r3
            r6.<init>(r3)
            r2.setValue(r6)
            return r1
        La6:
            qn2 r3 = (defpackage.qn2) r3
            c6 r2 = (defpackage.c6) r2
            long r4 = r2.a
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r3.g(r6)
            return r1
        Lb4:
            qa4 r2 = (defpackage.qa4) r2
            ta5 r3 = (defpackage.ta5) r3
            r2.setValue(r3)
            return r1
        Lbc:
            qn2 r3 = (defpackage.qn2) r3
            r3.g(r2)
            return r1
    }
}
