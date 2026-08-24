package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw7  reason: default package */
/* loaded from: classes.dex */
public final class aw7 {
    public static final java.lang.String i = null;
    public final defpackage.lw7 a;
    public final java.lang.String b;
    public final defpackage.y72 c;
    public final java.util.List d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public boolean g;
    public defpackage.xd5 h;

    static {
            java.lang.String r0 = "WorkContinuationImpl"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.aw7.i = r0
            return
    }

    public aw7(defpackage.lw7 r5, java.lang.String r6, defpackage.y72 r7, java.util.List r8) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.b = r6
            r4.c = r7
            r4.d = r8
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r8.size()
            r5.<init>(r6)
            r4.e = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f = r5
            r5 = 0
        L1e:
            int r6 = r8.size()
            if (r5 >= r6) goto L5f
            y72 r6 = defpackage.y72.REPLACE
            if (r7 != r6) goto L43
            java.lang.Object r6 = r8.get(r5)
            gm4 r6 = (defpackage.gm4) r6
            yw7 r6 = r6.b
            long r0 = r6.u
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            goto L43
        L3c:
            java.lang.String r4 = "Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP"
            defpackage.i.h(r4)
            r4 = 0
            throw r4
        L43:
            java.lang.Object r6 = r8.get(r5)
            gm4 r6 = (defpackage.gm4) r6
            java.util.UUID r6 = r6.a
            java.lang.String r6 = r6.toString()
            r6.getClass()
            java.util.ArrayList r0 = r4.e
            r0.add(r6)
            java.util.ArrayList r0 = r4.f
            r0.add(r6)
            int r5 = r5 + 1
            goto L1e
        L5f:
            return
    }

    public static java.util.HashSet b(defpackage.aw7 r1) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.getClass()
            return r0
    }

    public final defpackage.xd5 a() {
            r5 = this;
            boolean r0 = r5.g
            if (r0 != 0) goto L30
            lw7 r0 = r5.a
            az0 r1 = r0.b
            xd5 r1 = r1.m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "EnqueueRunnable_"
            r2.<init>(r3)
            y72 r3 = r5.c
            java.lang.String r3 = r3.name()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ow7 r0 = r0.d
            zb6 r0 = r0.a
            t46 r3 = new t46
            r4 = 24
            r3.<init>(r5, r4)
            xd5 r0 = defpackage.uj2.a0(r1, r2, r0, r3)
            r5.h = r0
            goto L54
        L30:
            ga0 r0 = defpackage.ga0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Already enqueued work ids ("
            r1.<init>(r2)
            java.lang.String r2 = ", "
            java.util.ArrayList r3 = r5.e
            java.lang.String r2 = android.text.TextUtils.join(r2, r3)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = defpackage.aw7.i
            r0.j(r2, r1)
        L54:
            xd5 r5 = r5.h
            return r5
    }
}
