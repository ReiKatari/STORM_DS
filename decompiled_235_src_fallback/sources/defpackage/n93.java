package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n93  reason: default package */
/* loaded from: classes.dex */
public final class n93 {
    public int a;

    public n93() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntRef(element = "
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ")@"
            r0.append(r1)
            int r2 = r2.hashCode()
            r1 = 16
            defpackage.g04.y(r1)
            java.lang.String r2 = java.lang.Integer.toString(r2, r1)
            r2.getClass()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
