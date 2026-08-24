package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn2  reason: default package */
/* loaded from: classes.dex */
public final class bn2 implements defpackage.pu6 {
    public final android.content.Context A;
    public final java.lang.String B;
    public final defpackage.zb L;
    public final boolean R;
    public final boolean X;
    public final defpackage.ex6 Y;
    public boolean Z;

    public bn2(android.content.Context r1, java.lang.String r2, defpackage.zb r3, boolean r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            a5 r1 = new a5
            r2 = 28
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.Y = r2
            return
    }

    @Override // defpackage.pu6
    public final defpackage.vm2 G() {
            r1 = this;
            ex6 r1 = r1.Y
            java.lang.Object r1 = r1.getValue()
            an2 r1 = (defpackage.an2) r1
            r0 = 0
            vm2 r1 = r1.e(r0)
            return r1
    }

    @Override // defpackage.pu6
    public final defpackage.vm2 I() {
            r1 = this;
            ex6 r1 = r1.Y
            java.lang.Object r1 = r1.getValue()
            an2 r1 = (defpackage.an2) r1
            r0 = 1
            vm2 r1 = r1.e(r0)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            ex6 r1 = r1.Y
            boolean r0 = r1.a()
            if (r0 == 0) goto L11
            java.lang.Object r1 = r1.getValue()
            an2 r1 = (defpackage.an2) r1
            r1.close()
        L11:
            return
    }

    @Override // defpackage.pu6
    public final java.lang.String getDatabaseName() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // defpackage.pu6
    public final void setWriteAheadLoggingEnabled(boolean r3) {
            r2 = this;
            ex6 r0 = r2.Y
            boolean r1 = r0.a()
            if (r1 == 0) goto L11
            java.lang.Object r0 = r0.getValue()
            an2 r0 = (defpackage.an2) r0
            r0.setWriteAheadLoggingEnabled(r3)
        L11:
            r2.Z = r3
            return
    }
}
