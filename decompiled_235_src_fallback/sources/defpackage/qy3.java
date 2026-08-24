package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy3  reason: default package */
/* loaded from: classes.dex */
public final class qy3 extends java.io.Writer {
    public final /* synthetic */ int A;
    public final java.lang.StringBuilder B;
    public final java.lang.CharSequence L;

    public qy3() {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.B = r0
            java.lang.String r0 = "FragmentManager"
            r2.L = r0
            return
    }

    public qy3(java.lang.StringBuilder r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            js6 r0 = new js6
            r0.<init>()
            r1.L = r0
            r1.B = r2
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.io.Writer r1 = super.append(r2)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.B
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.io.Writer r1 = super.append(r2, r3, r4)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.B
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Appendable r1 = super.append(r2)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.B
            r0.append(r2)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Appendable r1 = super.append(r2, r3, r4)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.B
            r0.append(r2, r3, r4)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r1 = r1.B
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L10
            java.io.Closeable r1 = (java.io.Closeable) r1
            r1.close()
        L10:
            return
        L11:
            r1.e()
            return
    }

    public void e() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.B
            int r1 = r0.length()
            if (r1 <= 0) goto L1b
            java.lang.CharSequence r2 = r2.L
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r0.toString()
            android.util.Log.d(r2, r1)
            r2 = 0
            int r1 = r0.length()
            r0.delete(r2, r1)
        L1b:
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r1 = r1.B
            boolean r0 = r1 instanceof java.io.Flushable
            if (r0 == 0) goto L10
            java.io.Flushable r1 = (java.io.Flushable) r1
            r1.flush()
        L10:
            return
        L11:
            r1.e()
            return
    }

    @Override // java.io.Writer
    public void write(int r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.write(r2)
            return
        L9:
            java.lang.StringBuilder r1 = r1.B
            char r2 = (char) r2
            r1.append(r2)
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.write(r2, r3, r4)
            return
        L9:
            java.util.Objects.requireNonNull(r2)
            java.lang.StringBuilder r1 = r1.B
            int r4 = r4 + r3
            r1.append(r2, r3, r4)
            return
    }

    @Override // java.io.Writer
    public final void write(char[] r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.A
            java.lang.StringBuilder r1 = r4.B
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            java.lang.CharSequence r4 = r4.L
            js6 r4 = (defpackage.js6) r4
            r4.A = r5
            r5 = 0
            r4.B = r5
            int r7 = r7 + r6
            r1.append(r4, r6, r7)
            return
        L15:
            r0 = 0
        L16:
            if (r0 >= r7) goto L2a
            int r2 = r6 + r0
            char r2 = r5[r2]
            r3 = 10
            if (r2 != r3) goto L24
            r4.e()
            goto L27
        L24:
            r1.append(r2)
        L27:
            int r0 = r0 + 1
            goto L16
        L2a:
            return
    }
}
