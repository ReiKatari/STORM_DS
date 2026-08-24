package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hw4  reason: default package */
/* loaded from: classes.dex */
public final class hw4 extends defpackage.s1 implements defpackage.s33, java.util.Collection, defpackage.zf3 {
    public static final defpackage.hw4 R = null;
    public final java.lang.Object A;
    public final java.lang.Object B;
    public final defpackage.yv4 L;

    static {
            hw4 r0 = new hw4
            d90 r1 = defpackage.d90.t0
            yv4 r2 = defpackage.yv4.L
            r0.<init>(r1, r1, r2)
            defpackage.hw4.R = r0
            return
    }

    public hw4(java.lang.Object r1, java.lang.Object r2, defpackage.yv4 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            yv4 r0 = r0.L
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            yv4 r0 = r0.L
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            rr2 r0 = new rr2
            java.lang.Object r1 = r2.A
            yv4 r2 = r2.L
            r0.<init>(r2, r1)
            return r0
    }
}
