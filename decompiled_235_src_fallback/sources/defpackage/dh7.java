package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh7  reason: default package */
/* loaded from: classes.dex */
public final class dh7 extends defpackage.fh7 {
    public final /* synthetic */ int b;

    public /* synthetic */ dh7(sun.misc.Unsafe r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fh7
    public final boolean c(long r3, java.lang.Object r5) {
            r2 = this;
            int r2 = r2.b
            switch(r2) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            boolean r2 = defpackage.gh7.h
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L13
            byte r2 = defpackage.gh7.g(r3, r5)
            if (r2 == 0) goto L1a
        L11:
            r0 = r1
            goto L1a
        L13:
            byte r2 = defpackage.gh7.h(r3, r5)
            if (r2 == 0) goto L1a
            goto L11
        L1a:
            return r0
        L1b:
            boolean r2 = defpackage.gh7.h
            r0 = 0
            r1 = 1
            if (r2 == 0) goto L29
            byte r2 = defpackage.gh7.g(r3, r5)
            if (r2 == 0) goto L30
        L27:
            r0 = r1
            goto L30
        L29:
            byte r2 = defpackage.gh7.h(r3, r5)
            if (r2 == 0) goto L30
            goto L27
        L30:
            return r0
    }

    @Override // defpackage.fh7
    public final byte d(long r1, java.lang.Object r3) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto Le
            byte r0 = defpackage.gh7.g(r1, r3)
            goto L12
        Le:
            byte r0 = defpackage.gh7.h(r1, r3)
        L12:
            return r0
        L13:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto L1c
            byte r0 = defpackage.gh7.g(r1, r3)
            goto L20
        L1c:
            byte r0 = defpackage.gh7.h(r1, r3)
        L20:
            return r0
    }

    @Override // defpackage.fh7
    public final double e(long r2, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            long r1 = r1.h(r2, r4)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            return r1
        Le:
            long r1 = r1.h(r2, r4)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            return r1
    }

    @Override // defpackage.fh7
    public final float f(long r2, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            int r1 = r1.g(r2, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
        Le:
            int r1 = r1.g(r2, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    @Override // defpackage.fh7
    public final void k(java.lang.Object r1, long r2, boolean r4) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto Le
            byte r0 = (byte) r4
            defpackage.gh7.k(r1, r2, r0)
            goto L12
        Le:
            byte r0 = (byte) r4
            defpackage.gh7.l(r1, r2, r0)
        L12:
            return
        L13:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto L1c
            byte r0 = (byte) r4
            defpackage.gh7.k(r1, r2, r0)
            goto L20
        L1c:
            byte r0 = (byte) r4
            defpackage.gh7.l(r1, r2, r0)
        L20:
            return
    }

    @Override // defpackage.fh7
    public final void l(java.lang.Object r1, long r2, byte r4) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto Ld
            defpackage.gh7.k(r1, r2, r4)
            goto L10
        Ld:
            defpackage.gh7.l(r1, r2, r4)
        L10:
            return
        L11:
            boolean r0 = defpackage.gh7.h
            if (r0 == 0) goto L19
            defpackage.gh7.k(r1, r2, r4)
            goto L1c
        L19:
            defpackage.gh7.l(r1, r2, r4)
        L1c:
            return
    }

    @Override // defpackage.fh7
    public final void m(java.lang.Object r7, long r8, double r10) {
            r6 = this;
            int r0 = r6.b
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            long r10 = java.lang.Double.doubleToLongBits(r10)
            r6.p(r7, r8, r10)
            return
        Ld:
            long r4 = java.lang.Double.doubleToLongBits(r10)
            r0 = r6
            r1 = r7
            r2 = r8
            r0.p(r1, r2, r4)
            return
    }

    @Override // defpackage.fh7
    public final void n(java.lang.Object r2, long r3, float r5) {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            int r5 = java.lang.Float.floatToIntBits(r5)
            r1.o(r2, r3, r5)
            return
        Ld:
            int r5 = java.lang.Float.floatToIntBits(r5)
            r1.o(r2, r3, r5)
            return
    }
}
