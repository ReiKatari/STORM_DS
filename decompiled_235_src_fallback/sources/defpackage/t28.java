package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t28  reason: default package */
/* loaded from: classes.dex */
public final class t28 extends defpackage.s28 {
    public static final defpackage.t28 X = null;
    public final transient java.lang.Object[] L;
    public final transient int R;

    static {
            t28 r0 = new t28
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            defpackage.t28.X = r0
            return
    }

    public t28(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.R = r2
            return
    }

    @Override // defpackage.s28, defpackage.p28
    public final int a(java.lang.Object[] r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.L
            r1 = 0
            int r2 = r2.R
            java.lang.System.arraycopy(r0, r1, r3, r1, r2)
            return r2
    }

    @Override // defpackage.p28
    public final int b() {
            r0 = this;
            int r0 = r0.R
            return r0
    }

    @Override // defpackage.p28
    public final int c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.p28
    public final boolean d() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.p28
    public final java.lang.Object[] f() {
            r0 = this;
            java.lang.Object[] r0 = r0.L
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.R
            defpackage.su7.b(r2, r0)
            java.lang.Object[] r1 = r1.L
            r1 = r1[r2]
            r1.getClass()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            int r0 = r0.R
            return r0
    }
}
