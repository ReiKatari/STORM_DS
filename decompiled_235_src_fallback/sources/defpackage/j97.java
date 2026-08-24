package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j97  reason: default package */
/* loaded from: classes.dex */
public final class j97 implements defpackage.dx6, defpackage.pj7, defpackage.ll7, defpackage.rt7 {
    public final /* synthetic */ int A;
    public java.lang.Object B;

    public j97() {
            r2 = this;
            r0 = 9
            r2.A = r0
            r2.<init>()
            bg1 r0 = new bg1
            r1 = 0
            r0.<init>(r1)
            r2.B = r0
            return
    }

    public j97(float r3, float r4) {
            r2 = this;
            r0 = 6
            r2.A = r0
            r2.<init>()
            de2 r0 = new de2
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0.<init>(r3, r4, r1)
            r2.B = r0
            return
    }

    public j97(float r2, float r3, defpackage.ap r4) {
            r1 = this;
            r0 = 8
            r1.A = r0
            int[] r0 = defpackage.jl7.a
            if (r4 == 0) goto Le
            j97 r0 = new j97
            r0.<init>(r4, r2, r3)
            goto L13
        Le:
            j97 r0 = new j97
            r0.<init>(r2, r3)
        L13:
            r1.<init>()
            eb r2 = new eb
            r3 = 25
            r2.<init>(r0, r3)
            r1.B = r2
            return
    }

    public /* synthetic */ j97(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public j97(defpackage.ap r6, float r7, float r8) {
            r5 = this;
            r0 = 5
            r5.A = r0
            r5.<init>()
            int r0 = r6.b()
            de2[] r1 = new defpackage.de2[r0]
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            de2 r3 = new de2
            float r4 = r6.a(r2)
            r3.<init>(r7, r8, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Ld
        L1d:
            r5.B = r1
            return
    }

    public /* synthetic */ j97(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public j97(defpackage.jh0 r1, defpackage.cf0 r2, defpackage.lb3 r3) {
            r0 = this;
            r2 = 4
            r0.A = r2
            r0.<init>()
            r0.B = r1
            t46 r1 = new t46
            r2 = 19
            r1.<init>(r0, r2)
            ex6 r0 = new ex6
            r0.<init>(r1)
            return
    }

    public j97(defpackage.o46 r2) {
            r1 = this;
            r0 = 12
            r1.A = r0
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.B = r0
            return
    }

    public j97(defpackage.ov7 r1, defpackage.gt7 r2, defpackage.yj7 r3) {
            r0 = this;
            r1 = 14
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // defpackage.ll7, defpackage.il7
    public boolean a() {
            r0 = this;
            java.lang.Object r0 = r0.B
            eb r0 = (defpackage.eb) r0
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // defpackage.il7
    public long b(defpackage.ap r1, defpackage.ap r2, defpackage.ap r3) {
            r0 = this;
            java.lang.Object r0 = r0.B
            eb r0 = (defpackage.eb) r0
            long r0 = r0.b(r1, r2, r3)
            return r0
    }

    public long c(long r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            bg1 r2 = (defpackage.bg1) r2
            r2.getClass()
            float r0 = defpackage.ol7.b(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            float r0 = defpackage.ol7.c(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto L2e
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "maximumVelocity should be a positive value. You specified="
            r0.<init>(r1)
            java.lang.String r1 = defpackage.ol7.g(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.c(r0)
        L2e:
            java.lang.Object r0 = r2.B
            rl7 r0 = (defpackage.rl7) r0
            float r1 = defpackage.ol7.b(r3)
            float r0 = r0.b(r1)
            java.lang.Object r2 = r2.L
            rl7 r2 = (defpackage.rl7) r2
            float r3 = defpackage.ol7.c(r3)
            float r2 = r2.b(r3)
            long r2 = defpackage.qo2.k(r0, r2)
            return r2
    }

    public java.lang.Object d(defpackage.ee3 r4, java.lang.reflect.Type r5) {
            r3 = this;
            java.lang.Object r3 = r3.B
            yb7 r3 = (defpackage.yb7) r3
            su2 r3 = r3.c
            r3.getClass()
            ie7 r0 = new ie7
            r0.<init>(r5)
            rf3 r5 = new rf3
            nf3 r1 = defpackage.rf3.q0
            r5.<init>(r1)
            r1 = 32
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r5.m0 = r2
            r2 = 0
            r5.n0 = r2
            java.lang.String[] r2 = new java.lang.String[r1]
            r5.o0 = r2
            int[] r1 = new int[r1]
            r5.p0 = r1
            r5.E0(r4)
            java.lang.Object r3 = r3.a(r5, r0)
            return r3
    }

    public defpackage.xd2 e(int r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 5: goto Lf;
                case 6: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            xd2 r1 = (defpackage.xd2) r1
            return r1
        La:
            java.lang.Object r1 = r1.B
            de2 r1 = (defpackage.de2) r1
            return r1
        Lf:
            java.lang.Object r1 = r1.B
            de2[] r1 = (defpackage.de2[]) r1
            r1 = r1[r2]
            return r1
    }

    @Override // defpackage.il7
    public defpackage.ap h(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            java.lang.Object r6 = r6.B
            r0 = r6
            eb r0 = (defpackage.eb) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            ap r6 = r0.h(r1, r3, r4, r5)
            return r6
    }

    @Override // defpackage.dx6
    public java.lang.Object n() {
            r5 = this;
            int r0 = r5.A
            java.lang.Object r5 = r5.B
            switch(r0) {
                case 3: goto L4b;
                default: goto L7;
            }
        L7:
            eb r5 = (defpackage.eb) r5
            java.lang.Object r0 = r5.L
            i36 r0 = (defpackage.i36) r0
            android.database.sqlite.SQLiteDatabase r0 = r0.e()
            r0.beginTransaction()
            java.lang.String r1 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L46
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch: java.lang.Throwable -> L46
            xd5 r3 = defpackage.xd5.n0     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = defpackage.i36.u(r1, r3)     // Catch: java.lang.Throwable -> L46
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L46
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L46
            r0.endTransaction()
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            fz r1 = (defpackage.fz) r1
            java.lang.Object r3 = r5.R
            bt r3 = (defpackage.bt) r3
            r4 = 1
            r3.U(r1, r4, r2)
            goto L2f
        L44:
            r5 = 0
            return r5
        L46:
            r5 = move-exception
            r0.endTransaction()
            throw r5
        L4b:
            i36 r5 = (defpackage.i36) r5
            wr0 r0 = r5.B
            long r0 = r0.a()
            iy r2 = r5.R
            long r2 = r2.d
            long r0 = r0 - r2
            android.database.sqlite.SQLiteDatabase r5 = r5.e()
            r5.beginTransaction()
            java.lang.String r2 = "events"
            java.lang.String r3 = "timestamp_ms < ?"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L7a
            int r0 = r5.delete(r2, r3, r0)     // Catch: java.lang.Throwable -> L7a
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L7a
            r5.endTransaction()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L7a:
            r0 = move-exception
            r5.endTransaction()
            throw r0
    }

    @Override // defpackage.il7
    public defpackage.ap q(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            java.lang.Object r6 = r6.B
            r0 = r6
            eb r0 = (defpackage.eb) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            ap r6 = r0.q(r1, r3, r4, r5)
            return r6
    }

    @Override // defpackage.il7
    public defpackage.ap r(defpackage.ap r1, defpackage.ap r2, defpackage.ap r3) {
            r0 = this;
            java.lang.Object r0 = r0.B
            eb r0 = (defpackage.eb) r0
            ap r0 = r0.r(r1, r2, r3)
            return r0
    }
}
