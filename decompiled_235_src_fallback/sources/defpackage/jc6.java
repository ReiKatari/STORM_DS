package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc6  reason: default package */
/* loaded from: classes.dex */
public final class jc6 implements java.lang.Runnable {
    public final defpackage.ku3 A;
    public final defpackage.st3 B;
    public boolean L;

    public jc6(defpackage.ku3 r1, defpackage.st3 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            boolean r0 = r2.L
            if (r0 != 0) goto Le
            ku3 r0 = r2.A
            st3 r1 = r2.B
            r0.f(r1)
            r0 = 1
            r2.L = r0
        Le:
            return
    }
}
