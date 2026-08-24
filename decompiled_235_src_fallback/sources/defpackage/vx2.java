package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx2  reason: default package */
/* loaded from: classes.dex */
public final class vx2 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public vx2(long r1, long r3, float r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r8
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HistoricalChange(uptimeMillis="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.d
            java.lang.String r3 = defpackage.jk4.h(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
