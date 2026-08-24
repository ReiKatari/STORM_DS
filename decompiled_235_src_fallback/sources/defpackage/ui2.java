package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui2  reason: default package */
/* loaded from: classes.dex */
public final class ui2 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;

    public ui2(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.a = r1
            r2.getClass()
            r0.b = r2
            r0.c = r3
            r4.getClass()
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            r4.append(r1)
            r4.append(r5)
            r4.append(r1)
            r4.append(r6)
            java.lang.String r1 = r4.toString()
            r0.g = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.c
            r1.append(r2)
            java.lang.String r2 = ", mSystemFont: "
            r1.append(r2)
            java.lang.String r2 = r6.e
            r1.append(r2)
            java.lang.String r2 = ", mVariationSettings: "
            r1.append(r2)
            java.lang.String r2 = r6.f
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L47:
            java.util.List r3 = r6.d
            int r4 = r3.size()
            if (r2 >= r4) goto L83
            java.lang.String r4 = " ["
            r0.append(r4)
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L5b:
            int r5 = r3.size()
            if (r4 >= r5) goto L7b
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L5b
        L7b:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L47
        L83:
            java.lang.String r6 = "}mCertificatesArray: 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
