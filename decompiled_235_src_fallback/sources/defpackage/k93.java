package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k93  reason: default package */
/* loaded from: classes.dex */
public final class k93 extends defpackage.e93 {
    public final int A;
    public final int B;
    public boolean L;
    public int R;

    public k93(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.A = r5
            r2.B = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.L = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.R = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            boolean r0 = r0.L
            return r0
    }

    @Override // defpackage.e93
    public final int nextInt() {
            r2 = this;
            int r0 = r2.R
            int r1 = r2.B
            if (r0 != r1) goto L13
            boolean r1 = r2.L
            if (r1 == 0) goto Le
            r1 = 0
            r2.L = r1
            return r0
        Le:
            defpackage.fa6.c()
            r2 = 0
            return r2
        L13:
            int r1 = r2.A
            int r1 = r1 + r0
            r2.R = r1
            return r0
    }
}
