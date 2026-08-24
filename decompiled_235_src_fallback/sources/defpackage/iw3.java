package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw3  reason: default package */
/* loaded from: classes.dex */
public final class iw3 extends defpackage.u {
    public final defpackage.gw3 a;
    public boolean b;
    public int c;

    public iw3(defpackage.gw3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.u
    public final boolean b(defpackage.a50 r3) {
            r2 = this;
            boolean r3 = r3 instanceof defpackage.qw3
            r0 = 0
            if (r3 == 0) goto L15
            boolean r3 = r2.b
            r1 = 1
            if (r3 == 0) goto L14
            int r3 = r2.c
            if (r3 != r1) goto L14
            gw3 r3 = r2.a
            r3.g = r0
            r2.b = r0
        L14:
            return r1
        L15:
            return r0
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            gw3 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r3) {
            r2 = this;
            boolean r0 = r3.h
            r1 = 1
            if (r0 == 0) goto Lb
            r2.b = r1
            r0 = 0
            r2.c = r0
            goto L14
        Lb:
            boolean r0 = r2.b
            if (r0 == 0) goto L14
            int r0 = r2.c
            int r0 = r0 + r1
            r2.c = r0
        L14:
            int r2 = r3.b
            b50 r2 = defpackage.b50.a(r2)
            return r2
    }
}
