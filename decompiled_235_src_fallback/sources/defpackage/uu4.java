package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu4  reason: default package */
/* loaded from: classes.dex */
public final class uu4 implements defpackage.bj5 {
    public final java.util.Set A;
    public final defpackage.ua4 B;

    public uu4(java.util.Set r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            ua4 r2 = new ua4
            r0 = 16
            br2[] r0 = new defpackage.br2[r0]
            r2.<init>(r0)
            r1.B = r2
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r0 = this;
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r5 = this;
            ua4 r0 = r5.B
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            r2 = 0
        L7:
            if (r2 >= r0) goto L1a
            r3 = r1[r2]
            br2 r3 = (defpackage.br2) r3
            bj5 r3 = r3.a
            java.util.Set r4 = r5.A
            r4.remove(r3)
            r3.c()
            int r2 = r2 + 1
            goto L7
        L1a:
            return
    }
}
