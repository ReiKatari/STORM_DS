package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el1  reason: default package */
/* loaded from: classes.dex */
public final class el1 implements defpackage.bj5 {
    public final defpackage.qn2 A;
    public defpackage.fl1 B;

    public el1(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r1 = this;
            fl1 r0 = r1.B
            if (r0 == 0) goto L7
            r0.dispose()
        L7:
            r0 = 0
            r1.B = r0
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r2 = this;
            qn2 r0 = r2.A
            gl1 r1 = defpackage.mb3.r
            java.lang.Object r0 = r0.g(r1)
            fl1 r0 = (defpackage.fl1) r0
            r2.B = r0
            return
    }
}
