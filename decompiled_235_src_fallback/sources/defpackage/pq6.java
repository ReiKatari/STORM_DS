package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq6  reason: default package */
/* loaded from: classes.dex */
public final class pq6 {
    public final defpackage.s63 a;
    public final defpackage.sk1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;

    public pq6(defpackage.s63 r5) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            android.os.HandlerThread r5 = new android.os.HandlerThread
            java.lang.String r0 = "Picasso-Stats"
            r1 = 10
            r5.<init>(r0, r1)
            r5.start()
            android.os.Looper r0 = r5.getLooper()
            java.lang.StringBuilder r1 = defpackage.ck7.a
            ow4 r1 = new ow4
            r2 = 1
            r1.<init>(r0, r2)
            android.os.Message r0 = r1.obtainMessage()
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.sendMessageDelayed(r0, r2)
            sk1 r0 = new sk1
            android.os.Looper r5 = r5.getLooper()
            r1 = 4
            r0.<init>(r5, r4, r1)
            r4.b = r0
            return
    }

    public final defpackage.qq6 a() {
            r28 = this;
            r0 = r28
            qq6 r1 = new qq6
            s63 r2 = r0.a
            java.lang.Object r2 = r2.B
            nr1 r2 = (defpackage.nr1) r2
            r3 = r1
            int r1 = r2.maxSize()
            int r2 = r2.size()
            r5 = r3
            long r3 = r0.c
            r7 = r5
            long r5 = r0.d
            r9 = r7
            long r7 = r0.e
            r11 = r9
            long r9 = r0.f
            r13 = r11
            long r11 = r0.g
            r15 = r13
            long r13 = r0.h
            r16 = r1
            r17 = r2
            long r1 = r0.i
            r18 = r1
            long r1 = r0.j
            r20 = r1
            int r1 = r0.k
            int r2 = r0.l
            int r0 = r0.m
            long r22 = java.lang.System.currentTimeMillis()
            r24 = r20
            r21 = r0
            r20 = r2
            r0 = r15
            r2 = r17
            r26 = r18
            r19 = r1
            r1 = r16
            r15 = r26
            r17 = r24
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15, r17, r19, r20, r21, r22)
            r15 = r0
            return r15
    }
}
