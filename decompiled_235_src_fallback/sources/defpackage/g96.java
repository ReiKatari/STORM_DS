package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g96  reason: default package */
/* loaded from: classes.dex */
public final class g96 {
    public long a;
    public defpackage.ll7 b;
    public boolean c;
    public float d;
    public final defpackage.wo e;
    public defpackage.wo f;
    public long g;
    public long h;

    public g96() {
            r2 = this;
            r2.<init>()
            wo r0 = new wo
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "progress nanos: "
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", animationSpec: "
            r0.append(r1)
            ll7 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", isComplete: "
            r0.append(r1)
            boolean r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", value: "
            r0.append(r1)
            float r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", start: "
            r0.append(r1)
            wo r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", initialVelocity: "
            r0.append(r1)
            wo r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", durationNanos: "
            r0.append(r1)
            long r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", animationSpecDuration: "
            r0.append(r1)
            long r1 = r3.h
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
