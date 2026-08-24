package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og5  reason: default package */
/* loaded from: classes.dex */
public final class og5 extends defpackage.yf5 {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView a;

    public og5(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yf5
    public final void a() {
            r2 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView r2 = r2.a
            r2.k(r0)
            sg5 r0 = r2.d1
            r1 = 1
            r0.f = r1
            r2.Z(r1)
            z9 r0 = r2.d0
            boolean r0 = r0.j()
            if (r0 != 0) goto L19
            r2.requestLayout()
        L19:
            return
    }

    @Override // defpackage.yf5
    public final void b(java.lang.Object r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView r4 = r4.a
            r4.k(r0)
            z9 r0 = r4.d0
            java.lang.Object r1 = r0.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = 1
            if (r7 >= r2) goto L10
            goto L38
        L10:
            r3 = 4
            y9 r5 = r0.m(r5, r3, r6, r7)
            r1.add(r5)
            int r5 = r0.a
            r5 = r5 | r3
            r0.a = r5
            int r5 = r1.size()
            if (r5 != r2) goto L38
            boolean r5 = r4.s0
            if (r5 == 0) goto L33
            boolean r5 = r4.r0
            if (r5 == 0) goto L33
            sf5 r5 = r4.h0
            java.util.WeakHashMap r6 = defpackage.ao7.a
            r4.postOnAnimation(r5)
            goto L38
        L33:
            r4.z0 = r2
            r4.requestLayout()
        L38:
            return
    }
}
