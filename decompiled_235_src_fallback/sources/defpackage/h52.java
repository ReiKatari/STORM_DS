package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h52  reason: default package */
/* loaded from: classes.dex */
public final class h52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.qn2 L;

    public /* synthetic */ h52(int r1, defpackage.qn2 r2) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.B
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            qn2 r8 = r8.L
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L62;
                case 2: goto L46;
                case 3: goto L2a;
                default: goto Le;
            }
        Le:
            q93 r9 = (defpackage.q93) r9
            long r0 = r9.a
            long r0 = r0 & r2
            int r9 = (int) r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.g(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            long r8 = r8 & r2
            i93 r0 = new i93
            r0.<init>(r8)
            return r0
        L2a:
            q93 r9 = (defpackage.q93) r9
            long r2 = r9.a
            long r2 = r2 >> r1
            int r9 = (int) r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.g(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            long r8 = r8 << r1
            i93 r0 = new i93
            r0.<init>(r8)
            return r0
        L46:
            q93 r9 = (defpackage.q93) r9
            long r0 = r9.a
            long r0 = r0 & r2
            int r9 = (int) r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.g(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            long r8 = r8 & r2
            i93 r0 = new i93
            r0.<init>(r8)
            return r0
        L62:
            q93 r9 = (defpackage.q93) r9
            long r2 = r9.a
            long r2 = r2 >> r1
            int r9 = (int) r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.g(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r8 = (long) r8
            long r8 = r8 << r1
            i93 r0 = new i93
            r0.<init>(r8)
            return r0
        L7e:
            q93 r9 = (defpackage.q93) r9
            long r4 = r9.a
            long r6 = r4 >> r1
            int r9 = (int) r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.g(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            long r4 = r4 & r2
            int r9 = (int) r4
            long r4 = (long) r8
            long r0 = r4 << r1
            long r8 = (long) r9
            long r8 = r8 & r2
            long r8 = r8 | r0
            q93 r0 = new q93
            r0.<init>(r8)
            return r0
    }
}
