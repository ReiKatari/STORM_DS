package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk5  reason: default package */
/* loaded from: classes.dex */
public final class kk5 {
    public final java.util.List a;
    public final java.util.Map b;
    public final java.util.Map c;
    public final java.util.List d;
    public final defpackage.bl5 e;

    public kk5(java.util.List r3, java.util.LinkedHashMap r4, java.util.LinkedHashMap r5, java.util.ArrayList r6, defpackage.bl5 r7, int r8) {
            r2 = this;
            r0 = r8 & 2
            zt1 r1 = defpackage.zt1.A
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r0 = r8 & 4
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r8 & 8
            if (r0 == 0) goto L12
            yt1 r6 = defpackage.yt1.A
        L12:
            r8 = r8 & 16
            if (r8 == 0) goto L17
            r7 = 0
        L17:
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            r2.e = r7
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ""
            bl5 r1 = r4.e
            if (r1 != 0) goto L8
            r1 = r0
            goto L1c
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ", template="
            r2.<init>(r3)
            int r1 = r1.a
            java.lang.String r1 = defpackage.bl5.b(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Request(streams="
            r2.<init>(r3)
            java.util.List r3 = r4.a
            r2.append(r3)
            r2.append(r1)
            r2.append(r0)
            r2.append(r0)
            java.lang.String r0 = ")@"
            r2.append(r0)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
