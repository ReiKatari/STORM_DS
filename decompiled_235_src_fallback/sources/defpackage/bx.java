package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
public final class bx {
    public final defpackage.o41 a;
    public final defpackage.d51 b;
    public final java.lang.Object c;
    public final java.util.LinkedHashMap d;
    public final java.util.concurrent.CopyOnWriteArrayList e;

    public bx(defpackage.t57 r3, defpackage.zg0 r4, defpackage.rc3 r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r2.<init>()
            gu6 r0 = new gu6
            r0.<init>(r5)
            n61 r3 = r3.h
            r61 r5 = new r61
            java.lang.String r1 = "CXCP-AudioRestrictionControllerImpl"
            r5.<init>(r1)
            l61 r3 = defpackage.jw2.y(r3, r5)
            l61 r3 = defpackage.jw2.y(r0, r3)
            o41 r3 = defpackage.g04.i(r3)
            r2.a = r3
            d51 r3 = new d51
            r5 = 1
            r3.<init>(r5)
            r2.b = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.c = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.d = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.e = r3
            wg0 r3 = defpackage.wg0.SCOPE
            n0 r5 = new n0
            r0 = 6
            r5.<init>(r2, r0)
            r4.a(r3, r5)
            return
    }

    public final defpackage.cx a() {
            r3 = this;
            java.util.LinkedHashMap r0 = r3.d
            cx r1 = new cx
            r2 = 3
            r1.<init>(r2)
            boolean r1 = r0.containsValue(r1)
            if (r1 != 0) goto L40
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            monitor-exit(r1)
            cx r1 = new cx
            r2 = 1
            r1.<init>(r2)
            boolean r1 = r0.containsValue(r1)
            if (r1 != 0) goto L3a
            java.lang.Object r1 = r3.c
            monitor-enter(r1)
            monitor-exit(r1)
            cx r1 = new cx
            r2 = 0
            r1.<init>(r2)
            boolean r0 = r0.containsValue(r1)
            if (r0 != 0) goto L34
            java.lang.Object r3 = r3.c
            monitor-enter(r3)
            monitor-exit(r3)
            r3 = 0
            return r3
        L34:
            cx r3 = new cx
            r3.<init>(r2)
            return r3
        L3a:
            cx r3 = new cx
            r3.<init>(r2)
            return r3
        L40:
            cx r3 = new cx
            r3.<init>(r2)
            return r3
    }
}
