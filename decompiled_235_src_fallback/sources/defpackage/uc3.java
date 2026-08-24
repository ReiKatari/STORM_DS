package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc3  reason: default package */
/* loaded from: classes.dex */
public abstract class uc3 extends defpackage.ky3 implements defpackage.il1, defpackage.e43 {
    public defpackage.ed3 Z;

    @Override // defpackage.il1
    public final void dispose() {
            r1 = this;
            ed3 r0 = r1.p()
            r0.m0(r1)
            return
    }

    @Override // defpackage.e43
    public final boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.e43
    public final defpackage.gg4 f() {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.rc3 getParent() {
            r0 = this;
            ed3 r0 = r0.p()
            return r0
    }

    public final defpackage.ed3 p() {
            r0 = this;
            ed3 r0 = r0.Z
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public abstract boolean q();

    public abstract void r(java.lang.Throwable r1);

    @Override // defpackage.ky3
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.nc1.P(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            ed3 r2 = r2.p()
            java.lang.String r2 = defpackage.nc1.P(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
