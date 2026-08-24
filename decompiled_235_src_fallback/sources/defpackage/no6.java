package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no6  reason: default package */
/* loaded from: classes.dex */
public final class no6 extends defpackage.yc7 {
    public static final defpackage.mo6 b = null;
    public final defpackage.yc7 a;

    static {
            mo6 r0 = new mo6
            r0.<init>()
            defpackage.no6.b = r0
            return
    }

    public no6(defpackage.yc7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r3) {
            r2 = this;
            yc7 r2 = r2.a
            java.lang.Object r2 = r2.b(r3)
            java.util.Date r2 = (java.util.Date) r2
            if (r2 == 0) goto L14
            java.sql.Timestamp r3 = new java.sql.Timestamp
            long r0 = r2.getTime()
            r3.<init>(r0)
            return r3
        L14:
            r2 = 0
            return r2
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.sql.Timestamp r2 = (java.sql.Timestamp) r2
            yc7 r0 = r0.a
            r0.c(r1, r2)
            return
    }
}
