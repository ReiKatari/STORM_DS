package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w46  reason: default package */
/* loaded from: classes.dex */
public final class w46 implements defpackage.fu3, java.lang.AutoCloseable {
    public final java.lang.String A;
    public final defpackage.v46 B;
    public boolean L;

    public w46(java.lang.String r1, defpackage.v46 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    public final void e(defpackage.ut3 r2, defpackage.d56 r3) {
            r1 = this;
            r3.getClass()
            r2.getClass()
            boolean r0 = r1.L
            if (r0 != 0) goto L1e
            r0 = 1
            r1.L = r0
            r2.a(r1)
            v46 r2 = r1.B
            s9 r2 = r2.b
            java.lang.Object r2 = r2.e
            gv0 r2 = (defpackage.gv0) r2
            java.lang.String r1 = r1.A
            r3.c(r1, r2)
            return
        L1e:
            java.lang.String r1 = "Already attached to lifecycleOwner"
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r2, defpackage.st3 r3) {
            r1 = this;
            st3 r0 = defpackage.st3.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.L = r3
            ut3 r2 = r2.getLifecycle()
            r2.c(r1)
        Le:
            return
    }
}
