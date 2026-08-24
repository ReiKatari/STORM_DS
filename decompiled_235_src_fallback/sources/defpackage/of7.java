package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of7  reason: default package */
/* loaded from: classes.dex */
public final class of7 extends defpackage.s25 {
    public int[] a;
    public int b;

    @Override // defpackage.s25
    public final java.lang.Object a() {
            r1 = this;
            int[] r0 = r1.a
            int r1 = r1.b
            int[] r1 = java.util.Arrays.copyOf(r0, r1)
            nf7 r0 = new nf7
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.s25
    public final void b(int r3) {
            r2 = this;
            int[] r0 = r2.a
            int r1 = r0.length
            if (r1 >= r3) goto L11
            int r1 = r0.length
            int r1 = r1 * 2
            if (r3 >= r1) goto Lb
            r3 = r1
        Lb:
            int[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.a = r3
        L11:
            return
    }

    @Override // defpackage.s25
    public final int d() {
            r0 = this;
            int r0 = r0.b
            return r0
    }
}
