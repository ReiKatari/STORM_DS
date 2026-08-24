package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u12  reason: default package */
/* loaded from: classes.dex */
public final class u12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;

    public /* synthetic */ u12(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.d0 = r1
            r0.e0 = r2
            r0.Z = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ u12(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.e0 = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ u12(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ u12(defpackage.sz1 r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ u12(defpackage.sz1 r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public u12(defpackage.sz1 r2, defpackage.pq5 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 6
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public u12(defpackage.v80 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 12
            r1.X = r0
            r1.e0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    private final java.lang.Object A(java.lang.Object r5) {
            r4 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r5)
            goto L2c
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L14:
            defpackage.oi2.Y(r5)
            java.lang.Object r5 = r4.d0
            w61 r5 = (defpackage.w61) r5
            java.lang.Object r1 = r4.e0
            hf5 r1 = (defpackage.hf5) r1
            java.lang.Object r3 = r4.Z
            um r3 = (defpackage.um) r3
            r4.Y = r2
            java.lang.Object r4 = r1.e(r5, r3, r4)
            if (r4 != r0) goto L2c
            return r0
        L2c:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    private final java.lang.Object B(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = r10.d0
            sn5 r0 = (defpackage.sn5) r0
            tp6 r1 = r0.f
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r10.Y
            jg7 r4 = defpackage.jg7.a
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L2e
            if (r3 == r7) goto L26
            if (r3 == r6) goto L22
            if (r3 != r5) goto L1c
            defpackage.oi2.Y(r11)
            goto L64
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r8
        L22:
            defpackage.oi2.Y(r11)
            goto L69
        L26:
            defpackage.oi2.Y(r11)
            hm5 r11 = (defpackage.hm5) r11
            java.lang.Object r11 = r11.A
            goto L4e
        L2e:
            defpackage.oi2.Y(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r1.getClass()
            r1.m(r8, r11)
            pn5 r11 = r0.b
            java.lang.Object r3 = r10.e0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r9 = r10.Z
            java.lang.String r9 = (java.lang.String) r9
            r10.Y = r7
            pl r11 = (defpackage.pl) r11
            java.lang.Object r11 = r11.v(r3, r9, r10)
            if (r11 != r2) goto L4e
            goto L63
        L4e:
            boolean r11 = r11 instanceof defpackage.em5
            if (r11 != 0) goto L5b
            r10.Y = r6
            java.lang.Object r10 = defpackage.sn5.e(r0, r10)
            if (r10 != r2) goto L69
            goto L63
        L5b:
            r10.Y = r5
            java.lang.Object r10 = defpackage.sn5.e(r0, r10)
            if (r10 != r2) goto L64
        L63:
            return r2
        L64:
            of6 r10 = r0.h
            r10.k(r4)
        L69:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r1.getClass()
            r1.m(r8, r10)
            return r4
    }

    private final java.lang.Object C(java.lang.Object r6) {
            r5 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r5.Y
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 != r3) goto L11
            defpackage.oi2.Y(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L18:
            defpackage.oi2.Y(r6)
            goto L34
        L1c:
            defpackage.oi2.Y(r6)
            java.lang.Object r6 = r5.Z
            ss4 r6 = (defpackage.ss4) r6
            r1 = -1
            r6.i(r1)
            java.lang.Object r6 = r5.d0
            ip3 r6 = (defpackage.ip3) r6
            r5.Y = r4
            java.lang.Object r6 = defpackage.ip3.j(r6, r2, r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            java.lang.Object r6 = r5.e0
            pr3 r6 = (defpackage.pr3) r6
            r5.Y = r3
            java.lang.Object r5 = defpackage.pr3.l(r6, r2, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            jg7 r5 = defpackage.jg7.a
            return r5
    }

    private final java.lang.Object D(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.e0
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r0 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r0
            java.lang.Object r1 = r8.d0
            w61 r1 = (defpackage.w61) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r8.Y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 != r5) goto L18
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L16
            goto L3b
        L16:
            r8 = move-exception
            goto L3e
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L1e:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            pq5 r9 = (defpackage.pq5) r9
            xe1 r3 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L16
            de1 r3 = defpackage.de1.L     // Catch: java.lang.Throwable -> L16
            m5 r6 = new m5     // Catch: java.lang.Throwable -> L16
            r7 = 26
            r6.<init>(r0, r9, r4, r7)     // Catch: java.lang.Throwable -> L16
            r8.d0 = r1     // Catch: java.lang.Throwable -> L16
            r8.Y = r5     // Catch: java.lang.Throwable -> L16
            java.lang.Object r9 = defpackage.hv.d0(r3, r6, r8)     // Catch: java.lang.Throwable -> L16
            if (r9 != r2) goto L3b
            return r2
        L3b:
            k06 r9 = (defpackage.k06) r9     // Catch: java.lang.Throwable -> L16
            goto L43
        L3e:
            em5 r9 = new em5
            r9.<init>(r8)
        L43:
            java.lang.Throwable r8 = defpackage.hm5.a(r9)
            r1 = 2131952565(0x7f1303b5, float:1.9541576E38)
            jg7 r2 = defpackage.jg7.a
            if (r8 != 0) goto La9
            k06 r9 = (defpackage.k06) r9
            if (r9 != 0) goto L5d
            r8 = 2131952563(0x7f1303b3, float:1.9541572E38)
            android.widget.Toast r8 = android.widget.Toast.makeText(r0, r8, r5)
            r8.show()
            return r2
        L5d:
            java.lang.String r8 = r9.b
            android.net.Uri r9 = r9.a
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.SEND"
            r3.<init>(r4)
            java.lang.String r4 = "*/*"
            r3.setType(r4)
            java.lang.String r4 = "android.intent.extra.STREAM"
            r3.putExtra(r4, r9)
            java.lang.String r4 = "android.intent.extra.TITLE"
            r3.putExtra(r4, r8)
            r3.addFlags(r5)
            android.content.ContentResolver r4 = r0.getContentResolver()
            android.content.ClipData r8 = android.content.ClipData.newUri(r4, r8, r9)
            r3.setClipData(r8)
            r8 = 2131952564(0x7f1303b4, float:1.9541574E38)
            java.lang.String r8 = r0.getString(r8)
            android.content.Intent r8 = android.content.Intent.createChooser(r3, r8)
            r0.startActivity(r8)     // Catch: java.lang.Throwable -> L95
            r9 = r2
            goto L9b
        L95:
            r8 = move-exception
            em5 r9 = new em5
            r9.<init>(r8)
        L9b:
            java.lang.Throwable r8 = defpackage.hm5.a(r9)
            if (r8 == 0) goto La8
            android.widget.Toast r8 = android.widget.Toast.makeText(r0, r1, r5)
            r8.show()
        La8:
            return r2
        La9:
            android.widget.Toast r8 = android.widget.Toast.makeText(r0, r1, r5)
            r8.show()
            return r2
    }

    private final java.lang.Object E(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.e0
            vv5 r0 = (defpackage.vv5) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            defpackage.oi2.Y(r5)
            goto L2c
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L18:
            defpackage.oi2.Y(r5)
            java.lang.Object r5 = r4.d0
            ue1 r5 = (defpackage.ue1) r5
            int r2 = r0.getTabIndex()
            r4.Y = r3
            java.lang.Object r5 = defpackage.nr4.g(r5, r2, r4)
            if (r5 != r1) goto L2c
            return r1
        L2c:
            java.lang.Object r4 = r4.Z
            java.util.List r4 = (java.util.List) r4
            int r5 = r0.getTabIndex()
            java.lang.Object r4 = r4.get(r5)
            nh2 r4 = (defpackage.nh2) r4
            defpackage.nh2.a(r4)
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    private final java.lang.Object v(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.Z
            qa4 r0 = (defpackage.qa4) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.Y
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            defpackage.oi2.Y(r7)
            goto L47
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L18:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.e0
            qa4 r7 = (defpackage.qa4) r7
            java.lang.Object r7 = r7.getValue()
            zn5 r7 = (defpackage.zn5) r7
            if (r7 == 0) goto L4f
            int r2 = r7.a
            if (r2 > 0) goto L4f
            int r7 = r7.b
            if (r7 <= 0) goto L30
            goto L4f
        L30:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.setValue(r7)
            jd1 r7 = defpackage.oq1.B
            r7 = 3
            uq1 r0 = defpackage.uq1.SECONDS
            long r4 = defpackage.n16.L(r7, r0)
            r6.Y = r3
            java.lang.Object r7 = defpackage.q60.u(r4, r6)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Object r6 = r6.d0
            on2 r6 = (defpackage.on2) r6
            r6.c()
            goto L54
        L4f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.setValue(r6)
        L54:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    private final java.lang.Object x(java.lang.Object r13) {
            r12 = this;
            java.lang.Object r0 = r12.Z
            zg5 r0 = (defpackage.zg5) r0
            java.lang.Object r1 = r12.e0
            bx4 r1 = (defpackage.bx4) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r12.Y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1c
            if (r3 != r5) goto L16
            defpackage.oi2.Y(r13)
            goto L57
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r4
        L1c:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.d0
            r6 = r13
            java.util.List r6 = (java.util.List) r6
            r10 = 0
            r11 = 63
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r13 = defpackage.gt0.P0(r6, r7, r8, r9, r10, r11)
            java.lang.String r3 = "Flow emitted new camera set: "
            java.lang.String r13 = r3.concat(r13)
            java.lang.String r3 = "PipePresenceSrc"
            android.util.Log.d(r3, r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r1.h
            boolean r13 = r13.get()
            if (r13 == 0) goto L5f
            boolean r13 = r0.A
            if (r13 == 0) goto L5b
            java.lang.String r13 = "Handling first camera set, triggering fresh query."
            android.util.Log.i(r3, r13)
            gx3 r13 = r1.a()
            r12.Y = r5
            java.lang.Object r12 = defpackage.gi2.m(r13, r12)
            if (r12 != r2) goto L57
            return r2
        L57:
            r12 = 0
            r0.A = r12
            goto L68
        L5b:
            r1.c(r6, r4)
            goto L68
        L5f:
            java.lang.String r12 = "Ignoring camera update because monitoring is stopped."
            int r12 = android.util.Log.d(r3, r12)
            defpackage.vy7.P(r12)
        L68:
            jg7 r12 = defpackage.jg7.a
            return r12
    }

    private final java.lang.Object z(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.Z
            pa r0 = (defpackage.pa) r0
            java.lang.Object r1 = r0.Z
            pu r1 = (defpackage.pu) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r11.Y
            r4 = 1
            java.lang.String r5 = "CXCP"
            r6 = 0
            if (r3 == 0) goto L29
            if (r3 != r4) goto L23
            java.lang.Object r3 = r11.d0
            dh5 r3 = (defpackage.dh5) r3
            java.lang.Object r7 = r11.e0
            w61 r7 = (defpackage.w61) r7
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            goto L79
        L20:
            r11 = move-exception
            goto Lb9
        L23:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r6
        L29:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.e0
            w61 r12 = (defpackage.w61) r12
            dh5 r3 = new dh5
            r3.<init>()
            r7 = r12
        L36:
            boolean r12 = defpackage.g04.H(r7)
            if (r12 == 0) goto Lb0
            v96 r12 = new v96     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            l61 r8 = r11.B     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r8.getClass()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r8 = r0.Y     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            v80 r8 = (defpackage.v80) r8     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            eb r8 = r8.w()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            m5 r9 = new m5     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r10 = 23
            r9.<init>(r0, r6, r10)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r12.h(r8, r9)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r8 = r3.A     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            jg1 r8 = (defpackage.jg1) r8     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            if (r8 == 0) goto L6c
            eb r8 = r8.n()     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            y3 r9 = new y3     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r10 = 13
            r9.<init>(r3, r6, r10)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r12.h(r8, r9)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
        L6c:
            r11.e0 = r7     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r11.d0 = r3     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            r11.Y = r4     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            java.lang.Object r12 = r12.e(r11)     // Catch: java.lang.Throwable -> L20 java.util.concurrent.CancellationException -> Lbf
            if (r12 != r2) goto L79
            return r2
        L79:
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L36
            java.lang.Object r12 = r3.A
            if (r12 == 0) goto L84
            goto L36
        L84:
            java.lang.Object r12 = r1.first()
            bf4 r8 = new bf4
            r9 = 8
            r8.<init>(r0, r12, r6, r9)
            r9 = 3
            kg1 r8 = defpackage.hv.i(r7, r6, r6, r8, r9)
            boolean r9 = r8.isCancelled()
            if (r9 == 0) goto Lb2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to process "
            r11.<init>(r1)
            r11.append(r12)
            java.lang.String r12 = " due to Job cancellation"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r5, r11)
        Lb0:
            r11 = r6
            goto Lc5
        Lb2:
            r1.removeFirst()
            r3.A = r8
            goto L36
        Lb9:
            java.lang.String r12 = "Encountered exception during processing"
            android.util.Log.e(r5, r12, r11)
            goto Lc5
        Lbf:
            java.lang.String r11 = "PruningProcessingQueue: Scope cancelled"
            android.util.Log.d(r5, r11)
            goto Lb0
        Lc5:
            defpackage.pa.a(r0, r11)
            if (r11 != 0) goto Lcb
            return r6
        Lcb:
            throw r11
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L1ba;
                case 1: goto L1ab;
                case 2: goto L19c;
                case 3: goto L18d;
                case 4: goto L17e;
                case 5: goto L16f;
                case 6: goto L160;
                case 7: goto L151;
                case 8: goto L142;
                case 9: goto L133;
                case 10: goto L124;
                case 11: goto L115;
                case 12: goto L106;
                case 13: goto Lf7;
                case 14: goto Le8;
                case 15: goto Ld9;
                case 16: goto Lca;
                case 17: goto Lbb;
                case 18: goto Lac;
                case 19: goto L9d;
                case 20: goto L8e;
                case 21: goto L7f;
                case 22: goto L70;
                case 23: goto L61;
                case 24: goto L52;
                case 25: goto L43;
                case 26: goto L34;
                case 27: goto L25;
                case 28: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            java.util.List r3 = (java.util.List) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L9d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lac:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lbb:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lca:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld9:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Le8:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lf7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L106:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L115:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L124:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L133:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L142:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L151:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L160:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16f:
            java.util.List r3 = (java.util.List) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L17e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L18d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L19c:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ab:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ba:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            u12 r2 = (defpackage.u12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.X
            switch(r0) {
                case 0: goto L234;
                case 1: goto L224;
                case 2: goto L214;
                case 3: goto L1fd;
                case 4: goto L1e6;
                case 5: goto L1d4;
                case 6: goto L1c5;
                case 7: goto L1b3;
                case 8: goto L19b;
                case 9: goto L183;
                case 10: goto L16b;
                case 11: goto L158;
                case 12: goto L14d;
                case 13: goto L140;
                case 14: goto L133;
                case 15: goto L120;
                case 16: goto L108;
                case 17: goto Lf9;
                case 18: goto Le6;
                case 19: goto Lce;
                case 20: goto Lb6;
                case 21: goto La3;
                case 22: goto L92;
                case 23: goto L83;
                case 24: goto L70;
                case 25: goto L58;
                case 26: goto L40;
                case 27: goto L2d;
                case 28: goto L15;
                default: goto L5;
            }
        L5:
            u12 r11 = new u12
            java.lang.Object r0 = r9.e0
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r9 = r9.Z
            qa4 r9 = (defpackage.qa4) r9
            r1 = 29
            r11.<init>(r0, r9, r10, r1)
            return r11
        L15:
            u12 r2 = new u12
            java.lang.Object r11 = r9.d0
            r3 = r11
            ue1 r3 = (defpackage.ue1) r3
            java.lang.Object r11 = r9.e0
            r4 = r11
            vv5 r4 = (defpackage.vv5) r4
            java.lang.Object r9 = r9.Z
            r5 = r9
            java.util.List r5 = (java.util.List) r5
            r7 = 28
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L2d:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r0 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r0
            java.lang.Object r9 = r9.Z
            pq5 r9 = (defpackage.pq5) r9
            r1 = 27
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L40:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            ip3 r4 = (defpackage.ip3) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            pr3 r5 = (defpackage.pr3) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            ss4 r6 = (defpackage.ss4) r6
            r8 = 26
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L58:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            sn5 r4 = (defpackage.sn5) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            r8 = 25
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L70:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            hf5 r0 = (defpackage.hf5) r0
            java.lang.Object r9 = r9.Z
            um r9 = (defpackage.um) r9
            r1 = 24
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L83:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r9 = r9.Z
            pa r9 = (defpackage.pa) r9
            r0 = 23
            r10.<init>(r9, r7, r0)
            r10.e0 = r11
            return r10
        L92:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r11 = r9.e0
            dh5 r11 = (defpackage.dh5) r11
            java.lang.Object r9 = r9.Z
            iz4 r9 = (defpackage.iz4) r9
            r0 = 22
            r10.<init>(r11, r9, r7, r0)
            return r10
        La3:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            bx4 r0 = (defpackage.bx4) r0
            java.lang.Object r9 = r9.Z
            zg5 r9 = (defpackage.zg5) r9
            r1 = 21
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        Lb6:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            on2 r4 = (defpackage.on2) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            qa4 r6 = (defpackage.qa4) r6
            r8 = 20
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        Lce:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            oj4 r4 = (defpackage.oj4) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            r8 = 19
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        Le6:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            p21 r0 = (defpackage.p21) r0
            java.lang.Object r9 = r9.Z
            cf4 r9 = (defpackage.cf4) r9
            r1 = 18
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        Lf9:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r9 = r9.Z
            android.content.Context r9 = (android.content.Context) r9
            r0 = 17
            r10.<init>(r9, r7, r0)
            r10.e0 = r11
            return r10
        L108:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            n96 r4 = (defpackage.n96) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            rs4 r6 = (defpackage.rs4) r6
            r8 = 16
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L120:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r9 = r9.Z
            qb0 r9 = (defpackage.qb0) r9
            r1 = 15
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L133:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r9 = r9.Z
            wa3 r9 = (defpackage.wa3) r9
            r11 = 14
            r10.<init>(r9, r7, r11)
            return r10
        L140:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r9 = r9.Z
            ha3 r9 = (defpackage.ha3) r9
            r11 = 13
            r10.<init>(r9, r7, r11)
            return r10
        L14d:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r9 = r9.e0
            v80 r9 = (defpackage.v80) r9
            r10.<init>(r9, r7)
            return r10
        L158:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            hs2 r0 = (defpackage.hs2) r0
            java.lang.Object r9 = r9.Z
            kt r9 = (defpackage.kt) r9
            r1 = 11
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L16b:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            hq2 r4 = (defpackage.hq2) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
            r8 = 10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L183:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            hq2 r6 = (defpackage.hq2) r6
            r8 = 9
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L19b:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.d0
            r4 = r10
            r94 r4 = (defpackage.r94) r4
            java.lang.Object r10 = r9.e0
            r5 = r10
            t93 r5 = (defpackage.t93) r5
            java.lang.Object r9 = r9.Z
            r6 = r9
            il1 r6 = (defpackage.il1) r6
            r8 = 8
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1b3:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.e0
            fo2 r0 = (defpackage.fo2) r0
            java.lang.Object r9 = r9.Z
            ne2 r9 = (defpackage.ne2) r9
            r1 = 7
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L1c5:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r11 = r9.d0
            sz1 r11 = (defpackage.sz1) r11
            java.lang.Object r9 = r9.e0
            pq5 r9 = (defpackage.pq5) r9
            r10.<init>(r11, r9, r7)
            return r10
        L1d4:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r0 = r9.Z
            sz1 r0 = (defpackage.sz1) r0
            java.lang.Object r9 = r9.e0
            nv4 r9 = (defpackage.nv4) r9
            r1 = 5
            r10.<init>(r0, r9, r7, r1)
            r10.d0 = r11
            return r10
        L1e6:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.Z
            r4 = r10
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r10 = r9.d0
            r5 = r10
            x85 r5 = (defpackage.x85) r5
            java.lang.Object r9 = r9.e0
            r6 = r9
            vs3 r6 = (defpackage.vs3) r6
            r8 = 4
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1fd:
            r7 = r10
            u12 r3 = new u12
            java.lang.Object r10 = r9.Z
            r4 = r10
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r10 = r9.d0
            r5 = r10
            jb5 r5 = (defpackage.jb5) r5
            java.lang.Object r9 = r9.e0
            r6 = r9
            dy1 r6 = (defpackage.dy1) r6
            r8 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L214:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r11 = r9.Z
            sz1 r11 = (defpackage.sz1) r11
            java.lang.Object r9 = r9.e0
            r85 r9 = (defpackage.r85) r9
            r0 = 2
            r10.<init>(r11, r9, r7, r0)
            return r10
        L224:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r11 = r9.Z
            sz1 r11 = (defpackage.sz1) r11
            java.lang.Object r9 = r9.e0
            pq5 r9 = (defpackage.pq5) r9
            r0 = 1
            r10.<init>(r11, r9, r7, r0)
            return r10
        L234:
            r7 = r10
            u12 r10 = new u12
            java.lang.Object r11 = r9.e0
            v80 r11 = (defpackage.v80) r11
            java.lang.Object r9 = r9.Z
            sz1 r9 = (defpackage.sz1) r9
            r0 = 0
            r10.<init>(r11, r9, r7, r0)
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r1 = r19
            int r0 = r1.X
            r2 = 4
            r3 = 16
            r4 = 10
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L91d;
                case 1: goto L8db;
                case 2: goto L87e;
                case 3: goto L845;
                case 4: goto L817;
                case 5: goto L7e7;
                case 6: goto L796;
                case 7: goto L768;
                case 8: goto L735;
                case 9: goto L6e2;
                case 10: goto L6a2;
                case 11: goto L55b;
                case 12: goto L4d3;
                case 13: goto L437;
                case 14: goto L399;
                case 15: goto L35b;
                case 16: goto L306;
                case 17: goto L271;
                case 18: goto Lfa;
                case 19: goto La8;
                case 20: goto La3;
                case 21: goto L9e;
                case 22: goto L69;
                case 23: goto L64;
                case 24: goto L5f;
                case 25: goto L5a;
                case 26: goto L55;
                case 27: goto L50;
                case 28: goto L4b;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L29
            if (r2 != r8) goto L23
            java.lang.Object r0 = r1.d0
            qa4 r0 = (defpackage.qa4) r0
            defpackage.oi2.Y(r20)
            r1 = r20
            goto L41
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L4a
        L29:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.Z
            qa4 r2 = (defpackage.qa4) r2
            java.lang.Object r3 = r1.e0
            qn2 r3 = (defpackage.qn2) r3
            r1.d0 = r2
            r1.Y = r8
            java.lang.Object r1 = r3.g(r1)
            if (r1 != r0) goto L40
            r9 = r0
            goto L4a
        L40:
            r0 = r2
        L41:
            ix5 r1 = (defpackage.ix5) r1
            pq4 r2 = defpackage.px5.a
            r0.setValue(r1)
            jg7 r9 = defpackage.jg7.a
        L4a:
            return r9
        L4b:
            java.lang.Object r0 = r19.E(r20)
            return r0
        L50:
            java.lang.Object r0 = r19.D(r20)
            return r0
        L55:
            java.lang.Object r0 = r19.C(r20)
            return r0
        L5a:
            java.lang.Object r0 = r19.B(r20)
            return r0
        L5f:
            java.lang.Object r0 = r19.A(r20)
            return r0
        L64:
            java.lang.Object r0 = r19.z(r20)
            return r0
        L69:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L81
            if (r2 != r8) goto L7b
            java.lang.Object r0 = r1.d0
            dh5 r0 = (defpackage.dh5) r0
            defpackage.oi2.Y(r20)
            r1 = r20
            goto L99
        L7b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L9d
        L81:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.e0
            dh5 r2 = (defpackage.dh5) r2
            java.lang.Object r3 = r1.Z
            iz4 r3 = (defpackage.iz4) r3
            r1.d0 = r2
            r1.Y = r8
            java.lang.Object r1 = r3.a(r1)
            if (r1 != r0) goto L98
            r9 = r0
            goto L9d
        L98:
            r0 = r2
        L99:
            r0.A = r1
            jg7 r9 = defpackage.jg7.a
        L9d:
            return r9
        L9e:
            java.lang.Object r0 = r19.x(r20)
            return r0
        La3:
            java.lang.Object r0 = r19.v(r20)
            return r0
        La8:
            jg7 r0 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto Lbc
            if (r3 != r8) goto Lb6
            defpackage.oi2.Y(r20)     // Catch: java.lang.Exception -> Led
            goto Lf4
        Lb6:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Lf9
        Lbc:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r1.d0     // Catch: java.lang.Exception -> Led
            oj4 r3 = (defpackage.oj4) r3     // Catch: java.lang.Exception -> Led
            vi r3 = r3.a     // Catch: java.lang.Exception -> Led
            java.lang.Object r4 = r1.e0     // Catch: java.lang.Exception -> Led
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Led
            java.lang.Object r6 = r1.Z     // Catch: java.lang.Exception -> Led
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Led
            r1.Y = r8     // Catch: java.lang.Exception -> Led
            kh r7 = r3.a     // Catch: java.lang.Exception -> Led
            java.io.File r3 = r3.a(r4, r6)     // Catch: java.lang.Exception -> Led
            r7.getClass()     // Catch: java.lang.Exception -> Led
            xe1 r4 = defpackage.xk1.a     // Catch: java.lang.Exception -> Led
            de1 r4 = defpackage.de1.L     // Catch: java.lang.Exception -> Led
            y3 r6 = new y3     // Catch: java.lang.Exception -> Led
            r6.<init>(r3, r9, r5)     // Catch: java.lang.Exception -> Led
            java.lang.Object r1 = defpackage.hv.d0(r4, r6, r1)     // Catch: java.lang.Exception -> Led
            if (r1 != r2) goto Le8
            goto Le9
        Le8:
            r1 = r0
        Le9:
            if (r1 != r2) goto Lf4
            r9 = r2
            goto Lf9
        Led:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        Lf4:
            hm5 r9 = new hm5
            r9.<init>(r0)
        Lf9:
            return r9
        Lfa:
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.Y
            if (r0 == 0) goto L10e
            if (r0 != r8) goto L107
            defpackage.oi2.Y(r20)
            goto L26d
        L107:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L26f
        L10e:
            defpackage.oi2.Y(r20)
            java.lang.Object r0 = r1.d0
            r10 = r0
            r35 r10 = (defpackage.r35) r10
            java.lang.Object r0 = r1.e0
            p21 r0 = (defpackage.p21) r0
            android.net.NetworkRequest r0 = r0.a()
            r11 = 12
            r12 = 30
            if (r0 != 0) goto L184
            java.lang.Object r0 = r1.e0
            p21 r0 = (defpackage.p21) r0
            kf4 r0 = r0.a
            r0.getClass()
            kf4 r13 = defpackage.kf4.NOT_REQUIRED
            if (r0 != r13) goto L133
            r0 = r9
            goto L184
        L133:
            android.net.NetworkRequest$Builder r13 = new android.net.NetworkRequest$Builder
            r13.<init>()
            android.net.NetworkRequest$Builder r13 = r13.addCapability(r11)
            android.net.NetworkRequest$Builder r3 = r13.addCapability(r3)
            r13 = 15
            android.net.NetworkRequest$Builder r3 = r3.removeCapability(r13)
            r13 = 13
            android.net.NetworkRequest$Builder r3 = r3.removeCapability(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r12) goto L15f
            kf4 r13 = defpackage.kf4.TEMPORARILY_UNMETERED
            if (r0 != r13) goto L15f
            r0 = 25
            android.net.NetworkRequest$Builder r0 = r3.addCapability(r0)
            android.net.NetworkRequest r0 = r0.build()
            goto L184
        L15f:
            int[] r13 = defpackage.lf4.a
            int r0 = r0.ordinal()
            r0 = r13[r0]
            if (r0 == r8) goto L17c
            if (r0 == r6) goto L175
            if (r0 == r5) goto L16e
            goto L180
        L16e:
            r0 = 18
            android.net.NetworkRequest$Builder r3 = r3.addCapability(r0)
            goto L180
        L175:
            r0 = 11
            android.net.NetworkRequest$Builder r3 = r3.addCapability(r0)
            goto L180
        L17c:
            android.net.NetworkRequest$Builder r3 = r3.addTransportType(r7)
        L180:
            android.net.NetworkRequest r0 = r3.build()
        L184:
            if (r0 != 0) goto L190
            r10.getClass()
            r10.w0(r9)
            jg7 r9 = defpackage.jg7.a
            goto L26f
        L190:
            bf4 r3 = new bf4
            java.lang.Object r6 = r1.Z
            cf4 r6 = (defpackage.cf4) r6
            r3.<init>(r6, r10, r9, r7)
            ap6 r3 = defpackage.hv.L(r10, r9, r9, r3, r5)
            bi2 r5 = new bi2
            r6 = 28
            r5.<init>(r6, r3, r10)
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 7
            if (r3 < r12) goto L212
            rf6 r3 = defpackage.rf6.a
            java.lang.Object r4 = r1.Z
            cf4 r4 = (defpackage.cf4) r4
            android.net.ConnectivityManager r4 = r4.a
            r3.getClass()
            java.lang.Object r9 = defpackage.rf6.b
            monitor-enter(r9)
            java.util.LinkedHashMap r12 = defpackage.rf6.c     // Catch: java.lang.Throwable -> L1d1
            boolean r13 = r12.isEmpty()     // Catch: java.lang.Throwable -> L1d1
            r12.put(r5, r0)     // Catch: java.lang.Throwable -> L1d1
            if (r13 == 0) goto L1d3
            ga0 r0 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r6 = defpackage.zv7.a     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r7 = "NetworkRequestConstraintController register shared callback"
            r0.b(r6, r7)     // Catch: java.lang.Throwable -> L1d1
            r4.registerDefaultNetworkCallback(r3)     // Catch: java.lang.Throwable -> L1d1
            goto L207
        L1d1:
            r0 = move-exception
            goto L210
        L1d3:
            boolean r3 = defpackage.rf6.e     // Catch: java.lang.Throwable -> L1d1
            if (r3 == 0) goto L207
            java.lang.Boolean r3 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L1d1
            if (r3 == 0) goto L207
            ga0 r3 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r12 = defpackage.zv7.a     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r13 = "NetworkRequestConstraintController send initial capabilities"
            r3.b(r12, r13)     // Catch: java.lang.Throwable -> L1d1
            android.net.NetworkCapabilities r3 = defpackage.rf6.d     // Catch: java.lang.Throwable -> L1d1
            java.lang.Boolean r12 = defpackage.rf6.f     // Catch: java.lang.Throwable -> L1d1
            r12.getClass()     // Catch: java.lang.Throwable -> L1d1
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L1d1
            if (r12 != 0) goto L1fa
            boolean r0 = defpackage.m2.z(r0, r3)     // Catch: java.lang.Throwable -> L1d1
            if (r0 == 0) goto L1fa
            r7 = r8
        L1fa:
            if (r7 == 0) goto L1ff
            v21 r0 = defpackage.v21.a     // Catch: java.lang.Throwable -> L1d1
            goto L204
        L1ff:
            w21 r0 = new w21     // Catch: java.lang.Throwable -> L1d1
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1d1
        L204:
            r5.g(r0)     // Catch: java.lang.Throwable -> L1d1
        L207:
            monitor-exit(r9)
            ci2 r0 = new ci2
            r3 = 27
            r0.<init>(r3, r5, r4)
            goto L25e
        L210:
            monitor-exit(r9)
            throw r0
        L212:
            int r3 = defpackage.c53.c
            java.lang.Object r3 = r1.Z
            cf4 r3 = (defpackage.cf4) r3
            android.net.ConnectivityManager r3 = r3.a
            c53 r9 = new c53
            r9.<init>(r5)
            zg5 r12 = new zg5
            r12.<init>()
            ga0 r13 = defpackage.ga0.f()     // Catch: java.lang.RuntimeException -> L235
            java.lang.String r14 = defpackage.zv7.a     // Catch: java.lang.RuntimeException -> L235
            java.lang.String r15 = "NetworkRequestConstraintController register callback"
            r13.b(r14, r15)     // Catch: java.lang.RuntimeException -> L235
            r3.registerNetworkCallback(r0, r9)     // Catch: java.lang.RuntimeException -> L235
            r12.A = r8     // Catch: java.lang.RuntimeException -> L235
            goto L259
        L235:
            r0 = move-exception
            java.lang.Class r13 = r0.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "TooManyRequestsException"
            boolean r7 = defpackage.xs6.Y(r13, r14, r7)
            if (r7 == 0) goto L270
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r13 = defpackage.zv7.a
            java.lang.String r14 = "NetworkRequestConstraintController couldn't register callback"
            r7.c(r13, r14, r0)
            w21 r0 = new w21
            r0.<init>(r6)
            r5.g(r0)
        L259:
            u6 r0 = new u6
            r0.<init>(r12, r3, r9, r4)
        L25e:
            x7 r3 = new x7
            r3.<init>(r11, r0)
            r1.Y = r8
            java.lang.Object r0 = defpackage.kj2.q(r10, r3, r1)
            if (r0 != r2) goto L26d
            r9 = r2
            goto L26f
        L26d:
            jg7 r9 = defpackage.jg7.a
        L26f:
            return r9
        L270:
            throw r0
        L271:
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r4 = r1.e0
            ne2 r4 = (defpackage.ne2) r4
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r1.Y
            if (r10 == 0) goto L29a
            if (r10 == r8) goto L292
            if (r10 == r6) goto L292
            if (r10 == r5) goto L292
            if (r10 != r2) goto L28b
            defpackage.oi2.Y(r20)
        L288:
            r9 = r0
            goto L305
        L28b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L305
        L292:
            java.lang.Object r3 = r1.d0
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            defpackage.oi2.Y(r20)
            goto L2ed
        L29a:
            defpackage.oi2.Y(r20)
            java.lang.Object r10 = r1.Z
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Class<android.net.ConnectivityManager> r11 = android.net.ConnectivityManager.class
            java.lang.Object r10 = r10.getSystemService(r11)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            if (r10 != 0) goto L2ac
            goto L288
        L2ac:
            android.net.Network r11 = r10.getActiveNetwork()
            if (r11 == 0) goto L2de
            android.net.NetworkCapabilities r5 = r10.getNetworkCapabilities(r11)
            if (r5 == 0) goto L2cf
            boolean r3 = r5.hasCapability(r3)
            if (r3 != r8) goto L2cf
            ue4 r3 = defpackage.ue4.CONNECTED
            r1.e0 = r4
            r1.d0 = r10
            r1.Y = r8
            java.lang.Object r3 = r4.a(r3, r1)
            if (r3 != r7) goto L2cd
            goto L304
        L2cd:
            r3 = r10
            goto L2ed
        L2cf:
            ue4 r3 = defpackage.ue4.DISCONNECTED
            r1.e0 = r4
            r1.d0 = r10
            r1.Y = r6
            java.lang.Object r3 = r4.a(r3, r1)
            if (r3 != r7) goto L2cd
            goto L304
        L2de:
            ue4 r3 = defpackage.ue4.DISCONNECTED
            r1.e0 = r4
            r1.d0 = r10
            r1.Y = r5
            java.lang.Object r3 = r4.a(r3, r1)
            if (r3 != r7) goto L2cd
            goto L304
        L2ed:
            xd1 r5 = new xd1
            r6 = 29
            r5.<init>(r3, r9, r6)
            pb0 r3 = defpackage.f04.p(r5)
            r1.e0 = r9
            r1.d0 = r9
            r1.Y = r2
            java.lang.Object r1 = r3.b(r4, r1)
            if (r1 != r7) goto L288
        L304:
            r9 = r7
        L305:
            return r9
        L306:
            java.lang.Object r0 = r1.e0
            qa4 r0 = (defpackage.qa4) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L31c
            if (r3 != r8) goto L316
            defpackage.oi2.Y(r20)
            goto L358
        L316:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L35a
        L31c:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r0.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r3 <= r8) goto L358
            java.lang.Object r3 = r0.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r0 = r0 - r6
            java.lang.Object r0 = r3.get(r0)
            sb4 r0 = (defpackage.sb4) r0
            java.lang.Object r3 = r1.d0
            n96 r3 = (defpackage.n96) r3
            java.lang.Object r4 = r1.Z
            rs4 r4 = (defpackage.rs4) r4
            float r4 = r4.h()
            r1.Y = r8
            java.lang.Object r0 = r3.v(r4, r0, r1)
            if (r0 != r2) goto L358
            r9 = r2
            goto L35a
        L358:
            jg7 r9 = defpackage.jg7.a
        L35a:
            return r9
        L35b:
            java.lang.Object r0 = r1.Z
            r2 = r0
            qb0 r2 = (defpackage.qb0) r2
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L376
            if (r3 != r8) goto L370
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            r1 = r20
            goto L38b
        L36e:
            r0 = move-exception
            goto L38f
        L370:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L398
        L376:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r1.d0
            w61 r3 = (defpackage.w61) r3
            java.lang.Object r4 = r1.e0     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            eo2 r4 = (defpackage.eo2) r4     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            r1.Y = r8     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            java.lang.Object r1 = r4.o(r3, r1)     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            if (r1 != r0) goto L38b
            r9 = r0
            goto L398
        L38b:
            r2.a(r1)     // Catch: java.lang.Throwable -> L36e java.util.concurrent.CancellationException -> L393
            goto L396
        L38f:
            r2.c(r0)
            goto L396
        L393:
            r2.b()
        L396:
            jg7 r9 = defpackage.jg7.a
        L398:
            return r9
        L399:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L3b4
            if (r2 != r8) goto L3ad
            java.lang.Object r0 = r1.e0
            wa3 r0 = (defpackage.wa3) r0
            java.lang.Object r1 = r1.d0
            hb4 r1 = (defpackage.hb4) r1
            defpackage.oi2.Y(r20)
            goto L3cd
        L3ad:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L432
        L3b4:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.Z
            wa3 r2 = (defpackage.wa3) r2
            hb4 r3 = r2.d
            r1.d0 = r3
            r1.e0 = r2
            r1.Y = r8
            java.lang.Object r1 = r3.e(r1)
            if (r1 != r0) goto L3cb
            r9 = r0
            goto L432
        L3cb:
            r0 = r2
            r1 = r3
        L3cd:
            boolean r2 = r0.e     // Catch: java.lang.Throwable -> L3f8
            if (r2 == 0) goto L3d2
            goto L42d
        L3d2:
            java.util.List r2 = defpackage.wa3.a(r0)     // Catch: java.lang.Throwable -> L3f8
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f8
            int r4 = defpackage.ht0.v0(r2, r4)     // Catch: java.lang.Throwable -> L3f8
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f8
        L3e3:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f8
            if (r4 == 0) goto L3fa
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3f8
            fk3 r4 = (defpackage.fk3) r4     // Catch: java.lang.Throwable -> L3f8
            fh1 r5 = new fh1     // Catch: java.lang.Throwable -> L3f8
            r5.<init>(r7, r4)     // Catch: java.lang.Throwable -> L3f8
            r3.add(r5)     // Catch: java.lang.Throwable -> L3f8
            goto L3e3
        L3f8:
            r0 = move-exception
            goto L433
        L3fa:
            tp6 r2 = r0.f     // Catch: java.lang.Throwable -> L3f8
            kw3 r4 = defpackage.hf.I()     // Catch: java.lang.Throwable -> L3f8
            fh1 r5 = new fh1     // Catch: java.lang.Throwable -> L3f8
            fk3 r10 = new fk3     // Catch: java.lang.Throwable -> L3f8
            java.util.UUID r11 = defpackage.fk3.h     // Catch: java.lang.Throwable -> L3f8
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L3f8
            r12 = 2131951849(0x7f1300e9, float:1.9540124E38)
            java.lang.String r12 = r6.getString(r12)     // Catch: java.lang.Throwable -> L3f8
            dk3 r13 = defpackage.dk3.DEFAULT     // Catch: java.lang.Throwable -> L3f8
            ck3 r14 = defpackage.ck3.FOLLOW_SYSTEM     // Catch: java.lang.Throwable -> L3f8
            zt1 r17 = defpackage.zt1.A     // Catch: java.lang.Throwable -> L3f8
            r15 = 0
            r16 = 50
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L3f8
            r5.<init>(r7, r10)     // Catch: java.lang.Throwable -> L3f8
            r4.add(r5)     // Catch: java.lang.Throwable -> L3f8
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L3f8
            kw3 r3 = defpackage.hf.A(r4)     // Catch: java.lang.Throwable -> L3f8
            r2.l(r3)     // Catch: java.lang.Throwable -> L3f8
            r0.e = r8     // Catch: java.lang.Throwable -> L3f8
        L42d:
            r1.h(r9)
            jg7 r9 = defpackage.jg7.a
        L432:
            return r9
        L433:
            r1.h(r9)
            throw r0
        L437:
            jg7 r0 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L454
            if (r3 != r8) goto L44d
            java.lang.Object r2 = r1.e0
            ha3 r2 = (defpackage.ha3) r2
            java.lang.Object r1 = r1.d0
            hb4 r1 = (defpackage.hb4) r1
            defpackage.oi2.Y(r20)
            goto L46d
        L44d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L4ce
        L454:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r1.Z
            ha3 r3 = (defpackage.ha3) r3
            hb4 r5 = r3.d
            r1.d0 = r5
            r1.e0 = r3
            r1.Y = r8
            java.lang.Object r1 = r5.e(r1)
            if (r1 != r2) goto L46b
            r9 = r2
            goto L4ce
        L46b:
            r2 = r3
            r1 = r5
        L46d:
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L4c1
            if (r3 == 0) goto L476
        L471:
            r1.h(r9)
            r9 = r0
            goto L4ce
        L476:
            yt1 r3 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L4c1
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4c1
            android.content.Context r6 = r2.a     // Catch: java.lang.Throwable -> L4c1
            java.io.File r6 = r6.getFilesDir()     // Catch: java.lang.Throwable -> L4c1
            java.lang.String r10 = "backgrounds.json"
            r5.<init>(r6, r10)     // Catch: java.lang.Throwable -> L4c1
            boolean r6 = r5.isFile()     // Catch: java.lang.Throwable -> L4c1
            if (r6 != 0) goto L48c
            goto L49f
        L48c:
            su2 r6 = r2.b     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            java.io.FileReader r10 = new java.io.FileReader     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            r10.<init>(r5)     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            java.lang.reflect.Type r5 = defpackage.ha3.g     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            java.lang.Object r5 = r6.b(r10, r5)     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L49f java.lang.Throwable -> L4c1
            if (r5 != 0) goto L49e
            goto L49f
        L49e:
            r3 = r5
        L49f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c1
            int r4 = defpackage.ht0.v0(r3, r4)     // Catch: java.lang.Throwable -> L4c1
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4c1
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4c1
        L4ac:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L4c1
            if (r4 == 0) goto L4c3
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L4c1
            n00 r4 = (defpackage.n00) r4     // Catch: java.lang.Throwable -> L4c1
            fh1 r6 = new fh1     // Catch: java.lang.Throwable -> L4c1
            r6.<init>(r7, r4)     // Catch: java.lang.Throwable -> L4c1
            r5.add(r6)     // Catch: java.lang.Throwable -> L4c1
            goto L4ac
        L4c1:
            r0 = move-exception
            goto L4cf
        L4c3:
            tp6 r3 = r2.f     // Catch: java.lang.Throwable -> L4c1
            r3.getClass()     // Catch: java.lang.Throwable -> L4c1
            r3.m(r9, r5)     // Catch: java.lang.Throwable -> L4c1
            r2.e = r8     // Catch: java.lang.Throwable -> L4c1
            goto L471
        L4ce:
            return r9
        L4cf:
            r1.h(r9)
            throw r0
        L4d3:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L4f2
            if (r2 != r8) goto L4ec
            java.lang.Object r2 = r1.d0
            n80 r2 = (defpackage.n80) r2
            java.lang.Object r3 = r1.Z
            ul0 r3 = (defpackage.ul0) r3
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L4e9
            r4 = r20
            goto L50d
        L4e9:
            r0 = move-exception
            r1 = r0
            goto L542
        L4ec:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L541
        L4f2:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.e0
            r3 = r2
            v80 r3 = (defpackage.v80) r3
            n80 r2 = new n80     // Catch: java.lang.Throwable -> L4e9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4e9
        L4ff:
            r1.Z = r3     // Catch: java.lang.Throwable -> L4e9
            r1.d0 = r2     // Catch: java.lang.Throwable -> L4e9
            r1.Y = r8     // Catch: java.lang.Throwable -> L4e9
            java.lang.Object r4 = r2.b(r1)     // Catch: java.lang.Throwable -> L4e9
            if (r4 != r0) goto L50d
            r9 = r0
            goto L541
        L50d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L4e9
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4e9
            if (r4 == 0) goto L53c
            java.lang.Object r4 = r2.c()     // Catch: java.lang.Throwable -> L4e9
            jg7 r4 = (defpackage.jg7) r4     // Catch: java.lang.Throwable -> L4e9
            java.util.concurrent.atomic.AtomicBoolean r4 = defpackage.ps2.b     // Catch: java.lang.Throwable -> L4e9
            r4.set(r7)     // Catch: java.lang.Throwable -> L4e9
            java.lang.Object r4 = defpackage.bm6.c     // Catch: java.lang.Throwable -> L4e9
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4e9
            os2 r5 = defpackage.bm6.j     // Catch: java.lang.Throwable -> L539
            ka4 r5 = r5.h     // Catch: java.lang.Throwable -> L539
            if (r5 == 0) goto L531
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L539
            if (r5 != r8) goto L531
            r5 = r8
            goto L532
        L531:
            r5 = r7
        L532:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e9
            if (r5 == 0) goto L4ff
            defpackage.bm6.a()     // Catch: java.lang.Throwable -> L4e9
            goto L4ff
        L539:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e9
            throw r0     // Catch: java.lang.Throwable -> L4e9
        L53c:
            r3.h(r9)
            jg7 r9 = defpackage.jg7.a
        L541:
            return r9
        L542:
            throw r1     // Catch: java.lang.Throwable -> L543
        L543:
            r0 = move-exception
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L54b
            r9 = r1
            java.util.concurrent.CancellationException r9 = (java.util.concurrent.CancellationException) r9
        L54b:
            if (r9 != 0) goto L557
            java.lang.String r2 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            r9.<init>(r2)
            r9.initCause(r1)
        L557:
            r3.h(r9)
            throw r0
        L55b:
            java.lang.Object r0 = r1.Z
            kt r0 = (defpackage.kt) r0
            km1 r3 = defpackage.km1.a
            jg7 r4 = defpackage.jg7.a
            java.lang.Object r10 = r1.e0
            r14 = r10
            hs2 r14 = (defpackage.hs2) r14
            java.lang.Object r10 = r1.d0
            ne2 r10 = (defpackage.ne2) r10
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r1.Y
            if (r12 == 0) goto L587
            if (r12 == r8) goto L57a
            if (r12 == r6) goto L57a
            if (r12 == r5) goto L57a
            if (r12 != r2) goto L580
        L57a:
            defpackage.oi2.Y(r20)
        L57d:
            r9 = r4
            goto L6a1
        L580:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L6a1
        L587:
            defpackage.oi2.Y(r20)
            android.content.Context r12 = r14.a
            android.content.Context r13 = r14.a
            java.io.File r12 = r12.getExternalCacheDir()
            if (r12 == 0) goto L57d
            java.io.File r15 = new java.io.File
            java.lang.String r5 = "updates"
            r15.<init>(r12, r5)
            boolean r5 = r15.isDirectory()
            if (r5 != 0) goto L5b4
            boolean r5 = r15.mkdirs()
            if (r5 != 0) goto L5b4
            r1.d0 = r9
            r1.Y = r8
            java.lang.Object r0 = r10.a(r3, r1)
            if (r0 != r11) goto L57d
        L5b1:
            r0 = r11
            goto L6a0
        L5b4:
            java.io.File r5 = new java.io.File
            java.lang.String r12 = "update.apk"
            r5.<init>(r15, r12)
            boolean r12 = r5.isFile()
            if (r12 == 0) goto L5d2
            boolean r12 = r5.delete()
            if (r12 != 0) goto L5d2
            r1.d0 = r9
            r1.Y = r6
            java.lang.Object r0 = r10.a(r3, r1)
            if (r0 != r11) goto L57d
            goto L5b1
        L5d2:
            java.lang.String r6 = r0.i
            android.net.Uri r12 = r0.c
            java.lang.String r15 = "https://github.com/ReiKatari/STORM_DS/releases/tag/"
            boolean r6 = defpackage.xs6.g0(r6, r15, r7)
            if (r6 == 0) goto L68d
            java.lang.String r6 = r12.toString()
            r6.getClass()
            java.lang.String r15 = "https://github.com/ReiKatari/STORM_DS/releases/download/"
            boolean r6 = defpackage.xs6.g0(r6, r15, r7)
            if (r6 == 0) goto L68d
            int r3 = me.magnum.melonds.common.providers.UpdateContentProvider.A
            android.net.Uri r3 = android.net.Uri.fromFile(r5)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r7 = r13.getPackageName()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r7)
            java.lang.String r7 = ".provider"
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            android.net.Uri$Builder r6 = r6.authority(r7)
            java.lang.String r7 = "file"
            android.net.Uri$Builder r6 = r6.scheme(r7)
            java.lang.String r7 = r3.getPath()
            android.net.Uri$Builder r6 = r6.path(r7)
            java.lang.String r7 = r3.getQuery()
            android.net.Uri$Builder r6 = r6.query(r7)
            java.lang.String r3 = r3.getFragment()
            android.net.Uri$Builder r3 = r6.fragment(r3)
            android.net.Uri r3 = r3.build()
            r3.getClass()
            java.lang.Class<android.app.DownloadManager> r6 = android.app.DownloadManager.class
            java.lang.Object r6 = r13.getSystemService(r6)
            r6.getClass()
            r15 = r6
            android.app.DownloadManager r15 = (android.app.DownloadManager) r15
            android.app.DownloadManager$Request r6 = new android.app.DownloadManager$Request
            r6.<init>(r12)
            r6.setDestinationUri(r3)
            r6.setNotificationVisibility(r8)
            java.lang.String r3 = "application/vnd.android.package-archive"
            r6.setMimeType(r3)
            bm7 r0 = r0.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Downloading update "
            r3.<init>(r7)
            r3.append(r0)
            java.lang.String r0 = "..."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.setTitle(r0)
            long r12 = r15.enqueue(r6)
            java.lang.Object r0 = r1.Z
            r16 = r0
            kt r16 = (defpackage.kt) r16
            r0 = r11
            n31 r11 = new n31
            r18 = 0
            r17 = r5
            r11.<init>(r12, r14, r15, r16, r17, r18)
            pb0 r3 = defpackage.f04.p(r11)
            r1.d0 = r9
            r1.Y = r2
            java.lang.Object r1 = r3.b(r10, r1)
            if (r1 != r0) goto L57d
            goto L6a0
        L68d:
            r0 = r11
            java.lang.String r2 = "GitHubUpdateInstall"
            java.lang.String r5 = "Rejected update with an unexpected GitHub release origin"
            android.util.Log.w(r2, r5)
            r1.d0 = r9
            r2 = 3
            r1.Y = r2
            java.lang.Object r1 = r10.a(r3, r1)
            if (r1 != r0) goto L57d
        L6a0:
            r9 = r0
        L6a1:
            return r9
        L6a2:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L6b7
            if (r2 != r8) goto L6b0
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L6e1
        L6b0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r9
            goto L6e1
        L6b7:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.d0
            hq2 r2 = (defpackage.hq2) r2
            wp2 r10 = r2.h
            java.lang.Object r2 = r1.e0
            r11 = r2
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Object r2 = r1.Z
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            yt1 r12 = defpackage.yt1.A
            r1.Y = r8
            r10.getClass()
            xe1 r2 = defpackage.xk1.a
            up2 r9 = new up2
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r1 = defpackage.hv.d0(r2, r9, r1)
            if (r1 != r0) goto L6e0
            goto L6e1
        L6e0:
            r0 = r1
        L6e1:
            return r0
        L6e2:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L6f7
            if (r2 != r8) goto L6f0
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L734
        L6f0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r9
            goto L734
        L6f7:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.d0
            android.view.SurfaceView r2 = (android.view.SurfaceView) r2
            java.lang.Object r3 = r1.e0
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r4 = r1.Z
            hq2 r4 = (defpackage.hq2) r4
            r1.Y = r8
            rj0 r5 = new rj0
            r41 r1 = defpackage.np2.V(r1)
            r5.<init>(r8, r1)
            r5.v()
            bq2 r1 = new bq2
            r1.<init>(r5, r3, r7)
            android.os.Handler r4 = r4.k     // Catch: java.lang.Throwable -> L71f
            android.view.PixelCopy.request(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L71f
            goto L72a
        L71f:
            java.lang.Object r1 = r5.u()
            boolean r1 = r1 instanceof defpackage.sg4
            if (r1 == 0) goto L72a
            r5.G(r9, r9)
        L72a:
            java.lang.Object r1 = r5.s()
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r0) goto L733
            goto L734
        L733:
            r0 = r1
        L734:
            return r0
        L735:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L747
            if (r2 != r8) goto L741
            defpackage.oi2.Y(r20)
            goto L75c
        L741:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L767
        L747:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.d0
            r94 r2 = (defpackage.r94) r2
            java.lang.Object r3 = r1.e0
            t93 r3 = (defpackage.t93) r3
            r1.Y = r8
            java.lang.Object r2 = r2.a(r3, r1)
            if (r2 != r0) goto L75c
            r9 = r0
            goto L767
        L75c:
            java.lang.Object r0 = r1.Z
            il1 r0 = (defpackage.il1) r0
            if (r0 == 0) goto L765
            r0.dispose()
        L765:
            jg7 r9 = defpackage.jg7.a
        L767:
            return r9
        L768:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L77a
            if (r2 != r8) goto L774
            defpackage.oi2.Y(r20)
            goto L793
        L774:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L795
        L77a:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.d0
            w61 r2 = (defpackage.w61) r2
            java.lang.Object r3 = r1.e0
            fo2 r3 = (defpackage.fo2) r3
            java.lang.Object r4 = r1.Z
            ne2 r4 = (defpackage.ne2) r4
            r1.Y = r8
            java.lang.Object r1 = r3.e(r2, r4, r1)
            if (r1 != r0) goto L793
            r9 = r0
            goto L795
        L793:
            jg7 r9 = defpackage.jg7.a
        L795:
            return r9
        L796:
            jg7 r0 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L7b7
            if (r3 == r8) goto L7ad
            if (r3 != r6) goto L7a7
            defpackage.oi2.Y(r20)
        L7a5:
            r9 = r0
            goto L7e6
        L7a7:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L7e6
        L7ad:
            java.lang.Object r3 = r1.Z
            sz1 r3 = (defpackage.sz1) r3
            defpackage.oi2.Y(r20)
            r4 = r20
            goto L7cd
        L7b7:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r1.d0
            sz1 r3 = (defpackage.sz1) r3
            java.lang.Object r4 = r1.e0
            pq5 r4 = (defpackage.pq5) r4
            r1.Z = r3
            r1.Y = r8
            java.lang.Object r4 = defpackage.sz1.Q(r3, r4, r1)
            if (r4 != r2) goto L7cd
            goto L7e5
        L7cd:
            pq5 r4 = (defpackage.pq5) r4
            r1.Z = r9
            r1.Y = r6
            r3.getClass()
            z12 r5 = new z12
            r5.<init>(r3, r4, r9)
            java.lang.Object r1 = defpackage.g04.C(r5, r1)
            if (r1 != r2) goto L7e2
            goto L7e3
        L7e2:
            r1 = r0
        L7e3:
            if (r1 != r2) goto L7a5
        L7e5:
            r9 = r2
        L7e6:
            return r9
        L7e7:
            java.lang.Object r0 = r1.d0
            java.util.List r0 = (java.util.List) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L800
            if (r3 != r8) goto L7f9
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L816
        L7f9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r9
            goto L816
        L800:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r1.Z
            sz1 r3 = (defpackage.sz1) r3
            java.lang.Object r4 = r1.e0
            nv4 r4 = (defpackage.nv4) r4
            r1.d0 = r9
            r1.Y = r8
            java.lang.Object r0 = defpackage.sz1.k(r3, r4, r0, r1)
            if (r0 != r2) goto L816
            r0 = r2
        L816:
            return r0
        L817:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L829
            if (r2 != r8) goto L823
            defpackage.oi2.Y(r20)
            goto L842
        L823:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L844
        L829:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.Z
            sz1 r2 = (defpackage.sz1) r2
            java.lang.Object r3 = r1.d0
            x85 r3 = (defpackage.x85) r3
            java.lang.Object r4 = r1.e0
            vs3 r4 = (defpackage.vs3) r4
            r1.Y = r8
            java.lang.Object r1 = defpackage.sz1.V(r2, r3, r4, r1)
            if (r1 != r0) goto L842
            r9 = r0
            goto L844
        L842:
            jg7 r9 = defpackage.jg7.a
        L844:
            return r9
        L845:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L85a
            if (r2 != r8) goto L853
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L87d
        L853:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r9
            goto L87d
        L85a:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.Z
            sz1 r2 = (defpackage.sz1) r2
            oj4 r2 = r2.i
            java.lang.Object r3 = r1.d0
            jb5 r3 = (defpackage.jb5) r3
            java.lang.String r3 = r3.a()
            java.lang.Object r4 = r1.e0
            dy1 r4 = (defpackage.dy1) r4
            pq5 r4 = r4.a
            java.lang.String r4 = r4.i
            r1.Y = r8
            java.lang.Object r1 = r2.g(r3, r4, r1)
            if (r1 != r0) goto L87c
            goto L87d
        L87c:
            r0 = r1
        L87d:
            return r0
        L87e:
            java.lang.Object r0 = r1.e0
            r85 r0 = (defpackage.r85) r0
            java.lang.Object r2 = r1.Z
            sz1 r2 = (defpackage.sz1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.Y
            if (r4 == 0) goto L8a4
            if (r4 == r8) goto L89a
            if (r4 != r6) goto L894
            defpackage.oi2.Y(r20)
            goto L8d8
        L894:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L8da
        L89a:
            defpackage.oi2.Y(r20)
            r4 = r20
            hm5 r4 = (defpackage.hm5) r4
            java.lang.Object r4 = r4.A
            goto L8b6
        L8a4:
            defpackage.oi2.Y(r20)
            pn5 r4 = r2.g
            long r9 = r0.a
            r1.Y = r8
            pl r4 = (defpackage.pl) r4
            java.lang.Object r4 = r4.h(r9, r1)
            if (r4 != r3) goto L8b6
            goto L8d6
        L8b6:
            boolean r5 = r4 instanceof defpackage.em5
            if (r5 != 0) goto L8d8
            r5 = r4
            o75 r5 = (defpackage.o75) r5
            if (r5 == 0) goto L8d8
            of6 r2 = r2.F0
            o95 r7 = new o95
            int r8 = r0.b
            int r9 = r0.c
            java.lang.String r0 = r0.d
            r7.<init>(r5, r8, r9, r0)
            r1.d0 = r4
            r1.Y = r6
            java.lang.Object r0 = r2.a(r7, r1)
            if (r0 != r3) goto L8d8
        L8d6:
            r9 = r3
            goto L8da
        L8d8:
            jg7 r9 = defpackage.jg7.a
        L8da:
            return r9
        L8db:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L8f3
            if (r2 != r8) goto L8ed
            java.lang.Object r0 = r1.d0
            tp6 r0 = (defpackage.tp6) r0
            defpackage.oi2.Y(r20)
            r1 = r20
            goto L90d
        L8ed:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L91c
        L8f3:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.Z
            sz1 r2 = (defpackage.sz1) r2
            tp6 r3 = r2.p0
            java.lang.Object r4 = r1.e0
            pq5 r4 = (defpackage.pq5) r4
            r1.d0 = r3
            r1.Y = r8
            java.lang.Object r1 = defpackage.sz1.Q(r2, r4, r1)
            if (r1 != r0) goto L90c
            r9 = r0
            goto L91c
        L90c:
            r0 = r3
        L90d:
            pq5 r1 = (defpackage.pq5) r1
            gy1 r2 = new gy1
            r2.<init>(r1)
            r0.getClass()
            r0.m(r9, r2)
            jg7 r9 = defpackage.jg7.a
        L91c:
            return r9
        L91d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L94b
            if (r2 == r8) goto L941
            if (r2 == r6) goto L939
            r3 = 3
            if (r2 != r3) goto L933
            java.lang.Object r2 = r1.d0
            n80 r2 = (defpackage.n80) r2
            defpackage.oi2.Y(r20)
            r4 = 3
            goto L958
        L933:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L996
        L939:
            java.lang.Object r2 = r1.d0
            n80 r2 = (defpackage.n80) r2
            defpackage.oi2.Y(r20)
            goto L983
        L941:
            java.lang.Object r2 = r1.d0
            n80 r2 = (defpackage.n80) r2
            defpackage.oi2.Y(r20)
            r3 = r20
            goto L963
        L94b:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r1.e0
            v80 r2 = (defpackage.v80) r2
            n80 r3 = new n80
            r3.<init>(r2)
            r2 = r3
        L958:
            r1.d0 = r2
            r1.Y = r8
            java.lang.Object r3 = r2.b(r1)
            if (r3 != r0) goto L963
            goto L992
        L963:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L994
            r2.c()
            jd1 r3 = defpackage.oq1.B
            r3 = 750(0x2ee, float:1.051E-42)
            uq1 r4 = defpackage.uq1.MILLISECONDS
            long r3 = defpackage.n16.L(r3, r4)
            r1.d0 = r2
            r1.Y = r6
            java.lang.Object r3 = defpackage.q60.u(r3, r1)
            if (r3 != r0) goto L983
            goto L992
        L983:
            java.lang.Object r3 = r1.Z
            sz1 r3 = (defpackage.sz1) r3
            r1.d0 = r2
            r4 = 3
            r1.Y = r4
            java.lang.Object r3 = defpackage.sz1.D(r3, r1)
            if (r3 != r0) goto L958
        L992:
            r9 = r0
            goto L996
        L994:
            jg7 r9 = defpackage.jg7.a
        L996:
            return r9
    }
}
