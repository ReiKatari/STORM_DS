package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public class ug extends java.lang.RuntimeException {
    public ug(int r1) {
            r0 = this;
            switch(r1) {
                case 14: goto L7;
                default: goto L3;
            }
        L3:
            r0.<init>()
            return
        L7:
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            return
    }

    public ug(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return
    }

    public ug(defpackage.vl5 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            wl5 r3 = r3.a
            int r1 = r3.R
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r3 = r3.L
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
