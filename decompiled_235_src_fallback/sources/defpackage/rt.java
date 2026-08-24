package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt  reason: default package */
/* loaded from: classes.dex */
public final class rt implements defpackage.st, defpackage.pt {
    public final /* synthetic */ defpackage.pt A;
    public final defpackage.kk3 B;

    public rt(defpackage.pt r1, defpackage.kk3 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            pt r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.T(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.a()
            return r0
    }

    @Override // defpackage.eb3
    public final boolean a0() {
            r0 = this;
            pt r0 = r0.A
            boolean r0 = r0.a0()
            return r0
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.e0(r1)
            return r0
    }

    @Override // defpackage.eb3
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            kk3 r0 = r0.B
            return r0
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            pt r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    @Override // defpackage.g34
    public final defpackage.f34 o0(int r7, int r8, java.util.Map r9, defpackage.qn2 r10, defpackage.qn2 r11) {
            r6 = this;
            r6 = 0
            if (r7 >= 0) goto L5
            r1 = r6
            goto L6
        L5:
            r1 = r7
        L6:
            if (r8 >= 0) goto La
            r2 = r6
            goto Lb
        La:
            r2 = r8
        Lb:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r1 & r6
            if (r7 != 0) goto L15
            r6 = r6 & r2
            if (r6 != 0) goto L15
            goto L33
        L15:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Size("
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r7 = " x "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ") is out of range. Each dimension must be between 0 and 16777215."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            defpackage.p53.c(r6)
        L33:
            qt r0 = new qt
            r5 = 0
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            pt r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            pt r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            pt r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            pt r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            pt r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
