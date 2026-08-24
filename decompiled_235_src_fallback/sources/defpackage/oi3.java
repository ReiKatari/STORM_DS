package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi3  reason: default package */
/* loaded from: classes.dex */
public final class oi3 {
    public final java.lang.Integer a;
    public final java.util.Set b;
    public final defpackage.pi3 c;

    public oi3(java.util.Set r2, defpackage.pi3 r3) {
            r1 = this;
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.getClass()
            r1.<init>()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.oi3
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 398591036(0x17c2043c, double:1.969301376E-315)
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Integer r2 = r2.a
            if (r2 != 0) goto L7
            java.lang.String r2 = "398591036 without alias"
            return r2
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "398591036 with alias "
            r0.<init>(r1)
            int r2 = r2.intValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
