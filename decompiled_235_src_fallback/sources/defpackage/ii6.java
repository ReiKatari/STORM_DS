package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii6  reason: default package */
/* loaded from: classes.dex */
public final class ii6 implements defpackage.m55 {
    public static final java.lang.Object c = null;
    public volatile defpackage.m55 a;
    public volatile java.lang.Object b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ii6.c = r0
            return
    }

    public static defpackage.m55 a(defpackage.m55 r2) {
            boolean r0 = r2 instanceof defpackage.ii6
            if (r0 != 0) goto L15
            boolean r0 = r2 instanceof defpackage.em1
            if (r0 == 0) goto L9
            return r2
        L9:
            ii6 r0 = new ii6
            r0.<init>()
            java.lang.Object r1 = defpackage.ii6.c
            r0.b = r1
            r0.a = r2
            return r0
        L15:
            return r2
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r2 = this;
            java.lang.Object r0 = r2.b
            java.lang.Object r1 = defpackage.ii6.c
            if (r0 != r1) goto L16
            m55 r0 = r2.a
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r2.b
            return r2
        Ld:
            java.lang.Object r0 = r0.get()
            r2.b = r0
            r1 = 0
            r2.a = r1
        L16:
            return r0
    }
}
