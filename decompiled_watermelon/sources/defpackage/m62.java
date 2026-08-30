package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m62  reason: default package */
/* loaded from: classes.dex */
public class m62 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m62(java.io.File r3, java.io.File r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1c:
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public m62(int i, long j) {
        super(j + " kb of memory would be needed; limit was " + i + " kb. If the file is not corrupt, consider increasing the memory limit.");
    }
}
