package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq6  reason: default package */
/* loaded from: classes.dex */
public final class yq6 extends defpackage.t74 {
    public defpackage.zq6 a;
    public defpackage.jo6 b;
    public defpackage.xq6 c;

    @Override // defpackage.t74
    public final float a() {
            r0 = this;
            xq6 r0 = r0.c
            float r0 = r0.b()
            return r0
    }

    public final void b(float r2, float r3, float r4, float r5, float r6, float r7) {
            r1 = this;
            r0 = r1
            zq6 r1 = r0.a
            r0.c = r1
            r1.l = r2
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.k = r0
            if (r0 == 0) goto L1d
            r0 = r2
            float r2 = -r4
            float r3 = r0 - r3
            r4 = r6
            r6 = r5
            r5 = r7
            r1.d(r2, r3, r4, r5, r6)
            return
        L1d:
            r0 = r2
            r2 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            float r3 = r3 - r0
            r1.d(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r1) {
            r0 = this;
            xq6 r0 = r0.c
            float r0 = r0.getInterpolation(r1)
            return r0
    }
}
