package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl2  reason: default package */
/* loaded from: classes.dex */
public final class kl2 implements defpackage.jl2 {
    public final int a;
    public final /* synthetic */ androidx.fragment.app.u b;

    public kl2(androidx.fragment.app.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // defpackage.jl2
    public final boolean a(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            androidx.fragment.app.u r0 = r4.b
            androidx.fragment.app.o r1 = r0.z
            int r4 = r4.a
            if (r1 == 0) goto L17
            if (r4 >= 0) goto L17
            androidx.fragment.app.u r1 = r1.getChildFragmentManager()
            r2 = -1
            r3 = 0
            boolean r1 = r1.R(r2, r3)
            if (r1 == 0) goto L17
            return r3
        L17:
            r1 = 1
            boolean r4 = r0.S(r4, r1, r5, r6)
            return r4
    }
}
