package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq6  reason: default package */
/* loaded from: classes.dex */
public abstract class fq6 implements defpackage.eq6 {
    public final defpackage.vw A;

    public fq6() {
            r2 = this;
            r2.<init>()
            vw r0 = new vw
            r1 = 0
            r0.<init>(r1)
            r2.A = r0
            return
    }

    public final boolean e(int r1) {
            r0 = this;
            vw r0 = r0.A
            int r0 = r0.get()
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final void g(int r4) {
            r3 = this;
        L0:
            vw r0 = r3.A
            int r1 = r0.get()
            r2 = r1 & r4
            if (r2 == 0) goto Lb
            goto L13
        Lb:
            r2 = r1 | r4
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L0
        L13:
            return
    }
}
