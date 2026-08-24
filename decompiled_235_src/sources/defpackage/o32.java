package defpackage;

import android.util.Log;
import defpackage.sz1;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o32  reason: default package */
/* loaded from: classes.dex */
public final class o32 extends hw6 implements eo2 {
    public String X;
    public String Y;
    public Object Z;
    public dh5 d0;
    public dh5 e0;
    public dh5 f0;
    public dh5 g0;
    public int h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ rc3 j0;
    public final /* synthetic */ sz1 k0;
    public final /* synthetic */ tu0 l0;
    public final /* synthetic */ uz1 m0;
    public final /* synthetic */ pq5 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o32(rc3 rc3Var, sz1 sz1Var, tu0 tu0Var, uz1 uz1Var, pq5 pq5Var, r41 r41Var) {
        super(2, r41Var);
        this.j0 = rc3Var;
        this.k0 = sz1Var;
        this.l0 = tu0Var;
        this.m0 = uz1Var;
        this.n0 = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((o32) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        o32 o32Var = new o32(this.j0, this.k0, this.l0, this.m0, this.n0, r41Var);
        o32Var.i0 = obj;
        return o32Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (defpackage.yh2.n(r4, r30) == r3) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0279 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0398 A[Catch: all -> 0x0316, TryCatch #2 {all -> 0x0316, blocks: (B:128:0x030e, B:132:0x031b, B:136:0x0332, B:141:0x034a, B:146:0x035e, B:148:0x0364, B:167:0x03bb, B:169:0x03cc, B:175:0x03d6, B:177:0x03dc, B:179:0x03e2, B:181:0x03e7, B:191:0x0438, B:182:0x03f8, B:184:0x03fe, B:185:0x040f, B:187:0x0413, B:188:0x0424, B:190:0x0428, B:194:0x044c, B:149:0x0367, B:151:0x0370, B:153:0x0374, B:155:0x0388, B:156:0x038f, B:157:0x0390, B:158:0x0395, B:160:0x0398, B:162:0x039c, B:164:0x03a5, B:166:0x03a9, B:196:0x0485, B:197:0x048c, B:122:0x02e6, B:124:0x02ee, B:202:0x0491, B:75:0x017b), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a5 A[Catch: all -> 0x0316, TryCatch #2 {all -> 0x0316, blocks: (B:128:0x030e, B:132:0x031b, B:136:0x0332, B:141:0x034a, B:146:0x035e, B:148:0x0364, B:167:0x03bb, B:169:0x03cc, B:175:0x03d6, B:177:0x03dc, B:179:0x03e2, B:181:0x03e7, B:191:0x0438, B:182:0x03f8, B:184:0x03fe, B:185:0x040f, B:187:0x0413, B:188:0x0424, B:190:0x0428, B:194:0x044c, B:149:0x0367, B:151:0x0370, B:153:0x0374, B:155:0x0388, B:156:0x038f, B:157:0x0390, B:158:0x0395, B:160:0x0398, B:162:0x039c, B:164:0x03a5, B:166:0x03a9, B:196:0x0485, B:197:0x048c, B:122:0x02e6, B:124:0x02ee, B:202:0x0491, B:75:0x017b), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03cc A[Catch: all -> 0x0316, TryCatch #2 {all -> 0x0316, blocks: (B:128:0x030e, B:132:0x031b, B:136:0x0332, B:141:0x034a, B:146:0x035e, B:148:0x0364, B:167:0x03bb, B:169:0x03cc, B:175:0x03d6, B:177:0x03dc, B:179:0x03e2, B:181:0x03e7, B:191:0x0438, B:182:0x03f8, B:184:0x03fe, B:185:0x040f, B:187:0x0413, B:188:0x0424, B:190:0x0428, B:194:0x044c, B:149:0x0367, B:151:0x0370, B:153:0x0374, B:155:0x0388, B:156:0x038f, B:157:0x0390, B:158:0x0395, B:160:0x0398, B:162:0x039c, B:164:0x03a5, B:166:0x03a9, B:196:0x0485, B:197:0x048c, B:122:0x02e6, B:124:0x02ee, B:202:0x0491, B:75:0x017b), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d6 A[Catch: all -> 0x0316, TryCatch #2 {all -> 0x0316, blocks: (B:128:0x030e, B:132:0x031b, B:136:0x0332, B:141:0x034a, B:146:0x035e, B:148:0x0364, B:167:0x03bb, B:169:0x03cc, B:175:0x03d6, B:177:0x03dc, B:179:0x03e2, B:181:0x03e7, B:191:0x0438, B:182:0x03f8, B:184:0x03fe, B:185:0x040f, B:187:0x0413, B:188:0x0424, B:190:0x0428, B:194:0x044c, B:149:0x0367, B:151:0x0370, B:153:0x0374, B:155:0x0388, B:156:0x038f, B:157:0x0390, B:158:0x0395, B:160:0x0398, B:162:0x039c, B:164:0x03a5, B:166:0x03a9, B:196:0x0485, B:197:0x048c, B:122:0x02e6, B:124:0x02ee, B:202:0x0491, B:75:0x017b), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044c A[Catch: all -> 0x0316, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0316, blocks: (B:128:0x030e, B:132:0x031b, B:136:0x0332, B:141:0x034a, B:146:0x035e, B:148:0x0364, B:167:0x03bb, B:169:0x03cc, B:175:0x03d6, B:177:0x03dc, B:179:0x03e2, B:181:0x03e7, B:191:0x0438, B:182:0x03f8, B:184:0x03fe, B:185:0x040f, B:187:0x0413, B:188:0x0424, B:190:0x0428, B:194:0x044c, B:149:0x0367, B:151:0x0370, B:153:0x0374, B:155:0x0388, B:156:0x038f, B:157:0x0390, B:158:0x0395, B:160:0x0398, B:162:0x039c, B:164:0x03a5, B:166:0x03a9, B:196:0x0485, B:197:0x048c, B:122:0x02e6, B:124:0x02ee, B:202:0x0491, B:75:0x017b), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0549 A[Catch: all -> 0x04eb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x04eb, blocks: (B:208:0x04dc, B:212:0x04ee, B:215:0x04f4, B:218:0x0501, B:222:0x0549), top: B:230:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x009d, blocks: (B:31:0x0097, B:52:0x00de, B:34:0x00a0, B:35:0x00a4, B:40:0x00af), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0248 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:7:0x002d, B:12:0x0046, B:100:0x026d, B:102:0x0271, B:104:0x0279, B:109:0x0288, B:111:0x028c, B:117:0x0297, B:120:0x02ca, B:93:0x0230, B:95:0x0240, B:97:0x0248, B:20:0x0071, B:87:0x01e2, B:89:0x0211, B:23:0x007c, B:70:0x0169, B:73:0x0174, B:74:0x017a, B:76:0x017d, B:77:0x017e, B:78:0x0191, B:80:0x0197, B:82:0x01ac, B:83:0x01b0, B:26:0x0087, B:62:0x014a, B:64:0x014e, B:67:0x0154, B:29:0x0092, B:59:0x012a, B:55:0x0118), top: B:227:0x0012 }] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        String str;
        boolean z;
        boolean h1;
        sx1 sx1Var;
        of6 of6Var;
        sz1 sz1Var;
        Object e;
        sz1 sz1Var2;
        String str2;
        Object b;
        hb5 hb5Var;
        Object b2;
        sx1 sx1Var2;
        of6 of6Var2;
        kd6 kd6Var;
        Object D;
        String str3;
        sz1 sz1Var3;
        dh5 dh5Var;
        sz1.b bVar;
        dh5 dh5Var2;
        dh5 dh5Var3;
        pz1 pz1Var;
        dh5 dh5Var4;
        String str4;
        dh5 dh5Var5;
        Object e0;
        String str5;
        dh5 dh5Var6;
        dh5 dh5Var7;
        rz1 rz1Var;
        Object d0;
        boolean z2;
        boolean z3;
        sz1.a aVar;
        boolean z4;
        kd6 kd6Var2;
        boolean D2;
        sx1 sx1Var3;
        dh5 dh5Var8;
        pz1 pz1Var2;
        Object e02;
        dh5 dh5Var9;
        int i;
        dp2 dp2Var;
        ep2 ep2Var;
        ep2 ep2Var2;
        sx1 sx1Var4;
        dp2 dp2Var2;
        boolean z5;
        of6 of6Var3;
        of6 of6Var4;
        of6 of6Var5;
        pz1 pz1Var3;
        of6 of6Var6;
        String str6;
        w61 w61Var = (w61) this.i0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        switch (this.h0) {
            case 0:
                oi2.Y(obj);
                try {
                    rc3 rc3Var = this.j0;
                    if (rc3Var != null) {
                        this.i0 = w61Var;
                        this.h0 = 1;
                        break;
                    }
                    sz1Var = this.k0;
                    this.i0 = w61Var;
                    this.h0 = 2;
                    if (sz1.f(sz1Var, this) == x61Var) {
                        return x61Var;
                    }
                    sz1 sz1Var4 = this.k0;
                    this.i0 = w61Var;
                    this.h0 = 3;
                    e = sz1.e(sz1Var4, this);
                    if (e == x61Var) {
                        return x61Var;
                    }
                    str = (String) e;
                    sz1Var2 = this.k0;
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                    str = null;
                    if (str != null) {
                    }
                    if (!(th instanceof CancellationException)) {
                    }
                }
                if (str != null) {
                    sz1Var2.N = null;
                    sz1Var2.O = sz1.c.DISABLED;
                    sz1Var2.w.d(dp2.DISABLED_LOAD_ERROR);
                    this.k0.G0("ra_runtime_identity_lease_rejected", new vr4("reason", "authentication_mutation_or_mismatch"));
                    this.k0.N0.k(new la5(null));
                    tu0 tu0Var = this.l0;
                    jg7 jg7Var = jg7.a;
                    tu0Var.b0(jg7Var);
                    this.l0.b0(jg7Var);
                    return jg7Var;
                }
                this.i0 = w61Var;
                this.X = str;
                this.Y = str;
                this.h0 = 4;
                if (sz1.f(sz1Var2, this) != x61Var) {
                    str2 = str;
                    yh2.o(b());
                    pn5 pn5Var = this.k0.g;
                    this.i0 = w61Var;
                    this.X = str;
                    this.Y = str2;
                    this.h0 = 5;
                    b = ((pl) pn5Var).c.b(this);
                    if (b == x61Var) {
                        return x61Var;
                    }
                    if (b instanceof hb5) {
                        hb5Var = (hb5) b;
                    } else {
                        hb5Var = null;
                    }
                    if (hb5Var != null) {
                        iw2 iw2Var = this.k0.o0;
                        this.i0 = w61Var;
                        this.X = str;
                        this.Y = str2;
                        this.h0 = 6;
                        b2 = iw2Var.b(str2, hb5Var, this);
                        if (b2 == x61Var) {
                            return x61Var;
                        }
                        if (((Boolean) b2).booleanValue()) {
                            Object obj2 = this.k0.P;
                            sz1 sz1Var5 = this.k0;
                            synchronized (obj2) {
                                sz1Var5.R = str2;
                            }
                            ks3 ks3Var = this.k0.Z;
                            Set entrySet = ks3Var.a.entrySet();
                            entrySet.getClass();
                            Iterator it = entrySet.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getClass();
                                if (((bs3) entry.getValue()).b != as3.PENDING) {
                                    it.remove();
                                }
                            }
                            ks3Var.b.clear();
                            ks3Var.e = true;
                            this.k0.a0.k();
                            sz1 sz1Var6 = this.k0;
                            kd6Var = sz1Var6.c;
                            wp0 C = ((ng6) kd6Var).C();
                            this.i0 = w61Var;
                            this.X = str;
                            this.Y = str2;
                            this.Z = sz1Var6;
                            this.h0 = 7;
                            D = f04.D(C, this);
                            if (D != x61Var) {
                                str3 = str2;
                                sz1Var3 = sz1Var6;
                                sz1Var3.T = nb3.k(D, Boolean.TRUE);
                                this.k0.M = null;
                                sz1 sz1Var7 = this.k0;
                                sz1Var7.N = null;
                                sz1Var7.O = sz1.c.DISABLED;
                                dh5Var = new dh5();
                                uz1 uz1Var = this.m0;
                                dh5Var.A = uz1Var;
                                dh5 dh5Var10 = new dh5();
                                bVar = uz1Var.a;
                                dh5Var10.A = bVar;
                                dh5Var2 = new dh5();
                                if (bVar != sz1.b.OFFLINE_ACCUMULATING) {
                                    pq5 pq5Var = this.n0;
                                    this.i0 = w61Var;
                                    this.X = str;
                                    this.Y = str3;
                                    this.Z = dh5Var;
                                    this.d0 = dh5Var10;
                                    this.e0 = dh5Var2;
                                    this.f0 = dh5Var2;
                                    this.h0 = 8;
                                    e0 = sz1Var7.e0(pq5Var, this);
                                    if (e0 != x61Var) {
                                        str5 = str3;
                                        dh5Var6 = dh5Var10;
                                        dh5Var7 = dh5Var2;
                                        pz1Var = (pz1) e0;
                                        String str7 = str5;
                                        dh5Var3 = dh5Var2;
                                        dh5Var2 = dh5Var7;
                                        dh5Var5 = dh5Var6;
                                        dh5Var4 = dh5Var;
                                        str4 = str7;
                                        dh5Var3.A = pz1Var;
                                        if (dh5Var5.A != sz1.b.OFFLINE_ACCUMULATING) {
                                            de1 a = xk1.a();
                                            f02 f02Var = new f02(this.k0, this.n0, null, 3);
                                            this.i0 = w61Var;
                                            this.X = str;
                                            this.Y = str4;
                                            this.Z = dh5Var4;
                                            this.d0 = dh5Var5;
                                            this.e0 = dh5Var2;
                                            this.f0 = null;
                                            this.h0 = 9;
                                            d0 = hv.d0(a, f02Var, this);
                                            if (d0 == x61Var) {
                                                return x61Var;
                                            }
                                            rz1Var = (rz1) d0;
                                            if (!((uz1) dh5Var4.A).g) {
                                                if (((uz1) dh5Var4.A).b == sz1.d.HARDCORE) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (rz1Var != null) {
                                                    aVar = rz1Var.b;
                                                } else {
                                                    aVar = null;
                                                }
                                                if (aVar == sz1.a.NETWORK) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z3 && !z4) {
                                                    uz1 a2 = uz1.a((uz1) dh5Var4.A, sz1.b.OFFLINE_ACCUMULATING, sz1.d.SOFTCORE, ik4.OFFLINE_FROM_START, null, 0L, 448);
                                                    dh5Var4.A = a2;
                                                    sz1.b bVar2 = a2.a;
                                                    dh5Var5.A = bVar2;
                                                    this.k0.G = bVar2;
                                                    this.k0.H = ((uz1) dh5Var4.A).b;
                                                    try {
                                                        this.k0.I = false;
                                                        this.k0.J = false;
                                                        kd6Var2 = this.k0.c;
                                                        D2 = ((ng6) kd6Var2).D();
                                                        sx1Var3 = this.k0.w;
                                                        rx1 rx1Var = new rx1(this.n0);
                                                        sx1Var3.b = D2;
                                                        z2 = false;
                                                        sx1Var3.a = false;
                                                        sx1Var3.d = false;
                                                        sx1Var3.e = rx1Var;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        z = false;
                                                        if (str != null) {
                                                        }
                                                        if (!(th instanceof CancellationException)) {
                                                        }
                                                    }
                                                    if (D2) {
                                                        sz1 sz1Var8 = this.k0;
                                                        pq5 pq5Var2 = this.n0;
                                                        this.i0 = w61Var;
                                                        this.X = str;
                                                        this.Y = str4;
                                                        this.Z = dh5Var4;
                                                        this.d0 = dh5Var5;
                                                        this.e0 = dh5Var2;
                                                        this.f0 = null;
                                                        this.g0 = dh5Var2;
                                                        this.h0 = 10;
                                                        e02 = sz1Var8.e0(pq5Var2, this);
                                                        if (e02 != x61Var) {
                                                            dh5Var9 = dh5Var2;
                                                            pz1Var2 = (pz1) e02;
                                                            dh5 dh5Var11 = dh5Var2;
                                                            dh5Var2 = dh5Var9;
                                                            dh5Var8 = dh5Var11;
                                                            dh5Var2.A = pz1Var2;
                                                            sz1 sz1Var9 = this.k0;
                                                            vr4 a0 = kj2.a0("reason", "network_bootstrap_unavailable");
                                                            if (dh5Var8.A != null) {
                                                                str6 = "softcore_offline";
                                                            } else {
                                                                str6 = "disabled";
                                                            }
                                                            sz1Var9.H0("ra_hardcore_online_bootstrap_rejected", a0, kj2.a0("fallback", str6));
                                                            dh5Var2 = dh5Var8;
                                                            rz1Var = null;
                                                            dh5 dh5Var12 = dh5Var4;
                                                            i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                                                            if (i == 1 && i != 2) {
                                                                if (i == 3) {
                                                                    pz1 pz1Var4 = (pz1) dh5Var2.A;
                                                                    if (pz1Var4 != null) {
                                                                        ep2Var2 = pz1Var4.d;
                                                                        sx1Var4 = this.k0.w;
                                                                        sx1Var4.d(ep2Var2.a);
                                                                        dp2Var2 = ep2Var2.a;
                                                                        if (dp2Var2 != dp2.ENABLED_FULL) {
                                                                            z5 = z2;
                                                                            if (!z5) {
                                                                            }
                                                                        }
                                                                        z5 = true;
                                                                        if (!z5) {
                                                                        }
                                                                    } else {
                                                                        dp2 dp2Var3 = dp2.DISABLED_LOAD_ERROR;
                                                                        dp2Var3.getClass();
                                                                        if (dp2Var3 != dp2.ENABLED_FULL && dp2Var3 != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                                                            yt1 yt1Var = yt1.A;
                                                                            ep2Var = new ep2(dp2Var3, yt1Var, yt1Var, 0, null, null);
                                                                            ep2Var2 = ep2Var;
                                                                            sx1Var4 = this.k0.w;
                                                                            sx1Var4.d(ep2Var2.a);
                                                                            dp2Var2 = ep2Var2.a;
                                                                            if (dp2Var2 != dp2.ENABLED_FULL) {
                                                                            }
                                                                            z5 = true;
                                                                            if (!z5) {
                                                                            }
                                                                        } else {
                                                                            throw new IllegalArgumentException("Failed requirement.");
                                                                        }
                                                                    }
                                                                } else {
                                                                    throw new ug(9);
                                                                }
                                                            } else {
                                                                if (rz1Var != null || (ep2Var2 = rz1Var.a) == null) {
                                                                    dp2Var = dp2.DISABLED_LOAD_ERROR;
                                                                    dp2Var.getClass();
                                                                    if (dp2Var == dp2.ENABLED_FULL && dp2Var != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                                                        yt1 yt1Var2 = yt1.A;
                                                                        ep2Var = new ep2(dp2Var, yt1Var2, yt1Var2, 0, null, null);
                                                                        ep2Var2 = ep2Var;
                                                                    } else {
                                                                        throw new IllegalArgumentException("Failed requirement.");
                                                                    }
                                                                }
                                                                sx1Var4 = this.k0.w;
                                                                sx1Var4.d(ep2Var2.a);
                                                                dp2Var2 = ep2Var2.a;
                                                                if (dp2Var2 != dp2.ENABLED_FULL && dp2Var2 != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                                                    z5 = z2;
                                                                    if (!z5) {
                                                                        if (dh5Var5.A == sz1.b.OFFLINE_ACCUMULATING && (pz1Var3 = (pz1) dh5Var2.A) != null && pz1Var3.e) {
                                                                            of6Var6 = this.k0.N0;
                                                                            of6Var6.k(new pa5(ep2Var2.f));
                                                                        } else {
                                                                            dp2 dp2Var4 = ep2Var2.a;
                                                                            if (dp2Var4 == dp2.DISABLED_LOAD_ERROR) {
                                                                                of6Var5 = this.k0.N0;
                                                                                of6Var5.k(new la5(ep2Var2.f));
                                                                            } else if (dp2Var4 == dp2.DISABLED_GAME_NOT_FOUND) {
                                                                                of6Var4 = this.k0.N0;
                                                                                of6Var4.k(new na5(ep2Var2.f));
                                                                            } else if (dp2Var4 == dp2.DISABLED_LOGIN_EXPIRED) {
                                                                                of6Var3 = this.k0.N0;
                                                                                of6Var3.k(new oa5(ep2Var2.f));
                                                                            }
                                                                        }
                                                                        sz1.R(this.k0, str4, "integration_disabled");
                                                                        tu0 tu0Var2 = this.l0;
                                                                        jg7 jg7Var2 = jg7.a;
                                                                        tu0Var2.u0();
                                                                        this.l0.u0();
                                                                        return jg7Var2;
                                                                    }
                                                                    ap6 L = hv.L(w61Var, null, null, new n32(dh5Var5, this.k0, ep2Var2, this.n0, dh5Var12, str4, dh5Var2, null), 3);
                                                                    this.k0.F = L;
                                                                    L.a0(new t00(this.k0, str4, ep2Var2, 13));
                                                                    this.l0.u0();
                                                                    this.l0.u0();
                                                                    return jg7.a;
                                                                }
                                                                z5 = true;
                                                                if (!z5) {
                                                                }
                                                            }
                                                        }
                                                        return x61Var;
                                                    }
                                                    dh5Var8 = dh5Var2;
                                                    pz1Var2 = null;
                                                    dh5Var2.A = pz1Var2;
                                                    sz1 sz1Var92 = this.k0;
                                                    vr4 a02 = kj2.a0("reason", "network_bootstrap_unavailable");
                                                    if (dh5Var8.A != null) {
                                                    }
                                                    sz1Var92.H0("ra_hardcore_online_bootstrap_rejected", a02, kj2.a0("fallback", str6));
                                                    dh5Var2 = dh5Var8;
                                                    rz1Var = null;
                                                    dh5 dh5Var122 = dh5Var4;
                                                    i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                                                    if (i == 1) {
                                                    }
                                                    if (rz1Var != null) {
                                                    }
                                                    dp2Var = dp2.DISABLED_LOAD_ERROR;
                                                    dp2Var.getClass();
                                                    if (dp2Var == dp2.ENABLED_FULL) {
                                                    }
                                                    throw new IllegalArgumentException("Failed requirement.");
                                                }
                                            }
                                            z2 = false;
                                            dh5 dh5Var1222 = dh5Var4;
                                            i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                                            if (i == 1) {
                                            }
                                            if (rz1Var != null) {
                                            }
                                            dp2Var = dp2.DISABLED_LOAD_ERROR;
                                            dp2Var.getClass();
                                            if (dp2Var == dp2.ENABLED_FULL) {
                                            }
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        rz1Var = null;
                                        if (!((uz1) dh5Var4.A).g) {
                                        }
                                        z2 = false;
                                        dh5 dh5Var12222 = dh5Var4;
                                        i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                                        if (i == 1) {
                                        }
                                        if (rz1Var != null) {
                                        }
                                        dp2Var = dp2.DISABLED_LOAD_ERROR;
                                        dp2Var.getClass();
                                        if (dp2Var == dp2.ENABLED_FULL) {
                                        }
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    return x61Var;
                                }
                                dh5Var3 = dh5Var2;
                                pz1Var = null;
                                dh5Var4 = dh5Var;
                                str4 = str3;
                                dh5Var5 = dh5Var10;
                                dh5Var3.A = pz1Var;
                                if (dh5Var5.A != sz1.b.OFFLINE_ACCUMULATING) {
                                }
                            } else {
                                return x61Var;
                            }
                        }
                    }
                    sz1.R(this.k0, str2, "hardcore_queue_session_rejected");
                    sz1 sz1Var10 = this.k0;
                    sz1Var10.N = null;
                    sz1Var10.O = sz1.c.DISABLED;
                    sx1Var2 = sz1Var10.w;
                    sx1Var2.d(dp2.DISABLED_LOAD_ERROR);
                    this.k0.G0("ra_runtime_identity_lease_rejected", kj2.a0("reason", "hardcore_queue_not_empty_after_terminal_discard"));
                    of6Var2 = this.k0.N0;
                    of6Var2.k(new la5(null));
                    tu0 tu0Var3 = this.l0;
                    jg7 jg7Var3 = jg7.a;
                    tu0Var3.u0();
                    this.l0.u0();
                    return jg7Var3;
                }
                return x61Var;
            case 1:
                oi2.Y(obj);
                sz1Var = this.k0;
                this.i0 = w61Var;
                this.h0 = 2;
                if (sz1.f(sz1Var, this) == x61Var) {
                }
                sz1 sz1Var42 = this.k0;
                this.i0 = w61Var;
                this.h0 = 3;
                e = sz1.e(sz1Var42, this);
                if (e == x61Var) {
                }
                str = (String) e;
                sz1Var2 = this.k0;
                if (str != null) {
                }
                break;
            case 2:
                oi2.Y(obj);
                sz1 sz1Var422 = this.k0;
                this.i0 = w61Var;
                this.h0 = 3;
                e = sz1.e(sz1Var422, this);
                if (e == x61Var) {
                }
                str = (String) e;
                sz1Var2 = this.k0;
                if (str != null) {
                }
                break;
            case 3:
                oi2.Y(obj);
                e = obj;
                str = (String) e;
                sz1Var2 = this.k0;
                if (str != null) {
                }
                break;
            case 4:
                str2 = this.Y;
                str = this.X;
                oi2.Y(obj);
                yh2.o(b());
                pn5 pn5Var2 = this.k0.g;
                this.i0 = w61Var;
                this.X = str;
                this.Y = str2;
                this.h0 = 5;
                b = ((pl) pn5Var2).c.b(this);
                if (b == x61Var) {
                }
                if (b instanceof hb5) {
                }
                if (hb5Var != null) {
                }
                sz1.R(this.k0, str2, "hardcore_queue_session_rejected");
                sz1 sz1Var102 = this.k0;
                sz1Var102.N = null;
                sz1Var102.O = sz1.c.DISABLED;
                sx1Var2 = sz1Var102.w;
                sx1Var2.d(dp2.DISABLED_LOAD_ERROR);
                this.k0.G0("ra_runtime_identity_lease_rejected", kj2.a0("reason", "hardcore_queue_not_empty_after_terminal_discard"));
                of6Var2 = this.k0.N0;
                of6Var2.k(new la5(null));
                tu0 tu0Var32 = this.l0;
                jg7 jg7Var32 = jg7.a;
                tu0Var32.u0();
                this.l0.u0();
                return jg7Var32;
            case 5:
                str2 = this.Y;
                str = this.X;
                oi2.Y(obj);
                b = obj;
                if (b instanceof hb5) {
                }
                if (hb5Var != null) {
                }
                sz1.R(this.k0, str2, "hardcore_queue_session_rejected");
                sz1 sz1Var1022 = this.k0;
                sz1Var1022.N = null;
                sz1Var1022.O = sz1.c.DISABLED;
                sx1Var2 = sz1Var1022.w;
                sx1Var2.d(dp2.DISABLED_LOAD_ERROR);
                this.k0.G0("ra_runtime_identity_lease_rejected", kj2.a0("reason", "hardcore_queue_not_empty_after_terminal_discard"));
                of6Var2 = this.k0.N0;
                of6Var2.k(new la5(null));
                tu0 tu0Var322 = this.l0;
                jg7 jg7Var322 = jg7.a;
                tu0Var322.u0();
                this.l0.u0();
                return jg7Var322;
            case 6:
                str2 = this.Y;
                str = this.X;
                oi2.Y(obj);
                b2 = obj;
                if (((Boolean) b2).booleanValue()) {
                }
                sz1.R(this.k0, str2, "hardcore_queue_session_rejected");
                sz1 sz1Var10222 = this.k0;
                sz1Var10222.N = null;
                sz1Var10222.O = sz1.c.DISABLED;
                sx1Var2 = sz1Var10222.w;
                sx1Var2.d(dp2.DISABLED_LOAD_ERROR);
                this.k0.G0("ra_runtime_identity_lease_rejected", kj2.a0("reason", "hardcore_queue_not_empty_after_terminal_discard"));
                of6Var2 = this.k0.N0;
                of6Var2.k(new la5(null));
                tu0 tu0Var3222 = this.l0;
                jg7 jg7Var3222 = jg7.a;
                tu0Var3222.u0();
                this.l0.u0();
                return jg7Var3222;
            case 7:
                sz1Var3 = (sz1) this.Z;
                str3 = this.Y;
                str = this.X;
                oi2.Y(obj);
                D = obj;
                sz1Var3.T = nb3.k(D, Boolean.TRUE);
                this.k0.M = null;
                sz1 sz1Var72 = this.k0;
                sz1Var72.N = null;
                sz1Var72.O = sz1.c.DISABLED;
                dh5Var = new dh5();
                uz1 uz1Var2 = this.m0;
                dh5Var.A = uz1Var2;
                dh5 dh5Var102 = new dh5();
                bVar = uz1Var2.a;
                dh5Var102.A = bVar;
                dh5Var2 = new dh5();
                if (bVar != sz1.b.OFFLINE_ACCUMULATING) {
                }
                break;
            case 8:
                dh5 dh5Var13 = this.f0;
                dh5Var7 = this.e0;
                dh5Var6 = this.d0;
                dh5Var = (dh5) this.Z;
                String str8 = this.Y;
                String str9 = this.X;
                try {
                    oi2.Y(obj);
                    dh5Var2 = dh5Var13;
                    str5 = str8;
                    str = str9;
                    e0 = obj;
                    pz1Var = (pz1) e0;
                    String str72 = str5;
                    dh5Var3 = dh5Var2;
                    dh5Var2 = dh5Var7;
                    dh5Var5 = dh5Var6;
                    dh5Var4 = dh5Var;
                    str4 = str72;
                    dh5Var3.A = pz1Var;
                    if (dh5Var5.A != sz1.b.OFFLINE_ACCUMULATING) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str = str9;
                    z = false;
                    if (str != null) {
                        try {
                            sz1 sz1Var11 = this.k0;
                            h1 = sz1Var11.h1(str, "bootstrap_failed", new dz1(sz1Var11, 2));
                        } catch (Throwable th7) {
                            this.l0.u0();
                            throw th7;
                        }
                    } else {
                        h1 = z;
                    }
                    if (!(th instanceof CancellationException)) {
                        if (!h1) {
                            tu0 tu0Var4 = this.l0;
                            jg7 jg7Var4 = jg7.a;
                            tu0Var4.u0();
                            this.l0.u0();
                            return jg7Var4;
                        }
                        Log.e("EmulatorViewModel", "RetroAchievements bootstrap failed for '" + this.n0.a + "'", th);
                        this.l0.u0();
                        this.k0.I0(null);
                        sz1 sz1Var12 = this.k0;
                        sz1Var12.N = null;
                        sz1Var12.O = sz1.c.DISABLED;
                        sx1Var = sz1Var12.w;
                        sx1Var.d(dp2.DISABLED_LOAD_ERROR);
                        of6Var = this.k0.N0;
                        of6Var.k(new la5(null));
                        this.l0.u0();
                        return jg7.a;
                    }
                    throw th;
                }
                break;
            case 9:
                dh5 dh5Var14 = this.e0;
                dh5Var5 = this.d0;
                dh5Var4 = (dh5) this.Z;
                str4 = this.Y;
                str = this.X;
                oi2.Y(obj);
                dh5Var2 = dh5Var14;
                d0 = obj;
                rz1Var = (rz1) d0;
                if (!((uz1) dh5Var4.A).g) {
                }
                z2 = false;
                dh5 dh5Var122222 = dh5Var4;
                i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                if (i == 1) {
                }
                if (rz1Var != null) {
                }
                dp2Var = dp2.DISABLED_LOAD_ERROR;
                dp2Var.getClass();
                if (dp2Var == dp2.ENABLED_FULL) {
                }
                throw new IllegalArgumentException("Failed requirement.");
            case 10:
                dh5Var9 = this.g0;
                rz1 rz1Var2 = (rz1) this.f0;
                dh5 dh5Var15 = this.e0;
                dh5Var5 = this.d0;
                dh5Var4 = (dh5) this.Z;
                str4 = this.Y;
                String str10 = this.X;
                oi2.Y(obj);
                dh5Var2 = dh5Var15;
                z2 = false;
                e02 = obj;
                pz1Var2 = (pz1) e02;
                dh5 dh5Var112 = dh5Var2;
                dh5Var2 = dh5Var9;
                dh5Var8 = dh5Var112;
                dh5Var2.A = pz1Var2;
                sz1 sz1Var922 = this.k0;
                vr4 a022 = kj2.a0("reason", "network_bootstrap_unavailable");
                if (dh5Var8.A != null) {
                }
                sz1Var922.H0("ra_hardcore_online_bootstrap_rejected", a022, kj2.a0("fallback", str6));
                dh5Var2 = dh5Var8;
                rz1Var = null;
                dh5 dh5Var1222222 = dh5Var4;
                i = l32.a[((sz1.b) dh5Var5.A).ordinal()];
                if (i == 1) {
                }
                if (rz1Var != null) {
                }
                dp2Var = dp2.DISABLED_LOAD_ERROR;
                dp2Var.getClass();
                if (dp2Var == dp2.ENABLED_FULL) {
                }
                throw new IllegalArgumentException("Failed requirement.");
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
