package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu6  reason: default package */
/* loaded from: classes.dex */
public final class tu6 extends defpackage.wu6 {
    public final /* synthetic */ int R;
    public final java.lang.Object X;

    public tu6(defpackage.vm2 r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.R = r0
            r2.getClass()
            r3.getClass()
            r1.<init>(r2, r3)
            dn2 r2 = r2.k(r3)
            r1.X = r2
            return
    }

    public tu6(defpackage.vm2 r2, java.lang.String r3, defpackage.su6 r4) {
            r1 = this;
            r0 = 2
            r1.R = r0
            r2.getClass()
            r3.getClass()
            r1.<init>(r2, r3)
            r1.X = r4
            return
    }

    public tu6(defpackage.vm2 r2, java.lang.String r3, defpackage.uu6 r4) {
            r1 = this;
            r0 = 0
            r1.R = r0
            r2.getClass()
            r3.getClass()
            r1.<init>(r2, r3)
            r1.X = r4
            return
    }

    @Override // defpackage.j36
    public final java.lang.String R(int r5) {
            r4 = this;
            int r0 = r4.R
            r1 = 0
            java.lang.String r2 = "no row"
            r3 = 21
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto La;
            }
        La:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L11:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L18:
            java.lang.Object r4 = r4.X
            uu6 r4 = (defpackage.uu6) r4
            java.lang.String r4 = r4.R(r5)
            return r4
    }

    @Override // defpackage.j36
    public final void c(int r3, long r4) {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            r2.e()
            r2 = 25
            java.lang.String r3 = "column index out of range"
            defpackage.ii2.T(r2, r3)
            r2 = 0
            throw r2
        L13:
            r2.e()
            dn2 r1 = (defpackage.dn2) r1
            r1.c(r3, r4)
            return
        L1c:
            uu6 r1 = (defpackage.uu6) r1
            r1.c(r3, r4)
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            int r0 = r3.R
            java.lang.Object r1 = r3.X
            r2 = 1
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lb;
                default: goto L8;
            }
        L8:
            r3.L = r2
            return
        Lb:
            dn2 r1 = (defpackage.dn2) r1
            r1.close()
            r3.L = r2
            return
        L13:
            uu6 r1 = (defpackage.uu6) r1
            r1.close()
            return
    }

    @Override // defpackage.j36
    public final void d(byte[] r3, int r4) {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            r2.e()
            r2 = 25
            java.lang.String r3 = "column index out of range"
            defpackage.ii2.T(r2, r3)
            r2 = 0
            throw r2
        L13:
            r2.e()
            dn2 r1 = (defpackage.dn2) r1
            r1.d(r3, r4)
            return
        L1c:
            uu6 r1 = (defpackage.uu6) r1
            r1.d(r3, r4)
            return
    }

    @Override // defpackage.j36
    public final void f(int r3) {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            r2.e()
            r2 = 25
            java.lang.String r3 = "column index out of range"
            defpackage.ii2.T(r2, r3)
            r2 = 0
            throw r2
        L13:
            r2.e()
            dn2 r1 = (defpackage.dn2) r1
            r1.f(r3)
            return
        L1c:
            uu6 r1 = (defpackage.uu6) r1
            r1.f(r3)
            return
    }

    @Override // defpackage.j36
    public final boolean f0() {
            r6 = this;
            int r0 = r6.R
            vm2 r1 = r6.A
            java.lang.Object r2 = r6.X
            r3 = 0
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L7f;
                default: goto La;
            }
        La:
            su6 r2 = (defpackage.su6) r2
            int[] r6 = defpackage.vu6.a
            int r0 = r2.ordinal()
            r6 = r6[r0]
            r0 = 1
            if (r6 == r0) goto L78
            r0 = 2
            if (r6 == r0) goto L74
            r0 = 3
            if (r6 == r0) goto L70
            r0 = 4
            if (r6 == r0) goto L6c
            r0 = 5
            if (r6 != r0) goto L68
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            android.database.sqlite.SQLiteDatabase r0 = r1.A
            go3 r2 = defpackage.vm2.X
            java.lang.Object r4 = r2.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L64
            go3 r4 = defpackage.vm2.R
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L64
            java.lang.Object r1 = r2.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.Object r2 = r4.getValue()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            r4 = 0
            java.lang.Object r0 = r2.invoke(r0, r4)
            if (r0 == 0) goto L5e
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r4, r6, r4}
            r1.invoke(r0, r6)
            goto L7e
        L5e:
            java.lang.String r6 = "Required value was null."
            defpackage.i.m(r6)
            goto L7e
        L64:
            r1.e()
            goto L7e
        L68:
            defpackage.i.d()
            goto L7e
        L6c:
            r1.h()
            goto L7e
        L70:
            r1.e()
            goto L7e
        L74:
            r1.n()
            goto L7e
        L78:
            r1.D()
            r1.n()
        L7e:
            return r3
        L7f:
            r6.e()
            dn2 r2 = (defpackage.dn2) r2
            android.database.sqlite.SQLiteStatement r6 = r2.B
            r6.execute()
            return r3
        L8a:
            uu6 r2 = (defpackage.uu6) r2
            boolean r6 = r2.f0()
            java.lang.String r0 = r2.R(r3)
            java.lang.String r2 = "wal"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto La2
            android.database.sqlite.SQLiteDatabase r0 = r1.A
            r0.enableWriteAheadLogging()
            goto La7
        La2:
            android.database.sqlite.SQLiteDatabase r0 = r1.A
            r0.disableWriteAheadLogging()
        La7:
            return r6
    }

    @Override // defpackage.wu6, defpackage.j36
    public void g() {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L14;
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            super.g()
            return
        Lb:
            r2.e()
            dn2 r1 = (defpackage.dn2) r1
            r1.g()
            return
        L14:
            uu6 r1 = (defpackage.uu6) r1
            r1.g()
            return
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int r5) {
            r4 = this;
            int r0 = r4.R
            r1 = 0
            java.lang.String r2 = "no row"
            r3 = 21
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto La;
            }
        La:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L11:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L18:
            java.lang.Object r4 = r4.X
            uu6 r4 = (defpackage.uu6) r4
            byte[] r4 = r4.getBlob(r5)
            return r4
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
            r2 = this;
            int r0 = r2.R
            r1 = 0
            switch(r0) {
                case 0: goto Le;
                case 1: goto La;
                default: goto L6;
            }
        L6:
            r2.e()
            return r1
        La:
            r2.e()
            return r1
        Le:
            java.lang.Object r2 = r2.X
            uu6 r2 = (defpackage.uu6) r2
            int r2 = r2.getColumnCount()
            return r2
    }

    @Override // defpackage.j36
    public final java.lang.String getColumnName(int r5) {
            r4 = this;
            int r0 = r4.R
            r1 = 0
            java.lang.String r2 = "no row"
            r3 = 21
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto La;
            }
        La:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L11:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L18:
            java.lang.Object r4 = r4.X
            uu6 r4 = (defpackage.uu6) r4
            java.lang.String r4 = r4.getColumnName(r5)
            return r4
    }

    @Override // defpackage.j36
    public final long getLong(int r5) {
            r4 = this;
            int r0 = r4.R
            r1 = 0
            java.lang.String r2 = "no row"
            r3 = 21
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto La;
            }
        La:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L11:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L18:
            java.lang.Object r4 = r4.X
            uu6 r4 = (defpackage.uu6) r4
            long r4 = r4.getLong(r5)
            return r4
    }

    @Override // defpackage.j36
    public final boolean isNull(int r5) {
            r4 = this;
            int r0 = r4.R
            r1 = 0
            java.lang.String r2 = "no row"
            r3 = 21
            switch(r0) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto La;
            }
        La:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L11:
            r4.e()
            defpackage.ii2.T(r3, r2)
            throw r1
        L18:
            java.lang.Object r4 = r4.X
            uu6 r4 = (defpackage.uu6) r4
            boolean r4 = r4.isNull(r5)
            return r4
    }

    @Override // defpackage.wu6, defpackage.j36
    public void reset() {
            r1 = this;
            int r0 = r1.R
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.reset()
            return
        L9:
            java.lang.Object r1 = r1.X
            uu6 r1 = (defpackage.uu6) r1
            r1.reset()
            return
    }

    @Override // defpackage.j36
    public final void w(int r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L22;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            r4.getClass()
            r2.e()
            r2 = 25
            java.lang.String r3 = "column index out of range"
            defpackage.ii2.T(r2, r3)
            r2 = 0
            throw r2
        L16:
            r4.getClass()
            r2.e()
            dn2 r1 = (defpackage.dn2) r1
            r1.m(r3, r4)
            return
        L22:
            r4.getClass()
            uu6 r1 = (defpackage.uu6) r1
            r1.w(r3, r4)
            return
    }

    @Override // defpackage.j36
    public boolean z() {
            r1 = this;
            int r0 = r1.R
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.z()
            return r1
        La:
            java.lang.Object r1 = r1.X
            uu6 r1 = (defpackage.uu6) r1
            boolean r1 = r1.z()
            return r1
    }
}
