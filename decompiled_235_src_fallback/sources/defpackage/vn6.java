package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn6  reason: default package */
/* loaded from: classes.dex */
public final class vn6 extends defpackage.e93 {
    public int A;
    public final /* synthetic */ defpackage.un6 B;

    public vn6(defpackage.un6 r1) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.A
            un6 r1 = r1.B
            int r1 = r1.f()
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // defpackage.e93
    public final int nextInt() {
            r2 = this;
            int r0 = r2.A
            int r1 = r0 + 1
            r2.A = r1
            un6 r2 = r2.B
            int r2 = r2.d(r0)
            return r2
    }
}
