package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o41  reason: default package */
/* loaded from: classes.dex */
public final class o41 implements defpackage.w61 {
    public final /* synthetic */ int A;
    public defpackage.l61 B;

    public /* synthetic */ o41() {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            return
    }

    public o41(defpackage.l61 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // defpackage.w61
    public final defpackage.l61 A() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            l61 r1 = r1.B
            return r1
        L8:
            l61 r1 = r1.B
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoroutineScope(coroutineContext="
            r0.<init>(r1)
            l61 r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
