package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd1  reason: default package */
/* loaded from: classes.dex */
public class kd1 implements defpackage.zc7 {
    public kd1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r1, defpackage.ie7 r2) {
            r0 = this;
            java.lang.Class r0 = r2.a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto Lf
            nd1 r0 = new nd1
            ld1 r1 = defpackage.md1.b
            r2 = 2
            r0.<init>(r1, r2, r2)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"
            return r0
    }
}
