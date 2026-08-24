package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er3  reason: default package */
/* loaded from: classes.dex */
public final class er3 extends defpackage.uj2 {
    public final defpackage.ei h;

    public er3(defpackage.qn2 r2) {
            r1 = this;
            r1.<init>()
            ei r0 = new ei
            r0.<init>()
            r1.h = r0
            r2.g(r1)
            return
    }

    public static void g0(defpackage.er3 r3, java.lang.String r4, java.lang.String r5, defpackage.fo2 r6, int r7) {
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r7 = r7 & 2
            if (r7 == 0) goto Lb
            r5 = r1
        Lb:
            ei r3 = r3.h
            br3 r7 = new br3
            r0 = 0
            if (r4 == 0) goto L17
            cr3 r1 = new cr3
            r1.<init>(r4, r0)
        L17:
            cr3 r4 = new cr3
            r2 = 1
            r4.<init>(r5, r2)
            dr3 r5 = new dr3
            r5.<init>(r6, r0)
            zv0 r6 = new zv0
            r0 = -857469575(0xffffffffcce40d79, float:-1.19565256E8)
            r6.<init>(r0, r2, r5)
            r7.<init>(r1, r4, r6)
            r3.a(r2, r7)
            return
    }

    @Override // defpackage.uj2
    public final defpackage.ei J() {
            r0 = this;
            ei r0 = r0.h
            return r0
    }

    public final void h0(int r2, defpackage.qn2 r3, defpackage.qn2 r4, defpackage.zv0 r5) {
            r1 = this;
            br3 r0 = new br3
            r0.<init>(r3, r4, r5)
            ei r1 = r1.h
            r1.a(r2, r0)
            return
    }
}
