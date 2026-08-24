package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l57  reason: default package */
/* loaded from: classes.dex */
public final class l57 implements defpackage.j61 {
    public final java.lang.Object A;
    public final java.lang.ThreadLocal B;
    public final defpackage.n57 L;

    public l57(java.lang.Object r1, java.lang.ThreadLocal r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            n57 r1 = new n57
            r1.<init>(r2)
            r0.L = r1
            return
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r2) {
            r1 = this;
            n57 r0 = r1.L
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La
            vt1 r1 = defpackage.vt1.A
        La:
            return r1
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r1) {
            r0 = this;
            l61 r0 = defpackage.jw2.y(r0, r1)
            return r0
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r2) {
            r1 = this;
            n57 r0 = r1.L
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final void a(java.lang.Object r1) {
            r0 = this;
            java.lang.ThreadLocal r0 = r0.B
            r0.set(r1)
            return
    }

    public final java.lang.Object b() {
            r2 = this;
            java.lang.ThreadLocal r0 = r2.B
            java.lang.Object r1 = r0.get()
            java.lang.Object r2 = r2.A
            r0.set(r2)
            return r1
    }

    @Override // defpackage.j61
    public final defpackage.k61 getKey() {
            r0 = this;
            n57 r0 = r0.L
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ThreadLocal(value="
            r0.<init>(r1)
            java.lang.Object r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            r0.append(r1)
            java.lang.ThreadLocal r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r1.o(r2, r0)
            return r0
    }
}
