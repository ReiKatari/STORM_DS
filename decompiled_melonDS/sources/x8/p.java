package x8;

import androidx.work.OverwritingInputMerger;
import p8.c0;
import p8.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: z  reason: collision with root package name */
    public static final wa.b f14419z;

    /* renamed from: a  reason: collision with root package name */
    public final String f14420a;

    /* renamed from: b  reason: collision with root package name */
    public e0 f14421b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14422c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14423d;

    /* renamed from: e  reason: collision with root package name */
    public p8.h f14424e;

    /* renamed from: f  reason: collision with root package name */
    public final p8.h f14425f;

    /* renamed from: g  reason: collision with root package name */
    public final long f14426g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14427h;

    /* renamed from: i  reason: collision with root package name */
    public final long f14428i;

    /* renamed from: j  reason: collision with root package name */
    public p8.e f14429j;

    /* renamed from: k  reason: collision with root package name */
    public final int f14430k;

    /* renamed from: l  reason: collision with root package name */
    public p8.a f14431l;
    public long m;

    /* renamed from: n  reason: collision with root package name */
    public long f14432n;

    /* renamed from: o  reason: collision with root package name */
    public final long f14433o;

    /* renamed from: p  reason: collision with root package name */
    public final long f14434p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14435q;

    /* renamed from: r  reason: collision with root package name */
    public c0 f14436r;

    /* renamed from: s  reason: collision with root package name */
    public final int f14437s;

    /* renamed from: t  reason: collision with root package name */
    public final int f14438t;

    /* renamed from: u  reason: collision with root package name */
    public final long f14439u;

    /* renamed from: v  reason: collision with root package name */
    public final int f14440v;

    /* renamed from: w  reason: collision with root package name */
    public final int f14441w;

    /* renamed from: x  reason: collision with root package name */
    public String f14442x;

    /* renamed from: y  reason: collision with root package name */
    public final Boolean f14443y;

    static {
        p8.v.g("WorkSpec");
        f14419z = new wa.b(11);
    }

    public /* synthetic */ p(String str, e0 e0Var, String str2, String str3, p8.h hVar, p8.h hVar2, long j2, long j10, long j11, p8.e eVar, int i2, p8.a aVar, long j12, long j13, long j14, long j15, boolean z10, c0 c0Var, int i10, long j16, int i11, int i12, String str4, Boolean bool, int i13) {
        this(str, (i13 & 2) != 0 ? e0.ENQUEUED : e0Var, str2, (i13 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i13 & 16) != 0 ? p8.h.f11493b : hVar, (i13 & 32) != 0 ? p8.h.f11493b : hVar2, (i13 & 64) != 0 ? 0L : j2, (i13 & 128) != 0 ? 0L : j10, (i13 & 256) != 0 ? 0L : j11, (i13 & 512) != 0 ? p8.e.f11470j : eVar, (i13 & 1024) != 0 ? 0 : i2, (i13 & 2048) != 0 ? p8.a.EXPONENTIAL : aVar, (i13 & 4096) != 0 ? 30000L : j12, (i13 & 8192) != 0 ? -1L : j13, (i13 & 16384) == 0 ? j14 : 0L, (32768 & i13) != 0 ? -1L : j15, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : c0Var, (262144 & i13) != 0 ? 0 : i10, 0, (1048576 & i13) != 0 ? Long.MAX_VALUE : j16, (2097152 & i13) != 0 ? 0 : i11, (4194304 & i13) != 0 ? -256 : i12, (8388608 & i13) != 0 ? null : str4, (i13 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static p b(p pVar, String str, p8.h hVar) {
        String str2 = pVar.f14420a;
        e0 e0Var = pVar.f14421b;
        String str3 = pVar.f14423d;
        p8.h hVar2 = pVar.f14425f;
        long j2 = pVar.f14426g;
        long j10 = pVar.f14427h;
        long j11 = pVar.f14428i;
        p8.e eVar = pVar.f14429j;
        int i2 = pVar.f14430k;
        p8.a aVar = pVar.f14431l;
        long j12 = pVar.m;
        long j13 = pVar.f14432n;
        long j14 = pVar.f14433o;
        long j15 = pVar.f14434p;
        boolean z10 = pVar.f14435q;
        c0 c0Var = pVar.f14436r;
        int i10 = pVar.f14437s;
        int i11 = pVar.f14438t;
        long j16 = pVar.f14439u;
        int i12 = pVar.f14440v;
        int i13 = pVar.f14441w;
        String str4 = pVar.f14442x;
        Boolean bool = pVar.f14443y;
        pVar.getClass();
        str2.getClass();
        e0Var.getClass();
        str3.getClass();
        hVar2.getClass();
        eVar.getClass();
        aVar.getClass();
        c0Var.getClass();
        return new p(str2, e0Var, str, str3, hVar, hVar2, j2, j10, j11, eVar, i2, aVar, j12, j13, j14, j15, z10, c0Var, i10, i11, j16, i12, i13, str4, bool);
    }

    public final long a() {
        boolean z10;
        if (this.f14421b == e0.ENQUEUED && this.f14430k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return p7.k.e(z10, this.f14430k, this.f14431l, this.m, this.f14432n, this.f14437s, c(), this.f14426g, this.f14428i, this.f14427h, this.f14439u);
    }

    public final boolean c() {
        if (this.f14427h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (nc.k.a(this.f14420a, pVar.f14420a) && this.f14421b == pVar.f14421b && nc.k.a(this.f14422c, pVar.f14422c) && nc.k.a(this.f14423d, pVar.f14423d) && nc.k.a(this.f14424e, pVar.f14424e) && nc.k.a(this.f14425f, pVar.f14425f) && this.f14426g == pVar.f14426g && this.f14427h == pVar.f14427h && this.f14428i == pVar.f14428i && nc.k.a(this.f14429j, pVar.f14429j) && this.f14430k == pVar.f14430k && this.f14431l == pVar.f14431l && this.m == pVar.m && this.f14432n == pVar.f14432n && this.f14433o == pVar.f14433o && this.f14434p == pVar.f14434p && this.f14435q == pVar.f14435q && this.f14436r == pVar.f14436r && this.f14437s == pVar.f14437s && this.f14438t == pVar.f14438t && this.f14439u == pVar.f14439u && this.f14440v == pVar.f14440v && this.f14441w == pVar.f14441w && nc.k.a(this.f14442x, pVar.f14442x) && nc.k.a(this.f14443y, pVar.f14443y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d4 = w.d.d(w.d.d((this.f14421b.hashCode() + (this.f14420a.hashCode() * 31)) * 31, 31, this.f14422c), 31, this.f14423d);
        int c4 = w.d.c(this.f14441w, w.d.c(this.f14440v, w.d.f(this.f14439u, w.d.c(this.f14438t, w.d.c(this.f14437s, (this.f14436r.hashCode() + w.d.e(w.d.f(this.f14434p, w.d.f(this.f14433o, w.d.f(this.f14432n, w.d.f(this.m, (this.f14431l.hashCode() + w.d.c(this.f14430k, (this.f14429j.hashCode() + w.d.f(this.f14428i, w.d.f(this.f14427h, w.d.f(this.f14426g, (this.f14425f.hashCode() + ((this.f14424e.hashCode() + d4) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), this.f14435q, 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.f14442x;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (c4 + hashCode) * 31;
        Boolean bool = this.f14443y;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        return w.d.r(new StringBuilder("{WorkSpec: "), this.f14420a, '}');
    }

    public p(String str, e0 e0Var, String str2, String str3, p8.h hVar, p8.h hVar2, long j2, long j10, long j11, p8.e eVar, int i2, p8.a aVar, long j12, long j13, long j14, long j15, boolean z10, c0 c0Var, int i10, int i11, long j16, int i12, int i13, String str4, Boolean bool) {
        str.getClass();
        e0Var.getClass();
        str2.getClass();
        str3.getClass();
        hVar.getClass();
        hVar2.getClass();
        eVar.getClass();
        aVar.getClass();
        c0Var.getClass();
        this.f14420a = str;
        this.f14421b = e0Var;
        this.f14422c = str2;
        this.f14423d = str3;
        this.f14424e = hVar;
        this.f14425f = hVar2;
        this.f14426g = j2;
        this.f14427h = j10;
        this.f14428i = j11;
        this.f14429j = eVar;
        this.f14430k = i2;
        this.f14431l = aVar;
        this.m = j12;
        this.f14432n = j13;
        this.f14433o = j14;
        this.f14434p = j15;
        this.f14435q = z10;
        this.f14436r = c0Var;
        this.f14437s = i10;
        this.f14438t = i11;
        this.f14439u = j16;
        this.f14440v = i12;
        this.f14441w = i13;
        this.f14442x = str4;
        this.f14443y = bool;
    }
}
