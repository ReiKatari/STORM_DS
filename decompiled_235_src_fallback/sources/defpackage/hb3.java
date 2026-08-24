package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb3  reason: default package */
/* loaded from: classes.dex */
public abstract class hb3 extends defpackage.z64 implements defpackage.jm3 {
    public final /* synthetic */ int k0;

    public /* synthetic */ hb3(int r1) {
            r0 = this;
            r0.k0 = r1
            r0.<init>()
            return
    }

    public abstract long R0(defpackage.x24 r1, long r2);

    public abstract boolean S0();

    public int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r0 = r0.k0
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r2.c(r3)
            return r0
        La:
            int r0 = r2.c(r3)
            return r0
    }

    public defpackage.f34 c(defpackage.g34 r3, defpackage.x24 r4, long r5) {
            r2 = this;
            long r0 = r2.R0(r4, r5)
            boolean r2 = r2.S0()
            if (r2 == 0) goto Le
            long r0 = defpackage.s21.e(r5, r0)
        Le:
            dx4 r2 = r4.y(r0)
            int r4 = r2.A
            int r5 = r2.B
            jv r6 = new jv
            r0 = 5
            r6.<init>(r2, r0)
            zt1 r2 = defpackage.zt1.A
            f34 r2 = r3.K(r4, r5, r2, r6)
            return r2
    }

    @Override // defpackage.jm3
    public int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r0 = r0.k0
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r2.u(r3)
            return r0
        La:
            int r0 = r2.u(r3)
            return r0
    }

    public int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r0 = r0.k0
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r2.V(r3)
            return r0
        La:
            int r0 = r2.V(r3)
            return r0
    }

    @Override // defpackage.jm3
    public int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            int r0 = r0.k0
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r2.n(r3)
            return r0
        La:
            int r0 = r2.n(r3)
            return r0
    }
}
