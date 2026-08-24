package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv2  reason: default package */
/* loaded from: classes.dex */
public final class sv2 implements defpackage.ds1 {
    public final /* synthetic */ defpackage.ds1[] a;

    public sv2(defpackage.ds1[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ds1
    public final void a(defpackage.gs1 r4) {
            r3 = this;
            ds1[] r3 = r3.a
            int r0 = r3.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Le
            r2 = r3[r1]
            r2.a(r4)
            int r1 = r1 + 1
            goto L4
        Le:
            return
    }
}
