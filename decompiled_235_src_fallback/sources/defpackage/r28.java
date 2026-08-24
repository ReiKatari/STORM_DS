package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r28  reason: default package */
/* loaded from: classes.dex */
public final class r28 extends defpackage.s28 {
    public final transient int L;
    public final transient int R;
    public final /* synthetic */ defpackage.s28 X;

    public r28(defpackage.s28 r1, int r2, int r3) {
            r0 = this;
            r0.X = r1
            r0.<init>()
            r0.L = r2
            r0.R = r3
            return
    }

    @Override // defpackage.p28
    public final int b() {
            r2 = this;
            s28 r0 = r2.X
            int r0 = r0.c()
            int r1 = r2.L
            int r0 = r0 + r1
            int r2 = r2.R
            int r0 = r0 + r2
            return r0
    }

    @Override // defpackage.p28
    public final int c() {
            r1 = this;
            s28 r0 = r1.X
            int r0 = r0.c()
            int r1 = r1.L
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.p28
    public final boolean d() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.p28
    public final java.lang.Object[] f() {
            r0 = this;
            s28 r0 = r0.X
            java.lang.Object[] r0 = r0.f()
            return r0
    }

    @Override // defpackage.s28
    public final defpackage.s28 g(int r2, int r3) {
            r1 = this;
            int r0 = r1.R
            defpackage.su7.d(r2, r3, r0)
            int r0 = r1.L
            int r2 = r2 + r0
            int r3 = r3 + r0
            s28 r1 = r1.X
            s28 r1 = r1.g(r2, r3)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.R
            defpackage.su7.b(r2, r0)
            int r0 = r1.L
            int r2 = r2 + r0
            s28 r1 = r1.X
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    @Override // defpackage.s28, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            s28 r0 = r0.g(r1, r2)
            return r0
    }
}
