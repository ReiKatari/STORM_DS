package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r33  reason: default package */
/* loaded from: classes.dex */
public final class r33 extends defpackage.z0 {
    public final defpackage.h1 A;
    public final int B;
    public final int L;

    public r33(defpackage.h1 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            int r1 = r1.a()
            defpackage.np2.z(r2, r3, r1)
            int r3 = r3 - r2
            r0.L = r3
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.L
            defpackage.np2.w(r2, r0)
            int r0 = r1.B
            int r0 = r0 + r2
            h1 r1 = r1.A
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.L
            defpackage.np2.z(r3, r4, r0)
            r33 r0 = new r33
            int r1 = r2.B
            int r3 = r3 + r1
            int r1 = r1 + r4
            h1 r2 = r2.A
            r0.<init>(r2, r3, r1)
            return r0
    }
}
