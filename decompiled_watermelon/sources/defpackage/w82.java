package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w82  reason: default package */
/* loaded from: classes.dex */
public final class w82 implements i47 {
    public final zd6 a;
    public n47 b;
    public volatile int c;
    public gs0 d;

    public w82(je0 je0Var, zd6 zd6Var, n57 n57Var, ew6 ew6Var, s57 s57Var) {
        je0Var.getClass();
        zd6Var.getClass();
        n57Var.getClass();
        ew6Var.getClass();
        this.a = zd6Var;
        this.c = 2;
        a53.d(o27.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.v82
            if (r0 == 0) goto L13
            r0 = r6
            v82 r0 = (defpackage.v82) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            v82 r0 = new v82
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            java.lang.String r4 = "CXCP"
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            int r5 = r0.R
            defpackage.me2.a0(r6)
            goto L59
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L32:
            defpackage.me2.a0(r6)
            boolean r6 = defpackage.ve2.D(r4)
            if (r6 == 0) goto L40
            java.lang.String r6 = "FlashControl: Waiting for any ongoing update to be completed"
            android.util.Log.d(r4, r6)
        L40:
            int r6 = r5.c
            gs0 r5 = r5.d
            if (r5 == 0) goto L47
            goto L4d
        L47:
            o27 r5 = defpackage.o27.a
            gs0 r5 = defpackage.a53.d(r5)
        L4d:
            r0.R = r6
            r0.Z = r3
            java.lang.Object r5 = r5.Z(r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r5 = r6
        L59:
            boolean r6 = defpackage.ve2.D(r4)
            if (r6 == 0) goto L70
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "awaitFlashModeUpdate: initialFlashMode = "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r4, r6)
        L70:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w82.a(k11):java.lang.Object");
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.b = n47Var;
        c(this.c, false);
    }

    public final gs0 c(int i, boolean z) {
        if (ve2.D("CXCP")) {
            StringBuilder s = wh1.s("setFlashAsync: flashMode = ", i, ", requestControl = ");
            s.append(this.b);
            Log.d("CXCP", s.toString());
        }
        gs0 gs0Var = new gs0();
        if (this.b != null) {
            this.c = i;
            gs0 gs0Var2 = this.d;
            if (z) {
                if (gs0Var2 != null) {
                    b31.z("There is a new flash mode being set or camera was closed", gs0Var2);
                }
                this.d = null;
            } else if (gs0Var2 != null) {
                l.K(gs0Var, gs0Var2);
            }
            this.d = gs0Var;
            zd6 zd6Var = this.a;
            synchronized (zd6Var.d) {
                zd6Var.h = i;
            }
            l.K(zd6Var.f(), gs0Var);
            return gs0Var;
        }
        b31.z("Camera is not active.", gs0Var);
        return gs0Var;
    }

    @Override // defpackage.i47
    public final void reset() {
        this.c = 2;
        gs0 gs0Var = this.d;
        if (gs0Var != null) {
            b31.z("There is a new flash mode being set or camera was closed", gs0Var);
        }
        this.d = null;
        c(2, true);
    }
}
