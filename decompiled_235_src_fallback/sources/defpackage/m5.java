package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m5  reason: default package */
/* loaded from: classes.dex */
public final class m5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ m5(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ m5(java.lang.Object r1, java.util.List r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.Y = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ m5(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    private final java.lang.Object v(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            java.lang.Object r2 = r1.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r2
            l06 r2 = r2.B0
            if (r2 == 0) goto L16
            java.lang.Object r1 = r1.Z
            pq5 r1 = (defpackage.pq5) r1
            k06 r1 = r2.f(r1)
            return r1
        L16:
            java.lang.String r1 = "romSaveFileManager"
            defpackage.nb3.a0(r1)
            r1 = 0
            throw r1
    }

    private final java.lang.Object x(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            java.lang.Object r2 = r1.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r2
            l06 r2 = r2.B0
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.Z
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r2.c(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1a:
            java.lang.String r1 = "romSaveFileManager"
            defpackage.nb3.a0(r1)
            r1 = 0
            throw r1
    }

    private final java.lang.Object z(java.lang.Object r4) {
            r3 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r4 = r3.Y
            pq5 r4 = (defpackage.pq5) r4
            android.net.Uri r4 = r4.d
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r0 = r3.Z
            kx5 r0 = (defpackage.kx5) r0
            java.util.Map r1 = r0.d
            r1.getClass()
            monitor-enter(r1)
            java.util.Map r0 = r0.d     // Catch: java.lang.Throwable -> L31
            r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r0.get(r4)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L33
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            r0.put(r4, r2)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r3 = move-exception
            goto L4e
        L33:
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)
            java.lang.Object r0 = r3.Z
            kx5 r0 = (defpackage.kx5) r0
            java.lang.Object r3 = r3.Y
            pq5 r3 = (defpackage.pq5) r3
            r2.lock()
            android.graphics.Bitmap r3 = defpackage.kx5.a(r0, r4, r3)     // Catch: java.lang.Throwable -> L49
            r2.unlock()
            return r3
        L49:
            r3 = move-exception
            r2.unlock()
            throw r3
        L4e:
            monitor-exit(r1)
            throw r3
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L1a5;
                case 1: goto L196;
                case 2: goto L188;
                case 3: goto L17a;
                case 4: goto L16c;
                case 5: goto L15e;
                case 6: goto L150;
                case 7: goto L141;
                case 8: goto L132;
                case 9: goto L124;
                case 10: goto L116;
                case 11: goto L108;
                case 12: goto Lfa;
                case 13: goto Lec;
                case 14: goto Lde;
                case 15: goto Ld0;
                case 16: goto Lc1;
                case 17: goto Lb2;
                case 18: goto La4;
                case 19: goto L96;
                case 20: goto L88;
                case 21: goto L79;
                case 22: goto L6b;
                case 23: goto L5f;
                case 24: goto L51;
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
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            zv5 r3 = (defpackage.zv5) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L51:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L5f:
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L6b:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L79:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L88:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L96:
            java.util.List r3 = (java.util.List) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        La4:
            java.util.List r3 = (java.util.List) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        Lb2:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lc1:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld0:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        Lde:
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        Lec:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        Lfa:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L108:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L116:
            java.util.List r3 = (java.util.List) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L124:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L132:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L141:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L150:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L15e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L16c:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L17a:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L188:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
        L196:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1a5:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            m5 r2 = (defpackage.m5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.Z
            switch(r0) {
                case 0: goto L182;
                case 1: goto L175;
                case 2: goto L168;
                case 3: goto L15b;
                case 4: goto L14e;
                case 5: goto L143;
                case 6: goto L136;
                case 7: goto L129;
                case 8: goto L11d;
                case 9: goto L10f;
                case 10: goto L103;
                case 11: goto Lf5;
                case 12: goto Le7;
                case 13: goto Ld9;
                case 14: goto Lcd;
                case 15: goto Lbf;
                case 16: goto Lb1;
                case 17: goto La5;
                case 18: goto L99;
                case 19: goto L8d;
                case 20: goto L81;
                case 21: goto L73;
                case 22: goto L65;
                case 23: goto L59;
                case 24: goto L4b;
                case 25: goto L3f;
                case 26: goto L31;
                case 27: goto L23;
                case 28: goto L15;
                default: goto L7;
            }
        L7:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            me.magnum.melonds.ui.romlist.a r2 = (me.magnum.melonds.ui.romlist.a) r2
            pq5 r1 = (defpackage.pq5) r1
            r0 = 29
            r4.<init>(r2, r1, r3, r0)
            return r4
        L15:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            pq5 r2 = (defpackage.pq5) r2
            kx5 r1 = (defpackage.kx5) r1
            r0 = 28
            r4.<init>(r2, r1, r3, r0)
            return r4
        L23:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r2
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 27
            r4.<init>(r2, r1, r3, r0)
            return r4
        L31:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r2
            pq5 r1 = (defpackage.pq5) r1
            r0 = 26
            r4.<init>(r2, r1, r3, r0)
            return r4
        L3f:
            m5 r2 = new m5
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r1 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r1
            r0 = 25
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L4b:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            hn5 r2 = (defpackage.hn5) r2
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 24
            r4.<init>(r2, r1, r3, r0)
            return r4
        L59:
            m5 r2 = new m5
            pa r1 = (defpackage.pa) r1
            r0 = 23
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L65:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            bx4 r2 = (defpackage.bx4) r2
            qb0 r1 = (defpackage.qb0) r1
            r0 = 22
            r4.<init>(r2, r1, r3, r0)
            return r4
        L73:
            m5 r4 = new m5
            wz3 r1 = (defpackage.wz3) r1
            java.lang.Object r2 = r2.Y
            java.util.List r2 = (java.util.List) r2
            r0 = 21
            r4.<init>(r1, r2, r3, r0)
            return r4
        L81:
            m5 r2 = new m5
            au3 r1 = (defpackage.au3) r1
            r0 = 20
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L8d:
            m5 r2 = new m5
            eo3 r1 = (defpackage.eo3) r1
            r0 = 19
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L99:
            m5 r2 = new m5
            qn3 r1 = (defpackage.qn3) r1
            r0 = 18
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        La5:
            m5 r2 = new m5
            a5 r1 = (defpackage.a5) r1
            r0 = 17
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        Lb1:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 16
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lbf:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0 = 15
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lcd:
            m5 r2 = new m5
            xb2 r1 = (defpackage.xb2) r1
            r0 = 14
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        Ld9:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            sz1 r2 = (defpackage.sz1) r2
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            r0 = 13
            r4.<init>(r2, r1, r3, r0)
            return r4
        Le7:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            sz1 r2 = (defpackage.sz1) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 12
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lf5:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            sz1 r2 = (defpackage.sz1) r2
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 11
            r4.<init>(r2, r1, r3, r0)
            return r4
        L103:
            m5 r2 = new m5
            xa1 r1 = (defpackage.xa1) r1
            r0 = 10
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L10f:
            m5 r4 = new m5
            la1 r1 = (defpackage.la1) r1
            java.lang.Object r2 = r2.Y
            java.util.List r2 = (java.util.List) r2
            r0 = 9
            r4.<init>(r1, r2, r3, r0)
            return r4
        L11d:
            m5 r2 = new m5
            c81 r1 = (defpackage.c81) r1
            r0 = 8
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L129:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            ld0 r2 = (defpackage.ld0) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 7
            r4.<init>(r2, r1, r3, r0)
            return r4
        L136:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            yk0 r2 = (defpackage.yk0) r2
            pq7 r1 = (defpackage.pq7) r1
            r0 = 6
            r4.<init>(r2, r1, r3, r0)
            return r4
        L143:
            m5 r2 = new m5
            e70 r1 = (defpackage.e70) r1
            r0 = 5
            r2.<init>(r1, r3, r0)
            r2.Y = r4
            return r2
        L14e:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            cv7 r2 = (defpackage.cv7) r2
            qa4 r1 = (defpackage.qa4) r1
            r0 = 4
            r4.<init>(r2, r1, r3, r0)
            return r4
        L15b:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            bx r2 = (defpackage.bx) r2
            cx r1 = (defpackage.cx) r1
            r0 = 3
            r4.<init>(r2, r1, r3, r0)
            return r4
        L168:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            rd r2 = (defpackage.rd) r2
            cx r1 = (defpackage.cx) r1
            r0 = 2
            r4.<init>(r2, r1, r3, r0)
            return r4
        L175:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            java.io.File r2 = (java.io.File) r2
            kh r1 = (defpackage.kh) r1
            r0 = 1
            r4.<init>(r2, r1, r3, r0)
            return r4
        L182:
            m5 r4 = new m5
            java.lang.Object r2 = r2.Y
            java.util.List r2 = (java.util.List) r2
            ts4 r1 = (defpackage.ts4) r1
            r0 = 0
            r4.<init>(r2, r1, r3, r0)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r92) {
            r91 = this;
            r0 = r91
            int r1 = r0.X
            r2 = 8
            r3 = 10
            r5 = 2
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r1) {
                case 0: goto Lc2e;
                case 1: goto Lbd1;
                case 2: goto Lbbb;
                case 3: goto Lb8f;
                case 4: goto Lb69;
                case 5: goto Lb19;
                case 6: goto Lafe;
                case 7: goto Laeb;
                case 8: goto Lab5;
                case 9: goto La97;
                case 10: goto La6a;
                case 11: goto La45;
                case 12: goto La22;
                case 13: goto La05;
                case 14: goto L8d3;
                case 15: goto L8a8;
                case 16: goto L335;
                case 17: goto L2e4;
                case 18: goto L2a5;
                case 19: goto L264;
                case 20: goto L23b;
                case 21: goto L1f8;
                case 22: goto L184;
                case 23: goto L13e;
                case 24: goto Lc3;
                case 25: goto L3b;
                case 26: goto L36;
                case 27: goto L31;
                case 28: goto L2c;
                default: goto L10;
            }
        L10:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            me.magnum.melonds.ui.romlist.a r1 = (me.magnum.melonds.ui.romlist.a) r1
            l06 r1 = r1.Y
            if (r1 == 0) goto L26
            java.lang.Object r0 = r0.Z
            pq5 r0 = (defpackage.pq5) r0
            k06 r0 = r1.f(r0)
            return r0
        L26:
            java.lang.String r0 = "romSaveFileManager"
            defpackage.nb3.a0(r0)
            throw r9
        L2c:
            java.lang.Object r0 = r91.z(r92)
            return r0
        L31:
            java.lang.Object r0 = r91.x(r92)
            return r0
        L36:
            java.lang.Object r0 = r91.v(r92)
            return r0
        L3b:
            java.lang.Object r1 = r0.Z
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r1 = (me.magnum.melonds.ui.romdetails.RomDetailsActivity) r1
            java.lang.Object r0 = r0.Y
            zv5 r0 = (defpackage.zv5) r0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            boolean r2 = r0 instanceof defpackage.wv5
            if (r2 == 0) goto L9a
            wv5 r0 = (defpackage.wv5) r0
            java.lang.String r2 = r0.a
            xv5 r3 = r0.b
            int[] r4 = defpackage.gv5.a
            int r8 = r3.ordinal()
            r4 = r4[r8]
            if (r4 == r7) goto L73
            if (r4 == r5) goto L6f
            if (r4 == r6) goto L6b
            r5 = 4
            if (r4 != r5) goto L67
            r4 = 2131952352(0x7f1302e0, float:1.9541144E38)
            goto L76
        L67:
            defpackage.i.d()
            goto Lc2
        L6b:
            r4 = 2131952349(0x7f1302dd, float:1.9541138E38)
            goto L76
        L6f:
            r4 = 2131952350(0x7f1302de, float:1.954114E38)
            goto L76
        L73:
            r4 = 2131952351(0x7f1302df, float:1.9541142E38)
        L76:
            xv5 r5 = defpackage.xv5.SERVER_REJECTED
            if (r3 != r5) goto L91
            java.lang.String r0 = r0.c
            if (r0 != 0) goto L88
            r0 = 2131952353(0x7f1302e1, float:1.9541146E38)
            java.lang.String r0 = r1.getString(r0)
            r0.getClass()
        L88:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = r1.getString(r4, r0)
            goto Lb2
        L91:
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r0 = r1.getString(r4, r0)
            goto Lb2
        L9a:
            boolean r2 = r0 instanceof defpackage.yv5
            if (r2 == 0) goto Lbf
            yv5 r0 = (defpackage.yv5) r0
            int r0 = r0.a
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            r2 = 2131952354(0x7f1302e2, float:1.9541148E38)
            java.lang.String r0 = r1.getString(r2, r0)
        Lb2:
            r0.getClass()
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r7)
            r0.show()
            jg7 r9 = defpackage.jg7.a
            goto Lc2
        Lbf:
            defpackage.i.d()
        Lc2:
            return r9
        Lc3:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            hn5 r1 = (defpackage.hn5) r1
            android.content.Context r2 = r1.a
            pe5 r2 = defpackage.vs0.q(r2)
            java.lang.Object r0 = r0.Z
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ev r0 = defpackage.gt0.B0(r0)
            gn5 r3 = new gn5
            r3.<init>(r8)
            qd2 r4 = new qd2
            r4.<init>(r0, r3, r5)
            gn5 r0 = new gn5
            r0.<init>(r7)
            pc2 r3 = new pc2
            r3.<init>(r4, r7, r0)
            gn5 r0 = new gn5
            r4 = 23
            r0.<init>(r4)
            ol1 r4 = new ol1
            java.util.Iterator r3 = r3.iterator()
            r4.<init>(r3, r0)
        L100:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L13b
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            x23 r3 = new x23
            android.content.Context r5 = r1.a
            r3.<init>(r5)
            r3.c = r0
            ra0 r0 = defpackage.ra0.ENABLED
            r3.p = r0
            ra0 r0 = defpackage.ra0.DISABLED
            r3.o = r0
            wi6 r0 = defpackage.wi6.c
            ve5 r0 = new ve5
            r0.<init>()
            r3.r = r0
            r3.t = r9
            r3.u = r9
            r3.v = r9
            z23 r0 = r3.a()
            o41 r3 = r2.e
            ne5 r5 = new ne5
            r5.<init>(r2, r0, r9, r8)
            defpackage.hv.i(r3, r9, r9, r5, r6)
            goto L100
        L13b:
            jg7 r0 = defpackage.jg7.a
            return r0
        L13e:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            java.lang.Object r0 = r0.Z
            pa r0 = (defpackage.pa) r0
            java.lang.Object r2 = r0.Z
            pu r2 = (defpackage.pu) r2
            r2.addLast(r1)
            java.lang.Object r1 = r0.Y
            v80 r1 = (defpackage.v80) r1
            java.lang.Object r3 = r1.m()
        L158:
            boolean r4 = r3 instanceof defpackage.fm0
            if (r4 != 0) goto L167
            defpackage.gm0.b(r3)
            r2.addLast(r3)
            java.lang.Object r3 = r1.m()
            goto L158
        L167:
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PruningProcessingQueue: Pruning "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r1, r3)
            java.lang.Object r0 = r0.B
            qn2 r0 = (defpackage.qn2) r0
            r0.g(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L184:
            java.lang.Object r1 = r0.Z
            qb0 r1 = (defpackage.qb0) r1
            java.lang.String r2 = "PipePresenceSrc"
            java.lang.Object r0 = r0.Y
            r3 = r0
            bx4 r3 = (defpackage.bx4) r3
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            android.hardware.camera2.CameraManager r0 = r3.j     // Catch: java.lang.Exception -> L1af
            java.lang.String[] r4 = r0.getCameraIdList()     // Catch: java.lang.Exception -> L1af
            r4.getClass()     // Catch: java.lang.Exception -> L1af
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1af
            r5.<init>()     // Catch: java.lang.Exception -> L1af
            int r6 = r4.length     // Catch: java.lang.Exception -> L1af
        L1a3:
            if (r8 >= r6) goto L1cf
            r7 = r4[r8]     // Catch: java.lang.Exception -> L1af
            r7.getClass()     // Catch: java.lang.Exception -> L1af java.lang.IllegalArgumentException -> L1b1
            yf0 r0 = defpackage.nc1.J(r7, r9, r9)     // Catch: java.lang.Exception -> L1af java.lang.IllegalArgumentException -> L1b1
            goto L1c7
        L1af:
            r0 = move-exception
            goto L1ea
        L1b1:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1af
            r10.<init>()     // Catch: java.lang.Exception -> L1af
            java.lang.String r11 = "Could not create CameraIdentifier for system ID: "
            r10.append(r11)     // Catch: java.lang.Exception -> L1af
            r10.append(r7)     // Catch: java.lang.Exception -> L1af
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Exception -> L1af
            android.util.Log.w(r2, r7, r0)     // Catch: java.lang.Exception -> L1af
            r0 = r9
        L1c7:
            if (r0 == 0) goto L1cc
            r5.add(r0)     // Catch: java.lang.Exception -> L1af
        L1cc:
            int r8 = r8 + 1
            goto L1a3
        L1cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1af
            r0.<init>()     // Catch: java.lang.Exception -> L1af
            java.lang.String r4 = "[FetchData] Refreshed camera list from hardware: "
            r0.append(r4)     // Catch: java.lang.Exception -> L1af
            r0.append(r5)     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1af
            android.util.Log.d(r2, r0)     // Catch: java.lang.Exception -> L1af
            r3.c(r5, r9)     // Catch: java.lang.Exception -> L1af
            r1.a(r5)     // Catch: java.lang.Exception -> L1af
            goto L1f5
        L1ea:
            java.lang.String r4 = "[FetchData] Failed to refresh camera list from hardware."
            android.util.Log.e(r2, r4, r0)
            r3.c(r9, r0)
            r1.c(r0)
        L1f5:
            jg7 r0 = defpackage.jg7.a
            return r0
        L1f8:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r0.Y
            java.util.List r0 = (java.util.List) r0
            pc6 r1 = new pc6
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L20a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21c
            java.lang.Object r2 = r0.next()
            di7 r2 = (defpackage.di7) r2
            rc6 r2 = r2.o
            r1.a(r2)
            goto L20a
        L21c:
            rc6 r0 = r1.b()
            ek0 r0 = r0.g
            android.util.Range r0 = r0.a()
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 30
            if (r0 <= r1) goto L235
            goto L236
        L235:
            r7 = r8
        L236:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L23b:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            w61 r1 = (defpackage.w61) r1
            java.lang.Object r0 = r0.Z
            au3 r0 = (defpackage.au3) r0
            ut3 r2 = r0.A
            tt3 r3 = r2.b()
            tt3 r4 = defpackage.tt3.INITIALIZED
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L25a
            r2.a(r0)
            goto L261
        L25a:
            l61 r0 = r1.A()
            defpackage.yh2.m(r0, r9)
        L261:
            jg7 r0 = defpackage.jg7.a
            return r0
        L264:
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r0.Z
            eo3 r0 = (defpackage.eo3) r0
            de5 r2 = r0.g
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            ba6 r2 = (defpackage.ba6) r2
            java.util.UUID r2 = r2.a
            if (r1 == 0) goto L286
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L286
            goto L29f
        L286:
            java.util.Iterator r1 = r1.iterator()
        L28a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L29f
            java.lang.Object r3 = r1.next()
            fk3 r3 = (defpackage.fk3) r3
            java.util.UUID r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r2)
            if (r3 == 0) goto L28a
            goto L2a2
        L29f:
            r0.e()
        L2a2:
            jg7 r0 = defpackage.jg7.a
            return r0
        L2a5:
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r0.Z
            qn3 r0 = (defpackage.qn3) r0
            tp6 r2 = r0.e
            java.lang.Object r2 = r2.getValue()
            ba6 r2 = (defpackage.ba6) r2
            java.util.UUID r2 = r2.a
            if (r1 == 0) goto L2c5
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2c5
            goto L2de
        L2c5:
            java.util.Iterator r1 = r1.iterator()
        L2c9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2de
            java.lang.Object r3 = r1.next()
            fk3 r3 = (defpackage.fk3) r3
            java.util.UUID r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r2)
            if (r3 == 0) goto L2c9
            goto L2e1
        L2de:
            r0.e()
        L2e1:
            jg7 r0 = defpackage.jg7.a
            return r0
        L2e4:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            w61 r1 = (defpackage.w61) r1
            l61 r1 = r1.A()
            java.lang.Object r0 = r0.Z
            a5 r0 = (defpackage.a5) r0
            r57 r2 = new r57     // Catch: java.lang.InterruptedException -> L328
            r2.<init>()     // Catch: java.lang.InterruptedException -> L328
            rc3 r1 = defpackage.yh2.u(r1)     // Catch: java.lang.InterruptedException -> L328
            il1 r1 = defpackage.yh2.y(r1, r7, r2)     // Catch: java.lang.InterruptedException -> L328
            r2.e0 = r1     // Catch: java.lang.InterruptedException -> L328
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.r57.f0     // Catch: java.lang.InterruptedException -> L328
        L306:
            int r3 = r1.get(r2)     // Catch: java.lang.InterruptedException -> L328
            if (r3 == 0) goto L315
            if (r3 == r5) goto L31b
            if (r3 != r6) goto L311
            goto L31b
        L311:
            defpackage.r57.t(r3)     // Catch: java.lang.InterruptedException -> L328
            throw r9     // Catch: java.lang.InterruptedException -> L328
        L315:
            boolean r3 = r1.compareAndSet(r2, r3, r8)     // Catch: java.lang.InterruptedException -> L328
            if (r3 == 0) goto L306
        L31b:
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L323
            r2.s()     // Catch: java.lang.InterruptedException -> L328
            return r0
        L323:
            r0 = move-exception
            r2.s()     // Catch: java.lang.InterruptedException -> L328
            throw r0     // Catch: java.lang.InterruptedException -> L328
        L328:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "Blocking call was interrupted due to parent cancellation"
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            throw r0
        L335:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r0.Y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9 = r8
        L34c:
            int r10 = r1.length()
            if (r9 >= r10) goto L7ec
            char r10 = r1.charAt(r9)
            r11 = 40960(0xa000, float:5.7397E-41)
            r12 = 19968(0x4e00, float:2.7981E-41)
            r13 = 12544(0x3100, float:1.7578E-41)
            r14 = 12352(0x3040, float:1.7309E-41)
            if (r14 > r10) goto L364
            if (r10 >= r13) goto L364
            goto L368
        L364:
            if (r12 > r10) goto L7df
            if (r10 >= r11) goto L7df
        L368:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r9 = r1.length()
            r10 = -1
            r15 = r8
            r8 = r10
        L379:
            if (r15 >= r9) goto L3c9
            char r4 = r1.charAt(r15)
            if (r12 > r4) goto L385
            if (r4 >= r11) goto L385
            r11 = 0
            goto L393
        L385:
            r11 = 12448(0x30a0, float:1.7443E-41)
            if (r14 > r4) goto L38d
            if (r4 >= r11) goto L38d
        L38b:
            r11 = r7
            goto L393
        L38d:
            if (r11 > r4) goto L392
            if (r4 >= r13) goto L392
            goto L38b
        L392:
            r11 = r5
        L393:
            if (r11 != r5) goto L3a9
            int r4 = r3.length()
            if (r4 <= 0) goto L3a7
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L3a7:
            r8 = r10
            goto L3c3
        L3a9:
            if (r8 == r10) goto L3bf
            if (r8 == r11) goto L3bf
            int r8 = r3.length()
            if (r8 < r5) goto L3bf
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L3bf:
            r3.append(r4)
            r8 = r11
        L3c3:
            int r15 = r15 + 1
            r11 = 40960(0xa000, float:5.7397E-41)
            goto L379
        L3c9:
            int r4 = r3.length()
            if (r4 <= 0) goto L3d6
            java.lang.String r3 = r3.toString()
            r2.add(r3)
        L3d6:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.size()
            r5 = 0
        L3e0:
            if (r5 >= r4) goto L3f9
            java.lang.Object r8 = r2.get(r5)
            int r5 = r5 + 1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            if (r7 > r9) goto L3e0
            r10 = 9
            if (r9 >= r10) goto L3e0
            r3.add(r8)
            goto L3e0
        L3f9:
            java.util.Set r2 = defpackage.gt0.o1(r3)
            java.util.List r2 = defpackage.gt0.k1(r2)
            r3 = 6
            java.util.List r2 = defpackage.gt0.e1(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L40a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7db
            java.lang.Object r3 = r2.next()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r3 = "あ"
            java.lang.String r4 = "a"
            vr4 r5 = new vr4
            r5.<init>(r3, r4)
            java.lang.String r3 = "い"
            java.lang.String r4 = "i"
            vr4 r7 = new vr4
            r7.<init>(r3, r4)
            java.lang.String r4 = "う"
            java.lang.String r9 = "u"
            vr4 r10 = new vr4
            r10.<init>(r4, r9)
            java.lang.String r4 = "え"
            java.lang.String r9 = "e"
            vr4 r11 = new vr4
            r11.<init>(r4, r9)
            java.lang.String r4 = "お"
            java.lang.String r9 = "o"
            vr4 r12 = new vr4
            r12.<init>(r4, r9)
            java.lang.String r4 = "か"
            java.lang.String r9 = "ka"
            vr4 r13 = new vr4
            r13.<init>(r4, r9)
            java.lang.String r4 = "き"
            java.lang.String r9 = "ki"
            vr4 r14 = new vr4
            r14.<init>(r4, r9)
            java.lang.String r4 = "く"
            java.lang.String r9 = "ku"
            vr4 r15 = new vr4
            r15.<init>(r4, r9)
            java.lang.String r9 = "け"
            r92 = r2
            java.lang.String r2 = "ke"
            r17 = r5
            vr4 r5 = new vr4
            r5.<init>(r9, r2)
            java.lang.String r2 = "こ"
            java.lang.String r9 = "ko"
            r25 = r5
            vr4 r5 = new vr4
            r5.<init>(r2, r9)
            java.lang.String r2 = "さ"
            java.lang.String r9 = "sa"
            r26 = r5
            vr4 r5 = new vr4
            r5.<init>(r2, r9)
            java.lang.String r2 = "し"
            java.lang.String r9 = "shi"
            r27 = r5
            vr4 r5 = new vr4
            r5.<init>(r2, r9)
            java.lang.String r2 = "す"
            java.lang.String r9 = "su"
            r28 = r5
            vr4 r5 = new vr4
            r5.<init>(r2, r9)
            java.lang.String r9 = "せ"
            r29 = r5
            java.lang.String r5 = "se"
            r18 = r7
            vr4 r7 = new vr4
            r7.<init>(r9, r5)
            java.lang.String r5 = "そ"
            java.lang.String r9 = "so"
            r30 = r7
            vr4 r7 = new vr4
            r7.<init>(r5, r9)
            java.lang.String r5 = "た"
            java.lang.String r9 = "ta"
            r31 = r7
            vr4 r7 = new vr4
            r7.<init>(r5, r9)
            java.lang.String r9 = "ち"
            r32 = r7
            java.lang.String r7 = "chi"
            r19 = r10
            vr4 r10 = new vr4
            r10.<init>(r9, r7)
            java.lang.String r7 = "つ"
            java.lang.String r9 = "tsu"
            r33 = r10
            vr4 r10 = new vr4
            r10.<init>(r7, r9)
            java.lang.String r7 = "て"
            java.lang.String r9 = "te"
            r34 = r10
            vr4 r10 = new vr4
            r10.<init>(r7, r9)
            java.lang.String r7 = "と"
            java.lang.String r9 = "to"
            r35 = r10
            vr4 r10 = new vr4
            r10.<init>(r7, r9)
            java.lang.String r7 = "な"
            java.lang.String r9 = "na"
            r36 = r10
            vr4 r10 = new vr4
            r10.<init>(r7, r9)
            java.lang.String r9 = "に"
            r37 = r10
            java.lang.String r10 = "ni"
            r20 = r11
            vr4 r11 = new vr4
            r11.<init>(r9, r10)
            java.lang.String r10 = "ぬ"
            r38 = r11
            java.lang.String r11 = "nu"
            r21 = r12
            vr4 r12 = new vr4
            r12.<init>(r10, r11)
            java.lang.String r10 = "ね"
            java.lang.String r11 = "ne"
            r39 = r12
            vr4 r12 = new vr4
            r12.<init>(r10, r11)
            java.lang.String r10 = "の"
            java.lang.String r11 = "no"
            r40 = r12
            vr4 r12 = new vr4
            r12.<init>(r10, r11)
            java.lang.String r10 = "は"
            java.lang.String r11 = "ha"
            r41 = r12
            vr4 r12 = new vr4
            r12.<init>(r10, r11)
            java.lang.String r11 = "ひ"
            r42 = r12
            java.lang.String r12 = "hi"
            r22 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "ふ"
            java.lang.String r12 = "fu"
            r43 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "へ"
            java.lang.String r12 = "he"
            r44 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "ほ"
            java.lang.String r12 = "ho"
            r45 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "ま"
            java.lang.String r12 = "ma"
            r46 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "み"
            java.lang.String r12 = "mi"
            r47 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r11 = "む"
            java.lang.String r12 = "mu"
            r48 = r13
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.String r12 = "め"
            r49 = r13
            java.lang.String r13 = "me"
            r23 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "も"
            java.lang.String r13 = "mo"
            r50 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "や"
            java.lang.String r13 = "ya"
            r51 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "ゆ"
            java.lang.String r13 = "yu"
            r52 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "よ"
            java.lang.String r13 = "yo"
            r53 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "ら"
            java.lang.String r13 = "ra"
            r54 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "り"
            java.lang.String r13 = "ri"
            r55 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r12 = "る"
            java.lang.String r13 = "ru"
            r56 = r14
            vr4 r14 = new vr4
            r14.<init>(r12, r13)
            java.lang.String r13 = "れ"
            r57 = r14
            java.lang.String r14 = "re"
            r24 = r15
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            java.lang.String r13 = "ろ"
            java.lang.String r14 = "ro"
            r58 = r15
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            java.lang.String r13 = "わ"
            java.lang.String r14 = "wa"
            r59 = r15
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            java.lang.String r13 = "を"
            java.lang.String r14 = "wo"
            r60 = r15
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            java.lang.String r14 = "ん"
            r61 = r15
            java.lang.String r15 = "n"
            vr4 r0 = new vr4
            r0.<init>(r14, r15)
            java.lang.String r14 = "が"
            java.lang.String r15 = "ga"
            r62 = r0
            vr4 r0 = new vr4
            r0.<init>(r14, r15)
            java.lang.String r15 = "ぎ"
            r63 = r0
            java.lang.String r0 = "gi"
            r88 = r1
            vr4 r1 = new vr4
            r1.<init>(r15, r0)
            java.lang.String r0 = "ぐ"
            java.lang.String r15 = "gu"
            r64 = r1
            vr4 r1 = new vr4
            r1.<init>(r0, r15)
            java.lang.String r0 = "げ"
            java.lang.String r15 = "ge"
            r65 = r1
            vr4 r1 = new vr4
            r1.<init>(r0, r15)
            java.lang.String r0 = "ご"
            java.lang.String r15 = "go"
            r66 = r1
            vr4 r1 = new vr4
            r1.<init>(r0, r15)
            java.lang.String r0 = "ざ"
            java.lang.String r15 = "za"
            r67 = r1
            vr4 r1 = new vr4
            r1.<init>(r0, r15)
            java.lang.String r0 = "じ"
            java.lang.String r15 = "ji"
            r68 = r1
            vr4 r1 = new vr4
            r1.<init>(r0, r15)
            java.lang.String r0 = "ず"
            r69 = r1
            java.lang.String r1 = "zu"
            r89 = r6
            vr4 r6 = new vr4
            r6.<init>(r0, r1)
            java.lang.String r0 = "ぜ"
            r70 = r6
            java.lang.String r6 = "ze"
            r90 = r9
            vr4 r9 = new vr4
            r9.<init>(r0, r6)
            java.lang.String r0 = "ぞ"
            java.lang.String r6 = "zo"
            r71 = r9
            vr4 r9 = new vr4
            r9.<init>(r0, r6)
            java.lang.String r0 = "だ"
            java.lang.String r6 = "da"
            r72 = r9
            vr4 r9 = new vr4
            r9.<init>(r0, r6)
            java.lang.String r0 = "ぢ"
            vr4 r6 = new vr4
            r6.<init>(r0, r15)
            java.lang.String r0 = "づ"
            vr4 r15 = new vr4
            r15.<init>(r0, r1)
            java.lang.String r0 = "で"
            java.lang.String r1 = "de"
            r74 = r6
            vr4 r6 = new vr4
            r6.<init>(r0, r1)
            java.lang.String r1 = "ど"
            r76 = r6
            java.lang.String r6 = "do"
            r73 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ば"
            java.lang.String r6 = "ba"
            r77 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "び"
            java.lang.String r6 = "bi"
            r78 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぶ"
            java.lang.String r6 = "bu"
            r79 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "べ"
            java.lang.String r6 = "be"
            r80 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぼ"
            java.lang.String r6 = "bo"
            r81 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぱ"
            java.lang.String r6 = "pa"
            r82 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぴ"
            java.lang.String r6 = "pi"
            r83 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぷ"
            java.lang.String r6 = "pu"
            r84 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぺ"
            java.lang.String r6 = "pe"
            r85 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            java.lang.String r1 = "ぽ"
            java.lang.String r6 = "po"
            r86 = r9
            vr4 r9 = new vr4
            r9.<init>(r1, r6)
            r87 = r9
            r75 = r15
            vr4[] r1 = new defpackage.vr4[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87}
            java.util.Map r1 = defpackage.c14.m0(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r9 = r8.length()
            r15 = 0
        L73a:
            if (r15 >= r9) goto L759
            char r17 = r8.charAt(r15)
            r18 = r9
            java.lang.String r9 = java.lang.String.valueOf(r17)
            java.lang.Object r17 = r1.get(r9)
            java.lang.String r17 = (java.lang.String) r17
            if (r17 != 0) goto L74f
            goto L751
        L74f:
            r9 = r17
        L751:
            r6.append(r9)
            int r15 = r15 + 1
            r9 = r18
            goto L73a
        L759:
            java.lang.String r1 = r6.toString()
            r6 = 0
            boolean r9 = defpackage.xs6.Y(r8, r12, r6)
            if (r9 != 0) goto L7bd
            boolean r2 = defpackage.xs6.Y(r8, r2, r6)
            if (r2 != 0) goto L7bd
            boolean r2 = defpackage.xs6.Y(r8, r4, r6)
            if (r2 != 0) goto L7bd
            boolean r2 = defpackage.xs6.Y(r8, r11, r6)
            if (r2 != 0) goto L7bd
            boolean r2 = defpackage.xs6.Y(r8, r5, r6)
            if (r2 != 0) goto L7bd
            java.lang.String r2 = "ない"
            boolean r2 = defpackage.xs6.Y(r8, r2, r6)
            if (r2 == 0) goto L785
            goto L7bd
        L785:
            boolean r2 = defpackage.xs6.Y(r8, r3, r6)
            if (r2 != 0) goto L7ba
            boolean r2 = defpackage.xs6.Y(r8, r7, r6)
            if (r2 == 0) goto L792
            goto L7ba
        L792:
            boolean r2 = defpackage.xs6.Y(r8, r10, r6)
            if (r2 != 0) goto L7b7
            boolean r2 = defpackage.xs6.Y(r8, r14, r6)
            if (r2 != 0) goto L7b7
            boolean r2 = defpackage.xs6.Y(r8, r13, r6)
            if (r2 != 0) goto L7b7
            r2 = r90
            boolean r2 = defpackage.xs6.Y(r8, r2, r6)
            if (r2 != 0) goto L7b7
            boolean r0 = defpackage.xs6.Y(r8, r0, r6)
            if (r0 == 0) goto L7b3
            goto L7b7
        L7b3:
            java.lang.String r0 = "Существительное / Noun"
        L7b5:
            r11 = r0
            goto L7c0
        L7b7:
            java.lang.String r0 = "Частица / Particle"
            goto L7b5
        L7ba:
            java.lang.String r0 = "Прилагательное / Adj"
            goto L7b5
        L7bd:
            java.lang.String r0 = "Глагол / Verb"
            goto L7b5
        L7c0:
            kp2 r7 = new kp2
            java.lang.String r0 = "Игровой термин / Лексическая единица контекста"
            java.util.List r12 = defpackage.hf.b0(r0)
            r9 = r8
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = r89
            r0.add(r7)
            r2 = r92
            r6 = r0
            r1 = r88
            r0 = r91
            goto L40a
        L7db:
            r0 = r6
            r4 = r1
            goto L898
        L7df:
            r88 = r1
            r0 = r6
            int r9 = r9 + 1
            r6 = r0
            r1 = r88
            r8 = 0
            r0 = r91
            goto L34c
        L7ec:
            r88 = r1
            r0 = r6
            java.lang.String r1 = "[\\s,.:;!?\"'()]+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r16 = 0
            defpackage.qs6.H0(r16)
            r4 = r88
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r5 = r1.find()
            if (r5 != 0) goto L812
            java.lang.String r1 = r4.toString()
            java.util.List r1 = defpackage.hf.b0(r1)
            goto L841
        L812:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r8 = 0
        L818:
            int r3 = r1.start()
            java.lang.CharSequence r3 = r4.subSequence(r8, r3)
            java.lang.String r3 = r3.toString()
            r5.add(r3)
            int r8 = r1.end()
            boolean r3 = r1.find()
            if (r3 != 0) goto L8a4
            int r1 = r4.length()
            java.lang.CharSequence r1 = r4.subSequence(r8, r1)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            r1 = r5
        L841:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L84a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L867
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = defpackage.qs6.v0(r6)
            if (r8 != 0) goto L84a
            int r6 = r6.length()
            if (r6 <= r7) goto L84a
            r3.add(r5)
            goto L84a
        L867:
            java.util.List r1 = defpackage.gt0.e1(r3, r2)
            java.util.Iterator r1 = r1.iterator()
        L86f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L898
            java.lang.Object r2 = r1.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kp2 r5 = new kp2
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r7 = r6.toLowerCase(r2)
            r7.getClass()
            java.lang.String r8 = ""
            java.lang.String r9 = "Слово / Lexeme"
            java.lang.String r2 = "Термин / Игровой контекст"
            java.util.List r10 = defpackage.hf.b0(r2)
            r5.<init>(r6, r7, r8, r9, r10)
            r0.add(r5)
            goto L86f
        L898:
            jp2 r1 = new jp2
            r10 = r91
            java.lang.Object r2 = r10.Z
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r4, r2, r0)
            return r1
        L8a4:
            r10 = r91
            goto L818
        L8a8:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r10.Z
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ошибка сохранения: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r6 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r6)
            r0.show()
            jg7 r0 = defpackage.jg7.a
            return r0
        L8d3:
            r10 = r0
            java.lang.Object r0 = r10.Y
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r10.Z
            xb2 r1 = (defpackage.xb2) r1
            int r2 = r0.length
            int r2 = defpackage.c14.k0(r2)
            r3 = 16
            if (r2 >= r3) goto L8eb
            r2 = r3
        L8eb:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            int r2 = r0.length
            r5 = 0
        L8f2:
            if (r5 >= r2) goto L900
            r8 = r0[r5]
            java.lang.String r10 = r8.toString()
            r4.put(r10, r8)
            int r5 = r5 + 1
            goto L8f2
        L900:
            java.util.Map r0 = r1.t
            r1.t = r4
            java.util.Set r2 = r4.keySet()
            java.lang.Object r5 = r1.o
            monitor-enter(r5)
            java.util.LinkedHashMap r8 = r1.p     // Catch: java.lang.Throwable -> L934
            java.util.Set r8 = r8.keySet()     // Catch: java.lang.Throwable -> L934
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L934
            r16 = 0
        L917:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L934
            if (r10 == 0) goto L937
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L934
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L934
            boolean r11 = r2.contains(r10)     // Catch: java.lang.Throwable -> L934
            if (r11 != 0) goto L917
            r8.remove()     // Catch: java.lang.Throwable -> L934
            java.util.LinkedHashMap r11 = r1.q     // Catch: java.lang.Throwable -> L934
            r11.remove(r10)     // Catch: java.lang.Throwable -> L934
            r16 = r7
            goto L917
        L934:
            r0 = move-exception
            goto La03
        L937:
            if (r16 == 0) goto L93c
            r1.h()     // Catch: java.lang.Throwable -> L934
        L93c:
            monitor-exit(r5)
            if (r16 == 0) goto L942
            r1.w()
        L942:
            java.util.Set r2 = r0.keySet()
            java.util.Set r5 = r4.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r2 = defpackage.ii2.F(r2, r5)
            java.util.Set r4 = r4.keySet()
            java.util.Set r5 = r0.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r4 = defpackage.ii2.F(r4, r5)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L969:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L981
            java.lang.Object r8 = r2.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.get(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L969
            r5.add(r8)
            goto L969
        L981:
            java.util.Set r0 = defpackage.gt0.p1(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r2 = defpackage.gt0.p1(r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.n
            boolean r4 = r4.get()
            if (r4 != 0) goto L995
            goto La00
        L995:
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9ed
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L9a5
            goto L9ed
        L9a5:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L9b0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9d6
            java.lang.Object r0 = r5.next()
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r0)     // Catch: java.lang.Throwable -> L9c1
            goto L9c8
        L9c1:
            r0 = move-exception
            em5 r8 = new em5
            r8.<init>(r0)
            r0 = r8
        L9c8:
            boolean r8 = r0 instanceof defpackage.em5
            if (r8 == 0) goto L9ce
            r0 = r9
        L9ce:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9b0
            r4.add(r0)
            goto L9b0
        L9d6:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9dd
            goto L9ed
        L9dd:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.m
            ip r5 = new ip
            r5.<init>(r1, r4)
            boolean r0 = defpackage.gt0.W0(r0, r5)
            if (r0 == 0) goto L9ed
            r1.t(r7)
        L9ed:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La00
            o41 r0 = r1.h
            xd1 r4 = new xd1
            r4.<init>(r1, r2, r9, r3)
            defpackage.hv.L(r0, r9, r9, r4, r6)
        La00:
            jg7 r0 = defpackage.jg7.a
            return r0
        La03:
            monitor-exit(r5)
            throw r0
        La05:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            sz1 r0 = (defpackage.sz1) r0
            java.lang.Object r1 = r10.Z
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            as0 r3 = defpackage.to7.a(r0)
            xd1 r4 = new xd1
            r4.<init>(r0, r1, r9, r2)
            defpackage.hv.L(r3, r9, r9, r4, r6)
            jg7 r0 = defpackage.jg7.a
            return r0
        La22:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            sz1 r0 = (defpackage.sz1) r0
            zx1 r1 = new zx1
            r1.<init>(r9, r9)
            defpackage.sz1.T(r0, r1)
            o41 r1 = r0.z
            xd1 r2 = new xd1
            java.lang.Object r4 = r10.Z
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r0, r4, r9, r3)
            defpackage.hv.L(r1, r9, r9, r2, r6)
            jg7 r0 = defpackage.jg7.a
            return r0
        La45:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            sz1 r0 = (defpackage.sz1) r0
            zx1 r1 = new zx1
            r1.<init>(r9, r9)
            defpackage.sz1.T(r0, r1)
            o41 r1 = r0.z
            xd1 r2 = new xd1
            java.lang.Object r3 = r10.Z
            android.net.Uri r3 = (android.net.Uri) r3
            r10 = 9
            r2.<init>(r0, r3, r9, r10)
            defpackage.hv.L(r1, r9, r9, r2, r6)
            jg7 r0 = defpackage.jg7.a
            return r0
        La6a:
            r10 = r0
            java.lang.Object r0 = r10.Y
            java.util.List r0 = (java.util.List) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            boolean r1 = r0.isEmpty()
            java.lang.Object r2 = r10.Z
            xa1 r2 = (defpackage.xa1) r2
            tp6 r2 = r2.d
            if (r1 == 0) goto La89
            ma1 r0 = defpackage.ma1.a
            r2.getClass()
            r2.m(r9, r0)
            goto La94
        La89:
            na1 r1 = new na1
            r1.<init>(r0)
            r2.getClass()
            r2.m(r9, r1)
        La94:
            jg7 r0 = defpackage.jg7.a
            return r0
        La97:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Z
            la1 r0 = (defpackage.la1) r0
            tp6 r0 = r0.g
            ea1 r1 = new ea1
            java.lang.Object r2 = r10.Y
            java.util.List r2 = (java.util.List) r2
            r1.<init>(r2)
            r0.getClass()
            r0.m(r9, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        Lab5:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            w61 r0 = (defpackage.w61) r0
            java.lang.Object r1 = r10.Z
            c81 r1 = (defpackage.c81) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.b
            java.lang.Object r2 = r2.getAndSet(r9)
            rc3 r2 = (defpackage.rc3) r2
            java.util.concurrent.atomic.AtomicReference r3 = r1.b
            z r4 = new z
            r5 = 27
            r4.<init>(r2, r1, r9, r5)
            ap6 r0 = defpackage.hv.L(r0, r9, r9, r4, r6)
        Lad8:
            boolean r1 = r3.compareAndSet(r9, r0)
            if (r1 == 0) goto Ladf
            goto Lae6
        Ladf:
            java.lang.Object r1 = r3.get()
            if (r1 == 0) goto Lad8
            r7 = 0
        Lae6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        Laeb:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            ld0 r0 = (defpackage.ld0) r0
            java.lang.Object r1 = r10.Z
            java.lang.String r1 = (java.lang.String) r1
            lg0 r0 = r0.d(r1)
            return r0
        Lafe:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            yk0 r0 = (defpackage.yk0) r0
            if (r0 == 0) goto Lb0d
            r0.o()
        Lb0d:
            java.lang.Object r0 = r10.Z
            pq7 r0 = (defpackage.pq7) r0
            if (r0 == 0) goto Lb16
            r0.a(r9)
        Lb16:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lb19:
            r10 = r0
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r1 = r10.Y
            w61 r1 = (defpackage.w61) r1
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r1 = r10.Z
            e70 r1 = (defpackage.e70) r1
            boolean r2 = r1.h
            if (r2 != 0) goto Lb2e
            goto Lb68
        Lb2e:
            r6 = 0
            r1.h = r6
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb68
            r2.<init>()     // Catch: java.lang.Throwable -> Lb68
            java.util.concurrent.ConcurrentHashMap r3 = r1.e     // Catch: java.lang.Throwable -> Lb68
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> Lb68
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb68
        Lb40:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb68
            if (r4 == 0) goto Lb5c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb68
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lb68
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Lb68
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb68
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lb68
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lb68
            r2.put(r5, r4)     // Catch: java.lang.Throwable -> Lb68
            goto Lb40
        Lb5c:
            java.io.File r1 = r1.c     // Catch: java.lang.Throwable -> Lb68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb68
            r2.getClass()     // Catch: java.lang.Throwable -> Lb68
            defpackage.jc2.F0(r1, r2)     // Catch: java.lang.Throwable -> Lb68
        Lb68:
            return r0
        Lb69:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Z
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r1 = r10.Y
            cv7 r1 = (defpackage.cv7) r1
            bv7 r1 = r1.a
            if (r0 == 0) goto Lb89
            r1.f(r5)
            goto Lb8c
        Lb89:
            r1.a(r5)
        Lb8c:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lb8f:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            bx r0 = (defpackage.bx) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.e
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        Lba2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbb8
            java.lang.Object r1 = r0.next()
            bf0 r1 = (defpackage.bf0) r1
            java.lang.Object r2 = r10.Z
            cx r2 = (defpackage.cx) r2
            int r2 = r2.a
            r1.n(r2)
            goto Lba2
        Lbb8:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lbbb:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            rd r0 = (defpackage.rd) r0
            java.lang.Object r1 = r10.Z
            cx r1 = (defpackage.cx) r1
            int r1 = r1.a
            r0.n(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        Lbd1:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lbe2
            goto Lc2d
        Lbe2:
            java.lang.Object r1 = r10.Z
            kh r1 = (defpackage.kh) r1
            yc1 r0 = defpackage.kh.a(r1, r0)
            java.lang.Object r1 = r0.A
            java.io.File r1 = (java.io.File) r1
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lc24
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            java.lang.Object r0 = r0.B
            bs6 r0 = (defpackage.bs6) r0
            java.lang.String r1 = r1.getName()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r3)
            java.io.InputStream r0 = r0.a(r2, r1)
            e42 r1 = new e42
            java.io.FileDescriptor r2 = r2.getFD()
            r1.<init>(r2, r0)
            byte[] r9 = defpackage.f04.M(r1)     // Catch: java.lang.Throwable -> Lc1c
            r1.close()
            goto Lc2d
        Lc1c:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> Lc1f
        Lc1f:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        Lc24:
            java.lang.String r0 = "file doesn't exist: "
            java.lang.String r1 = r1.getName()
            defpackage.e41.x(r1, r0)
        Lc2d:
            return r9
        Lc2e:
            r10 = r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r92)
            java.lang.Object r0 = r10.Y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r10.Z
            ts4 r1 = (defpackage.ts4) r1
            if (r0 == 0) goto Lc45
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lc45
            goto Lc60
        Lc45:
            java.util.Iterator r2 = r0.iterator()
        Lc49:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc60
            java.lang.Object r3 = r2.next()
            c6 r3 = (defpackage.c6) r3
            long r3 = r3.a
            long r5 = r1.h()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto Lc49
            goto Lc6b
        Lc60:
            java.lang.Object r0 = defpackage.gt0.H0(r0)
            c6 r0 = (defpackage.c6) r0
            long r2 = r0.a
            r1.i(r2)
        Lc6b:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
