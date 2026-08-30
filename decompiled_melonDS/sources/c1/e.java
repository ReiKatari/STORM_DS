package c1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends nc.l implements mc.l {
    public static final e L = new e(1, 0);
    public static final e R = new e(1, 1);
    public static final e X = new e(1, 2);
    public static final e Y = new e(1, 3);
    public static final e Z = new e(1, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final e f2405b0 = new e(1, 5);

    /* renamed from: c0  reason: collision with root package name */
    public static final e f2406c0 = new e(1, 6);

    /* renamed from: d0  reason: collision with root package name */
    public static final e f2407d0 = new e(1, 7);

    /* renamed from: e0  reason: collision with root package name */
    public static final e f2408e0 = new e(1, 8);

    /* renamed from: f0  reason: collision with root package name */
    public static final e f2409f0 = new e(1, 9);

    /* renamed from: g0  reason: collision with root package name */
    public static final e f2410g0 = new e(1, 10);

    /* renamed from: h0  reason: collision with root package name */
    public static final e f2411h0 = new e(1, 11);

    /* renamed from: i0  reason: collision with root package name */
    public static final e f2412i0 = new e(1, 12);

    /* renamed from: j0  reason: collision with root package name */
    public static final e f2413j0 = new e(1, 13);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        switch (this.B) {
            case 0:
                return obj;
            case DSiCameraSource.FrontCamera /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 4:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case l1.c.f8511g /* 5 */:
                long a10 = i3.s.a(((i3.s) obj).f6689a, j3.d.f7371x);
                return new d1.o(i3.s.d(a10), i3.s.h(a10), i3.s.g(a10), i3.s.e(a10));
            case l1.c.f8509e /* 6 */:
                long j2 = ((i3.q0) obj).f6679a;
                return new d1.m(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 7:
                d1.m mVar = (d1.m) obj;
                return new i3.q0(i3.z.g(mVar.f3603a, mVar.f3604b));
            case 8:
                d1.l1 l1Var = (d1.l1) obj;
                return d1.d.q(7, null);
            case l1.c.f8508d /* 9 */:
                ((Number) obj).intValue();
                return 0;
            case l1.c.f8510f /* 10 */:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 11:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 12:
                d1.l1 l1Var2 = (d1.l1) obj;
                return w0.f2541c;
            case 13:
                if (((m0) obj) == m0.Visible) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 14:
                return new x4.l((0 << 32) | (4294967295L & ((int) (((x4.l) obj).f14346a & 4294967295L))));
            case l1.c.f8512h /* 15 */:
                return new x4.l((((int) (((x4.l) obj).f14346a >> 32)) << 32) | (0 & 4294967295L));
            default:
                return new x4.l((((int) (((x4.l) obj).f14346a >> 32)) << 32) | (0 & 4294967295L));
        }
    }
}
