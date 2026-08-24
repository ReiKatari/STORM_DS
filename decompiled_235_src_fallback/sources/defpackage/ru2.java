package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru2  reason: default package */
/* loaded from: classes.dex */
public class ru2 extends defpackage.ec6 {
    public defpackage.yc7 a;

    public ru2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r1) {
            r0 = this;
            yc7 r0 = r0.a
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.b(r1)
            return r0
        L9:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            yc7 r0 = r0.a
            if (r0 == 0) goto L8
            r0.c(r1, r2)
            return
        L8:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.i.m(r0)
            return
    }

    @Override // defpackage.ec6
    public final defpackage.yc7 d() {
            r0 = this;
            yc7 r0 = r0.a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }
}
