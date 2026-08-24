package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jh2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jh2 implements defpackage.no2 {
    public final /* synthetic */ defpackage.qn2 A;

    public jh2(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.no2
    public final defpackage.ao2 b() {
            r0 = this;
            qn2 r0 = r0.A
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.jh2
            if (r0 == 0) goto L11
            no2 r2 = (defpackage.no2) r2
            ao2 r2 = r2.b()
            qn2 r1 = r1.A
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            qn2 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }
}
