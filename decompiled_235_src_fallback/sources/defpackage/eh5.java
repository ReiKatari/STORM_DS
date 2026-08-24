package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh5  reason: default package */
/* loaded from: classes.dex */
public final class eh5 extends defpackage.ct0 {
    public final defpackage.ar0 b;
    public final defpackage.nu c;

    public eh5(defpackage.ar0 r2, defpackage.gg3 r3) {
            r1 = this;
            r3.getClass()
            r1.<init>(r3)
            r1.b = r2
            nu r2 = new nu
            wb6 r3 = r3.e()
            r3.getClass()
            r0 = 0
            r2.<init>(r3, r0)
            r1.c = r2
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            nu r0 = r0.c
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object f() {
            r0 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // defpackage.m0
    public final int g(java.lang.Object r1) {
            r0 = this;
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
    }

    @Override // defpackage.m0
    public final java.util.Iterator h(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r1.getClass()
            w0 r0 = new w0
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r1.getClass()
            int r0 = r1.length
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object m(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.getClass()
            ar0 r1 = r1.b
            java.lang.Class r1 = r1.a
            r1.getClass()
            int r0 = r2.size()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r1 = r2.toArray(r1)
            r1.getClass()
            return r1
    }

    @Override // defpackage.ct0
    public final void n(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.getClass()
            r2.add(r1, r3)
            return
    }
}
