package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm2  reason: default package */
/* loaded from: classes.dex */
public final class tm2 {
    public static final defpackage.ww i = null;
    public final long a;
    public final long b;
    public final long c;
    public final defpackage.pm2 d;
    public final defpackage.kw3 e;
    public final defpackage.xw f;
    public final defpackage.uw g;
    public final java.util.concurrent.CopyOnWriteArrayList h;

    static {
            ww r0 = new ww
            r0.<init>()
            r1 = 0
            r0.a = r1
            defpackage.tm2.i = r0
            return
    }

    public tm2(defpackage.yk5 r5, long r6, long r8, java.util.Set r10) {
            r4 = this;
            r5.getClass()
            r10.getClass()
            r4.<init>()
            r4.a = r6
            r4.b = r8
            ww r6 = defpackage.tm2.i
            r6.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = defpackage.ww.b
            long r6 = r7.incrementAndGet(r6)
            r4.c = r6
            pm2 r6 = new pm2
            r6.<init>(r4)
            r4.d = r6
            kw3 r6 = defpackage.hf.I()
            java.util.Map r5 = r5.x()
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L81
            java.lang.Object r7 = r5.next()
            kr6 r7 = (defpackage.kr6) r7
            int r7 = r7.a
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L47:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r9.next()
            r1 = r0
            ki0 r1 = (defpackage.ki0) r1
            int r1 = r1.a
            if (r1 != r7) goto L47
            goto L5a
        L59:
            r0 = 0
        L5a:
            ki0 r0 = (defpackage.ki0) r0
            if (r0 == 0) goto L31
            java.util.ArrayList r9 = r0.b
            int r0 = r9.size()
            uw r0 = defpackage.g04.t(r0)
            int r1 = r9.size()
        L6c:
            if (r8 >= r1) goto L31
            qm2 r2 = new qm2
            java.lang.Object r3 = r9.get(r8)
            ir6 r3 = (defpackage.ir6) r3
            int r3 = r3.a
            r2.<init>(r4, r7, r3, r0)
            r6.add(r2)
            int r8 = r8 + 1
            goto L6c
        L81:
            kw3 r5 = defpackage.hf.A(r6)
            r4.e = r5
            rm2 r6 = defpackage.rm2.STARTED
            xw r6 = defpackage.g04.u(r6)
            r4.f = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ht0.v0(r5, r7)
            r6.<init>(r7)
            java.util.ListIterator r5 = r5.listIterator(r8)
        L9e:
            r7 = r5
            xx2 r7 = (defpackage.xx2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb8
            java.lang.Object r7 = r7.next()
            qm2 r7 = (defpackage.qm2) r7
            int r7 = r7.c
            kr6 r8 = new kr6
            r8.<init>(r7)
            r6.add(r8)
            goto L9e
        Lb8:
            java.util.Set r5 = defpackage.gt0.o1(r6)
            java.util.List r5 = defpackage.gt0.k1(r5)
            int r5 = r5.size()
            uw r5 = defpackage.g04.t(r5)
            r4.g = r5
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>()
            r4.h = r5
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Frame-"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FrameId(value="
            r1.<init>(r2)
            long r2 = r5.c
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            long r3 = r5.a
            r0.append(r3)
            r1 = 64
            r0.append(r1)
            long r3 = r5.b
            r0.append(r3)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
