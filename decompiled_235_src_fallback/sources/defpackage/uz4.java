package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz4  reason: default package */
/* loaded from: classes.dex */
public final class uz4 extends defpackage.tz4 {
    public final java.lang.Object c;

    public uz4() {
            r1 = this;
            r0 = 12
            r1.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // defpackage.tz4
    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.c
            monitor-enter(r0)
            java.lang.Object r1 = super.a()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.tz4
    public final boolean c(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.c
            monitor-enter(r0)
            boolean r1 = super.c(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
