package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd7  reason: default package */
/* loaded from: classes.dex */
public final class vd7 implements defpackage.zc7 {
    public final /* synthetic */ java.lang.Class A;
    public final /* synthetic */ java.lang.Class B;
    public final /* synthetic */ defpackage.yc7 L;

    public vd7(java.lang.Class r1, java.lang.Class r2, defpackage.yc7 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r1, defpackage.ie7 r2) {
            r0 = this;
            java.lang.Class r1 = r2.a
            java.lang.Class r2 = r0.A
            if (r1 == r2) goto Ld
            java.lang.Class r2 = r0.B
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            yc7 r0 = r0.L
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class r1 = r2.B
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class r1 = r2.A
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            yc7 r2 = r2.L
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
