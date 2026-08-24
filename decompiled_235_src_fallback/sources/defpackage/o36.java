package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o36  reason: default package */
/* loaded from: classes.dex */
public final class o36 extends defpackage.r36 implements java.util.Iterator {
    public defpackage.p36 A;
    public defpackage.p36 B;
    public final /* synthetic */ int L;

    public o36(defpackage.p36 r1, defpackage.p36 r2, int r3) {
            r0 = this;
            r0.L = r3
            r0.<init>()
            r0.A = r2
            r0.B = r1
            return
    }

    @Override // defpackage.r36
    public final void a(defpackage.p36 r4) {
            r3 = this;
            p36 r0 = r3.A
            r1 = 0
            if (r0 != r4) goto Ld
            p36 r0 = r3.B
            if (r4 != r0) goto Ld
            r3.B = r1
            r3.A = r1
        Ld:
            p36 r0 = r3.A
            if (r0 != r4) goto L1d
            int r2 = r3.L
            switch(r2) {
                case 0: goto L19;
                default: goto L16;
            }
        L16:
            p36 r0 = r0.L
            goto L1b
        L19:
            p36 r0 = r0.R
        L1b:
            r3.A = r0
        L1d:
            p36 r0 = r3.B
            if (r0 != r4) goto L2e
            p36 r4 = r3.A
            if (r0 == r4) goto L2c
            if (r4 != 0) goto L28
            goto L2c
        L28:
            p36 r1 = r3.b(r0)
        L2c:
            r3.B = r1
        L2e:
            return
    }

    public final defpackage.p36 b(defpackage.p36 r1) {
            r0 = this;
            int r0 = r0.L
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            p36 r0 = r1.R
            return r0
        L8:
            p36 r0 = r1.L
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            p36 r0 = r0.B
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            p36 r0 = r2.B
            p36 r1 = r2.A
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            p36 r1 = r2.b(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.B = r1
            return r0
    }
}
