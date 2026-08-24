package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h40  reason: default package */
/* loaded from: classes.dex */
public final class h40 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public h40(long r2, long r4) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r4
            return
    }

    public h40(long r1, long r3, int r5) {
            r0 = this;
            r5 = 1
            r0.a = r5
            r0.<init>()
            r0.b = r1
            r0.c = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BindPair binding input "
            r0.<init>(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = " to output "
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
