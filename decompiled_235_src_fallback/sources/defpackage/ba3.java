package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba3  reason: default package */
/* loaded from: classes.dex */
public final class ba3 extends defpackage.dt0 {
    public final defpackage.cd4 q;

    public ba3(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            cd4 r0 = new cd4
            r0.<init>(r2)
            r1.q = r0
            return
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.Object r0 = r1.get(r2)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L11
            java.util.List r0 = (java.util.List) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "List<"
            r0.<init>(r1)
            cd4 r2 = r2.q
            java.lang.Class r2 = r2.r
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "}>"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.fd4
    public final java.lang.Object c(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            cd4 r0 = r0.q
            if (r1 == 0) goto L13
            java.lang.Enum r0 = r0.h(r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            java.util.ArrayList r0 = defpackage.gt0.V0(r1, r0)
            return r0
        L13:
            java.lang.Enum r0 = r0.h(r2)
            java.util.List r0 = defpackage.hf.b0(r0)
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r1) {
            r0 = this;
            cd4 r0 = r0.q
            java.lang.Enum r0 = r0.h(r1)
            java.util.List r0 = defpackage.hf.b0(r0)
            return r0
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.util.List r3 = (java.util.List) r3
            r2.getClass()
            if (r3 == 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.putSerializable(r2, r0)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.ba3
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ba3 r2 = (defpackage.ba3) r2
            cd4 r2 = r2.q
            cd4 r1 = r1.q
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    @Override // defpackage.dt0
    public final /* bridge */ /* synthetic */ java.lang.Object g() {
            r0 = this;
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    @Override // defpackage.dt0
    public final java.util.List h(java.lang.Object r2) {
            r1 = this;
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L28
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r2, r0)
            r1.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.String r0 = r0.toString()
            r1.add(r0)
            goto L13
        L27:
            return r1
        L28:
            yt1 r1 = defpackage.yt1.A
            return r1
    }

    public final int hashCode() {
            r0 = this;
            cd4 r0 = r0.q
            java.lang.Class r0 = r0.q
            int r0 = r0.hashCode()
            return r0
    }
}
