package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public abstract class a50 extends defpackage.a21 {
    @Override // defpackage.a21
    public final defpackage.a21 c() {
            r0 = this;
            java.lang.Object r0 = r0.b
            a21 r0 = (defpackage.a21) r0
            a50 r0 = (defpackage.a50) r0
            return r0
    }

    @Override // defpackage.a21
    public final void e(defpackage.a21 r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.a50
            if (r0 == 0) goto L7
            r1.b = r2
            return
        L7:
            java.lang.String r1 = "Parent of block must also be block (can not be inline)"
            defpackage.i.h(r1)
            return
    }
}
