package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg4  reason: default package */
/* loaded from: classes.dex */
public final class kg4 extends defpackage.r0 implements defpackage.rc3 {
    public static final defpackage.kg4 B = null;

    static {
            kg4 r0 = new kg4
            vs0 r1 = defpackage.vs0.h0
            r0.<init>(r1)
            defpackage.kg4.B = r0
            return
    }

    @Override // defpackage.rc3
    public final defpackage.m44 U() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This job is always active"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.rc3
    public final defpackage.il1 a0(defpackage.qn2 r1) {
            r0 = this;
            lg4 r0 = defpackage.lg4.A
            return r0
    }

    @Override // defpackage.rc3
    public final java.lang.Object c0(defpackage.s41 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.rc3
    public final boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.rc3
    public final defpackage.il1 e0(boolean r1, boolean r2, defpackage.a0 r3) {
            r0 = this;
            lg4 r0 = defpackage.lg4.A
            return r0
    }

    @Override // defpackage.rc3
    public final void h(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    @Override // defpackage.rc3
    public final boolean isCancelled() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.rc3
    public final defpackage.hq0 r(defpackage.ed3 r1) {
            r0 = this;
            lg4 r0 = defpackage.lg4.A
            return r0
    }

    @Override // defpackage.rc3
    public final boolean start() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "NonCancellable"
            return r0
    }

    @Override // defpackage.rc3
    public final java.util.concurrent.CancellationException v() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This job is always active"
            r1.<init>(r0)
            throw r1
    }
}
