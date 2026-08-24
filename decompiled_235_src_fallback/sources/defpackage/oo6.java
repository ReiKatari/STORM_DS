package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo6  reason: default package */
/* loaded from: classes.dex */
public final class oo6 extends defpackage.md1 {
    public final /* synthetic */ int c;

    public /* synthetic */ oo6(int r1, java.lang.Class r2) {
            r0 = this;
            r0.c = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.md1
    public final java.util.Date a(java.util.Date r3) {
            r2 = this;
            int r2 = r2.c
            switch(r2) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.sql.Timestamp r2 = new java.sql.Timestamp
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
        Lf:
            java.sql.Date r2 = new java.sql.Date
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
    }
}
