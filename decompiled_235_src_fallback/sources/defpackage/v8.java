package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.pd4("activity")
/* renamed from: v8  reason: default package */
/* loaded from: classes.dex */
public class v8 extends defpackage.qd4 {
    public final android.app.Activity c;

    public v8(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            k4 r0 = new k4
            r1 = 8
            r0.<init>(r1)
            qb6 r3 = defpackage.sb6.Z(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L15
            goto L28
        L27:
            r0 = 0
        L28:
            android.app.Activity r0 = (android.app.Activity) r0
            r2.c = r0
            return
    }

    @Override // defpackage.qd4
    public final defpackage.ic4 a() {
            r1 = this;
            u8 r0 = new u8
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.qd4
    public final defpackage.ic4 c(defpackage.ic4 r2) {
            r1 = this;
            u8 r2 = (defpackage.u8) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Destination "
            r1.<init>(r0)
            z9 r2 = r2.B
            int r2 = r2.a
            java.lang.String r0 = " does not have an Intent set."
            java.lang.String r1 = defpackage.lb1.o(r1, r2, r0)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.qd4
    public final boolean f() {
            r0 = this;
            android.app.Activity r0 = r0.c
            if (r0 == 0) goto L9
            r0.finish()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}
