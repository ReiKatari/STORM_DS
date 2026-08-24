package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu6  reason: default package */
/* loaded from: classes.dex */
public abstract class wu6 implements defpackage.j36 {
    public final defpackage.vm2 A;
    public final java.lang.String B;
    public boolean L;

    public wu6(defpackage.vm2 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    public final void e() {
            r1 = this;
            boolean r1 = r1.L
            if (r1 != 0) goto L5
            return
        L5:
            r1 = 21
            java.lang.String r0 = "statement is closed"
            defpackage.ii2.T(r1, r0)
            r1 = 0
            throw r1
    }

    @Override // defpackage.j36
    public void g() {
            r0 = this;
            r0.e()
            return
    }

    @Override // defpackage.j36
    public void reset() {
            r0 = this;
            r0.e()
            return
    }
}
