package defpackage;

import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik  reason: default package */
/* loaded from: classes.dex */
public final class ik extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public long Z;
    public String d0;
    public long e0;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public Object h0;
    public Object i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(sz1 sz1Var, long j, o75 o75Var, jb5 jb5Var, pq5 pq5Var, String str, long j2, long j3, long j4, r41 r41Var) {
        super(2, r41Var);
        this.h0 = sz1Var;
        this.Z = j;
        this.i0 = o75Var;
        this.j0 = jb5Var;
        this.k0 = pq5Var;
        this.d0 = str;
        this.e0 = j2;
        this.f0 = j3;
        this.g0 = j4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ik) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ik) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.k0;
        Object obj3 = this.j0;
        switch (i) {
            case 0:
                return new ik((jk) obj3, (String) obj2, this.f0, this.g0, r41Var);
            default:
                return new ik((sz1) this.h0, this.Z, (o75) this.i0, (jb5) obj3, (pq5) obj2, this.d0, this.e0, this.f0, this.g0, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r0 == r1) goto L16;
     */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        jk jkVar;
        hb4 hb4Var;
        String str;
        long j;
        long j2;
        lb5 lb5Var;
        String str2;
        x61 x61Var;
        Object b;
        int i = this.X;
        Object obj2 = this.k0;
        Object obj3 = this.j0;
        switch (i) {
            case 0:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        long j3 = this.e0;
                        long j4 = this.Z;
                        str = this.d0;
                        jkVar = (jk) this.i0;
                        oi2.Y(obj);
                        j = j3;
                        j2 = j4;
                        hb4Var = (hb4) this.h0;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jkVar = (jk) obj3;
                    hb4Var = jkVar.b;
                    String str3 = (String) obj2;
                    this.h0 = hb4Var;
                    this.i0 = jkVar;
                    this.d0 = str3;
                    long j5 = this.f0;
                    this.Z = j5;
                    long j6 = this.g0;
                    this.e0 = j6;
                    this.Y = 1;
                    if (hb4Var.e(this) == x61Var2) {
                        return x61Var2;
                    }
                    str = str3;
                    j = j6;
                    j2 = j5;
                }
                jk jkVar2 = jkVar;
                try {
                    SharedPreferences sharedPreferences = jkVar2.a;
                    String string = sharedPreferences.getString("ra_profile_username", null);
                    if (string == null) {
                        lb5Var = null;
                    } else {
                        lb5Var = new lb5(string, sharedPreferences.getLong("ra_profile_score", 0L), sharedPreferences.getLong("ra_profile_softcore_score", 0L));
                    }
                    if (lb5Var != null) {
                        str2 = lb5Var.a;
                    } else {
                        str2 = null;
                    }
                    if (nb3.k(str2, str)) {
                        String str4 = lb5Var.a;
                        str4.getClass();
                        jk.a(jkVar2, new lb5(str4, j2, j));
                    }
                    hb4Var.h(null);
                    return jg7.a;
                } catch (Throwable th) {
                    hb4Var.h(null);
                    throw th;
                }
            default:
                o75 o75Var = (o75) this.i0;
                sz1 sz1Var = (sz1) this.h0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            b = ((hm5) obj).A;
                            return new hm5(b);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    qf4 qf4Var = sz1Var.h;
                    fb5 fb5Var = new fb5(this.Z, o75Var.a, true, false);
                    this.Y = 1;
                    if (qf4Var.b(fb5Var, this) == x61Var3) {
                        x61Var = x61Var3;
                        return x61Var;
                    }
                }
                oj4 oj4Var = sz1Var.i;
                String a = ((jb5) obj3).a();
                String str5 = ((pq5) obj2).i;
                long j7 = this.Z;
                long j8 = o75Var.a;
                String str6 = this.d0;
                long j9 = this.e0;
                gk4 gk4Var = gk4.SOFTCORE;
                ik4 ik4Var = ik4.OFFLINE_AFTER_START;
                this.Y = 2;
                x61Var = x61Var3;
                b = oj4Var.b(a, str5, j7, j8, str6, j9, this.f0, this.g0, gk4Var, ik4Var, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(jk jkVar, String str, long j, long j2, r41 r41Var) {
        super(2, r41Var);
        this.j0 = jkVar;
        this.k0 = str;
        this.f0 = j;
        this.g0 = j2;
    }
}
