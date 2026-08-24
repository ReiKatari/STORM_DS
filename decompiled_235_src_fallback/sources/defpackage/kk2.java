package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk2  reason: default package */
/* loaded from: classes.dex */
public abstract class kk2 implements defpackage.in6 {
    public final defpackage.in6 A;

    public kk2(defpackage.in6 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            in6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.in6
    public long b0(defpackage.k80 r1, long r2) {
            r0 = this;
            r1.getClass()
            in6 r0 = r0.A
            long r0 = r0.b0(r1, r2)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            in6 r0 = r0.A
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            in6 r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
