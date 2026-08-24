package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s43  reason: default package */
/* loaded from: classes.dex */
public final class s43 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public s43(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.g = r11
            r0.h = r13
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IndirectPointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.nj2.F(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.g
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", isConsumed="
            r0.append(r1)
            boolean r3 = r3.i
            r1 = 41
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r1)
            return r3
    }
}
