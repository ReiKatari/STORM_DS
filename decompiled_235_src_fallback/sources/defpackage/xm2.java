package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm2  reason: default package */
/* loaded from: classes.dex */
public final class xm2 extends java.lang.RuntimeException {
    public final defpackage.ym2 A;
    public final java.lang.Throwable B;

    public xm2(defpackage.ym2 r1, java.lang.Throwable r2) {
            r0 = this;
            r1.getClass()
            r0.<init>(r2)
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
            r0 = this;
            java.lang.Throwable r0 = r0.B
            return r0
    }
}
