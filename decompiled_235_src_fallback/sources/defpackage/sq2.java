package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq2  reason: default package */
/* loaded from: classes.dex */
public final class sq2 {
    public int a;

    public sq2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean a() {
            r1 = this;
            int r1 = r1.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{ location = "
            r0.append(r1)
            int r2 = r2.a
            java.lang.String r1 = " }"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
