package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz  reason: default package */
/* loaded from: classes.dex */
public final class pz implements defpackage.lj0 {
    public final defpackage.oz[] A;

    public pz(defpackage.oz[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final void a() {
            r3 = this;
            oz[] r3 = r3.A
            int r0 = r3.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L19
            r2 = r3[r1]
            il1 r2 = r2.e0
            if (r2 == 0) goto L12
            r2.dispose()
            int r1 = r1 + 1
            goto L4
        L12:
            java.lang.String r3 = "handle"
            defpackage.nb3.a0(r3)
            r3 = 0
            throw r3
        L19:
            return
    }

    @Override // defpackage.lj0
    public final void b(java.lang.Throwable r1) {
            r0 = this;
            r0.a()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeHandlersOnCancel["
            r0.<init>(r1)
            oz[] r2 = r2.A
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
