package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk1  reason: default package */
/* loaded from: classes.dex */
public final class fk1 implements java.io.Closeable {
    public final java.lang.String A;
    public final long B;
    public final java.util.ArrayList L;
    public final /* synthetic */ defpackage.kk1 R;

    public fk1(defpackage.kk1 r1, java.lang.String r2, long r3, java.util.ArrayList r5, long[] r6) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r6.getClass()
            r0.R = r1
            r0.A = r2
            r0.B = r3
            r0.L = r5
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            java.util.ArrayList r3 = r3.L
            int r0 = r3.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            in6 r2 = (defpackage.in6) r2
            defpackage.yy7.b(r2)
            goto L7
        L15:
            return
    }
}
