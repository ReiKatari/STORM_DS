package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht1  reason: default package */
/* loaded from: classes.dex */
public final class ht1 implements defpackage.gt1 {
    public final int A;
    public int B;
    public int L;

    public ht1(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.B = r0
            r1.L = r0
            r1.A = r2
            return
    }

    @Override // defpackage.gt1
    public final java.lang.Object d() {
            r0 = this;
            return r0
    }

    @Override // defpackage.gt1
    public final boolean m(java.lang.CharSequence r1, int r2, int r3, defpackage.re7 r4) {
            r0 = this;
            r1 = 0
            int r4 = r0.A
            if (r2 > r4) goto Lc
            if (r4 >= r3) goto Lc
            r0.B = r2
            r0.L = r3
            return r1
        Lc:
            if (r3 > r4) goto L10
            r0 = 1
            return r0
        L10:
            return r1
    }
}
