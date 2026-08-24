package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir6  reason: default package */
/* loaded from: classes.dex */
public final class ir6 {
    public final int a;
    public final android.util.Size b;
    public final int c;
    public final java.lang.String d;
    public final defpackage.rp4 e;
    public final defpackage.qp4 f;
    public final defpackage.sp4 g;
    public final defpackage.vs0 h;
    public final defpackage.tp4 i;
    public defpackage.ki0 j;

    public ir6(int r1, int r2, defpackage.vs0 r3, defpackage.qp4 r4, defpackage.rp4 r5, defpackage.sp4 r6, defpackage.tp4 r7, android.util.Size r8, java.lang.String r9) {
            r0 = this;
            r8.getClass()
            r9.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r8
            r0.c = r2
            r0.d = r9
            r0.e = r5
            r0.f = r4
            r0.g = r6
            r0.h = r3
            r0.i = r7
            return
    }

    public final boolean a() {
            r8 = this;
            sp4 r0 = r8.g
            if (r0 == 0) goto L33
            long r0 = r0.a
            r2 = 0
            boolean r4 = defpackage.sp4.a(r0, r2)
            if (r4 != 0) goto L33
            r4 = 1
            boolean r6 = defpackage.sp4.a(r0, r4)
            if (r6 != 0) goto L33
            r6 = 3
            boolean r0 = defpackage.sp4.a(r0, r6)
            if (r0 != 0) goto L33
            tp4 r8 = r8.i
            if (r8 == 0) goto L33
            long r0 = r8.a
            boolean r8 = defpackage.tp4.a(r0, r2)
            if (r8 != 0) goto L33
            boolean r8 = defpackage.tp4.a(r0, r4)
            if (r8 == 0) goto L31
            goto L33
        L31:
            r8 = 0
            return r8
        L33:
            r8 = 1
            return r8
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = r1.a
            java.lang.String r0 = "Output-"
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            return r1
    }
}
