package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q36  reason: default package */
/* loaded from: classes.dex */
public final class q36 extends defpackage.r36 implements java.util.Iterator {
    public defpackage.p36 A;
    public boolean B;
    public final /* synthetic */ defpackage.s36 L;

    public q36(defpackage.s36 r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r1 = 1
            r0.B = r1
            return
    }

    @Override // defpackage.r36
    public final void a(defpackage.p36 r2) {
            r1 = this;
            p36 r0 = r1.A
            if (r2 != r0) goto Lf
            p36 r2 = r0.R
            r1.A = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.B = r2
        Lf:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto Lb
            s36 r1 = r1.L
            p36 r1 = r1.A
            if (r1 == 0) goto L15
            goto L13
        Lb:
            p36 r1 = r1.A
            if (r1 == 0) goto L15
            p36 r1 = r1.L
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.B
            if (r0 == 0) goto Le
            r0 = 0
            r1.B = r0
            s36 r0 = r1.L
            p36 r0 = r0.A
            r1.A = r0
            goto L18
        Le:
            p36 r0 = r1.A
            if (r0 == 0) goto L15
            p36 r0 = r0.L
            goto L16
        L15:
            r0 = 0
        L16:
            r1.A = r0
        L18:
            p36 r1 = r1.A
            return r1
    }
}
