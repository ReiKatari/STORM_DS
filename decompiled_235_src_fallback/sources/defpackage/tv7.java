package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv7  reason: default package */
/* loaded from: classes.dex */
public final class tv7 implements defpackage.fu3 {
    public final /* synthetic */ defpackage.o41 A;
    public final /* synthetic */ defpackage.um B;
    public final /* synthetic */ defpackage.if5 L;
    public final /* synthetic */ defpackage.dh5 R;

    public tv7(defpackage.o41 r1, defpackage.um r2, defpackage.if5 r3, defpackage.dh5 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r11, defpackage.st3 r12) {
            r10 = this;
            int[] r0 = defpackage.sv7.a
            int r12 = r12.ordinal()
            r12 = r0[r12]
            r0 = 0
            r1 = 1
            switch(r12) {
                case 1: goto L8a;
                case 2: goto L24;
                case 3: goto L17;
                case 4: goto L11;
                case 5: goto L87;
                case 6: goto L87;
                case 7: goto L87;
                default: goto Ld;
            }
        Ld:
            defpackage.i.d()
            return
        L11:
            if5 r10 = r10.L
            r10.x()
            return
        L17:
            if5 r10 = r10.L
            java.lang.Object r11 = r10.c
            monitor-enter(r11)
            r10.t = r1     // Catch: java.lang.Throwable -> L20
            monitor-exit(r11)
            return
        L20:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)
            throw r10
        L24:
            um r11 = r10.B
            r12 = 0
            if (r11 == 0) goto L6a
            java.lang.Object r11 = r11.L
            bk1 r11 = (defpackage.bk1) r11
            java.lang.Object r2 = r11.L
            monitor-enter(r2)
            java.lang.Object r3 = r11.L     // Catch: java.lang.Throwable -> L5d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r11.A     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L3a
        L38:
            monitor-exit(r2)
            goto L6a
        L3a:
            java.lang.Object r3 = r11.B     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r11.R     // Catch: java.lang.Throwable -> L5d
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L5d
            r11.B = r4     // Catch: java.lang.Throwable -> L5d
            r11.R = r3     // Catch: java.lang.Throwable -> L5d
            r11.A = r1     // Catch: java.lang.Throwable -> L5d
            int r11 = r3.size()     // Catch: java.lang.Throwable -> L5d
            r1 = r12
        L4d:
            if (r1 >= r11) goto L60
            java.lang.Object r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L5d
            r41 r4 = (defpackage.r41) r4     // Catch: java.lang.Throwable -> L5d
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L5d
            r4.i(r5)     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + 1
            goto L4d
        L5d:
            r0 = move-exception
            r10 = r0
            goto L68
        L60:
            r3.clear()     // Catch: java.lang.Throwable -> L5d
            goto L38
        L64:
            r0 = move-exception
            r10 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d
            throw r10     // Catch: java.lang.Throwable -> L5d
        L68:
            monitor-exit(r2)
            throw r10
        L6a:
            if5 r10 = r10.L
            java.lang.Object r11 = r10.c
            monitor-enter(r11)
            boolean r1 = r10.t     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L7d
            r10.t = r12     // Catch: java.lang.Throwable -> L7a
            qj0 r0 = r10.y()     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r0 = move-exception
            r10 = r0
            goto L88
        L7d:
            monitor-exit(r11)
            if (r0 == 0) goto L87
            jg7 r10 = defpackage.jg7.a
            rj0 r0 = (defpackage.rj0) r0
            r0.i(r10)
        L87:
            return
        L88:
            monitor-exit(r11)
            throw r10
        L8a:
            o41 r12 = r10.A
            a71 r2 = defpackage.a71.UNDISPATCHED
            kp5 r3 = new kp5
            dh5 r4 = r10.R
            if5 r5 = r10.L
            r8 = 0
            r9 = 11
            r7 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            defpackage.hv.L(r12, r0, r2, r3, r1)
            return
    }
}
