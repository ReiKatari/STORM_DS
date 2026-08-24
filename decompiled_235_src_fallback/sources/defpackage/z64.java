package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z64  reason: default package */
/* loaded from: classes.dex */
public abstract class z64 implements defpackage.xg1 {
    public defpackage.z64 A;
    public defpackage.o41 B;
    public int L;
    public int R;
    public defpackage.z64 X;
    public defpackage.z64 Y;
    public defpackage.hi4 Z;
    public defpackage.eg4 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public defpackage.le i0;
    public boolean j0;

    public z64() {
            r1 = this;
            r1.<init>()
            r1.A = r1
            r0 = -1
            r1.R = r0
            return
    }

    public final defpackage.w61 F0() {
            r3 = this;
            o41 r0 = r3.B
            if (r0 != 0) goto L2f
            zp4 r0 = defpackage.nc1.g0(r3)
            te r0 = (defpackage.te) r0
            l61 r0 = r0.getCoroutineContext()
            zp4 r1 = defpackage.nc1.g0(r3)
            te r1 = (defpackage.te) r1
            l61 r1 = r1.getCoroutineContext()
            vs0 r2 = defpackage.vs0.h0
            j61 r1 = r1.Z(r2)
            rc3 r1 = (defpackage.rc3) r1
            tc3 r2 = new tc3
            r2.<init>(r1)
            l61 r0 = r0.N(r2)
            o41 r0 = defpackage.g04.i(r0)
            r3.B = r0
        L2f:
            return r0
    }

    public boolean G0() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.d10
            r0 = r0 ^ 1
            return r0
    }

    public void H0() {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 == 0) goto L9
            java.lang.String r0 = "node attached multiple times"
            defpackage.p53.c(r0)
        L9:
            eg4 r0 = r1.d0
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "attach invoked on a node without a coordinator"
            defpackage.p53.c(r0)
        L13:
            r0 = 1
            r1.j0 = r0
            r1.g0 = r0
            return
    }

    public void I0() {
            r4 = this;
            boolean r0 = r4.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "Cannot detach a node that is not attached"
            defpackage.p53.c(r0)
        L9:
            boolean r0 = r4.g0
            if (r0 == 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() before markAsDetached()"
            defpackage.p53.c(r0)
        L12:
            boolean r0 = r4.h0
            if (r0 == 0) goto L1b
            java.lang.String r0 = "Must run runDetachLifecycle() before markAsDetached()"
            defpackage.p53.c(r0)
        L1b:
            r0 = 0
            r4.j0 = r0
            o41 r0 = r4.B
            if (r0 == 0) goto L30
            d74 r1 = new d74
            java.lang.String r2 = "The Modifier.Node was detached"
            r3 = 2
            r1.<init>(r2, r3)
            defpackage.g04.x(r0, r1)
            r0 = 0
            r4.B = r0
        L30:
            return
    }

    public void J0() {
            r0 = this;
            return
    }

    public void K0() {
            r0 = this;
            return
    }

    public void L0() {
            r0 = this;
            return
    }

    public void M0() {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "reset() called on an unattached node"
            defpackage.p53.c(r0)
        L9:
            r1.L0()
            return
    }

    public void N0() {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "Must run markAsAttached() prior to runAttachLifecycle"
            defpackage.p53.c(r0)
        L9:
            boolean r0 = r1.g0
            if (r0 != 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() only once after markAsAttached()"
            defpackage.p53.c(r0)
        L12:
            r0 = 0
            r1.g0 = r0
            r1.J0()
            r0 = 1
            r1.h0 = r0
            return
    }

    public void O0() {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "node detached multiple times"
            defpackage.p53.c(r0)
        L9:
            eg4 r0 = r1.d0
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "detach invoked on a node without a coordinator"
            defpackage.p53.c(r0)
        L13:
            boolean r0 = r1.h0
            if (r0 != 0) goto L1c
            java.lang.String r0 = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"
            defpackage.p53.c(r0)
        L1c:
            r0 = 0
            r1.h0 = r0
            le r0 = r1.i0
            if (r0 == 0) goto L26
            r0.c()
        L26:
            r1.K0()
            return
    }

    public void P0(defpackage.z64 r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void Q0(defpackage.eg4 r1) {
            r0 = this;
            r0.d0 = r1
            return
    }
}
