package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb2  reason: default package */
/* loaded from: classes.dex */
public class gb2 extends java.io.IOException {
    public gb2(int r2, long r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " kb of memory would be needed; limit was "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " kb. If the file is not corrupt, consider increasing the memory limit."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
    }

    public gb2(java.io.File r3, java.io.File r4, java.lang.String r5) {
            r2 = this;
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1f:
            if (r5 == 0) goto L2a
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
        L2a:
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
