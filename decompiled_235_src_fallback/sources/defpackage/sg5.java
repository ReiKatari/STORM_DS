package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg5  reason: default package */
/* loaded from: classes.dex */
public final class sg5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public final void a(int r3) {
            r2 = this;
            int r0 = r2.d
            r0 = r0 & r3
            if (r0 == 0) goto L6
            return
        L6:
            java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
            int r2 = r2.d
            java.lang.String r2 = java.lang.Integer.toBinaryString(r2)
            java.lang.String r0 = "Layout state should be one of "
            java.lang.String r1 = " but it is "
            defpackage.e41.r(r0, r3, r1, r2)
            return
    }

    public final int b() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto La
            int r0 = r1.b
            int r1 = r1.c
            int r0 = r0 - r1
            return r0
        La:
            int r1 = r1.e
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State{mTargetPosition="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mData=null, mItemCount="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", mIsMeasuring="
            r0.append(r1)
            boolean r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", mPreviousLayoutItemCount="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", mStructureChanged="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", mInPreLayout="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", mRunSimpleAnimations="
            r0.append(r1)
            boolean r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", mRunPredictiveAnimations="
            r0.append(r1)
            boolean r2 = r2.k
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
