package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc7  reason: default package */
/* loaded from: classes.dex */
public final class dc7 extends defpackage.bc7 {
    public final defpackage.dw4 R;

    public dc7(defpackage.dw4 r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.L
            int r1 = r0 + 2
            r4.L = r1
            w94 r1 = new w94
            java.lang.Object[] r2 = r4.A
            r3 = r2[r0]
            int r0 = r0 + 1
            r0 = r2[r0]
            dw4 r4 = r4.R
            r1.<init>(r4, r3, r0)
            return r1
    }
}
