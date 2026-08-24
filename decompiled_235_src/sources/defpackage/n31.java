package defpackage;

import android.app.DownloadManager;
import android.net.Uri;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n31  reason: default package */
/* loaded from: classes.dex */
public final class n31 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 2;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(sz1 sz1Var, pz1 pz1Var, String str, long j, gk4 gk4Var, ik4 ik4Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = sz1Var;
        this.e0 = pz1Var;
        this.f0 = str;
        this.Z = j;
        this.g0 = gk4Var;
        this.h0 = ik4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((n31) q((r41) obj2, (k86) obj)).s(jg7Var);
            case 1:
                return ((n31) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((n31) q((r41) obj2, (r35) obj)).s(jg7Var);
            default:
                return ((n31) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.h0;
        Object obj3 = this.g0;
        Object obj4 = this.f0;
        Object obj5 = this.e0;
        switch (i) {
            case 0:
                n31 n31Var = new n31((nh7) obj5, (p31) obj4, (z70) obj3, this.Z, (rc3) obj2, r41Var);
                n31Var.d0 = obj;
                return n31Var;
            case 1:
                return new n31((sz1) this.d0, (pz1) obj5, (String) obj4, this.Z, (gk4) obj3, (ik4) obj2, r41Var);
            case 2:
                n31 n31Var2 = new n31(this.Z, (hs2) obj5, (DownloadManager) obj4, (kt) obj3, (File) obj2, r41Var);
                n31Var2.d0 = obj;
                return n31Var2;
            default:
                return new n31((zx4) this.d0, (String) obj5, this.Z, (k47) obj4, (p27) obj3, (mk4) obj2, r41Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object e;
        Object obj2;
        String str;
        int i = this.X;
        long j = this.Z;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.f0;
        Object obj4 = this.g0;
        Object obj5 = this.h0;
        Object obj6 = this.e0;
        switch (i) {
            case 0:
                z70 z70Var = (z70) obj4;
                p31 p31Var = (p31) obj3;
                nh7 nh7Var = (nh7) obj6;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                nh7Var.e = p31.R0(p31Var, z70Var, j);
                t00 t00Var = new t00(p31Var, nh7Var, (rc3) obj5, (k86) this.d0);
                u6 u6Var = new u6(p31Var, nh7Var, z70Var, 5);
                this.Y = 1;
                if (nh7Var.a(t00Var, u6Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        e = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pz1 pz1Var = (pz1) obj6;
                    this.Y = 1;
                    e = ((sz1) this.d0).i.e(pz1Var.a, pz1Var.b, pz1Var.c.b, (String) obj3, this.Z, false, (gk4) obj4, (ik4) obj5, this);
                    if (e == x61Var2) {
                        return x61Var2;
                    }
                }
                return new hm5(e);
            case 2:
                hs2 hs2Var = (hs2) obj6;
                r35 r35Var = (r35) this.d0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                gs2 gs2Var = new gs2((DownloadManager) obj3, this.Z, r35Var, (hs2) obj6, (kt) obj4, (File) obj5);
                Uri parse = Uri.parse("content://downloads/my_downloads/" + j);
                hs2Var.a.getContentResolver().registerContentObserver(parse, false, gs2Var);
                gs2Var.onChange(false, parse);
                ci2 ci2Var = new ci2(2, hs2Var, gs2Var);
                this.d0 = null;
                this.Y = 1;
                if (kj2.q(r35Var, ci2Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            default:
                mk4 mk4Var = (mk4) obj5;
                String str2 = (String) obj6;
                p27 p27Var = (p27) obj4;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        obj2 = obj;
                        str = str2;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    zx4 zx4Var = (zx4) this.d0;
                    this.Y = 1;
                    zx4Var.getClass();
                    if (str2.length() != 0) {
                        long j2 = this.Z;
                        if (!k47.c(j2)) {
                            str = str2;
                            obj2 = hv.d0(zx4Var.a, new l5(zx4Var, new yx4(j2, null, zx4Var, str2), (r41) null, 24), this);
                            if (obj2 == x61Var4) {
                                return x61Var4;
                            }
                        }
                    }
                    obj2 = null;
                    str = str2;
                    if (obj2 == x61Var4) {
                    }
                }
                k47 k47Var = (k47) obj2;
                if (k47Var != null) {
                    long j3 = k47Var.a;
                    long f = jx2.f(mk4Var.i((int) (j3 >> 32)), mk4Var.i((int) (j3 & 4294967295L)));
                    if (!k47.a(f, (k47) obj3) && nb3.k(p27Var.n().a.B, str) && mk4Var == p27Var.b) {
                        p27Var.c.g(p27.e(p27Var.n().a, f));
                        p27Var.w = new k47(f);
                        return jg7Var;
                    }
                    return jg7Var;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(long j, hs2 hs2Var, DownloadManager downloadManager, kt ktVar, File file, r41 r41Var) {
        super(2, r41Var);
        this.Z = j;
        this.e0 = hs2Var;
        this.f0 = downloadManager;
        this.g0 = ktVar;
        this.h0 = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(zx4 zx4Var, String str, long j, k47 k47Var, p27 p27Var, mk4 mk4Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = zx4Var;
        this.e0 = str;
        this.Z = j;
        this.f0 = k47Var;
        this.g0 = p27Var;
        this.h0 = mk4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(nh7 nh7Var, p31 p31Var, z70 z70Var, long j, rc3 rc3Var, r41 r41Var) {
        super(2, r41Var);
        this.e0 = nh7Var;
        this.f0 = p31Var;
        this.g0 = z70Var;
        this.Z = j;
        this.h0 = rc3Var;
    }
}
