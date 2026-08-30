package defpackage;

import defpackage.k15;
import defpackage.m15;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vq3 implements ki2 {
    public final /* synthetic */ int A;

    public /* synthetic */ vq3(int i) {
        this.A = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        m93 _init_$_anonymous_;
        switch (this.A) {
            case 0:
                tv0 tv0Var = wq3.a;
                return null;
            case 1:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 2:
                tv0 tv0Var2 = zq3.a;
                return null;
            case 3:
                tv0 tv0Var3 = ar3.a;
                return null;
            case 4:
                ye6 ye6Var = br3.a;
                return y60.s0;
            case 5:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case ig7.b /* 6 */:
                tv0 tv0Var4 = dr3.a;
                return null;
            case 7:
                return new bu5();
            case 8:
                e81 e81Var = new e81(2, (byte) 0);
                e81Var.b(q75.a(m34.class), new gi3(19));
                return e81Var.d();
            case 9:
                return new zt(ca4.a, 0);
            case 10:
                return ga4.Companion.serializer();
            case 11:
                return jb4.Companion.serializer();
            case mj2.L /* 12 */:
                return lb4.Companion.serializer();
            case 13:
                _init_$_anonymous_ = ga4._init_$_anonymous_();
                return _init_$_anonymous_;
            case 14:
                return new zt(ta4.a, 0);
            case ig7.e /* 15 */:
                return new zt(za4.a, 0);
            case 16:
                return jb4.a();
            case 17:
                return lb4.a();
            case 18:
                return new sg4();
            case 19:
                int i = ol4.b;
                return o27.a;
            case 20:
                bb1 bb1Var = tg1.a;
                return ha1.L;
            case 21:
                k15.b bVar = k15.Companion;
                return new zt(m15.a.a, 0);
            case 22:
                return new zt(vu.a, 0);
            case 23:
                return new hg5();
            case 24:
                return new qt0(27);
            case 25:
                return Integer.valueOf(((k0) gl5.getEntries()).b());
            case 26:
                return me2.G(Boolean.FALSE);
            case 27:
                return new kt5(new LinkedHashMap());
            case 28:
                ye6 ye6Var2 = nt5.a;
                return null;
            default:
                ye6 ye6Var3 = ru5.a;
                return null;
        }
    }
}
