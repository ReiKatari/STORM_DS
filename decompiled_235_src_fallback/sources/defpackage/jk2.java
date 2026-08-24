package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk2  reason: default package */
/* loaded from: classes.dex */
public abstract class jk2 implements defpackage.ui6 {
    public final defpackage.ui6 A;

    public jk2(defpackage.ui6 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.ui6
    public void O(defpackage.k80 r1, long r2) {
            r0 = this;
            ui6 r0 = r0.A
            r0.O(r1, r2)
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            ui6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            ui6 r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.ui6, java.io.Flushable
    public void flush() {
            r0 = this;
            ui6 r0 = r0.A
            r0.flush()
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
            ui6 r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
