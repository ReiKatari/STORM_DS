package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public class hg extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hg(defpackage.dc5 r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            ec5 r3 = r3.a
            int r1 = r3.R
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r3 = r3.L
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.<init>(dc5):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(int i) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        switch (i) {
            case 13:
                return;
            default:
                return;
        }
    }

    public hg(String str) {
        super(str.toString());
    }
}
