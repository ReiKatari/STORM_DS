package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n46  reason: default package */
/* loaded from: classes.dex */
public final class n46 implements defpackage.bj5 {
    public defpackage.j56 A;
    public defpackage.q46 B;
    public java.lang.String L;
    public java.lang.Object R;
    public java.lang.Object[] X;
    public defpackage.m44 Y;
    public final defpackage.er2 Z;

    public n46(defpackage.j56 r1, defpackage.q46 r2, java.lang.String r3, java.lang.Object r4, java.lang.Object[] r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            er2 r1 = new er2
            r2 = 29
            r1.<init>(r0, r2)
            r0.Z = r1
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            m44 r0 = r0.Y
            if (r0 == 0) goto L7
            r0.I()
        L7:
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r0 = this;
            m44 r0 = r0.Y
            if (r0 == 0) goto L7
            r0.I()
        L7:
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r0 = this;
            r0.d()
            return
    }

    public final void d() {
            r4 = this;
            q46 r0 = r4.B
            m44 r1 = r4.Y
            if (r1 != 0) goto L62
            if (r0 == 0) goto L61
            er2 r1 = r4.Z
            java.lang.Object r2 = r1.c()
            if (r2 == 0) goto L59
            boolean r3 = r0.c(r2)
            if (r3 != 0) goto L59
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            boolean r0 = r2 instanceof defpackage.gm6
            if (r0 == 0) goto L51
            gm6 r2 = (defpackage.gm6) r2
            im6 r0 = r2.d()
            vs0 r1 = defpackage.vs0.j0
            if (r0 == r1) goto L39
            im6 r0 = r2.d()
            xd5 r1 = defpackage.xd5.s0
            if (r0 == r1) goto L39
            im6 r0 = r2.d()
            vs0 r1 = defpackage.vs0.s0
            if (r0 == r1) goto L39
            java.lang.String r0 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"
            goto L55
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutableState containing "
            r0.<init>(r1)
            java.lang.Object r1 = r2.getValue()
            r0.append(r1)
            java.lang.String r1 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L55
        L51:
            java.lang.String r0 = defpackage.qo2.z(r2)
        L55:
            r4.<init>(r0)
            throw r4
        L59:
            java.lang.String r2 = r4.L
            m44 r0 = r0.a(r2, r1)
            r4.Y = r0
        L61:
            return
        L62:
            m44 r4 = r4.Y
            java.lang.String r0 = ") is not null"
            java.lang.String r1 = "entry("
            defpackage.u34.A(r4, r0, r1)
            return
    }
}
