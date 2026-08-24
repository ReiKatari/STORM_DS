package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc6  reason: default package */
/* loaded from: classes.dex */
public final class mc6 implements defpackage.nc6 {
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final defpackage.nc6 b;

    public mc6(defpackage.nc6 r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            r2.b = r3
            return
    }

    @Override // defpackage.nc6
    public final void a(defpackage.rc6 r2, defpackage.oc6 r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.a
            boolean r0 = r0.get()
            if (r0 != 0) goto Ld
            nc6 r1 = r1.b
            r1.a(r2, r3)
        Ld:
            return
    }

    public final void b() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.a
            r0 = 1
            r1.set(r0)
            return
    }
}
