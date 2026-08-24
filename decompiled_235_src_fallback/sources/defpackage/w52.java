package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w52  reason: default package */
/* loaded from: classes.dex */
public class w52 implements defpackage.zc7 {
    public w52() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r1, defpackage.ie7 r2) {
            r0 = this;
            java.lang.Class r0 = r2.a
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L1d
            if (r0 != r1) goto Ld
            goto L1d
        Ld:
            boolean r1 = r0.isEnum()
            if (r1 != 0) goto L17
            java.lang.Class r0 = r0.getSuperclass()
        L17:
            x52 r1 = new x52
            r1.<init>(r0)
            return r1
        L1d:
            r0 = 0
            return r0
    }
}
